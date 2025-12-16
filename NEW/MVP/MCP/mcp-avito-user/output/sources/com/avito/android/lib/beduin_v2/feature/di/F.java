package com.avito.android.lib.beduin_v2.feature.di;

import cU0.AbstractC27103a;
import cU0.InterfaceC27104b;
import java.util.Set;
import kU0.C42634a;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import lU0.C43682a;
import lU0.C43683b;
import lU0.C43684c;
import mU0.C44015a;
import mU0.C44016b;
import mU0.C44017c;
import nU0.C44334a;
import nU0.C44335b;
import nU0.C44336c;

/* compiled from: BeduinDateTimeModule_ProvideDateTimeFunctionsFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/F;", "Ldagger/internal/h;", "", "LcU0/b;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F implements dagger.internal.h<Set<InterfaceC27104b>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176018b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f176019a;

    /* compiled from: BeduinDateTimeModule_ProvideDateTimeFunctionsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/F$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F(@Y61.k B b12, @Y61.k E e12) {
        this.f176019a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RT0.e eVar = (RT0.e) this.f176019a.get();
        f176018b.getClass();
        Set setL0 = C42756l.l0(new AbstractC27103a[]{new C42634a(eVar), new kU0.c(eVar), new kU0.b(eVar), new kU0.d(eVar), new lU0.e(eVar), new C43684c(eVar), new C43682a(eVar), new C43683b(eVar), new lU0.f(eVar), new lU0.d(eVar), new lU0.g(eVar), new mU0.e(eVar), new C44017c(eVar), new C44015a(eVar, eVar), new mU0.f(eVar, eVar), new C44016b(eVar), new mU0.d(eVar, eVar), new mU0.h(eVar, eVar), new mU0.g(eVar), new nU0.d(eVar), new C44334a(eVar), new nU0.e(eVar), new C44335b(eVar), new C44336c(eVar), new nU0.f(eVar)});
        dagger.internal.t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
