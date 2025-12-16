package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38707bh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private ICommonExecutor f380208a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f380209b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private b f380210c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private C39191v9 f380211d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final CacheControlHttpsConnectionPerformer f380212e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.e f380213f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39027od f380214g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private String f380215h;

    /* renamed from: com.yandex.metrica.impl.ob.bh$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38682ah f380216a;

        public a(C38682ah c38682ah) {
            this.f380216a = c38682ah;
        }

        @Override // java.lang.Runnable
        public void run() {
            C38707bh c38707bh = C38707bh.this;
            C38707bh.a(c38707bh, this.f380216a, c38707bh.f380215h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bh$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38881ih f380218a;

        public b() {
            this(new C38881ih());
        }

        @j.N
        public List<C38857hh> a(@j.P byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (A2.a(bArr)) {
                return arrayList;
            }
            try {
                return this.f380218a.a(new String(bArr, Constants.ENCODING));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        @j.k0
        public b(@j.N C38881ih c38881ih) {
            this.f380218a = c38881ih;
        }
    }

    public C38707bh(@j.N Context context, @j.P String str, @j.N ICommonExecutor iCommonExecutor) {
        ProtobufStateStorage protobufStateStorageA = InterfaceC38800fa.b.a(C38782eh.class).a(context);
        b bVar = new b();
        F0.g().t().getClass();
        this(null, protobufStateStorageA, bVar, new CacheControlHttpsConnectionPerformer(), iCommonExecutor, new C39191v9(), new com.yandex.metrica.coreutils.services.e(), new C39027od(context));
    }

    public void a(@j.N C38682ah c38682ah) {
        this.f380208a.execute(new a(c38682ah));
    }

    public boolean b(@j.N C39057pi c39057pi) {
        return this.f380215h == null ? c39057pi.L() != null : !r0.equals(c39057pi.L());
    }

    public static void a(C38707bh c38707bh, C38682ah c38682ah, String str) {
        if (!c38707bh.f380214g.canBeExecuted() || str == null) {
            return;
        }
        c38707bh.f380212e.a(str, new C38732ch(c38707bh, (C38782eh) c38707bh.f380209b.read(), c38682ah));
    }

    @j.k0
    public C38707bh(@j.P String str, @j.N ProtobufStateStorage protobufStateStorage, @j.N b bVar, @j.N CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, @j.N ICommonExecutor iCommonExecutor, @j.N C39191v9 c39191v9, @j.N com.yandex.metrica.coreutils.services.e eVar, @j.N C39027od c39027od) {
        this.f380215h = str;
        this.f380209b = protobufStateStorage;
        this.f380210c = bVar;
        this.f380212e = cacheControlHttpsConnectionPerformer;
        this.f380208a = iCommonExecutor;
        this.f380211d = c39191v9;
        this.f380213f = eVar;
        this.f380214g = c39027od;
    }

    public void a(@j.P C39057pi c39057pi) {
        if (c39057pi != null) {
            this.f380215h = c39057pi.L();
        }
    }
}
