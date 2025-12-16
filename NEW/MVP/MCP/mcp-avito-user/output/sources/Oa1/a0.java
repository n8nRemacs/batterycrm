package Oa1;

import java.net.URI;
import java.net.URL;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.N implements Y41.a<URL> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f12350l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var) {
        super(0);
        this.f12350l = e0Var;
    }

    @Override // Y41.a
    public final URL invoke() {
        this.f12350l.f12360a.getClass();
        return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
    }
}
