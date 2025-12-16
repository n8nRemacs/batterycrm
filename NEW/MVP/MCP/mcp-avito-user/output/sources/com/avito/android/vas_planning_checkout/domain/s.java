package com.avito.android.vas_planning_checkout.domain;

import aM0.InterfaceC19791a;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlanResultInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/s;", "Lcom/avito/android/vas_planning_checkout/domain/r;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19791a f322896b;

    /* compiled from: VasPlanResultInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/s$a;", "", "<init>", "()V", "", "PLANNED_SERVICES_KEY", "Ljava/lang/String;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public s(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC19791a interfaceC19791a) {
        this.f322895a = interfaceC35745a5;
        this.f322896b = interfaceC19791a;
    }

    @Override // com.avito.android.vas_planning_checkout.domain.r
    @Y61.k
    public final z a(@Y61.k String str, @Y61.k ArrayList arrayList) {
        A4 a42 = A4.f318516a;
        Set setP0 = C42745f0.P0(arrayList);
        a42.getClass();
        return this.f322896b.c(str, A4.g("plannedServices", setP0)).x0(this.f322895a.a()).d0(t.f322897b).r0(P2.c.f318721a);
    }
}
