package androidx.core.app;

import android.R;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.ActivityC22955m;
import com.vk.id.internal.auth.AuthActivity;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ActivityOptionsCompat.java */
/* renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22746d {

    /* compiled from: ActivityOptionsCompat.java */
    /* renamed from: androidx.core.app.d$a */
    public static class a extends C22746d {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityOptions f44522a;

        public a(ActivityOptions activityOptions) {
            this.f44522a = activityOptions;
        }

        @Override // androidx.core.app.C22746d
        public final Bundle c() {
            return this.f44522a.toBundle();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @X
    /* renamed from: androidx.core.app.d$b */
    public static class b {
    }

    /* compiled from: ActivityOptionsCompat.java */
    @X
    /* renamed from: androidx.core.app.d$c */
    public static class c {
    }

    /* compiled from: ActivityOptionsCompat.java */
    @X
    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    public static class C1717d {
    }

    /* compiled from: ActivityOptionsCompat.java */
    @X
    /* renamed from: androidx.core.app.d$e */
    public static class e {
    }

    /* compiled from: ActivityOptionsCompat.java */
    @X
    /* renamed from: androidx.core.app.d$f */
    public static class f {
    }

    /* compiled from: ActivityOptionsCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.app.d$g */
    public @interface g {
    }

    @j.N
    public static C22746d a(@j.N AuthActivity authActivity) {
        return new a(ActivityOptions.makeCustomAnimation(authActivity, R.anim.fade_in, R.anim.fade_out));
    }

    @j.N
    public static C22746d b(@j.N ActivityC22955m activityC22955m, @j.N View view, @j.N String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activityC22955m, view, str));
    }

    @j.P
    public Bundle c() {
        return null;
    }
}
