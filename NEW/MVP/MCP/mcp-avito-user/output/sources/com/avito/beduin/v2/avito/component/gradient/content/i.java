package com.avito.beduin.v2.avito.component.gradient.content;

import Y41.p;
import Y61.k;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: GradientContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/gradient/content/i;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/gradient/content/f;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements com.avito.beduin.v2.theme.d<f> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f334372a = new i();

    /* compiled from: GradientContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "index", "Lcom/avito/beduin/v2/avito/component/gradient/content/d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lcom/avito/beduin/v2/avito/component/gradient/content/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<InterfaceC36241a, Integer, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334373l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(InterfaceC36241a interfaceC36241a, Integer num) {
            int iIntValue = num.intValue();
            return (d) interfaceC36241a.m(iIntValue, h.f334371l, String.valueOf(iIntValue));
        }
    }

    @k
    public static f b(@k G g12) {
        Integer numA = g12.a("angle");
        return new f(null, numA != null ? s.g(numA.intValue(), 0, 360) : 0, new ET0.a(C42745f0.C(g12.g("colors", "colors", a.f334373l))), 1, null);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ f a(G g12) {
        return b(g12);
    }
}
