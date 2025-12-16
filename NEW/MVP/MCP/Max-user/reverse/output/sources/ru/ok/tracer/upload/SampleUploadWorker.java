package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a3b;
import defpackage.b9j;
import defpackage.ba7;
import defpackage.d6j;
import defpackage.dnf;
import defpackage.feg;
import defpackage.ha7;
import defpackage.hc8;
import defpackage.jo7;
import defpackage.jz5;
import defpackage.k7d;
import defpackage.la8;
import defpackage.nbj;
import defpackage.nca;
import defpackage.nn8;
import defpackage.pje;
import defpackage.rw5;
import defpackage.s74;
import defpackage.s7c;
import defpackage.t4j;
import defpackage.tha;
import defpackage.u4j;
import defpackage.ue3;
import defpackage.wxf;
import defpackage.z95;
import defpackage.z97;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SampleUploadWorker extends Worker {
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final la8 a() {
        File file;
        File file2 = null;
        try {
            file = new File(getInputData().e("tracer_sample_file_path"));
            try {
            } catch (Exception unused) {
                file2 = file;
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
                return la8.b();
            }
        } catch (Exception unused2) {
        }
        if (!file.exists()) {
            file.getPath();
            return la8.b();
        }
        long jD = getInputData().d("tracer_sample_file_size", -1L);
        Long lValueOf = jD > 0 ? Long.valueOf(jD) : null;
        String strE = getInputData().e("tracer_sample_file_name");
        if (t4j.e(u4j.b(getApplicationContext().getPackageManager(), getApplicationContext().getPackageName())) != getInputData().d("tracer_version_code", 0L)) {
            file.delete();
            return la8.b();
        }
        String strB = b(strE, lValueOf);
        if (strB != null) {
            c(file, strB);
        }
        return la8.b();
    }

    public final String b(String str, Long l) throws JSONException {
        feg fegVar = feg.a;
        String strA = feg.a();
        if (strA == null) {
            return null;
        }
        nn8 nn8Var = new nn8();
        Object obj = getInputData().a.get("tracer_custom_properties_keys");
        String[] strArr = obj instanceof String[] ? (String[]) obj : null;
        if (strArr == null) {
            strArr = new String[0];
        }
        for (String str2 : strArr) {
            String strE = getInputData().e(str2);
            if (strE != null) {
                nn8Var.put(str2, strE);
            }
        }
        nn8 nn8VarB = nn8Var.b();
        feg fegVar2 = feg.a;
        pje pjeVar = feg.e;
        if (pjeVar == null) {
            pjeVar = null;
        }
        wxf wxfVarC = pjeVar.c();
        if (!nn8VarB.isEmpty()) {
            Map map = wxfVarC.m;
            LinkedHashMap linkedHashMap = new LinkedHashMap(nn8VarB);
            linkedHashMap.putAll(map);
            wxfVarC = wxf.a(wxfVarC, false, linkedHashMap, 12287);
        }
        JSONObject jSONObjectH = jo7.h(wxfVarC);
        jSONObjectH.put("feature", getInputData().e("tracer_feature_name"));
        jSONObjectH.put("sampleSize", l);
        jSONObjectH.put("sampleFileName", str);
        if (getInputData().b("tracer_has_attr1", false)) {
            jSONObjectH.put("attr1", getInputData().d("tracer_attr1", 0L));
        }
        if (getInputData().b("tracer_has_attr2", false)) {
            jSONObjectH.put("attr2", getInputData().d("tracer_attr2", 0L));
        }
        if (getInputData().e("tracer_feature_tag") != null) {
            jSONObjectH.put("tag", getInputData().e("tracer_feature_tag"));
        }
        Object obj2 = feg.c().get(nca.b);
        if ((obj2 instanceof s74 ? (s74) obj2 : null) == null) {
            new s7c(13).d();
        }
        hc8 hc8Var = new hc8(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/initUpload").appendQueryParameter("sampleToken", strA).toString(), tha.b("application/json; charset=utf-8", jSONObjectH.toString()));
        jSONObjectH.toString();
        ba7 ba7VarB = ((ha7) feg.h.getValue()).b(hc8Var);
        try {
            JSONObject jSONObject = new JSONObject(dnf.m((byte[]) ((rw5) ba7VarB.d).c));
            tha.v(jSONObject, getInputData().e("tracer_feature_name"), getInputData().e("tracer_feature_tag"));
            if (ba7VarB.b != 200) {
                return null;
            }
            return jSONObject.getString("uploadToken");
        } finally {
        }
    }

    public final void c(File file, String str) throws IOException {
        String str2;
        if (getInputData().b("tracer_feature_uze_gzip", true)) {
            Context applicationContext = getApplicationContext();
            String string = getId().toString();
            String strB = d6j.b();
            if (strB.equals(applicationContext.getPackageName())) {
                str2 = "tracer";
            } else {
                str2 = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
            }
            File file2 = new File(applicationContext.getCacheDir(), str2);
            nbj.b(file2);
            File fileG = jz5.g(file2, string.concat(".tmp"));
            try {
                b9j.a(file, fileG);
                file.length();
                fileG.length();
                file.delete();
                file = fileG;
            } catch (IOException e) {
                fileG.delete();
                throw e;
            }
        } else {
            file.length();
        }
        feg fegVar = feg.a;
        Object obj = feg.c().get(nca.b);
        if ((obj instanceof s74 ? (s74) obj : null) == null) {
            new s7c(13).d();
        }
        String string2 = Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", str).toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z97("file", "sample", "application/octet-stream", new a3b(20, file)));
        try {
            ba7 ba7VarB = ((ha7) feg.h.getValue()).b(new hc8(string2, new z95(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(k7d.b.d())}, 1)), ue3.d0(arrayList))));
            try {
                int i = ba7VarB.b;
                String str3 = (String) ba7VarB.c;
                byte[] bArr = (byte[]) ((rw5) ba7VarB.d).c;
                String strM = bArr != null ? dnf.m(bArr) : null;
                String strE = getInputData().e("tracer_feature_name");
                String strE2 = getInputData().e("tracer_feature_tag");
                if (strM != null && dnf.r(strM, "{", false)) {
                    try {
                        tha.v(new JSONObject(strM), strE, strE2);
                    } catch (JSONException unused) {
                    }
                }
                if (i != 200) {
                    Log.e("Tracer", str3 + " , " + strM);
                }
            } finally {
            }
        } catch (Exception unused2) {
        } finally {
            file.delete();
        }
    }
}
