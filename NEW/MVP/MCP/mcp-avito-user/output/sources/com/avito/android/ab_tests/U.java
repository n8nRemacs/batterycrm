package com.avito.android.ab_tests;

import com.avito.android.C30566f2;
import com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47975j;

/* compiled from: SbcAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/U;", "Lcom/avito/android/ab_tests/T;", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f67738a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67739b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67740c;

    @Inject
    public U(@Y61.k C30566f2 c30566f2, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67738a = c30566f2;
        this.f67739b = c0Var;
        this.f67740c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.T
    @Y61.k
    public final u3.l<CrmNotificationCenterBeduinRedesignTestGroup> a() {
        return new u3.l<>(this.f67740c.c(new C47975j(this.f67738a)), this.f67739b);
    }
}
