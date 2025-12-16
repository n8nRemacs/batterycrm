package com.avito.android.universal_map.map.point_info;

import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.y;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "Lcom/avito/android/util/P2;", "LuG0/c;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f305794b;

    public d(e eVar) {
        this.f305794b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) ((y) obj).c();
        boolean z12 = p22 instanceof P2.b;
        e eVar = this.f305794b;
        if (z12) {
            eVar.f305798d.a();
        } else if (p22 instanceof P2.a) {
            eVar.f305798d.e();
        }
    }
}
