package com.avito.android.profile_phones.phone_action.view_model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.error.z;
import com.avito.android.profile_phones.phone_action.view_model.a;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import kotlin.Metadata;
import l41.g;
import sb0.InterfaceC48146a;
import tb0.InterfaceC48640a;

/* compiled from: PhoneActionViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/profile_phones/phone_action/view_model/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends M0 implements com.avito.android.profile_phones.phone_action.view_model.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final String f227322E;

    /* renamed from: J, reason: collision with root package name */
    public final int f227323J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final List<ParcelableEntity<String>> f227324K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final InterfaceC48640a f227325L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final InterfaceC48146a f227326M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public ParcelableEntity<String> f227327N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final C23038g0<a.e> f227328O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final D<a.b> f227329P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final D<a.C6906a> f227330Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final C23038g0<a.c> f227331R;

    /* renamed from: S, reason: collision with root package name */
    @k
    public final C23038g0<a.d> f227332S;

    /* renamed from: T, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f227333T;

    /* compiled from: PhoneActionViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f227328O.postValue(a.e.b.f227315a);
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f227336c;

        public b(String str) {
            this.f227336c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d dVar = d.this;
            dVar.f227329P.postValue(new a.b.C6908b(dVar.f227325L.a(this.f227336c)));
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            d dVar = d.this;
            InterfaceC48640a interfaceC48640a = dVar.f227325L;
            dVar.f227328O.postValue(new a.e.C6910a(interfaceC48640a.getF439324b(), interfaceC48640a.getF439325c(), interfaceC48640a.getF439326d()));
            String strJ = z.j(th2);
            if (strJ == null) {
                strJ = dVar.f227325L.getF439327e();
            }
            dVar.f227330Q.postValue(new a.C6906a(strJ, th2));
            V2.f318762a.a("DEFAULT_TAG", "Failed to remove phone", th2);
        }
    }

    public d(int i12, @k PhoneActionCode phoneActionCode, @k String str, @k List list, @k InterfaceC48146a interfaceC48146a, @k InterfaceC48640a interfaceC48640a) {
        this.f227322E = str;
        this.f227323J = i12;
        this.f227324K = list;
        this.f227325L = interfaceC48640a;
        this.f227326M = interfaceC48146a;
        C23038g0<a.e> c23038g0 = new C23038g0<>();
        this.f227328O = c23038g0;
        this.f227329P = new D<>();
        this.f227330Q = new D<>();
        C23038g0<a.c> c23038g02 = new C23038g0<>();
        this.f227331R = c23038g02;
        this.f227332S = new C23038g0<>();
        this.f227333T = new io.reactivex.rxjava3.disposables.c();
        c23038g0.postValue(new a.e.C6910a(interfaceC48640a.getF439324b(), interfaceC48640a.getF439325c(), interfaceC48640a.getF439326d()));
        if (phoneActionCode == PhoneActionCode.f228122c || i12 == 0) {
            c23038g02.postValue(a.c.b.f227308a);
        } else {
            ke(null, null);
        }
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    public final void A2() {
        ParcelableEntity<String> parcelableEntity = this.f227327N;
        String f227261b = parcelableEntity != null ? parcelableEntity.getF119974b() : null;
        if (f227261b != null || this.f227323J <= 0) {
            this.f227333T.b(this.f227326M.a(this.f227322E, f227261b).j(new a()).x(new b(f227261b), new c()));
        } else {
            ke(null, this.f227325L.getF439320g());
        }
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    @k
    /* renamed from: Ac, reason: from getter */
    public final C23038g0 getF227331R() {
        return this.f227331R;
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    @k
    public final AbstractC22991Y<a.b> S0() {
        return this.f227329P;
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    @k
    /* renamed from: V0, reason: from getter */
    public final D getF227330Q() {
        return this.f227330Q;
    }

    public final void ke(String str, String str2) {
        InterfaceC48640a interfaceC48640a = this.f227325L;
        this.f227331R.postValue(new a.c.C6909a(interfaceC48640a.getF439317d(), interfaceC48640a.getF439318e(), str, str2));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f227333T.e();
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    public final void q(@k List<? extends ParcelableEntity<String>> list) {
        if (list.isEmpty()) {
            return;
        }
        ParcelableEntity<String> parcelableEntity = list.get(0);
        this.f227327N = parcelableEntity;
        ke(parcelableEntity.getF119974b(), null);
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    public final void rd() {
        this.f227332S.postValue(new a.d(this.f227325L.getF439321h(), this.f227324K, this.f227327N));
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    public final void t3() {
        this.f227329P.postValue(a.b.C6907a.f227302a);
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    @k
    /* renamed from: va, reason: from getter */
    public final C23038g0 getF227332S() {
        return this.f227332S;
    }

    @Override // com.avito.android.profile_phones.phone_action.view_model.a
    @k
    public final AbstractC22991Y<a.e> z1() {
        return this.f227328O;
    }
}
