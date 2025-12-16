package com.avito.android.beduin.common.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: BeduinRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "maxHeight", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.utils.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28812h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28814j f103521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f103522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference<RecyclerView> f103523d;

    public C28812h(C28814j c28814j, t tVar, WeakReference<RecyclerView> weakReference) {
        this.f103521b = c28814j;
        this.f103522c = tVar;
        this.f103523d = weakReference;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        RecyclerView.C cL2;
        int iIntValue = ((Number) obj).intValue();
        this.f103521b.f103526b.put(this.f103522c, Integer.valueOf(iIntValue));
        WeakReference<RecyclerView> weakReference = this.f103523d;
        RecyclerView recyclerView = weakReference.get();
        if (recyclerView != null) {
            while (recyclerView != null && !(recyclerView.getLayoutParams() instanceof RecyclerView.n)) {
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            ViewParent parent2 = recyclerView != null ? recyclerView.getParent() : null;
            RecyclerView recyclerView2 = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
            if (recyclerView != null && recyclerView2 != null && (cL2 = recyclerView2.L(recyclerView)) != null) {
                int adapterPosition = cL2.getAdapterPosition();
                RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(adapterPosition, C28810f.f103517a);
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = weakReference.get();
        ViewGroup.LayoutParams layoutParams = recyclerView3 != null ? recyclerView3.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = iIntValue;
    }
}
