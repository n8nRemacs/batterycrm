package com.avito.android.ab_tests;

import com.avito.android.Z0;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ab_tests.groups.StandardizeButtonWidthTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47984t;

/* compiled from: MarketplaceAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/F;", "Lcom/avito/android/ab_tests/E;", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z0 f67706a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67707b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67708c;

    @Inject
    public F(@Y61.k Z0 z02, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67706a = z02;
        this.f67707b = c0Var;
        this.f67708c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.E
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> a() {
        return new u3.g<>(this.f67708c.c(new s3.X(this.f67706a)), this.f67707b);
    }

    @Override // com.avito.android.ab_tests.E
    @Y61.k
    public final u3.h<SimpleTestGroup> b() {
        return new u3.h<>(this.f67708c.c(new C47984t(this.f67706a)));
    }

    @Override // com.avito.android.ab_tests.E
    @Y61.k
    public final u3.l<StandardizeButtonWidthTestGroup> c() {
        return new u3.l<>(this.f67708c.c(new s3.V(this.f67706a)), this.f67707b);
    }
}
