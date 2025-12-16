package com.avito.android.auth_tracker.tracker;

import com.avito.android.analytics.InterfaceC28464o;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AuthTrackerInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "isSucceeded", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f92651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f92652c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(j jVar, Y41.l<? super Boolean, ? extends InterfaceC28464o> lVar) {
        this.f92651b = jVar;
        this.f92652c = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        this.f92651b.f92658b.c((InterfaceC28464o) this.f92652c.invoke(bool));
    }
}
