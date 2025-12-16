package com.avito.android.profile_phones.validation;

import Y61.k;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.SelfEmployedPhoneValidationResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.o;

/* compiled from: PhoneSelfEmployedValidationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/validation/b;", "Lcom/avito/android/profile_phones/validation/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile_phones.validation.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A1 f228344a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f228345b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f228346c;

    /* compiled from: PhoneSelfEmployedValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return I.l(new ApiException(b.this.f228346c.a((Throwable) obj), null, 2, null));
        }
    }

    @Inject
    public b(@k A1 a12, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar) {
        this.f228344a = a12;
        this.f228345b = interfaceC35745a5;
        this.f228346c = fVar;
    }

    @Override // com.avito.android.profile_phones.validation.a
    @k
    public final I<SelfEmployedPhoneValidationResult> b(@k String str) {
        I<TypedResult<SelfEmployedPhoneValidationResult>> iB2 = this.f228344a.b(str);
        InterfaceC35745a5 interfaceC35745a5 = this.f228345b;
        return g1.a(iB2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).t(new a()));
    }
}
