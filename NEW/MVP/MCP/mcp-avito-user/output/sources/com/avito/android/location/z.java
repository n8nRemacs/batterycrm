package com.avito.android.location;

import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SavedLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/location/q;", "Lcom/avito/android/location/LocationSource;", "it", "Lcom/avito/android/location/a;", "apply", "(Lkotlin/Q;)Lcom/avito/android/location/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f181862b;

    public z(u uVar) {
        this.f181862b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        Q q12 = (Q) obj;
        return new C31497a(this.f181862b.f181855a.f(), (LocationSource) q12.f406620c, (q) q12.f406619b);
    }
}
