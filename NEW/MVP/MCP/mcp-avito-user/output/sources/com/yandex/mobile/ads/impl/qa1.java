package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class qa1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39376x f389124a = new C39376x();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39367u f389125b = C39370v.a();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private a f389126c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private InterfaceC39322f0 f389127d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private kl0 f389128e;

    public interface a {
        void a();

        void b();
    }

    public class b implements InterfaceC39322f0 {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f389129a;

        public b(Context context) {
            this.f389129a = new WeakReference<>(context);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39322f0
        public final void a(@j.N Activity activity) {
            Context context = this.f389129a.get();
            if (context == null || !context.equals(activity) || qa1.this.f389126c == null) {
                return;
            }
            qa1.this.f389126c.b();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39322f0
        public final void b(@j.N Activity activity) {
            Context context = this.f389129a.get();
            if (context == null || !context.equals(activity) || qa1.this.f389126c == null) {
                return;
            }
            qa1.this.f389126c.a();
        }
    }

    public final void a(@j.N View view, @j.N a aVar) {
        this.f389126c = aVar;
        Context context = view.getContext();
        InterfaceC39322f0 interfaceC39322f0 = this.f389127d;
        if (interfaceC39322f0 != null) {
            this.f389125b.a(context, interfaceC39322f0);
        }
        kl0 kl0Var = this.f389128e;
        if (kl0Var != null) {
            kl0Var.a();
        }
        C39376x c39376x = this.f389124a;
        Context context2 = view.getContext();
        c39376x.getClass();
        int i12 = 0;
        while (context2 instanceof ContextWrapper) {
            int i13 = i12 + 1;
            if (i12 >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
            i12 = i13;
        }
        context2 = null;
        if (context2 != null) {
            this.f389127d = new b(context2);
            this.f389128e = new kl0(view, this.f389126c);
            this.f389125b.b(context2, this.f389127d);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f389128e);
        }
    }

    public final void a(@j.N Context context) {
        this.f389126c = null;
        InterfaceC39322f0 interfaceC39322f0 = this.f389127d;
        if (interfaceC39322f0 != null) {
            this.f389125b.a(context, interfaceC39322f0);
        }
        kl0 kl0Var = this.f389128e;
        if (kl0Var != null) {
            kl0Var.a();
        }
    }
}
