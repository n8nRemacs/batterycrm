package io.sentry.marshaller.json;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import y41.C50057c;
import y41.InterfaceC50060f;

/* compiled from: HttpInterfaceBinding.java */
/* loaded from: classes8.dex */
public class c implements d<C50057c> {
    @Override // io.sentry.marshaller.json.d
    public final void a(g gVar, InterfaceC50060f interfaceC50060f) {
        C50057c c50057c = (C50057c) interfaceC50060f;
        gVar.e0();
        gVar.k0(ContextActionHandler.Link.URL, c50057c.f442897b);
        gVar.k0("method", c50057c.f442898c);
        gVar.G("data");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c50057c.f442899d);
        if (mapUnmodifiableMap == null) {
            gVar.H();
        } else {
            if (mapUnmodifiableMap != null) {
                mapUnmodifiableMap.isEmpty();
            }
            gVar.e0();
            if (mapUnmodifiableMap != null) {
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    gVar.q((String) entry.getKey());
                    Iterator it = ((Collection) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        gVar.i0((String) it.next());
                    }
                    gVar.A();
                }
            }
            gVar.B();
        }
        gVar.k0("query_string", c50057c.f442900e);
        gVar.G("cookies");
        Map<String, String> map = c50057c.f442901f;
        if (map.isEmpty()) {
            gVar.H();
        } else {
            gVar.e0();
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                gVar.k0(entry2.getKey(), entry2.getValue());
            }
            gVar.B();
        }
        gVar.G("headers");
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(c50057c.f442913r);
        gVar.a0();
        for (Map.Entry entry3 : mapUnmodifiableMap2.entrySet()) {
            for (String str : (Collection) entry3.getValue()) {
                gVar.a0();
                gVar.i0((String) entry3.getKey());
                gVar.i0(str);
                gVar.A();
            }
        }
        gVar.A();
        gVar.G("env");
        gVar.e0();
        gVar.k0("REMOTE_ADDR", c50057c.f442902g);
        gVar.k0("SERVER_NAME", c50057c.f442903h);
        gVar.G("SERVER_PORT");
        gVar.L(c50057c.f442904i);
        gVar.k0("LOCAL_ADDR", c50057c.f442905j);
        gVar.k0("LOCAL_NAME", c50057c.f442906k);
        gVar.G("LOCAL_PORT");
        gVar.L(c50057c.f442907l);
        gVar.k0("SERVER_PROTOCOL", c50057c.f442908m);
        gVar.G("REQUEST_SECURE");
        gVar.y(c50057c.f442909n);
        gVar.G("REQUEST_ASYNC");
        gVar.y(c50057c.f442910o);
        gVar.k0("AUTH_TYPE", c50057c.f442911p);
        gVar.k0("REMOTE_USER", c50057c.f442912q);
        gVar.B();
        gVar.B();
    }
}
