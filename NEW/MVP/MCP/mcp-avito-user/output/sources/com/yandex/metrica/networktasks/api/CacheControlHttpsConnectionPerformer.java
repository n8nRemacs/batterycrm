package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.network.Response;
import java.util.List;

/* loaded from: classes7.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a, reason: collision with root package name */
    public final a f382397a = new a();

    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(String str, byte[] bArr);
    }

    public final void a(String str, Client client) {
        Response responseA;
        int i12;
        String str2;
        try {
            a aVar = this.f382397a;
            String oldETag = client.getOldETag();
            aVar.getClass();
            responseA = a.a(oldETag, str);
            i12 = responseA.f382387b;
        } catch (Throwable unused) {
        }
        if (i12 != 200) {
            if (i12 != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) responseA.f382390e.get("ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, responseA.f382388c);
    }
}
