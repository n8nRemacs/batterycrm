package com.avito.android.ab_tests;

import com.avito.android.C36135w2;
import com.avito.android.ab_tests.configs.AutoFilterHintToastTestGroup;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47967b;
import s3.C47971f;
import s3.C47981p;

/* compiled from: SerpAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/X;", "Lcom/avito/android/ab_tests/W;", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f67745a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67747c;

    @Inject
    public X(@Y61.k C36135w2 c36135w2, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67745a = c36135w2;
        this.f67746b = c0Var;
        this.f67747c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.W
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> A6() {
        return new u3.g<>(this.f67747c.c(new C47981p(this.f67745a)), this.f67746b);
    }

    @Override // com.avito.android.ab_tests.W
    @Y61.k
    public final u3.l<AutoFilterHintToastTestGroup> B6() {
        return new u3.l<>(this.f67747c.c(new C47971f()), this.f67746b);
    }

    @Override // com.avito.android.ab_tests.W
    @Y61.k
    public final u3.l<GridLayoutWithTwoColumnsAbTestGroup> J2() {
        return new u3.l<>(this.f67747c.c(new s3.r(this.f67745a)), this.f67746b);
    }

    @Override // com.avito.android.ab_tests.W
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> R5() {
        return new u3.g<>(this.f67747c.c(new C47967b(this.f67745a)), this.f67746b);
    }

    @Override // com.avito.android.ab_tests.W
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> c5() {
        return new u3.g<>(this.f67747c.c(new s3.L(this.f67745a)), this.f67746b);
    }
}
