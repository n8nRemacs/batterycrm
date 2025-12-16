package com.avito.android.safety.sessions.social_logout;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34243a1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsSocialLogoutInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/g;", "Lcom/avito/android/safety/sessions/social_logout/d;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34243a1 f258025a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f258026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f258027c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final G f258028d;

    @Inject
    public g(@Y61.k InterfaceC34243a1 interfaceC34243a1, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k G g12) {
        this.f258025a = interfaceC34243a1;
        this.f258026b = fVar;
        this.f258027c = interfaceC35745a5;
        this.f258028d = g12;
    }

    @Override // com.avito.android.safety.sessions.social_logout.d
    @Y61.l
    public final String a() {
        return this.f258028d.a();
    }

    @Override // com.avito.android.safety.sessions.social_logout.d
    public final boolean b() {
        return this.f258028d.b();
    }

    @Override // com.avito.android.safety.sessions.social_logout.d
    @Y61.k
    public final L0 c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        return this.f258025a.a(str, str2, str3, str4).x0(this.f258027c.a()).d0(e.f258023b).m0(new f(this));
    }
}
