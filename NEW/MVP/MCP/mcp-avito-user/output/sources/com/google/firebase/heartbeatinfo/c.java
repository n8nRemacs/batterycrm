package com.google.firebase.heartbeatinfo;

import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f361614c;

    public /* synthetic */ c(f fVar, int i12) {
        this.f361613b = i12;
        this.f361614c = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f361613b) {
            case 0:
                f fVar = this.f361614c;
                synchronized (fVar) {
                    ((j) fVar.f361618a.get()).h(System.currentTimeMillis(), fVar.f361620c.get().a());
                }
                return null;
            default:
                f fVar2 = this.f361614c;
                synchronized (fVar2) {
                    try {
                        j jVar = (j) fVar2.f361618a.get();
                        ArrayList arrayListC = jVar.c();
                        jVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i12 = 0; i12 < arrayListC.size(); i12++) {
                            k kVar = (k) arrayListC.get(i12);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", kVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) kVar.a()));
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
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
        }
    }
}
