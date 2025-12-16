package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jp1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class yp1 extends ap1 {
    public yp1(jp1.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j12) {
        super(bVar, hashSet, jSONObject, j12);
    }

    @Override // com.yandex.mobile.ads.impl.jp1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        uo1 uo1VarA = uo1.a();
        if (uo1VarA != null) {
            for (to1 to1Var : uo1VarA.b()) {
                if (this.f383624c.contains(to1Var.h())) {
                    to1Var.i().b(str, this.f383626e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        return this.f383625d.toString();
    }
}
