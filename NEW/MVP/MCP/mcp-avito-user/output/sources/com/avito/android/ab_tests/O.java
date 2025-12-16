package com.avito.android.ab_tests;

import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/O;", "Lcom/avito/android/ab_tests/N;", "_avito-discouraged_avito-feature_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c0 f67727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f67729c;

    @Inject
    public O(@Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e, @Y61.k Q1 q12) {
        this.f67727a = c0Var;
        this.f67728b = interfaceC27642e;
        this.f67729c = q12;
    }

    @Override // com.avito.android.ab_tests.N
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> a() {
        return new u3.l<>(this.f67728b.c(new s3.M()), this.f67727a);
    }

    @Override // com.avito.android.ab_tests.N
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> b() {
        return new u3.l<>(this.f67728b.c(new s3.N()), this.f67727a);
    }

    @Override // com.avito.android.ab_tests.N
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> c() {
        return new u3.l<>(this.f67728b.c(new s3.I(this.f67729c)), this.f67727a);
    }
}
