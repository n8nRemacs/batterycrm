package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38900jb;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;

/* renamed from: com.yandex.metrica.impl.ob.kb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38925kb {

    /* renamed from: a, reason: collision with root package name */
    private final C38900jb f380915a;

    /* renamed from: b, reason: collision with root package name */
    private final Uh f380916b;

    public C38925kb(@Y61.k C38900jb c38900jb, @Y61.k Uh uh2) {
        this.f380915a = c38900jb;
        this.f380916b = uh2;
    }

    public final void a() {
        Request requestB = new Request.Builder(this.f380916b.c()).b();
        NetworkClient.Builder builder = new NetworkClient.Builder();
        F0.g().t().getClass();
        String str = null;
        builder.f382374c = null;
        int i12 = C38977md.f381054a;
        builder.f382372a = Integer.valueOf(i12);
        builder.f382373b = Integer.valueOf(i12);
        builder.f382375d = Boolean.FALSE;
        builder.f382376e = Boolean.TRUE;
        Response responseB = new com.yandex.metrica.network.impl.c(builder.a(), requestB, new com.yandex.metrica.network.impl.d()).b();
        C38900jb c38900jb = this.f380915a;
        int i13 = responseB.f382387b;
        boolean z12 = i13 == 200;
        int length = responseB.f382388c.length;
        Throwable th2 = responseB.f382391f;
        if (th2 != null) {
            str = th2.getClass().getSimpleName() + " : " + th2.getLocalizedMessage();
        }
        c38900jb.a(new C38900jb.a(z12, i13, length, str));
    }
}
