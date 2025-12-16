package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.qh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39080qh extends Ah {

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final String f381585f;

    /* renamed from: com.yandex.metrica.impl.ob.qh$a */
    public class a extends HashMap<String, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f381586a;

        public a(C39080qh c39080qh, byte[] bArr) {
            this.f381586a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    public C39080qh(@j.N Socket socket, @j.N Uri uri, @j.N Gh gh2, @j.N C38758di c38758di, @j.N String str, @j.N Hh hh2) {
        super(socket, uri, gh2, c38758di, hh2);
        this.f381585f = str;
    }

    @Override // com.yandex.metrica.impl.ob.Ah
    public void a() {
        try {
            byte[] bArrEncode = Base64.encode(new C39276ym().a(this.f381585f.getBytes()), 0);
            a("HTTP/1.1 200 OK", new a(this, bArrEncode), bArrEncode);
        } catch (Throwable unused) {
        }
    }
}
