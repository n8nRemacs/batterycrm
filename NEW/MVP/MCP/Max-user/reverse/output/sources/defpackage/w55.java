package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final class w55 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile u9j e;
    public final Object f;

    public w55(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException(("File " + file + " not in directory").toString());
        }
        this.b = parentFile;
        this.c = jz5.g(parentFile, file.getName() + ".tmp");
        this.d = jz5.g(parentFile, file.getName() + ".taken");
        this.e = u55.a;
        this.f = new Object();
    }

    public final void a(List list) {
        List listB;
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            u9j u9jVar = this.e;
            if ((u9jVar instanceof v55) && list == ((List) ((v55) u9jVar).a.get())) {
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new t55(list);
                return;
            }
            u9j u9jVar2 = this.e;
            if (u9jVar2 instanceof u55) {
                listB = b();
            } else if (u9jVar2 instanceof t55) {
                listB = ((t55) u9jVar2).a;
            } else {
                if (!(u9jVar2 instanceof v55)) {
                    throw new NoWhenBranchMatchedException();
                }
                listB = hd5.a;
            }
            List listD = v1a.D(listB, list);
            c(listD);
            this.e = new t55(listD);
        }
    }

    public final List b() throws JSONException {
        File file = this.a;
        boolean zExists = file.exists();
        hd5 hd5Var = hd5.a;
        if (zExists) {
            try {
                JSONArray jSONArray = new JSONArray(jz5.f(file));
                o98 o98VarD = ve3.d();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    o98VarD.add(new y55(jSONObject.getString("event"), jSONObject.getString(IceCandidatePairChangedStat.KEY_REASON), jSONObject.getInt("count")));
                }
                return ve3.a(o98VarD);
            } catch (IOException e) {
                Log.e("Tracer", "Couldn't read " + file, e);
                return hd5Var;
            } catch (JSONException e2) {
                Log.e("Tracer", "Couldn't read " + file, e2);
                try {
                    nbj.a(file);
                } catch (IOException unused) {
                    Log.e("Tracer", "Couldn't delete " + file);
                }
            }
        }
        return hd5Var;
    }

    public final void c(List list) throws JSONException {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y55 y55Var = (y55) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", y55Var.a);
            jSONObject.put(IceCandidatePairChangedStat.KEY_REASON, y55Var.b);
            jSONObject.put("count", y55Var.c);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        try {
            nbj.b(this.b);
            jz5.h(file, string);
            nbj.d(file, file2);
        } catch (IOException e) {
            Log.e("Tracer", "Couldn't write " + file2, e);
            try {
                nbj.a(file2);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + file2);
            }
        }
    }

    public final List d() {
        List listB;
        u9j u9jVar = this.e;
        if ((!(u9jVar instanceof t55) || !((t55) u9jVar).a.isEmpty()) && !(u9jVar instanceof v55)) {
            synchronized (this.f) {
                try {
                    u9j u9jVar2 = this.e;
                    if (u9jVar2 instanceof u55) {
                        listB = b();
                    } else {
                        if (!(u9jVar2 instanceof t55)) {
                            if (!(u9jVar2 instanceof v55)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return hd5.a;
                        }
                        listB = ((t55) u9jVar2).a;
                    }
                    if (listB.isEmpty()) {
                        this.e = new t55(hd5.a);
                    } else {
                        this.a.renameTo(this.d);
                        this.e = new v55(listB);
                    }
                    return listB;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hd5.a;
    }
}
