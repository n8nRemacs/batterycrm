package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b7j {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.uda r17, java.util.LinkedHashSet r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7j.a(uda, java.util.LinkedHashSet):void");
    }

    public static List b(uda udaVar) {
        pe8 pe8Var = udaVar.b.a;
        String str = (String) pe8Var.n.D(pe8Var, w4e.m0[2]);
        if (d(str)) {
            return Collections.EMPTY_LIST;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    nr3 nr3VarA = nr3.a((JSONObject) jSONArray.get(i));
                    if (nr3VarA != null) {
                        arrayList.add(nr3VarA);
                    }
                } catch (JSONException e) {
                    wqi.e("b7j", "parse proxy from string exception " + e.getMessage(), null);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            wqi.e("b7j", "parse from string exception " + e2.getMessage(), null);
            return Collections.EMPTY_LIST;
        }
    }

    public static final void c(x74 x74Var, Throwable th) {
        try {
            a84 a84Var = (a84) x74Var.get(u1j.u0);
            if (a84Var != null) {
                a84Var.i(x74Var, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(x74Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                saj.a(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(x74Var, th);
        }
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }
}
