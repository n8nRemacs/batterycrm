package com.avito.android.ab_tests;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.configs.CrossFadeOpenAbTestGroup;
import com.avito.android.ab_tests.configs.MultiItemOutlinedChipsTestGroup;
import com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup;
import com.avito.android.ab_tests.configs.SparePartsGarageItemCompatV2RenaissanceTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47974i;
import s3.C47976k;
import s3.C47986v;
import s3.C47987w;

/* compiled from: AdvertDetailsAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/t;", "Lcom/avito/android/ab_tests/s;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27656t implements InterfaceC27655s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f68013a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f68014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f68015c;

    @Inject
    public C27656t(@Y61.k C29640d c29640d, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f68013a = c29640d;
        this.f68014b = c0Var;
        this.f68015c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.f<MultiItemOutlinedChipsTestGroup> k6() {
        return new u3.f<>(this.f68015c.c(new s3.H(this.f68013a)), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> l6() {
        return new u3.l<>(this.f68015c.c(new C47986v()), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.f<CrossFadeOpenAbTestGroup> m6() {
        return new u3.f<>(this.f68015c.c(new C47976k(this.f68013a)), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.l<RiseIcebreakersItemTestGroup> n6() {
        return new u3.l<>(this.f68015c.c(new s3.Q(this.f68013a)), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> o6() {
        return new u3.l<>(this.f68015c.c(new C47987w()), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> p6() {
        return new u3.g<>(this.f68015c.c(new C47974i(this.f68013a)), this.f68014b);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27655s
    @Y61.k
    public final u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup> v5() {
        return new u3.f<>(this.f68015c.c(new s3.U(this.f68013a)), this.f68014b);
    }
}
