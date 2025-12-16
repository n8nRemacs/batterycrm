package com.avito.android.verification.verification_passport;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationPassportInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_passport/c;", "Lcom/avito/android/verification/verification_passport/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f325691b;

    @Inject
    public c(@Y61.k A1 a12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f325690a = a12;
        this.f325691b = interfaceC35745a5;
    }

    @Override // com.avito.android.verification.verification_passport.b
    @Y61.k
    public final W a(@Y61.l String str, @Y61.l String str2) {
        return this.f325690a.a(str, str2).z(this.f325691b.a());
    }
}
