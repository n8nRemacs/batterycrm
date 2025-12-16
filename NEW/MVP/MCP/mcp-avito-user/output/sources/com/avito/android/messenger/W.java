package com.avito.android.messenger;

import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.ProfileShort;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: MessengerUserIdInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ProfileShort;", "profileShort", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/ProfileShort;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<ProfileShort> f186178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f186179c;

    public W(g0 g0Var, AtomicReference atomicReference) {
        this.f186178b = atomicReference;
        this.f186179c = g0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ProfileShort profileShort = (ProfileShort) obj;
        this.f186178b.set(profileShort);
        return this.f186179c.f196359a.h(new ProfileInfo(profileShort.getUserId(), profileShort.getUserHashId(), profileShort.getName(), profileShort.getEmail()), null);
    }
}
