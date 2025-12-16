package com.avito.android.advert.item.additionalSeller;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.additionalSeller.feature_item.FeatureItem;
import com.avito.android.advert.item.additionalSeller.t;
import com.avito.android.remote.model.DevelopmentFeature;
import com.avito.android.remote.model.Image;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSellerFeaturesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/u;", "Lcom/avito/android/advert/item/additionalSeller/t;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t.b f72632b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f72633c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f72634d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.konveyor.adapter.h f72635e;

    /* compiled from: AdditionalSellerFeaturesItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/additionalSeller/u$a", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            recyclerView.getClass();
            if (RecyclerView.U(view) != 0) {
                rect.left = y6.b(8);
            }
        }
    }

    /* compiled from: AdditionalSellerFeaturesItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<DevelopmentFeature> f72636l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ u f72637m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<DevelopmentFeature> list, u uVar) {
            super(1);
            this.f72636l = list;
            this.f72637m = uVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            DevelopmentFeature developmentFeature;
            int iIntValue = num.intValue();
            List<DevelopmentFeature> list = this.f72636l;
            if (list != null && (developmentFeature = list.get(iIntValue)) != null) {
                this.f72637m.f72632b.y(developmentFeature);
            }
            return G0.f406611a;
        }
    }

    public u(@Y61.k View view, @Y61.k t.b bVar) {
        super(view);
        this.f72632b = bVar;
        view.getContext();
        this.f72633c = (TextView) view.findViewById(R.id.additional_seller_features_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.additional_seller_features);
        this.f72634d = recyclerView;
        recyclerView.l(new a(), -1);
    }

    @Override // com.avito.android.advert.item.additionalSeller.t
    public final void V50(@Y61.l List<DevelopmentFeature> list) throws BlueprintCollisionException {
        int i12 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView recyclerView = this.f72634d;
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.android.advert.item.additionalSeller.feature_item.b bVar = new com.avito.android.advert.item.additionalSeller.feature_item.b(new com.avito.android.advert.item.additionalSeller.feature_item.e(new b(list, this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f72635e = hVar;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
        ArrayList arrayList = null;
        if (list != null) {
            List<DevelopmentFeature> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                DevelopmentFeature developmentFeature = (DevelopmentFeature) obj;
                arrayList2.add(new FeatureItem(String.valueOf(i12), developmentFeature.getName(), (Image) C42745f0.E(developmentFeature.getImages())));
                i12 = i13;
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            com.avito.konveyor.adapter.h hVar2 = this.f72635e;
            if (hVar2 != null) {
                hVar2.f338510e = new UV0.c(arrayList);
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.avito.android.advert.item.additionalSeller.t
    public final void b(@Y61.l String str) {
        I5.a(this.f72633c, str, false);
    }
}
