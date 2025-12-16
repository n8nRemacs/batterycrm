package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;

/* compiled from: SelectParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "it", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned$Section;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectParameter$Sectioned$listToShow$1 extends N implements l<SelectParameter.Sectioned.Section, List<? extends ParcelableEntity<String>>> {
    public static final SelectParameter$Sectioned$listToShow$1 INSTANCE = new SelectParameter$Sectioned$listToShow$1();

    public SelectParameter$Sectioned$listToShow$1() {
        super(1);
    }

    @Override // Y41.l
    @Y61.l
    public final List<ParcelableEntity<String>> invoke(@k SelectParameter.Sectioned.Section section) {
        if (section.getValues().isEmpty()) {
            return null;
        }
        String sectionTitle = section.getSectionTitle();
        if (sectionTitle == null || sectionTitle.length() == 0) {
            return section.getValues();
        }
        t0 t0Var = new t0(2);
        t0Var.a(new SectionTitle(section.getSectionTitle(), null, 2, null));
        t0Var.b(section.getValues().toArray(new SelectParameter.Value[0]));
        ArrayList<Object> arrayList = t0Var.f406850a;
        return C42745f0.U(arrayList.toArray(new ParcelableEntity[arrayList.size()]));
    }
}
