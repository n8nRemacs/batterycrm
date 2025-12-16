package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class um4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm4 b;

    public /* synthetic */ um4(vm4 vm4Var, int i) {
        this.a = i;
        this.b = vm4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                vm4 vm4Var = this.b;
                synchronized (vm4Var) {
                    try {
                        y17 y17Var = (y17) vm4Var.a.get();
                        ArrayList arrayListC = y17Var.c();
                        y17Var.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListC.size(); i++) {
                            ga0 ga0Var = (ga0) arrayListC.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", ga0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) ga0Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            default:
                vm4 vm4Var2 = this.b;
                synchronized (vm4Var2) {
                    ((y17) vm4Var2.a.get()).h(System.currentTimeMillis(), ((cr4) vm4Var2.c.get()).a());
                }
                return null;
        }
    }
}
