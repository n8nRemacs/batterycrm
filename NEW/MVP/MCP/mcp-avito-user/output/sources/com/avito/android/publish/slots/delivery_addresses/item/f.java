package com.avito.android.publish.slots.delivery_addresses.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAddressesSlotPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/item/f;", "Lcom/avito/android/publish/slots/delivery_addresses/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c> f243450b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f243451c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243450b = cVar;
        this.f243451c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.item.d
    @k
    /* renamed from: E6, reason: from getter */
    public final C41981q0 getF243451c() {
        return this.f243451c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r7, TV0.a r8, int r9) {
        /*
            r6 = this;
            com.avito.android.publish.slots.delivery_addresses.item.h r7 = (com.avito.android.publish.slots.delivery_addresses.item.h) r7
            com.avito.android.publish.slots.delivery_addresses.item.c r8 = (com.avito.android.publish.slots.delivery_addresses.item.c) r8
            java.lang.Integer r9 = r8.f243441c
            r0 = 0
            java.util.List<com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo> r1 = r8.f243442d
            if (r9 == 0) goto L3d
            if (r1 == 0) goto L31
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo r4 = (com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo) r4
            int r4 = r4.getAddressId()
            int r5 = r9.intValue()
            if (r4 != r5) goto L14
            goto L2d
        L2c:
            r3 = r0
        L2d:
            com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo r3 = (com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo) r3
            if (r3 != 0) goto L46
        L31:
            if (r1 == 0) goto L3b
            java.lang.Object r9 = kotlin.collections.C42745f0.E(r1)
            r3 = r9
            com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo r3 = (com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo) r3
            goto L46
        L3b:
            r3 = r0
            goto L46
        L3d:
            if (r1 == 0) goto L3b
            java.lang.Object r9 = kotlin.collections.C42745f0.E(r1)
            r3 = r9
            com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo r3 = (com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo) r3
        L46:
            if (r3 == 0) goto L4e
            java.lang.String r9 = r3.getAddress()
            if (r9 != 0) goto L50
        L4e:
            java.lang.String r9 = "fail"
        L50:
            r7.B0(r9)
            if (r1 == 0) goto L5a
            int r9 = r1.size()
            goto L5b
        L5a:
            r9 = 0
        L5b:
            r1 = 1
            if (r9 <= r1) goto L64
            java.lang.String r9 = r8.f243443e
            r7.dG(r9)
            goto L67
        L64:
            r7.dG(r0)
        L67:
            com.avito.android.publish.slots.delivery_addresses.item.e r9 = new com.avito.android.publish.slots.delivery_addresses.item.e
            r9.<init>(r6, r8)
            r7.xP(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_addresses.item.f.O5(TV0.e, TV0.a, int):void");
    }
}
