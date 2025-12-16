package com.avito.android.advert_core.messenger;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;

/* compiled from: AdvertMessengerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/messenger/f;", "Lcom/avito/android/advert_core/messenger/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<MessengerApi> f83788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f83789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f83790c;

    @Inject
    public f(@k h31.e<MessengerApi> eVar, @k E e12, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f83788a = eVar;
        this.f83789b = e12;
        this.f83790c = interfaceC35745a5;
    }

    @Override // com.avito.android.advert_core.messenger.a
    @k
    public final C42026y a(@k String str, @l String str2) {
        return this.f83789b.o().n(new b(this, str, str2));
    }

    @Override // com.avito.android.advert_core.messenger.a
    @k
    public final W b(@k String str) {
        C42026y c42026yA = a(str, null);
        InterfaceC35745a5 interfaceC35745a5 = this.f83790c;
        return c42026yA.s(interfaceC35745a5.a()).n(new e(this)).z(interfaceC35745a5.a());
    }
}
