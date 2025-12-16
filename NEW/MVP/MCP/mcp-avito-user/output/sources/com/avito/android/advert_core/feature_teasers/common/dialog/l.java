package com.avito.android.advert_core.feature_teasers.common.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserOption;
import com.avito.android.advert_core.feature_teasers.common.dialog.AdvertDetailsFeatureTeaserDialogInfo;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFeatureTeaserDialogFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/l;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/n;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class l implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f83644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f83645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.feature_teasers.common.k f83646c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f83647d;

    @Inject
    public l(@B9.a @Y61.k com.avito.konveyor.a aVar, @B9.a @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k com.avito.android.advert_core.feature_teasers.common.k kVar, @Y61.k b bVar) {
        this.f83644a = aVar;
        this.f83645b = hVar;
        this.f83646c = kVar;
        this.f83647d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.avito.android.advert_core.feature_teasers.common.dialog.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    @Override // com.avito.android.advert_core.feature_teasers.common.dialog.n
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k Context context, @Y61.k AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo) {
        ?? arrayList;
        int i12 = 0;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        int i13 = 1;
        dVar.D(R.layout.advert_details_feature_teaser_dialog, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.recycler);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        com.avito.konveyor.adapter.h hVar = this.f83645b;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, this.f83644a));
        recyclerView.o(new k(dVar, linearLayoutManager));
        View viewFindViewById = dVar.findViewById(R.id.advert_details_features_dialog_close_button);
        viewFindViewById.setOnClickListener(new S7.a(dVar, 6));
        boolean z12 = advertDetailsFeatureTeaserDialogInfo instanceof AdvertDetailsFeatureTeaserDialogInfo.CheckedByAvito;
        D6.G(viewFindViewById, !z12);
        D6.G(dVar.findViewById(R.id.apply_btn_container), z12);
        if (this.f83646c.c()) {
            D6.w(dVar.findViewById(R.id.advert_details_features_dialog__thumb));
        }
        ?? r102 = this.f83647d;
        if (z12) {
            Button button = (Button) dVar.findViewById(R.id.apply_btn);
            button.setOnClickListener(new S7.a(dVar, 5));
            AdvertDetailsFeatureTeaserDialogInfo.CheckedByAvito checkedByAvito = (AdvertDetailsFeatureTeaserDialogInfo.CheckedByAvito) advertDetailsFeatureTeaserDialogInfo;
            button.setText(checkedByAvito.f83617e);
            r102.getClass();
            arrayList = new ArrayList();
            r102.a(10, arrayList);
            J0 j02 = r102.f83621b;
            long jA2 = j02.a();
            AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = checkedByAvito.f83614b;
            arrayList.add(new e(jA2, advertDetailsFeatureTeaserOption.f83611b, null, R.attr.textHeadingLarge, null, advertDetailsFeatureTeaserOption.f83612c, null, null, R.dimen.advert_details_feature_teaser_icon_padding, 212, null));
            r102.a(10, arrayList);
            arrayList.add(new e(j02.a(), checkedByAvito.f83615c, null, R.attr.textBody, null, null, null, null, 0, 500, null));
            r102.a(10, arrayList);
            for (Object obj : checkedByAvito.f83616d) {
                int i14 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption2 = (AdvertDetailsFeatureTeaserOption) obj;
                if (i12 > 0) {
                    r102.a(8, arrayList);
                }
                arrayList.add(new e(j02.a(), advertDetailsFeatureTeaserOption2.f83611b, null, R.attr.textBody, null, null, advertDetailsFeatureTeaserOption2.f83612c, Integer.valueOf(R.dimen.advert_details_checked_by_avito_option_left_padding), R.dimen.advert_details_feature_teaser_option_icon_padding, 52, null));
                i12 = i14;
            }
        } else if (advertDetailsFeatureTeaserDialogInfo instanceof AdvertDetailsFeatureTeaserDialogInfo.FeaturesList) {
            AdvertDetailsFeatureTeaserDialogInfo.FeaturesList featuresList = (AdvertDetailsFeatureTeaserDialogInfo.FeaturesList) advertDetailsFeatureTeaserDialogInfo;
            ((TextView) dVar.findViewById(R.id.advert_details_features_dialog_title)).setText(featuresList.f83618b);
            r102.getClass();
            ArrayList arrayList2 = new ArrayList();
            com.avito.android.advert_core.feature_teasers.common.k kVar = r102.f83620a;
            r102.a(kVar.c() ? 12 : 20, arrayList2);
            J0 j03 = r102.f83621b;
            arrayList2.add(new e(j03.a(), featuresList.f83618b, null, R.attr.textHeadingLarge, null, null, null, null, 0, 500, null));
            LinkedHashMap linkedHashMap = featuresList.f83619c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!kVar.c() || i13 == 0) {
                    r102.a(24, arrayList2);
                } else {
                    r102.a(8, arrayList2);
                    i13 = i12;
                }
                arrayList2.add(new e(j03.a(), (String) entry.getKey(), null, R.attr.textHeadingSmall, null, null, null, null, 0, 500, null));
                for (String str : (List) entry.getValue()) {
                    r102.a(10, arrayList2);
                    arrayList2.add(new e(j03.a(), str, null, R.attr.textBody, null, null, null, null, 0, 500, null));
                }
                i12 = 0;
            }
            if (!linkedHashMap.isEmpty()) {
                r102.a(24, arrayList2);
            }
            arrayList = arrayList2;
        } else {
            arrayList = C42784z0.f406748b;
        }
        hVar.f338510e = new UV0.c(arrayList);
        return dVar;
    }
}
