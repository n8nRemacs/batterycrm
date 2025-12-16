package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.messenger.blacklist_reasons.m;
import com.avito.android.messenger.blacklist_reasons.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: BlacklistReasonsProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/blacklist_reasons/m$b;)Lcom/avito/android/messenger/blacklist_reasons/m$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.l<m.b, m.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f186647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f186648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, boolean z12) {
        super(1);
        this.f186647l = qVar;
        this.f186648m = z12;
    }

    @Override // Y41.l
    public final m.b invoke(m.b bVar) {
        m.b bVar2 = bVar;
        if (bVar2 instanceof m.b.a) {
            q qVar = this.f186647l;
            qVar.le().s(new q.a(null, null, new p(qVar, this.f186648m), 3, null));
            return m.b.c.f186641a;
        }
        if (bVar2.equals(m.b.c.f186641a) ? true : bVar2 instanceof m.b.C5477b) {
            return bVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
