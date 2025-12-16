package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.messenger.blacklist_reasons.i.b;
import com.avito.android.messenger.blacklist_reasons.m;
import com.avito.android.messenger.blacklist_reasons.y;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: BlacklistReasonsPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f186590b;

    public f(i iVar) {
        this.f186590b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        y.d dVar = (y.d) q12.f406619b;
        m.b bVar = (m.b) q12.f406620c;
        i iVar = this.f186590b;
        iVar.le().s(iVar.new b(dVar, bVar));
    }
}
