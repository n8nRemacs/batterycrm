package com.avito.android.advert.item.beduin.v2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ItemCardNativeCellWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/g;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/advert/item/beduin/v2/k;", "Landroid/view/ViewGroup;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends AbstractC36333c<k, ViewGroup> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f73345m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final q f73346n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public String f73347o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public a f73348p;

    /* compiled from: ItemCardNativeCellWrapper.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/g$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f73349a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.konveyor.a f73350b;

        /* renamed from: c, reason: collision with root package name */
        public final LayoutInflater f73351c;

        public a(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.a aVar) {
            this.f73349a = viewGroup;
            this.f73350b = aVar;
            this.f73351c = LayoutInflater.from(viewGroup.getContext());
        }
    }

    /* compiled from: ItemCardNativeCellWrapper.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/g$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.conveyor_item.a f73352a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.konveyor.adapter.b f73353b;

        public b(@Y61.k com.avito.conveyor_item.a aVar, @Y61.k com.avito.konveyor.adapter.b bVar) {
            this.f73352a = aVar;
            this.f73353b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f73352a, bVar.f73352a) && L.f(this.f73353b, bVar.f73353b);
        }

        public final int hashCode() {
            return this.f73353b.hashCode() + (this.f73352a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "NativeItem(item=" + this.f73352a + ", viewHolder=" + this.f73353b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k com.avito.konveyor.a aVar, @Y61.k q qVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f73345m = aVar;
        this.f73346n = qVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, k kVar2) {
        int iB2;
        int iB3;
        int iB4;
        ViewGroup viewGroup = (ViewGroup) view;
        k kVar3 = kVar2;
        String str = kVar3.f73360a;
        this.f73347o = str;
        boolean z12 = kVar3.f73361b;
        M.a(viewGroup, z12);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (z12) {
                ET0.b bVar = kVar3.f73362c;
                int iB5 = ET0.d.b(viewGroup.getResources(), bVar != null ? bVar.f4016a : 0);
                iB3 = ET0.d.b(viewGroup.getResources(), bVar != null ? bVar.f4017b : 0);
                iB4 = ET0.d.b(viewGroup.getResources(), bVar != null ? bVar.f4019d : 0);
                iB2 = ET0.d.b(viewGroup.getResources(), bVar != null ? bVar.f4018c : 0);
                i = iB5;
            } else {
                iB2 = 0;
                iB3 = 0;
                iB4 = 0;
            }
            marginLayoutParams.setMargins(i, iB4, iB3, iB2);
        }
        a aVar = this.f73348p;
        if (aVar == null) {
            aVar = new a(viewGroup, this.f73345m);
            this.f73348p = aVar;
        }
        List<com.avito.conveyor_item.a> listA = this.f73346n.a(str);
        com.avito.beduin.v2.render.android_view.diff.h.a(e.b.a(com.avito.beduin.v2.render.android_view.diff.e.f337969a, new e(aVar, listA)), new f(aVar, listA));
        Y41.l<Integer, G0> lVar = kVar3.f73363d;
        if (lVar != null) {
            viewGroup.setOnHierarchyChangeListener(new h(viewGroup, lVar));
            lVar.invoke(Integer.valueOf(listA.size()));
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }
}
