package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list;

import Cd.C13243a;
import Y61.k;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.H;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.MultiAddressListItem;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.a;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.l;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.m;
import com.avito.android.util.C35961v3;
import com.avito.android.util.OpenParams;
import com.avito.konveyor.adapter.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: MyAdvertAddressesListActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/MyAdvertAddressesListActivity;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/ui/activity/a;", "<init>", "()V", "a", "MyAdvertAddressesListParams", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MyAdvertAddressesListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f309677r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public m f309678m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f309679n = new O0(m0.f406844a.b(l.class), new c(), new b(new e()), new d());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public j f309680o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f309681p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public h f309682q;

    /* compiled from: MyAdvertAddressesListActivity.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/MyAdvertAddressesListActivity$MyAdvertAddressesListParams;", "Lcom/avito/android/util/OpenParams;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MyAdvertAddressesListParams implements OpenParams {

        @k
        public static final Parcelable.Creator<MyAdvertAddressesListParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MultiAddressesItem> f309683b;

        /* compiled from: MyAdvertAddressesListActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MyAdvertAddressesListParams> {
            @Override // android.os.Parcelable.Creator
            public final MyAdvertAddressesListParams createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MyAdvertAddressesListParams.class, parcel, arrayList, iL2, 1);
                }
                return new MyAdvertAddressesListParams(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MyAdvertAddressesListParams[] newArray(int i12) {
                return new MyAdvertAddressesListParams[i12];
            }
        }

        public MyAdvertAddressesListParams(@k List<MultiAddressesItem> list) {
            this.f309683b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MyAdvertAddressesListParams) && L.f(this.f309683b, ((MyAdvertAddressesListParams) obj).f309683b);
        }

        public final int hashCode() {
            return this.f309683b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("MyAdvertAddressesListParams(addresses="), this.f309683b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f309683b, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }
    }

    /* compiled from: MyAdvertAddressesListActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/MyAdvertAddressesListActivity$a;", "", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f309684l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f309684l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f309684l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return MyAdvertAddressesListActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MyAdvertAddressesListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MyAdvertAddressesListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<l> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = MyAdvertAddressesListActivity.this.f309678m;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.my_advert_adresses_list_layout;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di.a.a().build().a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.arch.mvi.android.f.a((l) this.f309679n.getValue(), this, Lifecycle.State.f46682e, new com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.e(1, this, MyAdvertAddressesListActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/MyAdvertAddressesListOneTimeEvent;)V", 0), f.f309699l);
        View viewK1 = K1();
        j jVar = this.f309680o;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f309681p;
        this.f309682q = new h(viewK1, aVar != null ? aVar : null, jVar);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        List<MultiAddressesItem> list = ((MyAdvertAddressesListParams) C35961v3.a(this).getValue()).f309683b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (MultiAddressesItem multiAddressesItem : list) {
            arrayList.add(new MultiAddressListItem(String.valueOf(multiAddressesItem.getId()), multiAddressesItem.getComponents(), multiAddressesItem.getCoords(), multiAddressesItem.h(), multiAddressesItem.getDeliveryInfo()));
        }
        ((l) this.f309679n.getValue()).accept(new a.C9497a(arrayList));
    }
}
