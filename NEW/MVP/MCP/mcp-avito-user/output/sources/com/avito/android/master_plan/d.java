package com.avito.android.master_plan;

import android.app.Application;
import android.content.Intent;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.master_plan.MasterPlanActivity;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MasterPlanIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/d;", "Lcom/avito/android/master_plan/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f186020a;

    @Inject
    public d(@Y61.k Application application) {
        this.f186020a = application;
    }

    @Override // com.avito.android.master_plan.c
    @Y61.k
    public final Intent a(@Y61.k Image image, @Y61.l ArrayList<MasterPlanPin> arrayList, float f12, @Y61.k MasterPlanPin masterPlanPin, @Y61.k String str, @Y61.k String str2) {
        new MasterPlanActivity.a();
        Intent intent = new Intent(this.f186020a, (Class<?>) MasterPlanActivity.class);
        intent.putExtra("image", image);
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("pins", arrayList);
        }
        intent.putExtra("scroll", f12);
        intent.putExtra("selectedPin", masterPlanPin);
        intent.putExtra("developmentId", str);
        intent.putExtra(SearchParamsConverterKt.SOURCE, str2);
        return intent;
    }
}
