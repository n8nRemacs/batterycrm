package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes7.dex */
public class Dh extends Ah {
    public Dh(@j.N Socket socket, @j.N Uri uri, @j.N Gh gh2, @j.N C38758di c38758di, @j.N Hh hh2) {
        super(socket, uri, gh2, c38758di, hh2);
    }

    @Override // com.yandex.metrica.impl.ob.Ah
    public void a() throws Throwable {
        Set<String> queryParameterNames = this.f377778d.getQueryParameterNames();
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            map.put(str, this.f377778d.getQueryParameter(str));
        }
        map.remove("t");
        a("HTTP/1.1 200 OK", new HashMap(), new byte[0]);
        ((Jh) this.f377776b).a(map, this.f377775a.getLocalPort(), this.f377779e);
    }
}
