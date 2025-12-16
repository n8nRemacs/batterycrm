package Ds;

import Y61.k;
import androidx.view.M0;
import com.avito.android.V;
import com.avito.android.credits.x;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditBrokerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDs/c;", "LDs/b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements InterfaceC13438b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final V f3496a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f3497b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f3498c;

    @Inject
    public c(@k V v12, @k x xVar, @k @InterfaceC30174s String str, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f3496a = v12;
        this.f3497b = xVar;
        this.f3498c = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f3496a, this.f3497b, this.f3498c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
