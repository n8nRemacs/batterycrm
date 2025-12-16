package Zc;

import Y61.k;
import ad.C19867a;
import ad.C19868b;
import android.os.Build;
import cd.C27177a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.File;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DeviceInfoExtractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZc/c;", "LZc/b;", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19535c implements InterfaceC19534b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f20281a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C27177a f20282b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C19868b f20283c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f20284d;

    @Inject
    public C19535c(@k C c12, @k C27177a c27177a, @k C19868b c19868b, @k InterfaceC28373a interfaceC28373a) {
        this.f20281a = c12;
        this.f20282b = c27177a;
        this.f20283c = c19868b;
        this.f20284d = interfaceC28373a;
    }

    @Override // Zc.InterfaceC19534b
    @k
    public final C19533a a() {
        boolean z12;
        String lowerCase;
        C c12 = this.f20281a;
        boolean zG2 = c12.g();
        boolean z13 = false;
        try {
            boolean zG3 = this.f20282b.f58051a.g();
            String str = Build.TAGS;
            boolean z14 = true;
            if ((zG3 || str == null || !C43066x.q(str, "test-keys", false)) && !new File("/system/app/Superuser.apk").exists()) {
                File file = new File("/system/xbin/su");
                if (!zG3) {
                    if (file.exists()) {
                        z13 = true;
                    }
                }
                z14 = z13;
            }
            z12 = z14;
        } catch (Throwable th2) {
            b("root", th2);
            z12 = false;
        }
        C19868b c19868b = this.f20283c;
        String str2 = null;
        try {
            c19868b.getClass();
            lowerCase = Build.CPU_ABI.toLowerCase(Locale.ROOT);
        } catch (Throwable th3) {
            b("cpu_arch", th3);
            lowerCase = null;
        }
        try {
            c19868b.getClass();
        } catch (Throwable th4) {
            b("cpu_model", th4);
        }
        String str3 = Build.VERSION.SDK_INT >= 31 ? Build.SOC_MODEL : null;
        try {
            c19868b.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                str2 = Build.SOC_MANUFACTURER;
            }
        } catch (Throwable th5) {
            b("cpu_brand", th5);
        }
        c19868b.getClass();
        return new C19533a(c12.getF125482b(), c12.getF125483c(), Build.HARDWARE, Build.PRODUCT, new C19867a(Runtime.getRuntime().availableProcessors(), lowerCase, str2, str3), zG2, z12);
    }

    public final void b(String str, Throwable th2) {
        String strConcat = "Error while extracting device info: ".concat(str);
        V2.f318762a.a("DEFAULT_TAG", strConcat, th2);
        this.f20284d.c(new NonFatalErrorEvent(strConcat, th2, null, null, 12, null));
    }
}
