package com.avito.android.beduin.common.component.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.lite.MapLiteModeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinMapLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f101751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f101752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f101753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f101754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a f101755p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AvitoMapPoint avitoMapPoint, List list, a aVar, a aVar2) {
        super(0);
        this.f101751l = fVar;
        this.f101752m = avitoMapPoint;
        this.f101753n = list;
        this.f101754o = aVar;
        this.f101755p = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.a
    public final G0 invoke() {
        MapLiteModeView mapLiteModeView = this.f101751l.f101760f;
        a aVar = this.f101755p;
        mapLiteModeView.bindView(this.f101752m, this.f101753n, this.f101754o, aVar, true, true, false);
        return G0.f406611a;
    }
}
