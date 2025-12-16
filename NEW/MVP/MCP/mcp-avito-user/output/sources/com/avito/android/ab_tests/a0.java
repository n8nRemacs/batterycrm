package com.avito.android.ab_tests;

import com.avito.android.B2;
import com.avito.android.ab_tests.groups.ServicesNotificationAboutAnomalyLowPricesGroup;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/a0;", "Lcom/avito/android/ab_tests/Z;", "_avito-discouraged_avito-feature_services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67752a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f67753b;

    @Inject
    public a0(@Y61.k InterfaceC27642e interfaceC27642e, @Y61.k B2 b22) {
        this.f67752a = interfaceC27642e;
        this.f67753b = b22;
    }

    @Override // com.avito.android.ab_tests.Z
    @Y61.k
    public final u3.h<ServicesNotificationAboutAnomalyLowPricesGroup> a() {
        return new u3.h<>(this.f67752a.c(new s3.T(this.f67753b)));
    }
}
