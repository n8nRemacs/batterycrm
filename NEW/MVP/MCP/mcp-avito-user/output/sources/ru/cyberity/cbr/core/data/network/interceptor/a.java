package ru.cyberity.cbr.core.data.network.interceptor;

import Y61.k;
import android.os.Build;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;

/* compiled from: AdditionalHeaderInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/network/interceptor/a;", "Lokhttp3/Interceptor;", "Lru/cyberity/cbr/core/data/source/settings/b;", "repository", "<init>", "(Lru/cyberity/cbr/core/data/source/settings/b;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lru/cyberity/cbr/core/data/source/settings/b;", "", "b", "Lkotlin/C;", "()Ljava/lang/String;", "deviceId", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.settings.b repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C deviceId = C42727D.c(new C12463a());

    /* compiled from: AdditionalHeaderInterceptor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.network.interceptor.a$a, reason: collision with other inner class name */
    public static final class C12463a extends N implements Y41.a<String> {
        public C12463a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.repository.e();
        }
    }

    public a(@k ru.cyberity.cbr.core.data.source.settings.b bVar) {
        this.repository = bVar;
    }

    @Override // okhttp3.Interceptor
    @k
    public synchronized Response intercept(@k Interceptor.Chain chain) {
        Request.Builder builderAddHeader;
        String strF;
        String str;
        String str2;
        try {
            Request.Builder builderAddHeader2 = chain.request().newBuilder().addHeader("X-Network-Type", this.repository.g());
            String strA = this.repository.a();
            if (C43066x.K(strA)) {
                strA = null;
            }
            if (strA != null) {
                builderAddHeader2.addHeader("X-Applicant-Id", strA);
            }
            n0 n0Var = n0.f432787a;
            builderAddHeader = builderAddHeader2.addHeader("X-Mob-App", n0Var.getPackageName()).addHeader("X-Mob-App-Ver", n0Var.getVersionName() + '/' + n0Var.getVersionCode()).addHeader("X-Mob-Dev", s.b()).addHeader("X-Mob-Dev-Id", a()).addHeader("X-Mob-Sdk-Ver", "1.30.4").addHeader("X-Mob-Sdk-Locale", n0Var.getLocale().toString()).addHeader("X-Mob-OS", "Android").addHeader("X-Mob-OS-Ver", Build.VERSION.RELEASE).addHeader("X-Client-Id", "msdk2").addHeader("X-Debug", String.valueOf(n0Var.isDebug())).addHeader("X-Device-Fingerprint", a());
            if (chain.request().headers().get("X-Session-Id") == null) {
                builderAddHeader.addHeader("X-Session-Id", String.valueOf(this.repository.f()));
            }
            Map<String, String> settings = n0Var.getSettings();
            if (settings != null && (str2 = settings.get("appFrameworkName")) != null) {
                builderAddHeader.addHeader("X-Mob-App-Framework", str2);
            }
            Map<String, String> settings2 = n0Var.getSettings();
            if (settings2 != null && (str = settings2.get("appFrameworkVersion")) != null) {
                builderAddHeader.addHeader("X-Mob-App-Framework-Ver", str);
            }
            ru.cyberity.ff.a aVar = ru.cyberity.ff.a.f435638a;
            if (aVar.u().g() && (strF = aVar.u().f()) != null) {
                builderAddHeader.addHeader("X-Test-Ip", strF);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return chain.proceed(builderAddHeader.build());
    }

    private final String a() {
        return (String) this.deviceId.getValue();
    }
}
