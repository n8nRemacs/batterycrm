package com.avito.android.master_plan;

import android.content.Intent;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MasterPlanIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/c;", "", "_avito_master-plan_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: MasterPlanIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(c cVar, Image image, ArrayList arrayList, float f12, MasterPlanPin masterPlanPin, String str, String str2, int i12) {
            if ((i12 & 4) != 0) {
                f12 = 0.5f;
            }
            float f13 = f12;
            if ((i12 & 32) != 0) {
                str2 = "masterplan";
            }
            return cVar.a(image, arrayList, f13, masterPlanPin, str, str2);
        }
    }

    @Y61.k
    Intent a(@Y61.k Image image, @Y61.l ArrayList<MasterPlanPin> arrayList, float f12, @Y61.k MasterPlanPin masterPlanPin, @Y61.k String str, @Y61.k String str2);
}
