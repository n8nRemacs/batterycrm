package com.google.android.datatransport.runtime;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.d;
import com.google.android.datatransport.runtime.f;
import com.google.android.datatransport.runtime.r;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: TransportRuntime.java */
@Singleton
/* loaded from: classes10.dex */
public class v implements u {

    /* renamed from: e, reason: collision with root package name */
    public static volatile f f343292e;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343293a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343294b;

    /* renamed from: c, reason: collision with root package name */
    public final FX0.e f343295c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.i f343296d;

    @Inject
    public v(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, FX0.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.i iVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.k kVar) {
        this.f343293a = aVar;
        this.f343294b = aVar2;
        this.f343295c = eVar;
        this.f343296d = iVar;
        kVar.getClass();
        kVar.f343222a.execute(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(kVar, 9));
    }

    public static v a() {
        f fVar = f343292e;
        if (fVar != null) {
            return fVar.f343150l.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f343292e == null) {
            synchronized (v.class) {
                if (f343292e == null) {
                    new f.b();
                    context.getClass();
                    f343292e = new f(context, null);
                }
            }
        }
    }

    public final com.google.android.datatransport.h c(com.google.android.datatransport.cct.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(aVar.a()) : Collections.singleton(new com.google.android.datatransport.c("proto"));
        r.a aVarA = r.a();
        aVar.getClass();
        ((d.b) aVarA).f343126a = "cct";
        String str = aVar.f342927a;
        String str2 = aVar.f342928b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = androidx.compose.ui.graphics.colorspace.e.n("1$", str, "\\", str2).getBytes(Charset.forName(Constants.ENCODING));
        }
        ((d.b) aVarA).f343127b = bytes;
        return new s(setUnmodifiableSet, aVarA.a(), this);
    }
}
