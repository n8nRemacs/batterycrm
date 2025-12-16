package com.avito.android.vas_planning.remove;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlannerRemoveIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/remove/i;", "Lcom/avito/android/vas_planning/remove/h;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f322494a;

    @Inject
    public i(@Y61.k Context context) {
        this.f322494a = context;
    }

    @Override // com.avito.android.vas_planning.remove.h
    @Y61.l
    public final String a(@Y61.l Intent intent) {
        if (intent != null) {
            return intent.getStringExtra("extra_vas_remove_msg");
        }
        return null;
    }

    @Override // com.avito.android.vas_planning.remove.h
    @Y61.k
    public final Intent b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        VasPlannerRemoveInfo vasPlannerRemoveInfo = new VasPlannerRemoveInfo(str, str2, str3, str4);
        Intent intent = new Intent(this.f322494a, (Class<?>) VasPlannerRemoveActivity.class);
        intent.putExtra("vas_plan_remove_info_extra", vasPlannerRemoveInfo);
        return intent;
    }

    @Override // com.avito.android.vas_planning.remove.h
    @Y61.l
    public final String c(@Y61.l Intent intent) {
        if (intent != null) {
            return intent.getStringExtra("extra_vas_remove_plan_id");
        }
        return null;
    }
}
