package io.noties.markwon;

import android.content.Context;
import android.text.SpannableStringBuilder;
import j.N;

/* compiled from: Markwon.java */
/* loaded from: classes8.dex */
public abstract class e {

    /* compiled from: Markwon.java */
    public interface a {
        @N
        a a(@N AbstractC41740a abstractC41740a);

        @N
        e build();
    }

    /* compiled from: Markwon.java */
    public interface b {
    }

    @N
    public static a a(@N Context context) {
        f fVar = new f(context);
        fVar.a(new io.noties.markwon.core.p());
        return fVar;
    }

    @N
    public abstract SpannableStringBuilder b(@N String str);
}
