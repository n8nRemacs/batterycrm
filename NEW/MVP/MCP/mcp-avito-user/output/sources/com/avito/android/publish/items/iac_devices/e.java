package com.avito.android.publish.items.iac_devices;

import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacDevicesItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f236870l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacDevicesItem f236871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, IacDevicesItem iacDevicesItem) {
        super(0);
        this.f236870l = gVar;
        this.f236871m = iacDevicesItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f236870l;
        OL.a aVar = gVar.f236875c;
        if (aVar.h()) {
            aVar.g();
        }
        gVar.f236876d.accept(new IacDevicesItem.b.a(this.f236871m));
        return G0.f406611a;
    }
}
