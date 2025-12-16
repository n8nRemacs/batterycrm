package com.iab.omid.library.corpmailru.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f364047a;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC10766b f364048d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC10766b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC10766b interfaceC10766b) {
        this.f364048d = interfaceC10766b;
    }

    public void a(a aVar) {
        this.f364047a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f364047a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
