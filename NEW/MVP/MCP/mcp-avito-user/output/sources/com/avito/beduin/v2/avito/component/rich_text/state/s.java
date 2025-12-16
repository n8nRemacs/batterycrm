package com.avito.beduin.v2.avito.component.rich_text.state;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.beduin.v2.engine.component.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/s;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/q;", "<init>", "()V", "a", "b", "c", "d", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements com.avito.beduin.v2.theme.d<q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f334951a = new s();

    /* compiled from: SegmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/s$a;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/v;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.beduin.v2.theme.d<v> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f334952a = new a();

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/beduin/v2/engine/field/m;", "Lkotlin/G0;", "callback", "Lkotlin/Function0;", "invoke", "(LY41/l;)LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.avito.component.rich_text.state.s$a$a, reason: collision with other inner class name */
        public static final class C10379a extends N implements Y41.l<Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0>, Y41.a<? extends G0>> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10379a f334953l = new C10379a();

            public C10379a() {
                super(1);
            }

            @Override // Y41.l
            public final Y41.a<? extends G0> invoke(Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0> lVar) {
                return new r(lVar);
            }
        }

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/m;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/rich_text/state/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<G, m> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f334954l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final m invoke(G g12) {
                G g13 = g12;
                n.f334945a.getClass();
                return new m(com.avito.beduin.v2.theme.h.c(g13, "textStyle", com.avito.beduin.v2.avito.component.text.state.n.f335362b), com.avito.beduin.v2.theme.s.b(g13, "strikethroughColor"));
            }
        }

        @Y61.l
        public static v b(@Y61.k G g12) {
            String string = g12.getString("text");
            if (string == null) {
                return null;
            }
            return new v(string, (Y41.a) g12.d(C10379a.f334953l, "onClick", "onClick"), (m) g12.f(b.f334954l, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE));
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ v a(G g12) {
            return b(g12);
        }
    }

    /* compiled from: SegmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/s$b;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/x;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.beduin.v2.theme.d<x> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f334955a = new b();

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/beduin/v2/engine/field/m;", "Lkotlin/G0;", "callback", "Lkotlin/Function0;", "invoke", "(LY41/l;)LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0>, Y41.a<? extends G0>> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f334956l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Y41.a<? extends G0> invoke(Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0> lVar) {
                return new t(lVar);
            }
        }

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.avito.component.rich_text.state.s$b$b, reason: collision with other inner class name */
        public static final class C10380b extends N implements Y41.l<G, o> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10380b f334957l = new C10380b();

            public C10380b() {
                super(1);
            }

            @Override // Y41.l
            public final o invoke(G g12) {
                p.f334949a.getClass();
                return p.b(g12);
            }
        }

        @Y61.l
        public static x b(@Y61.k G g12) {
            String string = g12.getString("text");
            if (string == null) {
                return null;
            }
            return new x(string, (Y41.a) g12.d(a.f334956l, "onClick", "onClick"), (o) g12.f(C10380b.f334957l, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE));
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ x a(G g12) {
            return b(g12);
        }
    }

    /* compiled from: SegmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/s$c;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/y;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements com.avito.beduin.v2.theme.d<y> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f334958a = new c();

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<G, o> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f334959l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final o invoke(G g12) {
                p.f334949a.getClass();
                return p.b(g12);
            }
        }

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/beduin/v2/engine/field/m;", "Lkotlin/G0;", "callback", "Lkotlin/Function0;", "invoke", "(LY41/l;)LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0>, Y41.a<? extends G0>> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f334960l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Y41.a<? extends G0> invoke(Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0> lVar) {
                return new u(lVar);
            }
        }

        @Y61.l
        public static y b(@Y61.k G g12) {
            String string = g12.getString("key");
            if (string == null) {
                return null;
            }
            Integer numA = g12.a("leftInset");
            int iIntValue = numA != null ? numA.intValue() : 0;
            Integer numA2 = g12.a("rightInset");
            return new y(string, iIntValue, numA2 != null ? numA2.intValue() : 0, (Y41.a) g12.d(b.f334960l, "onClick", "onClick"), (o) g12.f(a.f334959l, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE));
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ y a(G g12) {
            return b(g12);
        }
    }

    /* compiled from: SegmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/s$d;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/z;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements com.avito.beduin.v2.theme.d<z> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f334961a = new d();

        /* compiled from: SegmentDeclaration.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<G, o> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f334962l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final o invoke(G g12) {
                p.f334949a.getClass();
                return p.b(g12);
            }
        }

        @Y61.l
        public static z b(@Y61.k G g12) {
            String string;
            String string2 = g12.getString("text");
            if (string2 == null || (string = g12.getString("link")) == null) {
                return null;
            }
            return new z(string2, string, (o) g12.f(a.f334962l, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE));
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ z a(G g12) {
            return b(g12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Y61.l
    public static q b(@Y61.k G g12) {
        String string = g12.getString("segmentType");
        if (string != null) {
            switch (string.hashCode()) {
                case -1407140530:
                    if (string.equals("WebLink")) {
                        d.f334961a.getClass();
                        return d.b(g12);
                    }
                    break;
                case -939328666:
                    if (string.equals("TextIcon")) {
                        c.f334958a.getClass();
                        return c.b(g12);
                    }
                    break;
                case 2603341:
                    if (string.equals("Text")) {
                        b.f334955a.getClass();
                        return b.b(g12);
                    }
                    break;
                case 1747113600:
                    if (string.equals("StrikethroughText")) {
                        a.f334952a.getClass();
                        return a.b(g12);
                    }
                    break;
            }
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ q a(G g12) {
        return b(g12);
    }
}
