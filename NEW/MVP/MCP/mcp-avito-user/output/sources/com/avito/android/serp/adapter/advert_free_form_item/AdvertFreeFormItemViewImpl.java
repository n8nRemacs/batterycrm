package com.avito.android.serp.adapter.advert_free_form_item;

import Q81.a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.seller_promotions.o;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertFreeFormItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/advert_free_form_item/AdvertFreeFormItemViewImpl;", "Lcom/avito/android/serp/adapter/advert_free_form_item/n;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdvertFreeFormItemViewImpl extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f268705f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f268706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.common.component.adapter.b f268707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NoTouchEventRecyclerView f268708d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f268709e;

    /* compiled from: AdvertFreeFormItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/advert_free_form_item/AdvertFreeFormItemViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.advert_free_form_item.AdvertFreeFormItemViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    /* compiled from: AdvertFreeFormItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268710a;

        static {
            int[] iArr = new int[PhoneLoadingState.values().length];
            try {
                PhoneLoadingState phoneLoadingState = PhoneLoadingState.f430441b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f268710a = iArr;
        }
    }

    public AdvertFreeFormItemViewImpl(@Y61.k View view, @Y61.k com.avito.android.beduin_shared.common.component.adapter.b bVar) {
        super(view);
        this.f268706b = view;
        this.f268707c = bVar;
        View viewFindViewById = view.findViewById(R.id.free_form_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.NoTouchEventRecyclerView");
        }
        NoTouchEventRecyclerView noTouchEventRecyclerView = (NoTouchEventRecyclerView) viewFindViewById;
        this.f268708d = noTouchEventRecyclerView;
        View viewFindViewById2 = view.findViewById(R.id.viewed_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f268709e = (DockingBadge) viewFindViewById2;
        noTouchEventRecyclerView.setAdapter(bVar);
        noTouchEventRecyclerView.setScrollContainer(false);
        noTouchEventRecyclerView.getContext();
        noTouchEventRecyclerView.setLayoutManager(new AnonymousClass1());
    }

    @Override // com.avito.android.serp.adapter.advert_free_form_item.n
    public final void Co(@Y61.k ConstructorAdvertItem constructorAdvertItem) {
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> freeFormConverted = constructorAdvertItem.getFreeFormConverted();
        D6.G(this.f268708d, O2.a(freeFormConverted));
        if (freeFormConverted != null) {
            this.f268707c.k(freeFormConverted);
        }
        boolean zIsGigShift = constructorAdvertItem.getDisplayType().isGigShift();
        DockingBadge dockingBadge = this.f268709e;
        if (zIsGigShift) {
            D6.w(dockingBadge);
        } else {
            D6.G(dockingBadge, constructorAdvertItem.getF107481q());
        }
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        a.C0890a.a(this, z12);
    }

    @Override // com.avito.android.serp.adapter.advert_free_form_item.n
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f268706b.setOnClickListener(new o(1, aVar));
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        Button button = (Button) this.f268708d.findViewWithTag("button_with_loader_tag");
        if (button != null) {
            if (a.f268710a[phoneLoadingState.ordinal()] == 1) {
                button.setLoading(true);
            } else {
                button.setLoading(false);
            }
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
