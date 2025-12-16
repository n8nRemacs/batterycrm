package com.avito.android.profile.edit;

import com.avito.android.profile.edit.V;
import com.avito.android.remote.model.Profile;
import kotlin.Metadata;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "profile", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/profile/edit/V$c;", "apply", "(Lcom/avito/android/remote/model/Profile;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f222019b;

    public a0(b0 b0Var) {
        this.f222019b = b0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Profile profile = (Profile) obj;
        String locationId = profile.getLocationId();
        return locationId == null ? io.reactivex.rxjava3.core.z.c0(new V.c(profile, null)) : this.f222019b.f222067a.b(locationId).T(new Z(profile), Integer.MAX_VALUE);
    }
}
