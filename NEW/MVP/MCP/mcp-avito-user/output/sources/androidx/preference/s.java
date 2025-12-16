package androidx.preference;

import android.content.Context;
import androidx.annotation.RestrictTo;
import j.N;

/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public Object f53468a;

    /* renamed from: b, reason: collision with root package name */
    public Object f53469b;

    /* renamed from: c, reason: collision with root package name */
    public Object f53470c;

    /* compiled from: PreferenceManager.java */
    public interface a {
    }

    /* compiled from: PreferenceManager.java */
    public interface b {
    }

    /* compiled from: PreferenceManager.java */
    public interface c {
    }

    /* compiled from: PreferenceManager.java */
    public static abstract class d {
    }

    /* compiled from: PreferenceManager.java */
    public static class e extends d {
    }

    @RestrictTo
    public s(@N Context context) {
        a(context);
    }

    public static String a(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
