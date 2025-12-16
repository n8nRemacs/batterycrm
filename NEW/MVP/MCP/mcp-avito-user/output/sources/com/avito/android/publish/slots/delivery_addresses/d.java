package com.avito.android.publish.slots.delivery_addresses;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryAddressesDialogPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/d;", "Lcom/avito/android/publish/slots/delivery_addresses/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public g f243424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.delivery_addresses.item.c> f243425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243426c;

    /* compiled from: DeliveryAddressesDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f243427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f243428m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, d dVar) {
            super(1);
            this.f243427l = gVar;
            this.f243428m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            com.avito.android.publish.slots.delivery_addresses.item.c cVar = this.f243427l.f243433E;
            Integer numValueOf = Integer.valueOf(iIntValue);
            String str = cVar.f243440b;
            List<AddressInfo> list = cVar.f243442d;
            this.f243428m.f243425b.accept(new com.avito.android.publish.slots.delivery_addresses.item.c(str, cVar.f243443e, cVar.f243444f, cVar.f243445g, numValueOf, cVar.f243447i, cVar.f243446h, list));
            return G0.f406611a;
        }
    }

    @Inject
    public d() {
        com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.delivery_addresses.item.c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243425b = cVar;
        this.f243426c = cVar;
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.c
    public final void a(@Y61.k g gVar) {
        this.f243424a = gVar;
        gVar.f243436H.setOnClickListener(new f(0, (Object) new a(gVar, this), (Object) gVar));
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.c
    public final void b() {
        g gVar = this.f243424a;
        if (gVar != null) {
            gVar.r();
        }
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.c
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243426c() {
        return this.f243426c;
    }
}
