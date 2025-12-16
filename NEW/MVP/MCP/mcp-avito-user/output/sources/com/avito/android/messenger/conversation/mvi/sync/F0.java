package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "", "idsToRequestWithTime", "Lcom/avito/android/messenger/conversation/mvi/sync/v0$e;", "apply", "(Lio/reactivex/rxjava3/schedulers/d;)Lcom/avito/android/messenger/conversation/mvi/sync/v0$e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final F0<T, R> f194589b = new F0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.schedulers.d dVar = (io.reactivex.rxjava3.schedulers.d) obj;
        Set set = (Set) dVar.f404958a;
        return new C32293v0.e(dVar.f404959b, set, set);
    }
}
