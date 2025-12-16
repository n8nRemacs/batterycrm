package com.avito.android.developments_agency_search.adapter.horizontal_list;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;

/* compiled from: HorizontalListLayoutManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/horizontal_list/HorizontalListLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalListLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public float f136289G;

    /* renamed from: H, reason: collision with root package name */
    @U
    public int f136290H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Rect f136291I;

    public HorizontalListLayoutManager() {
        super(0, false);
        this.f136289G = 1.0f;
        this.f136291I = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@Y61.k View view) {
        int iMax;
        if (this.f53690r != 0) {
            super.D0(view);
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Rect rect = this.f136291I;
        H(view, rect);
        int i12 = rect.left;
        int i13 = rect.top + rect.bottom;
        int paddingRight = ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + getPaddingRight() + getPaddingLeft() + i12 + i12;
        int i14 = this.f53850p;
        int i15 = this.f53848n;
        float f12 = this.f136289G;
        if (f12 == 0.0f) {
            iMax = ((ViewGroup.MarginLayoutParams) nVar).width;
        } else if (f12 == 1.0f) {
            iMax = -1;
        } else {
            int iO02 = o0() - 1;
            if (iO02 < 0) {
                iO02 = 0;
            }
            iMax = Math.max((int) ((((this.f53850p - getPaddingRight()) - getPaddingLeft()) - (iO02 * this.f136290H)) * this.f136289G), ((ViewGroup.MarginLayoutParams) nVar).width);
        }
        view.measure(RecyclerView.m.f0(i14, i15, paddingRight, iMax, I()), RecyclerView.m.f0(this.f53851q, this.f53849o, ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + getPaddingBottom() + getPaddingTop() + i13, -1, J()));
    }
}
