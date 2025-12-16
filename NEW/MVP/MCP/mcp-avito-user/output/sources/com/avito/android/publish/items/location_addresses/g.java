package com.avito.android.publish.items.location_addresses;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LocationAddressesItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/location_addresses/g;", "Lcom/avito/android/publish/items/location_addresses/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f236999b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f237000c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f237001d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f237002e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f237003f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237004g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Boolean, AddressParameter.SellerAddresses.DeleteAddressSheet>> f237005h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237006i;

    /* compiled from: LocationAddressesItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f237008m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink) {
            super(0);
            this.f237008m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(g.this.f237000c, this.f237008m, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationAddressesItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AddressParameter.SellerAddresses.AddButton f237010m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AddressParameter.SellerAddresses.AddButton addButton) {
            super(0);
            this.f237010m = addButton;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g gVar = g.this;
            gVar.f237002e.j0();
            gVar.f237002e.v0(AddressChoiceType.f232213e);
            gVar.f237003f.accept(this.f237010m.getUrl());
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k C0 c02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.details.a aVar2, @Y61.k InterfaceC33535v interfaceC33535v) {
        this.f236999b = c02;
        this.f237000c = aVar;
        this.f237001d = aVar2;
        this.f237002e = interfaceC33535v;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237003f = cVar;
        this.f237004g = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, AddressParameter.SellerAddresses.DeleteAddressSheet>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f237005h = cVar2;
        this.f237006i = cVar2;
    }

    public final void O(com.avito.android.publish.items.location_addresses.a aVar, ParameterElement.C c12, DeepLink deepLink) {
        CharSequence addressError;
        ItemWithState.State state = c12.f117219o;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            ItemWithState.State.Error.ErrorWithMessage errorWithMessage = (ItemWithState.State.Error.ErrorWithMessage) state;
            AddressParameter.SellerAddresses sellerAddresses = c12.f117207D;
            if (sellerAddresses == null || (addressError = sellerAddresses.getAddressError()) == null) {
                addressError = errorWithMessage.f173897b;
            }
            aVar.h00(true, addressError, deepLink != null ? new a(deepLink) : null);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((com.avito.android.publish.items.location_addresses.a) eVar, (ParameterElement.C) aVar);
    }

    public final void V(com.avito.android.publish.items.location_addresses.a aVar, ParameterElement.C c12, com.avito.android.publish.items.location_addresses.b bVar) {
        AddressParameter.SellerAddresses sellerAddresses;
        AddressParameter.SellerAddresses.AddButton addButton;
        if (bVar == null || (sellerAddresses = bVar.f236992b) == null) {
            sellerAddresses = c12.f117207D;
        }
        aVar.g8((sellerAddresses != null ? sellerAddresses.getAddButton() : null) != null);
        aVar.aJ(false);
        if (sellerAddresses == null || (addButton = sellerAddresses.getAddButton()) == null) {
            return;
        }
        aVar.PA(addButton.getIcon(), addButton.getTitle(), new b(addButton));
    }

    @Override // com.avito.android.publish.items.location_addresses.e
    @Y61.k
    /* renamed from: Y5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF237004g() {
        return this.f237004g;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r4, TV0.a r5, int r6, java.util.List r7) {
        /*
            r3 = this;
            com.avito.android.publish.items.location_addresses.a r4 = (com.avito.android.publish.items.location_addresses.a) r4
            com.avito.android.category_parameters.ParameterElement$C r5 = (com.avito.android.category_parameters.ParameterElement.C) r5
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r0 = r7
        Le:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof com.avito.android.publish.items.location_addresses.b
            if (r2 == 0) goto Le
            r0 = r1
            goto Le
        L1e:
            boolean r6 = r0 instanceof com.avito.android.publish.items.location_addresses.b
            if (r6 != 0) goto L23
            r0 = r7
        L23:
            com.avito.android.publish.items.location_addresses.b r0 = (com.avito.android.publish.items.location_addresses.b) r0
            if (r0 == 0) goto L91
            com.avito.android.publish.C0 r6 = r3.f236999b
            boolean r6 = r6.Be()
            if (r6 == 0) goto L30
            goto L91
        L30:
            com.avito.android.details.a r6 = r3.f237001d
            com.avito.android.remote.model.category_parameters.CategoryParameters r6 = r6.C0()
            if (r6 == 0) goto L5e
            java.util.List r6 = r6.getParameters()
            if (r6 == 0) goto L5e
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L46:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof com.avito.android.remote.model.category_parameters.AddressParameter
            if (r2 == 0) goto L46
            goto L56
        L55:
            r1 = r7
        L56:
            boolean r6 = r1 instanceof com.avito.android.remote.model.category_parameters.AddressParameter
            if (r6 != 0) goto L5b
            r1 = r7
        L5b:
            com.avito.android.remote.model.category_parameters.AddressParameter r1 = (com.avito.android.remote.model.category_parameters.AddressParameter) r1
            goto L5f
        L5e:
            r1 = r7
        L5f:
            com.avito.android.items.ItemWithState$State r6 = r0.f236991a
            boolean r6 = r6 instanceof com.avito.android.items.ItemWithState.State.Error
            r2 = 0
            if (r6 == 0) goto L7a
            if (r1 == 0) goto L73
            java.lang.Boolean r6 = r1.isAddressesLoaded()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.L.f(r6, r1)
            goto L74
        L73:
            r6 = r2
        L74:
            if (r6 != 0) goto L7a
            r3.O(r4, r5, r7)
            goto L7d
        L7a:
            r4.h00(r2, r7, r7)
        L7d:
            r3.V(r4, r5, r0)
            com.avito.android.remote.model.category_parameters.AddressParameter$SellerAddresses r5 = r0.f236992b
            if (r5 == 0) goto L88
            com.avito.android.remote.model.text.AttributedText r7 = r5.getMotivation()
        L88:
            com.avito.android.publish.items.location_addresses.h r5 = new com.avito.android.publish.items.location_addresses.h
            r5.<init>(r3)
            r4.Do(r5, r7)
            goto L94
        L91:
            r3.k(r4, r5)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.items.location_addresses.g.g2(TV0.e, TV0.a, int, java.util.List):void");
    }

    public final void k(@Y61.k com.avito.android.publish.items.location_addresses.a aVar, @Y61.k ParameterElement.C c12) {
        AddressParameter addressParameter;
        List<ParameterSlot> parameters;
        Object next;
        aVar.K0(c12.f117208d, c12.f117220p);
        aVar.h00(false, null, null);
        AddressParameter.SellerAddresses sellerAddresses = c12.f117207D;
        aVar.Do(new h(this), sellerAddresses != null ? sellerAddresses.getMotivation() : null);
        if (this.f236999b.Be()) {
            JO.m mVar = c12.f117212h;
            if (mVar == null) {
                V(aVar, c12, null);
                O(aVar, c12, null);
                return;
            }
            if (mVar.f8968i) {
                O(aVar, c12, sellerAddresses != null ? sellerAddresses.getInvalidAddressHint() : null);
            }
            aVar.g8(false);
            JO.m mVar2 = c12.f117212h;
            if (mVar2 != null) {
                aVar.aJ(true);
                boolean z12 = !mVar2.f8968i;
                String str = mVar2.f8963d;
                aVar.Ky(mVar2.f8962c, str != null ? C43066x.B0(str, ',', ' ') : null, z12);
                aVar.ps(new f(c12, this, mVar2));
                return;
            }
            return;
        }
        CategoryParameters categoryParametersC0 = this.f237001d.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof AddressParameter) {
                        break;
                    }
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        V(aVar, c12, null);
        if (c12.f117219o instanceof ItemWithState.State.Error) {
            if ((addressParameter != null ? addressParameter.getErrorPlace() : null) != AddressParameter.EmptyValueErrorPlace.ADDRESSES_LIST) {
                O(aVar, c12, null);
            }
        }
    }

    @Override // com.avito.android.publish.items.location_addresses.e
    @Y61.k
    /* renamed from: n2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF237006i() {
        return this.f237006i;
    }
}
