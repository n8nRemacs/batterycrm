package US;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.time_line.d;
import com.avito.android.lib.design.time_line.s;
import com.avito.android.lib.util.q;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.time_line.state.a;
import com.avito.beduin.v2.avito.component.time_line.state.j;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLineComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LUS/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/time_line/state/a;", "Lcom/avito/android/lib/design/time_line/d;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_time-line"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.avito.component.time_line.state.a, d> {

    /* compiled from: TimeLineComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUS/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/time_line/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_time-line"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.avito.component.time_line.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f16383c = new a();

        public a() {
            super(j.f335411c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.time_line.state.a aVar) {
        d dVar = (d) view;
        com.avito.beduin.v2.avito.component.time_line.state.a aVar2 = aVar;
        dVar.setStyle((s) D.a(aVar2.f335395d, kVar));
        ArrayList<a.C10381a> arrayList = aVar2.f335392a.f4014b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (a.C10381a c10381a : arrayList) {
            String str = c10381a.f335402b;
            arrayList2.add(new GV.a(str != null ? q.a(str) : null, c10381a.f335401a));
        }
        dVar.setState(new GV.b(aVar2.f335393b, arrayList2, aVar2.f335394c));
        ET0.b bVar = aVar2.f335396e;
        dVar.setPadding(bVar != null ? y6.b(bVar.f4016a) : 0, bVar != null ? y6.b(bVar.f4019d) : 0, bVar != null ? y6.b(bVar.f4017b) : 0, bVar != null ? y6.b(bVar.f4018c) : 0);
        M.a(dVar, aVar2.f335397f);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new d(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
