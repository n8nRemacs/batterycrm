package com.avito.android.beduin.common.component;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPayloads.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes11.dex */
public final /* synthetic */ class f extends H implements Y41.l<BeduinModel, BeduinModel> {
    public f(Object obj) {
        super(1, obj, e.a.class, "ignoringPayloadFields", "ignoringPayloadFields(Lcom/avito/android/beduin_models/BeduinModel;)Lcom/avito/android/beduin_models/BeduinModel;", 0);
    }

    @Override // Y41.l
    public final BeduinModel invoke(BeduinModel beduinModel) {
        return ((e.a) this.receiver).a(beduinModel);
    }
}
