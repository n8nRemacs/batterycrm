package com.avito.android.remote.analytics.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.analytics.n;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj0.C43781a;
import lj0.InterfaceC43782b;

/* compiled from: MessengerNetworkErrorsReporterImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/h;", "Lcom/avito/android/remote/analytics/messenger/g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<b> f253208a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f253209b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f253210c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43782b f253211d;

    @Inject
    public h(@Y61.k Set<b> set, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k n nVar, @Y61.k InterfaceC43782b interfaceC43782b) {
        this.f253208a = set;
        this.f253209b = interfaceC28373a;
        this.f253210c = nVar;
        this.f253211d = interfaceC43782b;
    }

    @Override // com.avito.android.remote.analytics.messenger.g
    public final void a(@Y61.k String str, @Y61.k Throwable th2) {
        Iterator<T> it = this.f253208a.iterator();
        a aVarA = it.hasNext() ? ((b) it.next()).a(th2) : null;
        if (aVarA != null) {
            C34244a c34244aC = this.f253210c.c(th2);
            InterfaceC43782b interfaceC43782b = this.f253211d;
            C43781a c43781aA = interfaceC43782b.a();
            String str2 = c43781aA != null ? c43781aA.f414169a : null;
            C43781a c43781aA2 = interfaceC43782b.a();
            this.f253209b.c(new kj0.b(str, str, aVarA.f253201a.f253200b, aVarA.f253202b, aVarA.f253203c, c34244aC.f253102a, str2, c43781aA2 != null ? c43781aA2.f414170b : null, null, 256, null));
        }
    }
}
