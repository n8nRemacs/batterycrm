package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes8.dex */
public final class zi0 extends RecyclerView.Adapter<vi0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<b30> f392271a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final wi0 f392272b;

    /* JADX WARN: Multi-variable type inference failed */
    public zi0(@Y61.k w20 w20Var, @Y61.k List<? extends b30> list) {
        this.f392271a = list;
        this.f392272b = new wi0(w20Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f392271a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((vi0) c12).a(this.f392271a.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return this.f392272b.a(viewGroup);
    }
}
