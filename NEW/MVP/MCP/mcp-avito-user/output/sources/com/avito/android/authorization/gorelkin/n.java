package com.avito.android.authorization.gorelkin;

import Fc1.E0;
import android.content.res.Resources;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.remote.model.ParsingPermissionResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import javax.inject.Inject;
import kotlin.Metadata;
import zz.InterfaceC50647a;

/* compiled from: ParsingPermissionViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/gorelkin/n;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/authorization/gorelkin/m;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n extends M0 implements m {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final h f93939E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93940J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Resources f93941K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f93942L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93943M = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ParsingAllowance> f93944N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<m.b> f93945O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<m.a> f93946P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f93947Q;

    /* compiled from: ParsingPermissionViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PpFlow.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PpFlow ppFlow = PpFlow.f93887b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PpFlow ppFlow2 = PpFlow.f93887b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ParsingPermissionViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            n.this.f93945O.postValue(m.b.C2782b.f93935a);
        }
    }

    /* compiled from: ParsingPermissionViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ParsingPermissionResult;", "ppResult", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/ParsingPermissionResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParsingPermissionResult parsingPermissionResult = (ParsingPermissionResult) obj;
            boolean z12 = parsingPermissionResult instanceof ParsingPermissionResult.Ok;
            n nVar = n.this;
            if (z12) {
                ParsingPermissionResult.Ok ok2 = (ParsingPermissionResult.Ok) parsingPermissionResult;
                nVar.f93946P.postValue(new m.a.C2781a(ok2.getProfile(), ok2.getSession()));
            } else if (parsingPermissionResult instanceof ParsingPermissionResult.IncorrectData) {
                ParsingPermissionResult.IncorrectData incorrectData = (ParsingPermissionResult.IncorrectData) parsingPermissionResult;
                nVar.f93945O.postValue(new m.b.a(incorrectData.getMessages().get("name"), incorrectData.getMessages().get("phone")));
            }
        }
    }

    @Inject
    public n(@Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Resources resources, @Y61.k InterfaceC50647a interfaceC50647a) {
        this.f93939E = hVar;
        this.f93940J = interfaceC35745a5;
        this.f93941K = resources;
        this.f93942L = interfaceC50647a;
        C23038g0<ParsingAllowance> c23038g0 = new C23038g0<>(ParsingAllowance.f93861e);
        this.f93944N = c23038g0;
        this.f93945O = new C23038g0<>();
        this.f93946P = new C23038g0<>();
        this.f93947Q = c23038g0;
    }

    @Override // com.avito.android.authorization.gorelkin.m
    @Y61.k
    /* renamed from: Db, reason: from getter */
    public final C23038g0 getF93946P() {
        return this.f93946P;
    }

    @Override // com.avito.android.authorization.gorelkin.m
    public final void I3(@Y61.k ParsingAllowance parsingAllowance) {
        this.f93944N.postValue(parsingAllowance);
    }

    @Override // com.avito.android.authorization.gorelkin.m
    public final void a3(@Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, @Y61.k PpFlow ppFlow) throws Resources.NotFoundException {
        if (charSequence2.length() == 0) {
            this.f93945O.postValue(new m.b.a(null, this.f93941K.getString(R.string.parsing_permission_phone_input_error)));
            return;
        }
        int iOrdinal = ppFlow.ordinal();
        h hVar = this.f93939E;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ke(charSequence, charSequence2, new o(3, hVar, h.class, "sendRegisterParsingPermission", "sendRegisterParsingPermission(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/authorization/gorelkin/ParsingAllowance;)Lio/reactivex/rxjava3/core/Single;", 0));
                return;
            } else if (iOrdinal != 2) {
                return;
            }
        }
        ke(charSequence, charSequence2, new p(3, hVar, h.class, "sendSocialParsingPermission", "sendSocialParsingPermission(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/authorization/gorelkin/ParsingAllowance;)Lio/reactivex/rxjava3/core/Single;", 0));
    }

    public final void ke(CharSequence charSequence, CharSequence charSequence2, Y41.q<? super String, ? super String, ? super ParsingAllowance, ? extends I<ParsingPermissionResult>> qVar) {
        this.f93943M.b(new C42023v(qVar.invoke(charSequence.toString(), charSequence2.toString(), this.f93944N.getValue()).s(this.f93940J.e()).j(new b()), new E0(this, 15)).x(new c(), new l41.g() { // from class: com.avito.android.authorization.gorelkin.n.d
            @Override // l41.g
            public final void accept(Object obj) {
                Throwable th2 = (Throwable) obj;
                n nVar = n.this;
                nVar.getClass();
                nVar.f93945O.postValue(new m.b.c(th2 instanceof ApiException ? nVar.f93942L.b(((ApiException) th2).f318522b) : null, th2));
            }
        }));
    }

    @Override // com.avito.android.authorization.gorelkin.m
    @Y61.k
    /* renamed from: la, reason: from getter */
    public final C23038g0 getF93947Q() {
        return this.f93947Q;
    }

    @Override // com.avito.android.authorization.gorelkin.m
    @Y61.k
    public final AbstractC22991Y<m.b> o0() {
        return this.f93945O;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f93943M.e();
    }
}
