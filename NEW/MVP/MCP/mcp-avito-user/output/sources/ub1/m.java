package ub1;

import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.config.a;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final s f440164a;

    /* renamed from: b, reason: collision with root package name */
    public final F f440165b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC42726C f440166c = C42727D.c(new a());

    public static final class a extends N implements Y41.a<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends String> invoke() {
            F f12 = m.this.f440165b;
            G g12 = f12.f440131a;
            C49019a c49019a = f12.f440132b;
            ru.rustore.sdk.core.config.a.f436771b.getClass();
            return P0.g(new Q("sdkName", "ru.rustore.sdk:review"), new Q("sdkType", a.C12582a.a(c49019a.f440133a).f436772a.f436770b), new Q("sdkVersion", "7.0.0"));
        }
    }

    public m(s sVar, F f12) {
        this.f440164a = sVar;
        this.f440165b = f12;
    }
}
