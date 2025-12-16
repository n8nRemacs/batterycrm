package com.avito.android.tariff.cpr.configure.advance.items.hints;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35949t5;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureHintsItemsAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/hints/i;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/tariff/cpr/configure/advance/items/hints/j;", "Lcom/avito/android/tariff/cpr/configure/advance/items/hints/i$b;", "<init>", "()V", "a", "b", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends B<j, b> {

    /* compiled from: CprConfigureHintsItemsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/hints/i$a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/tariff/cpr/configure/advance/items/hints/j;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f295281a = new a();

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(j jVar, j jVar2) {
            return jVar.equals(jVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(j jVar, j jVar2) {
            return L.f(jVar.f295285a, jVar2.f295285a);
        }
    }

    /* compiled from: CprConfigureHintsItemsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/hints/i$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f295282b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f295283c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final SimpleDraweeView f295284d;

        public b(@k View view) {
            super(view);
            this.f295282b = view;
            this.f295283c = (TextView) view.findViewById(R.id.tv_hint_description);
            this.f295284d = (SimpleDraweeView) view.findViewById(R.id.iv_hint_image);
        }
    }

    public i() {
        super(a.f295281a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        j item = getItem(i12);
        com.avito.android.util.text.j.c(bVar.f295283c, item.f295285a, null);
        l.w(item.f295286b, C35949t5.a(bVar.f295284d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.tariff_cpr_hint_pager_item, viewGroup, false);
        viewB.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new b(viewB);
    }
}
