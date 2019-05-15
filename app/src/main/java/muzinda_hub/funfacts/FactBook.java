package muzinda_hub.funfacts;

import java.util.Random;

/**
 * Created by tzungura on 6/11/2015.
 */
public class FactBook {



       public String[] mFacts = {
                "Terri is awesome", "awesomeness is Terri", "awesomiology is the study of Terri",
                "Terri is the definition of awesomeness", "Ask Terri more about awesome", "Terri is TERERAI"

        };

    public String getFact()

    {
        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);


        fact = mFacts[randomNumber];

        return fact;
    }
}
