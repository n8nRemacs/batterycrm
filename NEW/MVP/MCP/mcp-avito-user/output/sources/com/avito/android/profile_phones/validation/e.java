package com.avito.android.profile_phones.validation;

import Y61.k;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.PhoneValidationResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.o;

/* compiled from: PhoneValidationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/validation/e;", "Lcom/avito/android/profile_phones/validation/d;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f228351a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f228352b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f228353c;

    /* compiled from: PhoneValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PhoneValidationResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return I.l(new ApiException(e.this.f228353c.a((Throwable) obj), null, 2, null));
        }
    }

    @Inject
    public e(@k InterfaceC34401z0 interfaceC34401z0, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar) {
        this.f228351a = interfaceC34401z0;
        this.f228352b = interfaceC35745a5;
        this.f228353c = fVar;
    }

    @Override // com.avito.android.profile_phones.validation.d
    @k
    public final I<PhoneValidationResult> a(@k String str) {
        return g1.a(this.f228351a.h(str).z(this.f228352b.a()).t(new a()));
    }
}
