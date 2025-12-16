package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.universal_map.map.AbstractC35293c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/c;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35326n extends kotlin.jvm.internal.N implements Y41.l<AbstractC35293c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305696l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35326n(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f305696l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC35293c abstractC35293c) {
        AbstractC35293c abstractC35293c2 = abstractC35293c;
        boolean z12 = abstractC35293c2 instanceof AbstractC35293c.b;
        UniversalMapFragment universalMapFragment = this.f305696l;
        if (z12) {
            oG0.f fVar = universalMapFragment.f304873y0;
            oG0.f fVar2 = fVar != null ? fVar : null;
            AbstractC35293c.b bVar = (AbstractC35293c.b) abstractC35293c2;
            AvitoMapPoint avitoMapPoint = bVar.f304917a;
            Float f12 = bVar.f304919c;
            fVar2.R6(avitoMapPoint, bVar.f304918b, Float.valueOf(f12 != null ? f12.floatValue() : 12.0f));
        } else if (abstractC35293c2 instanceof AbstractC35293c.a) {
            oG0.f fVar3 = universalMapFragment.f304873y0;
            (fVar3 != null ? fVar3 : null).Q4(((AbstractC35293c.a) abstractC35293c2).f304916a);
        }
        return G0.f406611a;
    }
}
