package com.avito.beduin.v2.avito.component.accordion.state;

import com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoAccordionStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/a;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "a", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f333714c = new a();

    /* compiled from: AvitoAccordionStateFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/accordion/state/a$a;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.accordion.state.a$a, reason: collision with other inner class name */
    public static final class C10366a implements com.avito.beduin.v2.theme.d<AvitoAccordionState.b> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C10366a f333715a = new C10366a();

        /* compiled from: AvitoAccordionStateFactory.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "<anonymous parameter 1>", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState$b$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.avito.component.accordion.state.a$a$a, reason: collision with other inner class name */
        public static final class C10367a extends N implements Y41.q<G, InterfaceC36249i, String, AvitoAccordionState.b.a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10367a f333716l = new C10367a();

            public C10367a() {
                super(3);
            }

            @Override // Y41.q
            public final AvitoAccordionState.b.a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
                return new AvitoAccordionState.b.a(interfaceC36249i);
            }
        }

        @Y61.k
        public static AvitoAccordionState.b b(@Y61.k G g12) {
            String string = g12.getString("text");
            if (string == null) {
                string = "";
            }
            return new AvitoAccordionState.b(string, g12.getString("icon"), (AvitoAccordionState.b.a) g12.h("accessory", "accessory", C10367a.f333716l));
        }

        @Override // com.avito.beduin.v2.theme.d
        public final /* bridge */ /* synthetic */ AvitoAccordionState.b a(G g12) {
            return b(g12);
        }
    }

    public a() {
        super("Accordion", false, 2, null);
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (AvitoAccordionState) E.b(bVar, bVar.f336563b, j.f333725l);
    }
}
