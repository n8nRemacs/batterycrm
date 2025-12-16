package com.avito.android.safety.password_change.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.safety.password_change.PasswordChangeParams;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PasswordChangeBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements com.avito.android.arch.mvi.b<PasswordChangeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PasswordChangeParams f257366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f257367b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f257368c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f257369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f257370e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.f f257371f;

    @Inject
    public k(@Y61.k PasswordChangeParams passwordChangeParams, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k p pVar, @Y61.k E e12, boolean z12, @Y61.k com.avito.android.credman.f fVar) {
        this.f257366a = passwordChangeParams;
        this.f257367b = interfaceC28373a;
        this.f257368c = pVar;
        this.f257369d = e12;
        this.f257370e = z12;
        this.f257371f = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PasswordChangeInternalAction> a() {
        return C43175k.N(C43175k.G(new j(this, null)), this.f257368c.a(), C43175k.G(new i(this, null)), C43175k.G(new h(this, null)), C43175k.G(new f(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
