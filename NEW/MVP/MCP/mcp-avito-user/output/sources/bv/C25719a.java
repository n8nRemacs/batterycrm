package bv;

import Gu.C13917a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: DeeplinkHandlerAuthorizationManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbv/a;", "", "a", "_avito_deeplink-handlers_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C25719a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f57537a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f57538b;

    /* compiled from: DeeplinkHandlerAuthorizationManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbv/a$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handlers_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bv.a$a, reason: collision with other inner class name */
    public static final class C2023a implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C2023a f57539b = new C2023a();
    }

    public C25719a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k E e12) {
        this.f57537a = aVar;
        this.f57538b = e12;
    }

    public final <D extends DeepLink> void a(@k D d12, @k AbstractC40161a<? extends D> abstractC40161a, @l AuthSource authSource, @k Y41.a<G0> aVar) {
        b(d12, abstractC40161a, authSource != null ? authSource.f92737b : null, aVar);
    }

    @InterfaceC42830m
    public final <D extends DeepLink> void b(@k D d12, @k AbstractC40161a<? extends D> abstractC40161a, @l String str, @k Y41.a<G0> aVar) {
        if (this.f57538b.b()) {
            aVar.invoke();
            return;
        }
        if (str == null) {
            str = "deeplink " + d12.getPath();
        }
        abstractC40161a.i(C2023a.f57539b, this.f57537a, C13917a.a(2, d12, str));
    }
}
