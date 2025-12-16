package io.noties.markwon.image.destination;

import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: ImageDestinationProcessorRelativeToAbsolute.java */
/* loaded from: classes8.dex */
public class c extends a {
    public c() {
        try {
            new URL("https://android.asset/");
        } catch (MalformedURLException e12) {
            e12.printStackTrace();
        }
    }
}
