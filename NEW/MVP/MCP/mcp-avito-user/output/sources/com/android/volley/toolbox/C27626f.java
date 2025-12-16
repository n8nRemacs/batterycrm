package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.b;
import com.android.volley.toolbox.AbstractC27623c;

/* compiled from: BasicAsyncNetwork.java */
/* renamed from: com.android.volley.toolbox.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27626f extends com.android.volley.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC27623c f67118a;

    /* compiled from: BasicAsyncNetwork.java */
    /* renamed from: com.android.volley.toolbox.f$a */
    public class a implements AbstractC27623c.b {
    }

    /* compiled from: BasicAsyncNetwork.java */
    /* renamed from: com.android.volley.toolbox.f$b */
    public static class b {
    }

    /* compiled from: BasicAsyncNetwork.java */
    /* renamed from: com.android.volley.toolbox.f$c */
    public class c<T> extends com.android.volley.v<T> {
        public c() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: BasicAsyncNetwork.java */
    /* renamed from: com.android.volley.toolbox.f$d */
    public class d<T> extends com.android.volley.v<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public C27626f(AbstractC27623c abstractC27623c, C27628h c27628h, a aVar) {
        this.f67118a = abstractC27623c;
    }

    @Override // com.android.volley.b
    public final void b(Request<?> request, b.InterfaceC2123b interfaceC2123b) {
        throw new IllegalStateException("mBlockingExecuter must be set before making a request");
    }
}
