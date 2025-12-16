package com.avito.android.auth_tracker.tracker;

import Wd.InterfaceC15745b;
import Xd.C16990a;
import com.avito.android.analytics.InterfaceC28464o;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AuthTrackerInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSucceeded", "Lcom/avito/android/analytics/o;", "invoke", "(Z)Lcom/avito/android/analytics/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<Boolean, InterfaceC28464o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.a f92655l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC15745b.a aVar) {
        super(1);
        this.f92655l = aVar;
    }

    @Override // Y41.l
    public final InterfaceC28464o invoke(Boolean bool) {
        return new C16990a(this.f92655l.f17991a, bool.booleanValue());
    }
}
