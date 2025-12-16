package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: UniversalMapInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointsRectResult;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f304799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f304800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f304801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f304802e;

    public N(O o12, AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, boolean z12) {
        this.f304799b = o12;
        this.f304800c = avitoMapPoint;
        this.f304801d = avitoMapPoint2;
        this.f304802e = z12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) ((io.reactivex.rxjava3.core.y) obj).c();
        boolean z12 = p22 instanceof P2.b;
        boolean z13 = this.f304802e;
        AvitoMapPoint avitoMapPoint = this.f304801d;
        AvitoMapPoint avitoMapPoint2 = this.f304800c;
        O o12 = this.f304799b;
        if (z12) {
            o12.f304806d.g(avitoMapPoint2, avitoMapPoint, z13, (UniversalMapPointsRectResult) ((P2.b) p22).f318720a);
        } else if (p22 instanceof P2.a) {
            o12.f304806d.d(avitoMapPoint2, avitoMapPoint, z13);
        }
    }
}
