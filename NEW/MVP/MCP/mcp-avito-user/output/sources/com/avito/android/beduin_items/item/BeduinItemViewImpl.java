package com.avito.android.beduin_items.item;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39736a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin_items/item/BeduinItemViewImpl;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin_items/item/h;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinItemViewImpl extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f105231b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f105232c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f105233d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f105234e;

    /* compiled from: BeduinItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin_items/item/BeduinItemViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_items.item.BeduinItemViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    public BeduinItemViewImpl(@k View view, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f105231b = abstractC25658a;
        this.f105232c = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.beduin_items_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f105233d = recyclerView;
        recyclerView.setAdapter(abstractC25658a);
        recyclerView.setScrollContainer(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass1());
    }

    @Override // com.avito.android.beduin_items.item.h
    public final void dT(@k com.avito.android.beduin_items.item.a aVar) {
        this.f105233d.setContentDescription(aVar.f105236b);
        InterfaceC39736a interfaceC39736a = aVar.f105238d;
        final AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f105231b;
        abstractC25658a.o(interfaceC39736a);
        y yVar = this.f105234e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f105234e = (y) aVar.f105237c.j0(this.f105232c.e()).t0(new l41.g() { // from class: com.avito.android.beduin_items.item.BeduinItemViewImpl.a
            @Override // l41.g
            public final void accept(Object obj) {
                abstractC25658a.m((List) obj);
            }
        });
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f105234e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
