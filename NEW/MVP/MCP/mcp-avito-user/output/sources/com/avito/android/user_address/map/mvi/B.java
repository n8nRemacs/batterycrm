package com.avito.android.user_address.map.mvi;

import android.app.Activity;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.mvi.A;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nF.C44245a;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/map/mvi/B;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/user_address/map/mvi/A;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B implements com.avito.android.arch.mvi.a<A, UserAddressMapMviInternalAction, UserAddressAddNewAddressMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map f307642a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.map.domain.d f307643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.o f307644c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Activity f307645d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.a f307646e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.map.view.e f307647f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.q f307648g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C44245a f307649h;

    /* compiled from: UserAddressMapMviActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/map/mvi/B$a;", "", "a", "b", "Lcom/avito/android/user_address/map/mvi/B$a$a;", "Lcom/avito/android/user_address/map/mvi/B$a$b;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAddressMapMviActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/B$a$a;", "Lcom/avito/android/user_address/map/mvi/B$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_address.map.mvi.B$a$a, reason: collision with other inner class name */
        public static final class C9452a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9452a f307650a = new C9452a();
        }

        /* compiled from: UserAddressMapMviActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/B$a$b;", "Lcom/avito/android/user_address/map/mvi/B$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f307651a = new b();
        }
    }

    @Inject
    public B(@Y61.k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map, @Y61.k com.avito.android.user_address.map.domain.d dVar, @Y61.k com.avito.android.location.find.o oVar, @Y61.k Activity activity, @Y61.k com.avito.android.user_address.a aVar, @Y61.k com.avito.android.user_address.map.view.e eVar, @Y61.k com.avito.android.permissions.q qVar, @Y61.k C44245a c44245a) {
        this.f307642a = map;
        this.f307643b = dVar;
        this.f307644c = oVar;
        this.f307645d = activity;
        this.f307646e = aVar;
        this.f307647f = eVar;
        this.f307648g = qVar;
        this.f307649h = c44245a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new D(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, C.f307652l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UserAddressMapMviInternalAction> b(@Y61.k A a12, @Y61.k UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        if (a12 instanceof A.h) {
            A.h hVar = (A.h) a12;
            if (hVar instanceof A.q) {
                return C43175k.G(new Q(2, null));
            }
            if (hVar instanceof A.r) {
                return d(((A.r) hVar).f307639a, userAddressAddNewAddressMviState);
            }
            if (hVar instanceof A.o) {
                return C43175k.G(new O(userAddressAddNewAddressMviState, this, null));
            }
            if (hVar instanceof A.d) {
                return C43175k.G(new P(this, ((A.d) hVar).f307627a, null));
            }
            if (!(hVar instanceof A.n)) {
                if (hVar instanceof A.i) {
                    return C43175k.G(new E(2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307642a;
            boolean z12 = map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById;
            com.avito.android.user_address.map.domain.d dVar = this.f307643b;
            if (z12) {
                return C35372z.b(dVar, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) map).f307117b);
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
                return C35372z.b(dVar, ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) map).f307121b);
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
                throw new IllegalStateException("addressId is null");
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) {
                throw new IllegalStateException("No retry button in AddSellerAddressFlow");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (a12 instanceof A.a) {
            return e(userAddressAddNewAddressMviState);
        }
        if (!(a12 instanceof A.l)) {
            throw new NoWhenBranchMatchedException();
        }
        A.l lVar = (A.l) a12;
        UserAddressMapFullAddressMviState userAddressMapFullAddressMviState = (UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState;
        if (lVar instanceof A.c) {
            return C43175k.G(new P(this, null, null));
        }
        if (lVar instanceof A.t) {
            return e(userAddressMapFullAddressMviState);
        }
        if (lVar instanceof A.f) {
            return C43175k.G(new G(lVar, null));
        }
        if (lVar instanceof A.g) {
            return C43175k.G(new H(lVar, null));
        }
        if (lVar instanceof A.m) {
            return C43175k.G(new I(lVar, null));
        }
        if (lVar instanceof A.p) {
            return C43175k.G(new J(lVar, null));
        }
        if (lVar instanceof A.e) {
            return C43175k.G(new K(lVar, null));
        }
        if (lVar instanceof A.k) {
            return C43175k.G(new L(2, null));
        }
        if (lVar instanceof A.j) {
            return new C43152f0(C43175k.G(new M(userAddressMapFullAddressMviState, this, null)), new N(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C43152f0 d(AvitoMapCameraPosition avitoMapCameraPosition, UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307642a;
        boolean z12 = map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo;
        com.avito.android.user_address.map.view.e eVar = this.f307647f;
        com.avito.android.user_address.map.domain.d dVar = this.f307643b;
        return z12 ? new C43152f0(C43175k.G(new C35368v(userAddressAddNewAddressMviState, avitoMapCameraPosition, (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map, dVar, null)), new C35369w(eVar, null)) : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow ? new C43152f0(C43175k.G(new C35363p(userAddressAddNewAddressMviState, avitoMapCameraPosition, dVar, (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map, null)), new C35364q(eVar, null)) : C35372z.a(dVar, avitoMapCameraPosition, userAddressAddNewAddressMviState, eVar);
    }

    public final C43152f0 e(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        InterfaceC43160i interfaceC43160iG;
        boolean z12 = userAddressAddNewAddressMviState instanceof UserAddressMapShortAddressMviState;
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307642a;
        if (z12) {
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) {
                interfaceC43160iG = C43175k.G(new X(this, (UserAddressMapShortAddressMviState) userAddressAddNewAddressMviState, null));
            } else if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) {
                interfaceC43160iG = C43175k.G(new S(userAddressAddNewAddressMviState, this, null));
            } else {
                if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo)) {
                    throw new IllegalStateException("Unknown fragment state");
                }
                interfaceC43160iG = C43175k.G(new W(this, (UserAddressMapShortAddressMviState) userAddressAddNewAddressMviState, null));
            }
        } else {
            if (!(userAddressAddNewAddressMviState instanceof UserAddressMapFullAddressMviState)) {
                throw new NoWhenBranchMatchedException();
            }
            if (map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById ? true : map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
                interfaceC43160iG = C43175k.G(new F((UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState, this, null));
            } else {
                if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress)) {
                    throw new IllegalStateException("Unknown fragment state");
                }
                interfaceC43160iG = C43175k.G(new S(userAddressAddNewAddressMviState, this, null));
            }
        }
        return new C43152f0(new kotlinx.coroutines.flow.X(new C43137a0(new T(2, null), interfaceC43160iG), new U(3, null)), new V(this, null));
    }
}
