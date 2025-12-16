package com.avito.android.messenger.service;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.f0;
import com.avito.android.messenger.w0;
import com.avito.android.messenger.x0;
import io.reactivex.rxjava3.internal.operators.maybe.H;
import io.reactivex.rxjava3.internal.operators.maybe.T;
import io.reactivex.rxjava3.internal.operators.observable.S;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OpenErrorTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/n;", "Lcom/avito/android/messenger/service/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f197295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f0 f197296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f197297c;

    @Inject
    public n(@Y61.k w0 w0Var, @Y61.k f0 f0Var, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f197295a = w0Var;
        this.f197296b = f0Var;
        this.f197297c = interfaceC28373a;
    }

    @Y61.k
    public final T a() {
        return new T(new H(new S(this.f197295a.g()).g(new x0()), new j(this)).c(new k(this)));
    }

    @Y61.k
    public final T b(@Y61.k String str, @Y61.k String str2) {
        return new T(new H(new S(this.f197295a.g()).g(new x0()), new l(this, str)).c(new m(this, str2)));
    }
}
