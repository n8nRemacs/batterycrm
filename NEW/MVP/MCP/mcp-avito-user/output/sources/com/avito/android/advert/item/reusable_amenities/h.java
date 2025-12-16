package com.avito.android.advert.item.reusable_amenities;

import com.avito.android.advert.item.Z0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AmenitiesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f78612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AmenitiesItem f78613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AmenitiesItem amenitiesItem) {
        super(0);
        this.f78612l = iVar;
        this.f78613m = amenitiesItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f78612l;
        AmenitiesItem amenitiesItem = this.f78613m;
        Map<String, Object> map = amenitiesItem.f78602l;
        iVar.f78614b.a(null, amenitiesItem.f78603m, map);
        Z0 z02 = iVar.f78615c;
        if (z02 != null) {
            z02.f72321z.a(new ArrayList<>(amenitiesItem.f78600j), amenitiesItem.f78599i, z02.f72298c);
        }
        return G0.f406611a;
    }
}
