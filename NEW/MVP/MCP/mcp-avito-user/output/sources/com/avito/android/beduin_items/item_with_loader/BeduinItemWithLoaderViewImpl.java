package com.avito.android.beduin_items.item_with_loader;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinItemWithLoaderView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin_items/item_with_loader/BeduinItemWithLoaderViewImpl;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin_items/item_with_loader/h;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinItemWithLoaderViewImpl extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f105248b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f105249c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f105250d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Spinner f105251e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public y f105252f;

    /* compiled from: BeduinItemWithLoaderView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin_items/item_with_loader/BeduinItemWithLoaderViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_items.item_with_loader.BeduinItemWithLoaderViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    public BeduinItemWithLoaderViewImpl(@k View view, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f105248b = abstractC25658a;
        this.f105249c = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.beduin_items_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f105250d = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.beduin_items_progress_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f105251e = (Spinner) viewFindViewById2;
        recyclerView.setAdapter(abstractC25658a);
        recyclerView.setScrollContainer(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass1());
    }

    @Override // com.avito.android.beduin_items.item_with_loader.h
    public final void Ll(@k com.avito.android.beduin_items.item_with_loader.a aVar) {
        int i12 = aVar.f105258f;
        BeduinHorizontalIndent beduinHorizontalIndent = new BeduinHorizontalIndent(Integer.valueOf(i12), Integer.valueOf(i12));
        final AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f105248b;
        abstractC25658a.p(beduinHorizontalIndent);
        this.f105250d.setContentDescription(aVar.f105254b);
        abstractC25658a.o(aVar.f105256d);
        y yVar = this.f105252f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f105252f = (y) aVar.f105255c.j0(this.f105249c.e()).t0(new l41.g() { // from class: com.avito.android.beduin_items.item_with_loader.BeduinItemWithLoaderViewImpl.a
            @Override // l41.g
            public final void accept(Object obj) {
                abstractC25658a.m((List) obj);
            }
        });
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f105252f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.beduin_items.item_with_loader.h
    public final void u5(boolean z12) {
        this.f105251e.setVisibility(z12 ? 0 : 8);
    }
}
