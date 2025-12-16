package com.avito.android.beduin.data;

import Y61.k;
import Y61.l;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import oi.InterfaceC44779a;
import qi.InterfaceC47401b;

/* compiled from: BeduinScreenRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/data/d;", "Lcom/avito/android/beduin/domain/screen/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes11.dex */
public final class d implements com.avito.android.beduin.domain.screen.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44779a> f103896a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f103897b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public volatile InterfaceC47401b f103898c;

    @Inject
    public d(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f103896a = eVar;
        this.f103897b = interfaceC35745a5;
    }

    @Override // com.avito.android.beduin.domain.screen.e
    @k
    public final C42007e a(@k String str) {
        return new C42007e(new a(this, str, 1));
    }

    @Override // com.avito.android.beduin.domain.screen.e
    @k
    public final W b(@k String str) {
        return new C42007e(new a(this, str, 0)).r(b.f103894b).k(new c(this)).z(this.f103897b.a());
    }
}
