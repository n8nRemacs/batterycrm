package com.avito.android.safety.sessions;

import Hq0.C14021c;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.InterfaceC34243a1;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeleteSessionInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/d;", "Lcom/avito/android/safety/sessions/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34243a1> f257935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f257936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f257937c;

    @Inject
    public d(@Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f257935a = eVar;
        this.f257936b = fVar;
        this.f257937c = interfaceC35745a5;
    }

    @Override // com.avito.android.safety.sessions.a
    @Y61.k
    public final L0 a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        return new F(new C14021c(5, str, this, str2, str3)).x0(this.f257937c.a()).d0(b.f257933b).m0(new c(this));
    }
}
