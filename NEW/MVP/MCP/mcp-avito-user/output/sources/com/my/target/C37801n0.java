package com.my.target;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37801n0 extends LinearLayoutManager {

    /* renamed from: com.my.target.n0$a */
    public interface a {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(View view) {
        ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).width = (int) (this.f53850p * 0.0f);
        super.D0(view);
    }
}
