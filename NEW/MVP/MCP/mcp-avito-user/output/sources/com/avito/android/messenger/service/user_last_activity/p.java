package com.avito.android.messenger.service.user_last_activity;

import com.avito.android.C30277e1;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.flowable.C41849g0;
import io.reactivex.rxjava3.internal.operators.flowable.C41873o0;
import io.reactivex.rxjava3.internal.operators.flowable.C41886t;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: UserLastActivitySyncAgent.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "userIdsToPoll", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/persistence/messenger/d3;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f197338b;

    public p(b bVar) {
        this.f197338b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        U u12;
        b bVar = this.f197338b;
        InterfaceC47842z interfaceC47842z = bVar.f197304W;
        List list = (List) obj;
        if (list.isEmpty()) {
            return I.q(C42784z0.f406748b);
        }
        int size = list.size();
        hu.akarnokd.rxjava3.schedulers.c cVar = bVar.f207140R;
        if (size <= 100) {
            u12 = interfaceC47842z.u(C42745f0.M0(list)).A(15L, TimeUnit.SECONDS).s(cVar).u(new i(bVar, list));
        } else {
            ArrayList arrayListR0 = C42745f0.R0(list, 100, 100);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
            Iterator<T> it = arrayListR0.iterator();
            while (it.hasNext()) {
                I<List<UserLastActivity>> iU2 = interfaceC47842z.u((List) it.next());
                C30277e1 c30277e1 = bVar.f197307Z;
                c30277e1.getClass();
                kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[33];
                if (((Boolean) c30277e1.f144959G.a().invoke()).booleanValue()) {
                    iU2 = iU2.u(new h(bVar));
                }
                arrayList.add(iU2);
            }
            int i12 = AbstractC41777j.f401972b;
            C41849g0 c41849g0F = new C41873o0(arrayList).f(io.reactivex.rxjava3.internal.functions.a.f401991a);
            ArrayList arrayList2 = new ArrayList();
            f<T1, T2> fVar = f.f197328b;
            l41.s sVarH = io.reactivex.rxjava3.internal.functions.a.h(arrayList2);
            Objects.requireNonNull(fVar, "collector is null");
            u12 = new C41886t(c41849g0F, sVarH, fVar).A(15L, TimeUnit.SECONDS).s(cVar).u(new g(bVar, list));
        }
        return u12.r(new d(bVar));
    }
}
