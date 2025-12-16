package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedOptions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/WithSectionedOptions;", "", "optionsCount", "", "getOptionsCount", "()I", "sectionedOptions", "", "Lcom/avito/android/remote/model/category_parameters/SectionedOptions;", "getSectionedOptions", "()Ljava/util/List;", "sectionedOptionsAsEntities", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "getSectionedOptionsAsEntities", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface WithSectionedOptions {

    /* compiled from: SectionedOptions.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int getOptionsCount(@k WithSectionedOptions withSectionedOptions) {
            List<SectionedOptions> sectionedOptions = withSectionedOptions.getSectionedOptions();
            if (sectionedOptions == null) {
                sectionedOptions = C42784z0.f406748b;
            }
            Iterator<T> it = sectionedOptions.iterator();
            int size = 0;
            while (it.hasNext()) {
                List<SelectParameter.Value> options = ((SectionedOptions) it.next()).getOptions();
                if (options == null) {
                    options = C42784z0.f406748b;
                }
                size += options.size();
            }
            return size;
        }

        @k
        public static List<ParcelableEntity<String>> getSectionedOptionsAsEntities(@k WithSectionedOptions withSectionedOptions) {
            List<SectionedOptions> sectionedOptions = withSectionedOptions.getSectionedOptions();
            if (sectionedOptions == null) {
                sectionedOptions = C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            for (SectionedOptions sectionedOptions2 : sectionedOptions) {
                String label = sectionedOptions2.getLabel();
                SectionTitle sectionTitle = null;
                if (label != null) {
                    if (label.length() <= 0 || !O2.a(sectionedOptions2.getOptions())) {
                        label = null;
                    }
                    if (label != null) {
                        sectionTitle = new SectionTitle(label, sectionedOptions2.getId());
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (sectionTitle != null) {
                    arrayList2.add(sectionTitle);
                }
                List<SelectParameter.Value> options = sectionedOptions2.getOptions();
                if (options != null) {
                    arrayList2.addAll(options);
                }
                C42745f0.h(arrayList2, arrayList);
            }
            return arrayList;
        }
    }

    int getOptionsCount();

    @l
    List<SectionedOptions> getSectionedOptions();

    @k
    List<ParcelableEntity<String>> getSectionedOptionsAsEntities();
}
