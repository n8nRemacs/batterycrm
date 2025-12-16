package com.avito.android.ab_tests;

import com.avito.android.C29270c0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DesignSystemAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/z;", "Lcom/avito/android/ab_tests/y;", "_avito-discouraged_avito-feature_design-system"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27662z implements InterfaceC27661y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f68027a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d0 f68028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f68029c;

    @Inject
    public C27662z(@Y61.k C29270c0 c29270c0, @Y61.k d0 d0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f68027a = c29270c0;
        this.f68028b = d0Var;
        this.f68029c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27661y
    public final u3.f a() {
        return new u3.f(this.f68029c.c(new s3.W(this.f68027a)), this.f68028b);
    }
}
