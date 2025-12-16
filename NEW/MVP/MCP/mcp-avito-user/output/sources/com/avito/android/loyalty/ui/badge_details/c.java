package com.avito.android.loyalty.ui.badge_details;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.loyalty.ui.badge_details.b f183251E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f183252F;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f183253G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public ArrayList f183254H;

    /* compiled from: BadgeDetailsBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements com.avito.android.loyalty.ui.items.collapse.d, D {
        public a() {
        }

        @Override // com.avito.android.loyalty.ui.items.collapse.d
        public final void a(@k com.avito.android.loyalty.ui.items.collapse.a aVar) {
            c cVar = c.this;
            ArrayList arrayList = new ArrayList(cVar.f183254H);
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (((com.avito.conveyor_item.a) it.next()).getId() == aVar.getId()) {
                    break;
                } else {
                    i12++;
                }
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.set(numValueOf.intValue(), com.avito.android.loyalty.ui.items.collapse.a.a(aVar, !aVar.f183667d));
                cVar.f183254H = arrayList;
                cVar.V(arrayList);
            }
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof com.avito.android.loyalty.ui.items.collapse.d) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, c.this, c.class, "onCollapseClicked", "onCollapseClicked(Lcom/avito/android/loyalty/ui/items/collapse/CollapseItem;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: BadgeDetailsBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f183256b;

        public b(com.avito.android.deeplink_handler.handler.composite.a aVar) {
            this.f183256b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(1, this.f183256b, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final void i7(@k DeepLink deepLink) {
            b.a.a(this.f183256b, deepLink, null, null, 6);
        }
    }

    /* compiled from: BadgeDetailsBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.loyalty.ui.badge_details.c$c, reason: collision with other inner class name */
    public static final class C5378c extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f183258m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5378c(Context context) {
            super(1);
            this.f183258m = context;
        }

        @Override // Y41.l
        public final G0 invoke(View view) throws Resources.NotFoundException {
            View view2 = view;
            c cVar = c.this;
            ArrayList arrayList = cVar.f183251E.f183249a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((com.avito.conveyor_item.a) it.next()) instanceof com.avito.android.loyalty.ui.items.collapse.a) {
                        Context context = this.f183258m;
                        boolean z12 = context.getResources().getBoolean(R.bool.is_tablet);
                        view2.getLayoutParams().height = z12 ? (int) cVar.getContext().getResources().getDimension(R.dimen.design_bottom_sheet_modal_max_width) : C35835l0.g(context).y;
                    }
                }
            }
            RecyclerView recyclerView = (RecyclerView) view2;
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.l(new PV.a(y6.b(2), y6.b(28), y6.b(24), y6.b(24)), -1);
            com.avito.konveyor.adapter.d dVar = cVar.f183253G;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            cVar.V(cVar.f183254H);
            return G0.f406611a;
        }
    }

    /* compiled from: BadgeDetailsBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            Button button = (Button) view.findViewById(R.id.bottom_sheet_button_footer_button_view);
            c cVar = c.this;
            if (button != null) {
                com.avito.android.loyalty.ui.badge_details.a aVar = cVar.f183251E.f183250b;
                com.avito.android.lib.design.button.b.a(button, aVar != null ? aVar.f183247a : null, false);
            }
            button.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(cVar, 20));
            return G0.f406611a;
        }
    }

    public c(@k Context context, @k com.avito.android.loyalty.ui.badge_details.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23), 0, 2, null);
        this.f183251E = bVar;
        this.f183252F = aVar;
        this.f183254H = bVar.f183249a;
        com.avito.android.loyalty.di.badge_details.d.a().a(new a(), new b(aVar)).a(this);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        B(R.layout.badge_details_content_v2, bVar.f183250b != null ? R.layout.bottom_sheet_button_footer : -1, new C5378c(context), new d(), true);
    }

    public final void V(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            arrayList2.add(aVar);
            if (aVar instanceof com.avito.android.loyalty.ui.items.collapse.a) {
                com.avito.android.loyalty.ui.items.collapse.a aVar2 = (com.avito.android.loyalty.ui.items.collapse.a) aVar;
                if (aVar2.f183667d) {
                    arrayList2.addAll(aVar2.f183668e);
                }
            }
        }
        com.avito.konveyor.adapter.d dVar = this.f183253G;
        if (dVar == null) {
            dVar = null;
        }
        dVar.l(arrayList2, null);
    }
}
