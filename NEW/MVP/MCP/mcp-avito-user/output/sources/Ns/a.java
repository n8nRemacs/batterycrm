package NS;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.switcher.state.i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SwitcherComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LNS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/switcher/state/a;", "LNS/c;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_switcher"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.switcher.state.a, c> {

    /* compiled from: SwitcherComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LNS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/switcher/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_switcher"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NS.a$a, reason: collision with other inner class name */
    public static final class C0735a extends n<com.avito.beduin.v2.avito.component.switcher.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0735a f11521c = new C0735a();

        public C0735a() {
            super(i.f335241c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.switcher.state.a aVar) throws Resources.NotFoundException {
        c cVar = (c) view;
        com.avito.beduin.v2.avito.component.switcher.state.a aVar2 = aVar;
        cVar.setStyle((com.avito.android.lib.design.switcher.a) D.a(aVar2.f335228e, kVar));
        l<Boolean, G0> lVar = aVar2.f335227d;
        boolean z12 = aVar2.f335225b;
        cVar.setState(new EV.c(lVar, z12, aVar2.f335224a, aVar2.f335226c, lVar != null && z12));
        D6.G(cVar, aVar2.f335229f);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new c(viewGroup.getContext());
    }
}
