package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import j.InterfaceC42155k;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.RequiresOptIn;

/* compiled from: BuildCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/core/os/b;", "", "<init>", "()V", "a", "b", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.core.os.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22774b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44795a = 0;

    /* compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/b$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.core.os.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f44796a = new a();

        public static void a(int i12) {
            SdkExtensions.getExtensionVersion(i12);
        }
    }

    /* compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/b$b;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    /* renamed from: androidx.core.os.b$b, reason: collision with other inner class name */
    public @interface InterfaceC1739b {
    }

    static {
        new C22774b();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            a.f44796a.getClass();
            a.a(30);
        }
        if (i12 >= 30) {
            a.f44796a.getClass();
            a.a(31);
        }
        if (i12 >= 30) {
            a.f44796a.getClass();
            a.a(33);
        }
        if (i12 >= 30) {
            a.f44796a.getClass();
            a.a(1000000);
        }
    }

    @X41.n
    @InterfaceC42155k
    public static final boolean a() {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 35) {
            if (i12 >= 34) {
                String str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("VanillaIceCream".toUpperCase(locale)) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
