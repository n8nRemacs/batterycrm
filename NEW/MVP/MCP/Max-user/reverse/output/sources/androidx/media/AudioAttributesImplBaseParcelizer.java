package androidx.media;

import defpackage.e0h;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e0h e0hVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = e0hVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = e0hVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = e0hVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = e0hVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, e0h e0hVar) {
        e0hVar.getClass();
        e0hVar.j(audioAttributesImplBase.a, 1);
        e0hVar.j(audioAttributesImplBase.b, 2);
        e0hVar.j(audioAttributesImplBase.c, 3);
        e0hVar.j(audioAttributesImplBase.d, 4);
    }
}
