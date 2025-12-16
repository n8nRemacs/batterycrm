package com.avito.android.publish.items.iac_devices.re23;

import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishIacDevicesItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f236894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacDevicesItem f236895m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, IacDevicesItem iacDevicesItem) {
        super(0);
        this.f236894l = fVar;
        this.f236895m = iacDevicesItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f236894l;
        OL.a aVar = fVar.f236896b;
        if (aVar.h()) {
            aVar.g();
        }
        fVar.f236897c.accept(new IacDevicesItem.b.a(this.f236895m));
        return G0.f406611a;
    }
}
