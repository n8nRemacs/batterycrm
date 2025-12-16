package C81;

import Yb1.a;
import android.content.Context;
import d1.h;
import e.InterfaceC39835a;
import e31.g;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import y81.InterfaceC50084a;
import y81.InterfaceC50085b;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final D31.a f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC39835a f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC50085b f1998c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC50084a f1999d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2000e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2001f;

    public c(D31.a aVar, InterfaceC39835a interfaceC39835a, InterfaceC50085b interfaceC50085b, InterfaceC50084a interfaceC50084a, g gVar, Context context) {
        this.f1996a = aVar;
        this.f1997b = interfaceC39835a;
        this.f1998c = interfaceC50085b;
        this.f1999d = interfaceC50084a;
        this.f2000e = gVar;
        this.f2001f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(C81.c r16, java.lang.String r17, Y41.a r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C81.c.a(C81.c, java.lang.String, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean b(String str) throws SocketException {
        Object next;
        Iterator it = ((O51.d) this.f1998c).a().f18603a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((String) next).toLowerCase(Locale.ROOT).equals(str)) {
                break;
            }
        }
        boolean z12 = next != null;
        if (z12) {
            h[] hVarArr = h.f393613b;
            g gVar = this.f2000e;
            gVar.getClass();
            gVar.f394946a.a(new a.d("blocked", "android_4.0.0", ((e.h) gVar.f394947b).a(), (String) y31.c.f442880b.getValue(), null, 16, null));
        }
        return z12;
    }
}
