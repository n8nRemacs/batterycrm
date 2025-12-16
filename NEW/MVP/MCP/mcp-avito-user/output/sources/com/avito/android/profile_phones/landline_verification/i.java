package com.avito.android.profile_phones.landline_verification;

import com.avito.android.util.rx3.g1;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult;", "apply", "(J)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f227230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f227231c;

    public i(j jVar, int i12) {
        this.f227230b = jVar;
        this.f227231c = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        j jVar = this.f227230b;
        return g1.a(jVar.f227232a.A(this.f227231c).z(jVar.f227234c.a()).t(new h(jVar)));
    }
}
