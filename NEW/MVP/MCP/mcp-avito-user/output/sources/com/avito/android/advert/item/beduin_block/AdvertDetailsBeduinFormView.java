package com.avito.android.advert.item.beduin_block;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_shared.model.utils.m;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: AdvertDetailsBeduinFormView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormView;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsBeduinFormView extends com.avito.konveyor.adapter.b implements com.avito.konveyor.util.d<AdvertDetailsBeduinFormItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f73393b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40691b f73394c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f73395d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f73396e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public y f73397f;

    /* compiled from: AdvertDetailsBeduinFormView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.beduin_block.AdvertDetailsBeduinFormView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    public AdvertDetailsBeduinFormView(@k View view, @k InterfaceC39736a interfaceC39736a, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k InterfaceC40691b interfaceC40691b, @k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f73393b = abstractC25658a;
        this.f73394c = interfaceC40691b;
        this.f73395d = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.beduin_block_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f73396e = recyclerView;
        recyclerView.setAdapter(abstractC25658a);
        recyclerView.setScrollContainer(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass1());
        abstractC25658a.o(interfaceC39736a);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f73397f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) throws Resources.NotFoundException {
        AdvertDetailsBeduinFormItem advertDetailsBeduinFormItem = (AdvertDetailsBeduinFormItem) aVar;
        RecyclerView recyclerView = this.f73396e;
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(advertDetailsBeduinFormItem.f73390e);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        BeduinForm beduinForm = advertDetailsBeduinFormItem.f73388c;
        recyclerView.setTag(R.id.advert_details_beduin_block_form_id, beduinForm.getF105312b());
        InterfaceC40691b interfaceC40691b = this.f73394c;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.getF103565k().get(beduinForm.getF105312b());
        if (interfaceC43779aJ == null) {
            interfaceC43779aJ = interfaceC40691b.j();
            m.b(interfaceC43779aJ, beduinForm);
        }
        y yVar = this.f73397f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        I0 i0J0 = interfaceC43779aJ.getF103348p().j0(this.f73395d.e());
        final AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f73393b;
        this.f73397f = (y) i0J0.t0(new l41.g() { // from class: com.avito.android.advert.item.beduin_block.e
            @Override // l41.g
            public final void accept(Object obj) {
                abstractC25658a.m((List) obj);
            }
        });
    }
}
