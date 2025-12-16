package com.avito.android.vas_planning.domain;

import aM0.InterfaceC19791a;
import com.avito.android.util.A4;
import com.avito.android.util.P2;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "rawItems", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f322342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f322343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f322344d;

    public n(l lVar, String str, List<String> list) {
        this.f322342b = lVar;
        this.f322343c = str;
        this.f322344d = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        l lVar = this.f322342b;
        InterfaceC19791a interfaceC19791a = lVar.f322334a;
        A4 a42 = A4.f318516a;
        Set setP0 = C42745f0.P0(this.f322344d);
        a42.getClass();
        return interfaceC19791a.d(this.f322343c, A4.g("plannedTime", setP0), A4.g("plannedTimeRaw", C42745f0.P0((List) obj))).x0(lVar.f322336c.a()).d0(m.f322341b).r0(P2.c.f318721a);
    }
}
