package androidx.privacysandbox.ads.adservices.internal;

import Y61.k;
import android.os.Build;
import android.os.ext.SdkExtensions;
import j.InterfaceC42164u;
import j.X;
import kotlin.Metadata;

/* compiled from: AdServicesInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/a;", "", "<init>", "()V", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f53525a = new a();

    /* compiled from: AdServicesInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/a$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.privacysandbox.ads.adservices.internal.a$a, reason: collision with other inner class name */
    public static final class C1891a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1891a f53526a = new C1891a();

        @InterfaceC42164u
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1891a.f53526a.a();
        }
        return 0;
    }
}
