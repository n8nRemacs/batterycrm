package PS;

import ET0.j;
import PS.c;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.lib.design.tab_group.e;
import com.avito.android.printable_text.PrintableText;
import com.avito.beduin.v2.avito.component.tab_group.state.NotificationView;
import com.avito.beduin.v2.avito.component.tab_group.state.c;
import com.avito.beduin.v2.avito.component.tab_group.state.m;
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

/* compiled from: TabGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LPS/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/c;", "Lcom/avito/android/lib/design/tab_group/TabGroup;", "a", "_design-modules_beduin-v2_renderer_component_tab-group"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.avito.component.tab_group.state.c, TabGroup> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f13069m;

    /* compiled from: TabGroupComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LPS/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/c;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_tab-group"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.avito.component.tab_group.state.c> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f13070c = new a();

        public a() {
            super(m.f335295c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(a12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k A a12) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f13069m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.tab_group.state.c cVar) {
        TabGroup tabGroup = (TabGroup) view;
        com.avito.beduin.v2.avito.component.tab_group.state.c cVar2 = cVar;
        M.a(tabGroup, cVar2.f335277e);
        tabGroup.setStyle((e) D.a(cVar2.f335275c, kVar));
        ArrayList<c.a> arrayList = cVar2.f335274b.f4014b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (c.a aVar : arrayList) {
            PrintableText printableTextF = com.avito.android.printable_text.b.f(aVar.f335281a);
            NotificationView notificationView = aVar.f335283c;
            int i12 = notificationView == null ? -1 : c.a.f13071a[notificationView.ordinal()];
            b.a cVar3 = null;
            Integer num = aVar.f335282b;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        cVar3 = b.a.e.f180735a;
                    } else if (i12 == 4) {
                        cVar3 = new b.a.d(num != null ? num.intValue() : 0, 0, null, 6, null);
                    }
                } else if (num != null) {
                    cVar3 = new b.a.c(num.intValue(), b.a.c.AbstractC5311a.C5312a.f180730b, null, 4, null);
                }
            } else if (num != null) {
                cVar3 = new b.a.c(num.intValue(), b.a.c.AbstractC5311a.C5314c.f180731b, null, 4, null);
            }
            arrayList2.add(new com.avito.android.lib.design.tab_group.b(printableTextF, cVar3, !aVar.f335284d));
        }
        tabGroup.setState(new com.avito.android.lib.design.tab_group.d(arrayList2, cVar2.f335273a, cVar2.f335276d));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        TabGroup tabGroup = new TabGroup(viewGroup.getContext(), null, 0, 6, null);
        if (this.f13069m.f337909e.f57087a) {
            tabGroup.addOnLayoutChangeListener(new j(0));
        }
        return tabGroup;
    }
}
