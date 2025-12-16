package com.avito.beduin.v2.avito.component.text.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandableTextDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/D;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/text/state/C;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D implements com.avito.beduin.v2.theme.d<C> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D f335320a = new D();

    /* compiled from: ExpandableTextDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/theme/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, com.avito.beduin.v2.theme.r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f335321l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.theme.r invoke(G g12) {
            r.a aVar = com.avito.beduin.v2.theme.r.f338365d;
            return com.avito.beduin.v2.theme.s.a(g12);
        }
    }

    /* compiled from: ExpandableTextDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/beduin/v2/engine/field/m;", "Lkotlin/G0;", "callback", "Lkotlin/Function0;", "invoke", "(LY41/l;)LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0>, Y41.a<? extends G0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f335322l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Y41.a<? extends G0> invoke(Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0> lVar) {
            return new E(lVar);
        }
    }

    @Y61.k
    public static C b(@Y61.k G g12) {
        String string = g12.getString("expandText");
        if (string == null) {
            string = "";
        }
        String str = string;
        Integer numA = g12.a("compactNumberOfLines");
        int iIntValue = numA != null ? numA.intValue() : 3;
        Boolean boolC = g12.c("shouldUseNewLine");
        return new C(str, iIntValue, boolC != null ? boolC.booleanValue() : false, com.avito.beduin.v2.theme.h.c(g12, "expandTextStyle", n.f335362b), (com.avito.beduin.v2.theme.r) g12.f(a.f335321l, "expandTextColor", "expandTextColor"), g12.getString("expandIcon"), (Y41.a) g12.d(b.f335322l, "onExpand", "onExpand"));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ C a(G g12) {
        return b(g12);
    }
}
