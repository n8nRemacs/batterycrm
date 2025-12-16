package com.avito.android.profile.edit;

import com.avito.android.remote.model.ProfileInfo;
import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ProfileInfo;", "profile", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/ProfileInfo;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class r0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f222239b;

    public r0(t0 t0Var) {
        this.f222239b = t0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ProfileInfo profileInfo = (ProfileInfo) obj;
        return this.f222239b.f222300b.h(new ProfileInfo(profileInfo.getUserId(), profileInfo.getUserHashId(), profileInfo.getName(), profileInfo.getEmail()), null);
    }
}
