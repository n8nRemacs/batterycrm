package com.yandex.metrica.impl.ob;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.tl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39155tl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final b f381896a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a f381897b;

    /* renamed from: com.yandex.metrica.impl.ob.tl$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.tl$b */
    public static class b {
    }

    public C39155tl() {
        this(new b(), new a());
    }

    @j.N
    public C38761dl a(@j.N Activity activity, @j.N Hk hk2, @j.N C39227wl c39227wl, @j.N Ak ak2, @j.N C39275yl c39275yl, @j.N C39131sl c39131sl) {
        ViewGroup viewGroup;
        C38761dl c38761dl = new C38761dl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        } catch (Throwable th2) {
            c39275yl.a("ui_parsing_root", th2);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.f381896a.getClass();
            Rk rk2 = new Rk(c39227wl, new Fl(c39275yl), new C39130sk(c39227wl.f382146c), ak2, Collections.singletonList(new Mk()), Arrays.asList(new C38686al(c39227wl.f382145b)), c39275yl, c39131sl, new Hl());
            c38761dl.a(rk2, viewGroup, hk2);
            if (c39227wl.f382148e) {
                this.f381897b.getClass();
                C39106rk c39106rk = new C39106rk(rk2.a());
                Iterator<C38711bl> it = rk2.b().iterator();
                while (it.hasNext()) {
                    c39106rk.a(it.next());
                }
            }
        }
        return c38761dl;
    }

    @j.k0
    public C39155tl(@j.N b bVar, @j.N a aVar) {
        this.f381896a = bVar;
        this.f381897b = aVar;
    }
}
