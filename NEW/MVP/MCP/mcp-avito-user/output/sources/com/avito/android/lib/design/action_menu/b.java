package com.avito.android.lib.design.action_menu;

import PK0.n;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.imv_similiar_adverts.h;
import com.avito.android.lib.design.action_menu.d;
import com.avito.android.lib.design.action_menu.e;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionMenuAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/action_menu/b;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/lib/design/action_menu/d$a;", "Lcom/avito/android/lib/design/action_menu/b$a;", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends B<d.a, a> {

    /* renamed from: e, reason: collision with root package name */
    @l
    public e.b f178222e;

    /* compiled from: ActionMenuAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/action_menu/b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f178223g = 0;

        /* renamed from: b, reason: collision with root package name */
        public final LinearLayout f178224b;

        /* renamed from: c, reason: collision with root package name */
        public final TextView f178225c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f178226d;

        /* renamed from: e, reason: collision with root package name */
        public final Spinner f178227e;

        /* renamed from: f, reason: collision with root package name */
        public final FrameLayout f178228f;

        public a(@k View view) {
            super(view);
            this.f178224b = (LinearLayout) view.findViewById(R.id.action_menu_item_root);
            this.f178225c = (TextView) view.findViewById(R.id.action_menu_item_icon);
            this.f178226d = (TextView) view.findViewById(R.id.action_menu_item_text);
            this.f178227e = (Spinner) view.findViewById(R.id.action_menu_item_spinner);
            this.f178228f = (FrameLayout) view.findViewById(R.id.iconWrapper);
        }
    }

    public b() {
        super(c.f178229a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        d.a item = getItem(i12);
        e.b bVar = this.f178222e;
        String strK0 = item.f178236a.k0(aVar.itemView.getContext());
        TextView textView = aVar.f178226d;
        textView.setText(strK0);
        h hVar = new h(item, 15);
        LinearLayout linearLayout = aVar.f178224b;
        linearLayout.setOnClickListener(hVar);
        if (bVar != null) {
            linearLayout.setPadding(bVar.f178251c, bVar.f178249a, bVar.f178252d, bVar.f178250b);
            int i13 = bVar.f178254f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, i13);
            int i14 = 0;
            layoutParams.setMargins(0, 0, bVar.f178258j, 0);
            FrameLayout frameLayout = aVar.f178228f;
            frameLayout.setLayoutParams(layoutParams);
            Spinner spinner = aVar.f178227e;
            com.avito.android.lib.design.spinner.a aVar2 = bVar.f178257i;
            spinner.setStyle(aVar2);
            if (Build.VERSION.SDK_INT >= 29) {
                spinner.setMinWidth(aVar2.f180562b);
                spinner.setMinHeight(aVar2.f180563c);
            }
            TextView textView2 = aVar.f178225c;
            n nVar = bVar.f178255g;
            com.avito.android.lib.design.text_view.e.a(textView2, nVar);
            int i15 = bVar.f178253e;
            textView2.setTextColor(i15);
            String str = item.f178237b;
            if (str != null) {
                FV.a.a(FV.a.f4720a, textView2, com.avito.android.lib.util.f.m(str));
            }
            boolean z12 = item.f178238c;
            textView2.setVisibility(!z12 && str != null ? 0 : 8);
            spinner.setVisibility(z12 ? 0 : 8);
            if (!z12 && str == null) {
                i14 = 8;
            }
            frameLayout.setVisibility(i14);
            com.avito.android.lib.design.text_view.e.a(textView, nVar);
            textView.setTextColor(i15);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.components_design_dropdown_action_menu_item, viewGroup, false));
    }
}
