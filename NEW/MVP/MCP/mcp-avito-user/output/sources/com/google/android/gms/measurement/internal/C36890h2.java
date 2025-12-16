package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzph;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36890h2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f355179a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f355180b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f355181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36876f2 f355182d;

    public C36890h2(C36876f2 c36876f2, String str) {
        this.f355182d = c36876f2;
        C36729v.f(str);
        this.f355179a = str;
        this.f355180b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116 A[Catch: NumberFormatException | JSONException -> 0x011e, NumberFormatException | JSONException -> 0x011e, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x011e, blocks: (B:9:0x0025, B:43:0x0093, B:43:0x0093, B:44:0x00a0, B:44:0x00a0, B:46:0x00a6, B:46:0x00a6, B:48:0x00b0, B:48:0x00b0, B:50:0x00c2, B:50:0x00c2, B:51:0x00cb, B:51:0x00cb, B:52:0x00cf, B:52:0x00cf, B:54:0x00d5, B:54:0x00d5, B:56:0x00df, B:56:0x00df, B:58:0x00f1, B:58:0x00f1, B:59:0x00fa, B:59:0x00fa, B:60:0x00fe, B:60:0x00fe, B:61:0x010a, B:61:0x010a, B:62:0x0116, B:62:0x0116, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:74:0x0025, outer: #1 }] */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36890h2.a():android.os.Bundle");
    }

    @j.l0
    public final void b(Bundle bundle) {
        Iterator<String> it;
        JSONObject jSONObject;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C36876f2 c36876f2 = this.f355182d;
        SharedPreferences.Editor editorEdit = c36876f2.m().edit();
        int size = bundle2.size();
        String str = this.f355179a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                    } catch (JSONException e12) {
                        e = e12;
                        it = it2;
                    }
                    if (zzph.zza()) {
                        it = it2;
                        try {
                        } catch (JSONException e13) {
                            e = e13;
                            c36876f2.zzj().f354889f.c("Cannot serialize bundle value to SharedPreferences", e);
                            it2 = it;
                        }
                        if (c36876f2.f355183a.f354715g.o(null, E.f354567D0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                c36876f2.zzj().f354889f.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                it2 = it;
                            }
                            jSONArray.put(jSONObject);
                            it2 = it;
                        }
                    } else {
                        it = it2;
                    }
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", "d");
                    } else {
                        c36876f2.zzj().f354889f.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        it2 = it;
                    }
                    jSONArray.put(jSONObject);
                    it2 = it;
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f355181c = bundle2;
    }
}
