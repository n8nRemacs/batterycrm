package com.avito.android.location;

import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "loadLocation", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181791b;

    public j(i iVar) {
        this.f181791b = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        r.a.a(this.f181791b.f181782b, (Location) obj, null, 6);
    }
}
