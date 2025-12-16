package com.avito.android.ab_tests;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExposureEventVisualizer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/C;", "Lcom/avito/android/ab_tests/B;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f67701a;

    @Inject
    public C(@Y61.k Context context, @Y61.k com.avito.android.P p12, @Y61.k com.avito.android.util.C c12) {
        this.f67701a = c12;
        new Handler(Looper.getMainLooper());
    }

    @Override // com.avito.android.ab_tests.B
    public final void a(@Y61.k String str, @Y61.k String str2) {
        this.f67701a.o().getClass();
    }
}
