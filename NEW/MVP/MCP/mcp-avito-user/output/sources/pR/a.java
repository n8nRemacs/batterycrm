package PR;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.lib.design.circular_counter.a;
import com.avito.beduin.v2.avito.component.circularCounter.state.d;
import com.avito.beduin.v2.avito.component.circularCounter.state.g;
import com.avito.beduin.v2.avito.component.circularCounter.state.i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CircularCounterComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LPR/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/a;", "Lcom/avito/android/lib/design/circular_counter/CircularCounter;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_circular-counter"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.circularCounter.state.a, CircularCounter> {

    /* compiled from: CircularCounterComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LPR/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_circular-counter"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PR.a$a, reason: collision with other inner class name */
    public static final class C0847a extends n<com.avito.beduin.v2.avito.component.circularCounter.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0847a f13067c = new C0847a();

        public C0847a() {
            super(d.f334098c);
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
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.circularCounter.state.a aVar) {
        a.AbstractC5261a bVar;
        CircularCounter circularCounter = (CircularCounter) view;
        com.avito.beduin.v2.avito.component.circularCounter.state.a aVar2 = aVar;
        circularCounter.setStyle((com.avito.android.lib.design.circular_counter.b) D.a(aVar2.f334091c, kVar));
        int i12 = (int) (aVar2.f334090b * 100);
        g gVar = aVar2.f334089a;
        if (gVar instanceof i) {
            i iVar = (i) gVar;
            bVar = new a.AbstractC5261a.C5262a(D.c(kVar, iVar.f334103a, iVar.f334104b, Integer.valueOf(s(iVar.f334105c))));
        } else {
            if (!(gVar instanceof com.avito.beduin.v2.avito.component.circularCounter.state.k)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new a.AbstractC5261a.b(((com.avito.beduin.v2.avito.component.circularCounter.state.k) gVar).f334108a);
        }
        circularCounter.setState(new com.avito.android.lib.design.circular_counter.a(bVar, i12, 0, 4, null));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new CircularCounter(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
