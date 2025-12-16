package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.o;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideComponentStatesRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/W;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/engine/component/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class W implements dagger.internal.h<com.avito.beduin.v2.engine.component.o> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176069c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176070a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f176071b;

    /* compiled from: BeduinFeatureModule_ProvideComponentStatesRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/W$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13) {
        this.f176070a = a12;
        this.f176071b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f176070a.get();
        Set set2 = (Set) this.f176071b.get();
        f176069c.getClass();
        L.f176033a.getClass();
        C31111a.f176074a.getClass();
        o.a aVar = new o.a(OT0.b.f12283c);
        aVar.a(com.avito.beduin.v2.component.box.state.f.f335586c);
        aVar.a(com.avito.beduin.v2.component.column.state.n.f335641c);
        aVar.a(com.avito.beduin.v2.component.lazy_column.state.j.f336015c);
        aVar.a(com.avito.beduin.v2.component.row.state.n.f336190c);
        aVar.a(com.avito.beduin.v2.component.lazy_row.state.j.f336094c);
        aVar.a(com.avito.beduin.v2.component.scroll_container.state.v.f336227c);
        aVar.a(com.avito.beduin.v2.component.scroll_container.state.c.f336192c);
        aVar.a(com.avito.beduin.v2.component.flexlayout.state.m.f335761c);
        aVar.a(com.avito.beduin.v2.component.flexlayout.state.a.f335731c);
        aVar.a(com.avito.beduin.v2.component.scroll_container.state.b.f336191c);
        aVar.a(JT0.b.f8999c);
        aVar.a(JT0.d.f9001c);
        aVar.a(com.avito.beduin.v2.component.video.state.p.f336385c);
        aVar.a(com.avito.beduin.v2.component.aspect_ratio.state.k.f335547c);
        aVar.a(com.avito.beduin.v2.avito.component.button.state.k.f333956c);
        aVar.a(com.avito.beduin.v2.avito.component.checkbox.state.i.f334023c);
        aVar.a(com.avito.beduin.v2.avito.component.spinner.state.g.f335143c);
        aVar.a(com.avito.beduin.v2.avito.component.pull_to_refresh.h.f334869c);
        aVar.a(com.avito.beduin.v2.avito.component.surface.state.e.f335223c);
        aVar.a(com.avito.beduin.v2.avito.component.text.state.i.f335350c);
        aVar.a(com.avito.beduin.v2.avito.component.rich_text.state.k.f334942c);
        aVar.a(com.avito.beduin.v2.avito.component.image.state.j.f334423c);
        aVar.a(com.avito.beduin.v2.avito.component.input.state.j.f334531d);
        aVar.a(com.avito.beduin.v2.avito.component.input.state.i.f334530d);
        aVar.a(com.avito.beduin.v2.avito.component.input.state.a.f334489d);
        aVar.a(com.avito.beduin.v2.avito.component.input.state.k.f334532d);
        aVar.a(com.avito.beduin.v2.avito.component.page_indicator.state.l.f334796c);
        aVar.a(com.avito.beduin.v2.avito.component.chips.state.m.f334078c);
        aVar.a(com.avito.beduin.v2.avito.component.tab_group.state.m.f335295c);
        aVar.a(com.avito.beduin.v2.avito.component.gradient.state.h.f334385c);
        aVar.a(com.avito.beduin.v2.avito.component.stepper.state.k.f335184c);
        aVar.a(com.avito.beduin.v2.avito.component.progress_bar.state.h.f334830c);
        aVar.a(com.avito.beduin.v2.avito.component.badge.state.j.f333811c);
        aVar.a(com.avito.beduin.v2.avito.component.badge.state.k.f333812c);
        aVar.a(com.avito.beduin.v2.avito.component.select.state.q.f335029c);
        aVar.a(com.avito.beduin.v2.avito.component.selector_card.state.k.f335080c);
        aVar.a(com.avito.beduin.v2.avito.component.accordion.state.a.f333714c);
        aVar.a(com.avito.beduin.v2.avito.component.switcher.state.i.f335241c);
        aVar.a(com.avito.beduin.v2.avito.component.radio.state.k.f334898c);
        aVar.a(com.avito.beduin.v2.avito.component.docking_badge.state.o.f334345c);
        aVar.a(com.avito.beduin.v2.avito.component.docking_badge.state.m.f334336c);
        aVar.a(com.avito.beduin.v2.avito.component.description_list.state.l.f334250c);
        aVar.a(com.avito.beduin.v2.avito.component.description_list_parameter_line.state.m.f334296c);
        aVar.a(com.avito.beduin.v2.avito.component.button.banner.l.f333928c);
        aVar.a(com.avito.beduin.v2.avito.component.time_line.state.j.f335411c);
        aVar.a(com.avito.beduin.v2.component.gridlayout.state.a.f335838c);
        aVar.a(com.avito.beduin.v2.avito.component.graphic_element.d.f334398c);
        aVar.a(com.avito.beduin.v2.avito.component.map.state.r.f334709c);
        aVar.a(com.avito.beduin.v2.avito.component.slider.state.d.f335129c);
        aVar.a(com.avito.beduin.v2.avito.component.date_picker.state.i.f334185c);
        aVar.a(com.avito.beduin.v2.avito.component.animation.state.h.f333786c);
        aVar.a(com.avito.beduin.v2.avito.component.items_controller.g.f334556c);
        aVar.a(com.avito.beduin.v2.avito.component.circularCounter.state.d.f334098c);
        aVar.a(com.avito.beduin.v2.avito.component.text.state.A.f335310c);
        aVar.a(com.avito.beduin.v2.avito.component.tooltip.state.m.f335451c);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aVar.a((AbstractC36250j) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            aVar.a((AbstractC36250j) it2.next());
        }
        return new com.avito.beduin.v2.engine.component.o(kotlin.collections.P0.q(aVar.f336574b), aVar.f336573a, null);
    }
}
