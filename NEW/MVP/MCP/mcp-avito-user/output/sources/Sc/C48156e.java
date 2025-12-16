package sc;

import Y61.k;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetrica;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: YandexMetricaInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsc/e;", "Lsc/d;", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sc.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48156e implements InterfaceC48155d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C48156e f437918a = new C48156e();

    @Override // sc.InterfaceC48155d
    public final void a() {
        C48158g c48158g = C48158g.f437919a;
        Map mapSingletonMap = Collections.singletonMap("platform", "android");
        c48158g.getClass();
        try {
            YandexMetrica.reportEvent("contact", (Map<String, Object>) mapSingletonMap);
        } catch (ValidationException unused) {
        }
    }
}
