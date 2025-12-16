package com.avito.android.ab_tests;

import Uj0.InterfaceC15529a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: AbTestsReloadTask.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/p;", "", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27653p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15529a f68006a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27648k f68007b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27638a f68008c;

    @Inject
    public C27653p(@Y61.k InterfaceC15529a interfaceC15529a, @Y61.k InterfaceC27648k interfaceC27648k, @Y61.k InterfaceC27638a interfaceC27638a) {
        this.f68006a = interfaceC15529a;
        this.f68007b = interfaceC27648k;
        this.f68008c = interfaceC27638a;
    }

    @Y61.k
    public final C43197r1 a() {
        this.f68008c.c();
        return new C43197r1(new C27652o(2, this.f68007b, InterfaceC27648k.class, "store", "store(Ljava/util/Map;)V", 4), new C27650m(C43175k.G(new C27651n(this, null))));
    }
}
