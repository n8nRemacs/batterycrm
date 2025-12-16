package com.avito.android.profile_phones.confirm_phone;

import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.remote.model.PhoneValidationResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import zb0.C50541a;

/* compiled from: ConfirmPhoneViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/o;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/profile_phones/confirm_phone/l;", "a", "b", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends M0 implements l {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f227071T = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.confirm_phone.k f227072E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.b f227073J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.validation.d f227074K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.f f227075L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f227076M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f227077N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227078O = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final b f227079P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<l.c> f227080Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D<l.a> f227081R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final D<l.b> f227082S;

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/o$a;", "", "<init>", "()V", "", "KEY_IS_PHONE_VALID_SAVED_STATE", "Ljava/lang/String;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/o$b;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f227083b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f227084c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f227085d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f227086e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f227087f;

        static {
            b bVar = new b("VALID", 0);
            f227083b = bVar;
            b bVar2 = new b("INVALID", 1);
            f227084c = bVar2;
            b bVar3 = new b("REVERIFICATION", 2);
            f227085d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f227086e = bVarArr;
            f227087f = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f227086e.clone();
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/RequestCodeResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/registration/RequestCodeResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            RequestCodeResult requestCodeResult = (RequestCodeResult) obj;
            boolean z12 = requestCodeResult instanceof RequestCodeResult.Ok;
            o oVar = o.this;
            if (z12) {
                int i12 = o.f227071T;
                oVar.f227080Q.postValue(new l.c.d(oVar.f227072E.f227036a));
                RequestCodeResult.Ok ok2 = (RequestCodeResult.Ok) requestCodeResult;
                oVar.f227081R.postValue(new l.a.C6894a(ok2.getNextTryTime() - ok2.getLastTryTime(), oVar.f227072E.f227037b));
                return;
            }
            int i13 = 2;
            Throwable th2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (requestCodeResult instanceof RequestCodeResult.Failure) {
                oVar.f227080Q.postValue(new l.c.b(((RequestCodeResult.Failure) requestCodeResult).getMessage(), th2, i13, objArr3 == true ? 1 : 0));
                oVar.f227081R.postValue(new l.a.C6894a(0L, oVar.f227072E.f227037b));
            } else {
                if (requestCodeResult instanceof RequestCodeResult.IncorrectData) {
                    o.le(oVar, ((RequestCodeResult.IncorrectData) requestCodeResult).getMessages());
                    return;
                }
                if (requestCodeResult instanceof RequestCodeResult.Confirmed) {
                    oVar.f227080Q.postValue(new l.c.b(oVar.f227075L.getF119611a(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0));
                    oVar.f227081R.postValue(new l.a.C6894a(0L, oVar.f227072E.f227037b));
                } else {
                    if (!(requestCodeResult instanceof RequestCodeResult.ErrorDialog)) {
                        boolean z13 = requestCodeResult instanceof RequestCodeResult.VerifyByCall;
                        return;
                    }
                    oVar.f227080Q.postValue(new l.c.a(((RequestCodeResult.ErrorDialog) requestCodeResult).getUserDialog()));
                    oVar.f227081R.postValue(l.a.b.f227044a);
                }
            }
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            o.ke(o.this, (Throwable) obj);
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f227090b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((CharSequence) obj).toString();
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f<T> implements l41.r {
        public f() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((String) obj).length() == o.this.f227072E.f227037b;
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            o.this.f227080Q.postValue(l.c.C6896c.f227058a);
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            o oVar = o.this;
            com.avito.android.profile_phones.confirm_phone.k kVar = oVar.f227072E;
            String str = kVar.f227036a;
            RequestCodeV2Source requestCodeV2Source = kVar.f227041f;
            oVar.f227078O.b(oVar.f227073J.g(str, (String) obj, requestCodeV2Source).x(new p(oVar), new q(oVar)));
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f227094b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe input changes", (Throwable) obj);
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PhoneValidationResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/PhoneValidationResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f227096c;

        public j(boolean z12) {
            this.f227096c = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar;
            PhoneValidationResult phoneValidationResult = (PhoneValidationResult) obj;
            boolean z12 = phoneValidationResult instanceof PhoneValidationResult.AllowReverification;
            if (z12 ? true : phoneValidationResult instanceof PhoneValidationResult.DisallowReverification) {
                bVar = b.f227085d;
            } else if (phoneValidationResult instanceof PhoneValidationResult.IncorrectData) {
                bVar = b.f227084c;
            } else {
                if (!(phoneValidationResult instanceof PhoneValidationResult.Ok)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = b.f227083b;
            }
            int i12 = o.f227071T;
            o oVar = o.this;
            oVar.f227077N.e(bVar, "key_is_phone_valid_save_state");
            D<l.b> d12 = oVar.f227082S;
            if (z12) {
                PhoneValidationResult.AllowReverification allowReverification = (PhoneValidationResult.AllowReverification) phoneValidationResult;
                d12.postValue(new l.b.C6895b(allowReverification.getPhone(), allowReverification.getPhoneFormatted(), allowReverification.getUserEmail()));
            } else if (phoneValidationResult instanceof PhoneValidationResult.DisallowReverification) {
                PhoneValidationResult.DisallowReverification disallowReverification = (PhoneValidationResult.DisallowReverification) phoneValidationResult;
                d12.postValue(new l.b.c(disallowReverification.getPhone(), disallowReverification.getPhoneFormatted(), disallowReverification.getUserEmail()));
            } else if (phoneValidationResult instanceof PhoneValidationResult.IncorrectData) {
                o.le(oVar, ((PhoneValidationResult.IncorrectData) phoneValidationResult).getMessages());
            } else if (phoneValidationResult instanceof PhoneValidationResult.Ok) {
                oVar.me(this.f227096c);
            }
        }
    }

    /* compiled from: ConfirmPhoneViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {
        public k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            o.ke(o.this, (Throwable) obj);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k com.avito.android.profile_phones.confirm_phone.k kVar, @Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.b bVar, @Y61.k com.avito.android.profile_phones.validation.d dVar, @Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C23060r0 c23060r0) {
        this.f227072E = kVar;
        this.f227073J = bVar;
        this.f227074K = dVar;
        this.f227075L = fVar;
        this.f227076M = interfaceC35745a5;
        this.f227077N = c23060r0;
        this.f227079P = kVar.f227040e ? b.f227084c : b.f227083b;
        C23038g0<l.c> c23038g0 = new C23038g0<>();
        this.f227080Q = c23038g0;
        D<l.a> d12 = new D<>();
        this.f227081R = d12;
        this.f227082S = new D<>();
        c23038g0.postValue(new l.c.d(kVar.f227036a));
        if (kVar.f227039d) {
            ne(false);
        } else {
            d12.postValue(new l.a.C6894a(kVar.f227038c, kVar.f227037b));
        }
    }

    public static final void ke(o oVar, Throwable th2) {
        oVar.f227081R.postValue(new l.a.C6894a(0L, oVar.f227072E.f227037b));
        if (th2 instanceof ApiException) {
            oVar.f227080Q.postValue(new l.c.b(((ApiException) th2).getMessage(), th2));
        } else {
            V2.f318762a.e("Failed to request phone code", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void le(o oVar, Map map) {
        oVar.getClass();
        String f119611a = (String) C42745f0.F(map.values());
        if (f119611a == null) {
            f119611a = oVar.f227075L.getF119611a();
        }
        oVar.f227080Q.postValue(new l.c.b(f119611a, null, 2, 0 == true ? 1 : 0));
        oVar.f227081R.postValue(new l.a.C6894a(0L, oVar.f227072E.f227037b));
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    public final void N2() {
        ne(true);
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    public final void O6() {
        this.f227082S.setValue(l.b.a.f227046a);
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    @Y61.k
    /* renamed from: O9, reason: from getter */
    public final D getF227081R() {
        return this.f227081R;
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    @Y61.k
    public final AbstractC22991Y<l.b> S0() {
        return this.f227082S;
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    public final void V4() {
        this.f227082S.postValue(l.b.a.f227046a);
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    public final void l0() {
        this.f227077N.e(b.f227083b, "key_is_phone_valid_save_state");
        ne(true);
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    public final void m6(@Y61.k z<CharSequence> zVar) {
        this.f227078O.b(zVar.d0(e.f227090b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(new f()).K(new g()).v0(new h(), i.f227094b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void me(boolean z12) {
        this.f227081R.setValue(l.a.c.f227045a);
        com.avito.android.profile_phones.confirm_phone.k kVar = this.f227072E;
        String str = kVar.f227036a;
        this.f227078O.b(this.f227073J.e(str, kVar.f227041f, C50541a.a(str), z12).x(new c(), new d()));
    }

    public final void ne(boolean z12) {
        C23060r0 c23060r0 = this.f227077N;
        b bVar = (b) c23060r0.b("key_is_phone_valid_save_state");
        if (bVar == null) {
            bVar = this.f227079P;
        }
        if (bVar == b.f227084c) {
            this.f227081R.setValue(l.a.c.f227045a);
            this.f227078O.b(this.f227074K.a(this.f227072E.f227036a).s(this.f227076M.e()).x(new j(z12), new k()));
            return;
        }
        b bVar2 = (b) c23060r0.b("key_is_phone_valid_save_state");
        if (bVar2 == null) {
            bVar2 = this.f227079P;
        }
        if (bVar2 == b.f227083b) {
            me(z12);
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f227078O.e();
    }

    @Override // com.avito.android.profile_phones.confirm_phone.l
    @Y61.k
    public final AbstractC22991Y<l.c> z1() {
        return this.f227080Q;
    }
}
