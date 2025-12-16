package com.avito.android.short_term_rent.view.components.toggle_v2;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.ArrayList;
import kotlin.Metadata;
import tw0.InterfaceC48733a;

/* compiled from: ToggleV2Adapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/c$a;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @l
    public final e f283069c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f283070d = new ArrayList();

    /* compiled from: ToggleV2Adapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/toggle_v2/c$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends RecyclerView.C {
        public a() {
            throw null;
        }
    }

    public c(@l e eVar) {
        this.f283069c = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f283070d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ToggleV2Button toggleV2Button = (ToggleV2Button) ((a) c12).itemView;
        InterfaceC48733a interfaceC48733a = (InterfaceC48733a) this.f283070d.get(i12);
        e eVar = this.f283069c;
        toggleV2Button.setSelected(eVar != null ? eVar.a(i12) : false);
        toggleV2Button.setEnabled(interfaceC48733a.getF281727d());
        toggleV2Button.setText(interfaceC48733a.getF281726c());
        toggleV2Button.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i12, 7, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a((ToggleV2Button) C0.b(viewGroup, R.layout.toggle_v2_button_viewholder, viewGroup, false));
    }
}
