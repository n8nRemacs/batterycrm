package androidx.core.app;

import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f44504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44505b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f44506c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f44507d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f44508e;

    /* compiled from: RemoteInput.java */
    @X
    public static class a {
    }

    /* compiled from: RemoteInput.java */
    @X
    public static class b {
    }

    /* compiled from: RemoteInput.java */
    @X
    public static class c {
    }

    /* compiled from: RemoteInput.java */
    @X
    public static class d {
        public static void a(RemoteInput.Builder builder) {
            builder.setEditChoicesBeforeSending(0);
        }
    }

    /* compiled from: RemoteInput.java */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f44510b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f44511c = new Bundle();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44512d = true;

        /* renamed from: a, reason: collision with root package name */
        public final String f44509a = "direct_reply";
    }

    /* compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    /* compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface g {
    }

    public M(String str, String str2, boolean z12, Bundle bundle, HashSet hashSet) {
        this.f44504a = str;
        this.f44505b = str2;
        this.f44506c = z12;
        this.f44507d = bundle;
        this.f44508e = hashSet;
    }
}
