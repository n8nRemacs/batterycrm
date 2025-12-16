package io.sentry.marshaller.json;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import y41.C50061g;
import y41.C50062h;
import y41.InterfaceC50060f;

/* compiled from: StackTraceInterfaceBinding.java */
/* loaded from: classes8.dex */
public class h implements d<C50062h> {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f405224c = Pattern.compile("\\$+(?:(?:(?:FastClass|Enhancer)[a-zA-Z]*CGLIB)|(?:HibernateProxy))\\$+");

    /* renamed from: a, reason: collision with root package name */
    public Collection<String> f405225a = Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f405226b = true;

    @Override // io.sentry.marshaller.json.d
    public final void a(g gVar, InterfaceC50060f interfaceC50060f) {
        boolean z12;
        C50062h c50062h = (C50062h) interfaceC50060f;
        gVar.e0();
        gVar.q("frames");
        C50061g[] c50061gArr = c50062h.f442926b;
        C50061g[] c50061gArr2 = (C50061g[]) Arrays.copyOf(c50061gArr, c50061gArr.length);
        int length = c50061gArr2.length - 1;
        int i12 = c50062h.f442927c;
        while (length >= 0) {
            C50061g c50061g = c50061gArr2[length];
            int i13 = i12 - 1;
            boolean z13 = i12 > 0;
            gVar.e0();
            gVar.k0("filename", c50061g.f442923d);
            String str = c50061g.f442921b;
            gVar.k0("module", str);
            if ((this.f405226b && z13) || ((str.contains("CGLIB") || str.contains("Hibernate")) && f405224c.matcher(str).find())) {
                z12 = false;
            } else {
                Iterator<String> it = this.f405225a.iterator();
                while (it.hasNext()) {
                    if (str.startsWith(it.next())) {
                        z12 = true;
                        break;
                    }
                }
                z12 = false;
            }
            gVar.G("in_app");
            gVar.y(z12);
            gVar.k0("function", c50061g.f442922c);
            gVar.G("lineno");
            gVar.L(c50061g.f442924e);
            Map<String, Object> map = c50061g.f442925f;
            if (map != null && !map.isEmpty()) {
                gVar.R("vars");
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    gVar.G(entry.getKey());
                    gVar.n0(0, entry.getValue());
                }
                gVar.B();
            }
            gVar.B();
            length--;
            i12 = i13;
        }
        gVar.A();
        gVar.B();
    }
}
