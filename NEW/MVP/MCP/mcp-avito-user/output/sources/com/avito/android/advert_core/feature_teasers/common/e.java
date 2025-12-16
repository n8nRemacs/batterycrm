package com.avito.android.advert_core.feature_teasers.common;

import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.advert_core.feature_teasers.common.dialog.AdvertDetailsFeatureTeaserDialogInfo;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import com.avito.android.remote.model.feature_teaser.CheckedByAvito;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFeatureTeaserItemsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/e;", "Lcom/avito/android/advert_core/feature_teasers/common/b;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements b {
    @Inject
    public e() {
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.b
    @Y61.l
    public final ArrayList a(@Y61.k Y41.l lVar, @Y61.l List list) {
        AdvertDetailsFeatureTeaserDialogInfo.FeaturesList featuresList;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ApartmentFeature apartmentFeature = (ApartmentFeature) obj;
            ApartmentFeature.ActionInfo actionInfo = apartmentFeature.getActionInfo();
            if (actionInfo != null) {
                String title = actionInfo.getTitle();
                List<ApartmentFeature.FeatureBloc> blocs = actionInfo.getBlocs();
                int iF2 = P0.f(C42745f0.q(blocs, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (ApartmentFeature.FeatureBloc featureBloc : blocs) {
                    linkedHashMap.put(featureBloc.getTitle(), featureBloc.getItems());
                }
                featuresList = new AdvertDetailsFeatureTeaserDialogInfo.FeaturesList(linkedHashMap, title);
            } else {
                featuresList = null;
            }
            long jLongValue = ((Number) lVar.invoke(Integer.valueOf(i12))).longValue();
            String slug = apartmentFeature.getSlug();
            AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = new AdvertDetailsFeatureTeaserOption(apartmentFeature.getTitle(), null);
            String str = apartmentFeature.getSlug() + '_' + i12;
            String actionText = apartmentFeature.getActionText();
            List<String> previewOptions = apartmentFeature.getPreviewOptions();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(previewOptions, 10));
            Iterator<T> it = previewOptions.iterator();
            while (it.hasNext()) {
                arrayList2.add(new AdvertDetailsFeatureTeaserOption((String) it.next(), null));
            }
            arrayList.add(new AdvertDetailsFeatureTeaserItem(jLongValue, 0, str, null, null, advertDetailsFeatureTeaserOption, featuresList, null, arrayList2, actionText, slug, null, 2200, null));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.b
    @Y61.l
    public final AdvertDetailsFeatureTeaserItem b(@Y61.l CheckedByAvito checkedByAvito, long j12) {
        if (checkedByAvito == null) {
            return null;
        }
        List<String> checks = checkedByAvito.getActionInfo().getChecks();
        ArrayList arrayList = new ArrayList(C42745f0.q(checks, 10));
        Iterator<T> it = checks.iterator();
        while (it.hasNext()) {
            arrayList.add(new AdvertDetailsFeatureTeaserOption((String) it.next(), AdvertDetailsFeatureTeaserItem.Icon.f83608c));
        }
        String title = checkedByAvito.getActionInfo().getTitle();
        AdvertDetailsFeatureTeaserItem.Icon icon = AdvertDetailsFeatureTeaserItem.Icon.f83607b;
        return new AdvertDetailsFeatureTeaserItem(j12, 0, "CheckedByAvito", null, null, new AdvertDetailsFeatureTeaserOption(checkedByAvito.getTitle(), icon), new AdvertDetailsFeatureTeaserDialogInfo.CheckedByAvito(new AdvertDetailsFeatureTeaserOption(title, icon), checkedByAvito.getActionInfo().getSubtitle(), arrayList, checkedByAvito.getActionInfo().getApplyBtnText()), checkedByAvito.getSubtitle(), arrayList, checkedByAvito.getActionText(), null, null, 3096, null);
    }
}
