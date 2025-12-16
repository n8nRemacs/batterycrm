package com.avito.android.serp.adapter;

import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: DeliveryTermsConverterImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/O;", "Lcom/avito/android/serp/adapter/N;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class O implements N {
    @Inject
    public O() {
    }

    @Override // com.avito.android.serp.adapter.N
    @Y61.k
    public final DeliveryTerms a(@Y61.k com.avito.android.remote.model.DeliveryTerms deliveryTerms) {
        String text = deliveryTerms.getText();
        String icon = deliveryTerms.getIcon();
        return new DeliveryTerms(text, icon != null ? com.avito.android.lib.util.q.a(icon) : null);
    }
}
