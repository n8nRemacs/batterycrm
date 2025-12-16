package ZT0;

import Y61.k;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.J;
import com.avito.beduin.v2.engine.core.C36258h;
import com.avito.beduin.v2.engine.core.DisabledMutableValueFactory;
import com.avito.beduin.v2.engine.core.InterfaceC36254d;
import com.avito.beduin.v2.engine.core.q;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationValuePool.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZT0/d;", "LZT0/b;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f20177a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC36274k f20178b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashSet f20179c;

    /* renamed from: d, reason: collision with root package name */
    public int f20180d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20181e;

    public d(@k InterfaceC36274k interfaceC36274k, @k String str) {
        this.f20177a = str;
        J jS2 = interfaceC36274k.s();
        DisabledMutableValueFactory disabledMutableValueFactory = DisabledMutableValueFactory.f336590b;
        jS2.getClass();
        this.f20178b = interfaceC36274k.m(new J(disabledMutableValueFactory));
        this.f20179c = new LinkedHashSet();
    }

    @Override // ZT0.b
    public final void a(@k InterfaceC36254d interfaceC36254d) {
        if (this.f20181e) {
            interfaceC36254d.destroy();
        } else {
            this.f20179c.add(interfaceC36254d);
        }
    }

    @Override // ZT0.b
    @k
    public final InterfaceC36254d b() {
        boolean z12 = this.f20181e;
        InterfaceC36274k interfaceC36274k = this.f20178b;
        if (z12) {
            return new q(interfaceC36274k);
        }
        LinkedHashSet linkedHashSet = this.f20179c;
        InterfaceC36254d c36258h = (InterfaceC36254d) C42745f0.R(linkedHashSet);
        if (c36258h != null) {
            linkedHashSet.remove(c36258h);
        } else {
            c36258h = new C36258h(interfaceC36274k, "recycle");
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Pool");
                StringBuilder sb2 = new StringBuilder("Pool '");
                sb2.append(this.f20177a);
                sb2.append("': ");
                int i12 = this.f20180d + 1;
                this.f20180d = i12;
                sb2.append(i12);
                cVar.d(strS, sb2.toString());
            }
        }
        return c36258h;
    }

    @Override // ZT0.b
    public final void destroy() {
        this.f20181e = true;
        LinkedHashSet linkedHashSet = this.f20179c;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC36254d) it.next()).destroy();
        }
        linkedHashSet.clear();
    }
}
