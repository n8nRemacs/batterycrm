package com.avito.android.location;

import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SavedLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/location/q;", "Lcom/avito/android/location/LocationSource;", "<name for destructuring parameter 0>", "Lcom/avito/android/remote/model/Location;", "apply", "(Lkotlin/Q;)Lcom/avito/android/remote/model/Location;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f181861b;

    public y(boolean z12) {
        this.f181861b = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        q qVar = (q) ((Q) obj).f406619b;
        if (!this.f181861b) {
            return qVar.f181849a;
        }
        Location location = qVar.f181849a;
        return location.copy((3839 & 1) != 0 ? location.id : null, (3839 & 2) != 0 ? location.names : null, (3839 & 4) != 0 ? location.hasMetro : false, (3839 & 8) != 0 ? location.hasChildren : false, (3839 & 16) != 0 ? location.hasDirections : false, (3839 & 32) != 0 ? location.hasDistricts : false, (3839 & 64) != 0 ? location.parent : null, (3839 & 128) != 0 ? location.from : null, (3839 & 256) != 0 ? location.forcedByUser : qVar.f181851c, (3839 & 512) != 0 ? location.coordinates : null, (3839 & 1024) != 0 ? location.forcedLocationForRecommendation : null, (3839 & 2048) != 0 ? location.internalId : null);
    }
}
