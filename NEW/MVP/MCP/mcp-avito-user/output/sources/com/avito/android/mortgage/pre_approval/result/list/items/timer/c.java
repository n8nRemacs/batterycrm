package com.avito.android.mortgage.pre_approval.result.list.items.timer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40507d.b f202076b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40507d f202077c;

    public c(@k InterfaceC40507d.b bVar, @k InterfaceC40507d interfaceC40507d) {
        this.f202076b = bVar;
        this.f202077c = interfaceC40507d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f202076b, cVar.f202076b) && L.f(this.f202077c, cVar.f202077c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF183738b() {
        return "TIMER_ID";
    }

    public final int hashCode() {
        return this.f202077c.hashCode() + r.d(this.f202076b.f396215a, -1453834709, 31);
    }

    @k
    public final String toString() {
        return "TimerItem(stringId=TIMER_ID, allTime=" + this.f202076b + ", timeLeft=" + this.f202077c + ')';
    }
}
