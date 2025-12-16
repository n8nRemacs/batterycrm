package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.h;
import com.avito.android.messenger.map.search.l;
import com.avito.android.mvi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GeoSearchInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/h$a;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/search/h$a;)Lcom/avito/android/messenger/map/search/h$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o extends N implements Y41.l<h.a, h.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f196580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f196581m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f196582n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j12, l lVar, String str) {
        super(1);
        this.f196580l = lVar;
        this.f196581m = str;
        this.f196582n = j12;
    }

    @Override // Y41.l
    public final h.a invoke(h.a aVar) {
        l lVar = this.f196580l;
        com.avito.android.mvi.rx3.with_monolithic_state.t<h.a> tVarLe = lVar.le();
        StringBuilder sb2 = new StringBuilder("requestId = ");
        long j12 = this.f196582n;
        sb2.append(j12);
        sb2.append(", query = ");
        String str = this.f196581m;
        sb2.append(str);
        tVarLe.s(new l.a(null, sb2.toString(), new k(j12, lVar, str), 1, null));
        return h.a.a(aVar, null, new b.c(j12), 1);
    }
}
