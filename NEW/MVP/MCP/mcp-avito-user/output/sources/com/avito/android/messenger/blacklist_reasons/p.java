package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.messenger.blacklist_reasons.m;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: BlacklistReasonsProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/blacklist_reasons/m$b;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p extends N implements Y41.l<m.b, I<m.b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f186644l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f186645m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, boolean z12) {
        super(1);
        this.f186644l = qVar;
        this.f186645m = z12;
    }

    @Override // Y41.l
    public final I<m.b> invoke(m.b bVar) {
        m.b bVar2 = bVar;
        if (bVar2 instanceof m.b.a ? true : bVar2 instanceof m.b.C5477b) {
            return I.q(bVar2);
        }
        if (!bVar2.equals(m.b.c.f186641a)) {
            throw new NoWhenBranchMatchedException();
        }
        q qVar = this.f186644l;
        O oR2 = qVar.f186646V.getBlacklistReasons().s(qVar.f207133K.c()).r(o.f186643b);
        final boolean z12 = this.f186645m;
        return oR2.u(new l41.o() { // from class: com.avito.android.messenger.blacklist_reasons.n
            @Override // l41.o
            public final Object apply(Object obj) {
                return z12 ? new m.b.a(null, 1, null) : new m.b.a(com.avito.android.messenger.util.q.a((Throwable) obj));
            }
        });
    }
}
