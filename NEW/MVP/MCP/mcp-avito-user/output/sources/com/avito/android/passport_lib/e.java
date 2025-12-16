package com.avito.android.passport_lib;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.y;

/* compiled from: PassportProfileIconTypeInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport_lib/e;", "Lcom/avito/android/passport_lib/a;", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f213916a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<I50.a> f213917b;

    @Inject
    public e(@Y61.k q qVar, @Y61.k h31.e eVar) {
        this.f213916a = qVar;
        this.f213917b = eVar;
    }

    @Override // com.avito.android.passport_lib.a
    @Y61.k
    public final C41936b0 a() {
        return new C41936b0(y.b(this.f213916a.a()), new d(this));
    }
}
