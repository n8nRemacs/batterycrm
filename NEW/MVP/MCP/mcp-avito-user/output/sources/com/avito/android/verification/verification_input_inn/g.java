package com.avito.android.verification.verification_input_inn;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationInputInnInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/g;", "Lcom/avito/android/verification/verification_input_inn/e;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325613a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f325614b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f325615c;

    @Inject
    public g(@Y61.k A1 a12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f325613a = a12;
        this.f325614b = interfaceC35745a5;
        this.f325615c = fVar;
    }

    @Override // com.avito.android.verification.verification_input_inn.e
    @Y61.k
    public final W a(@Y61.k Map map, @Y61.k Map map2) {
        return g1.a(this.f325613a.w(map, map2)).z(this.f325614b.a());
    }

    @Override // com.avito.android.verification.verification_input_inn.e
    @Y61.k
    public final W c(@Y61.k Map map) {
        return this.f325613a.c(map).r(f.f325612b).u(new androidx.room.rxjava3.b(this, 23)).z(this.f325614b.a());
    }
}
