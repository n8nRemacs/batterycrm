package com.avito.android.ab_tests;

import com.avito.android.N2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47980o;

/* compiled from: UserAdvertAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/g0;", "Lcom/avito/android/ab_tests/f0;", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N2 f67948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67950c;

    @Inject
    public g0(@Y61.k N2 n22, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67948a = n22;
        this.f67949b = c0Var;
        this.f67950c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.f0
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> a() {
        return new u3.g<>(this.f67950c.c(new C47980o(this.f67948a)), this.f67949b);
    }
}
