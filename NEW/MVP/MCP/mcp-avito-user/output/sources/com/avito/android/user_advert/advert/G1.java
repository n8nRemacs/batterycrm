package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: MyDraftAdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/G1;", "Lcom/avito/android/user_advert/advert/E1;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G1 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43640a> f308235a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f308236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f308237c;

    @Inject
    public G1(@Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f308235a = eVar;
        this.f308236b = interfaceC35745a5;
        this.f308237c = fVar;
    }

    @Override // com.avito.android.user_advert.advert.E1
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U d(@Y61.k String str, @Y61.l String str2) {
        return com.avito.android.util.rx3.g1.a(new C42007e(new com.avito.android.advert.deeplinks.delivery.p(this, str, str2, 16)).z(this.f308236b.a())).r(F1.f308232b).u(new V(this, 1));
    }
}
