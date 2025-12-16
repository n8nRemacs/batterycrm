package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42025x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/r;", "Lcom/avito/android/code_confirmation/code_confirmation/g;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements InterfaceC29394g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.r> f119619a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f119620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final W f119621c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f119622d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119623e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CodeConfirmationSource f119624f;

    @Inject
    public r(@Y61.k h31.e<com.avito.android.remote.r> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k W w12, @Y61.k com.avito.android.remote.error.f fVar, boolean z12, @Y61.k CodeConfirmationSource codeConfirmationSource) {
        this.f119619a = eVar;
        this.f119620b = interfaceC35745a5;
        this.f119621c = w12;
        this.f119622d = fVar;
        this.f119623e = z12;
        this.f119624f = codeConfirmationSource;
    }

    public static final io.reactivex.rxjava3.core.q c(r rVar, ApiError apiError) {
        rVar.getClass();
        return io.reactivex.rxjava3.core.I.l(new ApiException(apiError, null, 2, null)).E();
    }

    public static final C42025x d(r rVar, ApiError apiError) {
        rVar.getClass();
        return io.reactivex.rxjava3.core.I.l(new ApiException(apiError, null, 2, null));
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g
    @Y61.k
    public final C42007e a(@Y61.k final String str, @Y61.k final String str2, final boolean z12) {
        final String str3 = this.f119624f.f92770b;
        return new C42007e(new l41.s() { // from class: com.avito.android.code_confirmation.code_confirmation.i
            @Override // l41.s
            public final Object get() {
                r rVar = this;
                InterfaceC35745a5 interfaceC35745a5 = rVar.f119620b;
                String str4 = str2;
                String str5 = str3;
                boolean z13 = z12;
                String str6 = str;
                if (!z13) {
                    return g1.a(rVar.f119619a.get().e(str6, str4, str5).z(interfaceC35745a5.a()).t(new C29397j(rVar))).n(new C29398k(rVar, str6));
                }
                return g1.a(kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C29404q(rVar, str6, str4, str5, null)).z(interfaceC35745a5.a()).t(new C29399l(rVar))).n(new C29400m(rVar));
            }
        });
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.D b(@Y61.k final String str, @Y61.l CodeConfirmationSource codeConfirmationSource, final boolean z12) {
        if (codeConfirmationSource == null) {
            codeConfirmationSource = this.f119624f;
        }
        final String str2 = codeConfirmationSource.f92770b;
        return new io.reactivex.rxjava3.internal.operators.single.D(g1.a(new C42007e(new l41.s() { // from class: com.avito.android.code_confirmation.code_confirmation.h
            @Override // l41.s
            public final Object get() {
                String str3 = str2;
                boolean z13 = z12;
                r rVar = this;
                String str4 = str;
                if (!z13) {
                    return rVar.f119619a.get().c(str4, rVar.f119623e, str3);
                }
                return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new C29401n(rVar, str4, str3, null));
            }
        }).z(this.f119620b.a()).t(new C29402o(this))), new C29403p(this, str));
    }
}
