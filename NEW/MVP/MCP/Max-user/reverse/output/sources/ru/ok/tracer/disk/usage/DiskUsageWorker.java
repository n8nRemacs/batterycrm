package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.fni;
import defpackage.hd5;
import defpackage.hv6;
import defpackage.jib;
import defpackage.jz5;
import defpackage.k7d;
import defpackage.l8;
import defpackage.la8;
import defpackage.nme;
import defpackage.q85;
import defpackage.s55;
import defpackage.tha;
import defpackage.ue3;
import defpackage.v17;
import defpackage.we3;
import defpackage.xx4;
import defpackage.yx4;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "yx4", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageWorker extends Worker {
    public final bwf b;

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = new bwf(l8.o);
    }

    public static String b(LinkedHashMap linkedHashMap, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((hv6) entry.getKey()).a, c((yx4) entry.getValue()));
        }
        jSONObject.put("consumers", jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject c(yx4 yx4Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long j = yx4Var.a;
        List list = yx4Var.d;
        jSONObject.put("size", j);
        jSONObject.put(SdkMetricStatEvent.NAME_KEY, yx4Var.b);
        if (yx4Var.c) {
            jSONObject.put("is_dir", true);
        }
        if (yx4Var.e) {
            jSONObject.put("is_overflow", true);
        }
        if (yx4Var.f) {
            jSONObject.put("is_excluded", true);
        }
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.put(c((yx4) it.next())));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static yx4 g(File file, int i, ArrayList arrayList) {
        boolean z;
        ?? arrayList2;
        boolean z2;
        boolean z3;
        if (arrayList.contains(file)) {
            Objects.toString(file);
            return new yx4(0L, file.getName(), null, false, 28);
        }
        if (!file.isDirectory()) {
            return new yx4(file.length(), file.getName(), null, false, 60);
        }
        try {
            File parentFile = file.getParentFile();
            File file2 = parentFile == null ? file : new File(parentFile.getCanonicalFile(), file.getName());
            z = !fni.a(file2.getCanonicalFile(), file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        if (z) {
            return new yx4(0L, file.getName(), null, false, 56);
        }
        File[] fileArrListFiles = file.listFiles();
        hd5 hd5Var = hd5.a;
        if (fileArrListFiles != null) {
            arrayList2 = new ArrayList(fileArrListFiles.length);
            for (File file3 : fileArrListFiles) {
                arrayList2.add(g(file3, i + 1, arrayList));
            }
        } else {
            arrayList2 = hd5Var;
        }
        long j = 4096;
        Iterator it = arrayList2.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((yx4) it.next()).a;
        }
        long j3 = j + j2;
        if (i > 6) {
            file.toString();
            z2 = true;
        } else {
            z2 = false;
            hd5Var = arrayList2;
        }
        List listX = ue3.X(hd5Var, new s55(27));
        if (listX.size() > 20) {
            file.toString();
            listX = listX.subList(0, 20);
            z3 = true;
        } else {
            z3 = z2;
        }
        return new yx4(j3, file.getName(), listX, z3, 32);
    }

    @Override // androidx.work.Worker
    public final la8 a() throws Throwable {
        File parentFile;
        nme nmeVar = jib.a;
        if (tha.t(nmeVar)) {
            return la8.b();
        }
        long j = 0;
        long jD = getInputData().d("probability", 0L);
        if (jD < 0 || (jD != 0 && k7d.b.e(jD) != 0)) {
            return la8.b();
        }
        Context applicationContext = getApplicationContext();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            e(applicationInfo.dataDir, hv6.INTERNAL_DATA, linkedHashMap);
            File externalFilesDir = applicationContext.getExternalFilesDir(null);
            e((externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? null : parentFile.getPath(), hv6.EXTERNAL_DATA, linkedHashMap);
            File parentFile2 = new File(applicationInfo.sourceDir).getParentFile();
            e(parentFile2 != null ? parentFile2.getPath() : null, hv6.SRC, linkedHashMap);
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                j += ((yx4) it.next()).a;
            }
            ((xx4) this.b.getValue()).getClass();
            if (j > 10737418240L) {
                File fileV = v17.v(getApplicationContext(), nmeVar);
                jz5.h(fileV, b(linkedHashMap, j));
                q85.v(getApplicationContext(), nmeVar, fileV, null, Long.valueOf(j), Collections.singletonMap("limit", String.valueOf(10737418240L)), 88);
            }
            return la8.b();
        } catch (Exception unused) {
            return la8.a();
        }
    }

    public final void e(String str, hv6 hv6Var, LinkedHashMap linkedHashMap) {
        if (str == null) {
            return;
        }
        String str2 = hv6Var.a;
        File file = new File(str);
        ((xx4) this.b.getValue()).getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(jz5.g(file, ((String) it.next()).substring(str2.length() + 1)));
        }
        linkedHashMap.put(hv6Var, g(file, 0, arrayList2));
    }
}
