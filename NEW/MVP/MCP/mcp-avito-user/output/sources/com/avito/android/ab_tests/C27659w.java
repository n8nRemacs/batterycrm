package com.avito.android.ab_tests;

import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47982q;

/* compiled from: CoreAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/w;", "Lcom/avito/android/ab_tests/v;", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27659w implements InterfaceC27658v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f68020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f68021b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f68022c;

    @Inject
    public C27659w(@Y61.k com.avito.android.P p12, @Y61.k InterfaceC27642e interfaceC27642e, @Y61.k c0 c0Var) {
        this.f68020a = p12;
        this.f68021b = c0Var;
        this.f68022c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27658v
    @Y61.k
    public final u3.f a() {
        return new u3.f(this.f68022c.c(new s3.S(this.f68020a)), this.f68021b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27658v
    @Y61.k
    public final u3.f b() {
        return new u3.f(this.f68022c.c(new C47982q()), this.f68021b);
    }
}
