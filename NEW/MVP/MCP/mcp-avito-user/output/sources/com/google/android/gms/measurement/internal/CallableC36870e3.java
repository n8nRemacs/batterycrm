package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzph;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC36870e3 implements Callable<List<zzmh>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f355116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f355117c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f355118d;

    public CallableC36870e3(M2 m22, zzo zzoVar, Bundle bundle) {
        this.f355116b = zzoVar;
        this.f355117c = bundle;
        this.f355118d = m22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // java.util.concurrent.Callable
    public final List<zzmh> call() throws IOException {
        String str;
        ArrayList arrayList;
        M2 m22 = this.f355118d;
        m22.f354801a.Q();
        C36997w5 c36997w5 = m22.f354801a;
        c36997w5.zzl().e();
        if (zzph.zza()) {
            C36880g c36880gK = c36997w5.K();
            zzo zzoVar = this.f355116b;
            if (c36880gK.o(zzoVar.f355567b, E.f354565C0) && (str = zzoVar.f355567b) != null) {
                Bundle bundle = this.f355117c;
                if (bundle != null) {
                    int[] intArray = bundle.getIntArray("uriSources");
                    long[] longArray = bundle.getLongArray("uriTimestamps");
                    if (intArray != null) {
                        if (longArray == null || longArray.length != intArray.length) {
                            c36997w5.zzj().f354889f.b("Uri sources and timestamps do not match");
                        } else {
                            for (int i12 = 0; i12 < intArray.length; i12++) {
                                C36908k c36908k = c36997w5.f355440c;
                                C36997w5.n(c36908k);
                                int i13 = intArray[i12];
                                long j12 = longArray[i12];
                                C36729v.f(str);
                                c36908k.e();
                                c36908k.i();
                                try {
                                    int iDelete = c36908k.l().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i13), String.valueOf(j12)});
                                    c36908k.zzj().f354897n.d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i13), Long.valueOf(j12));
                                } catch (SQLiteException e12) {
                                    c36908k.zzj().f354889f.a(S1.i(str), "Error pruning trigger URIs. appId", e12);
                                }
                            }
                        }
                    }
                }
                C36908k c36908k2 = c36997w5.f355440c;
                C36997w5.n(c36908k2);
                C36729v.f(str);
                c36908k2.e();
                c36908k2.i();
                ArrayList arrayList2 = new ArrayList();
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = c36908k2.l().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", SearchParamsConverterKt.SOURCE}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                        if (cursorQuery.moveToFirst()) {
                            do {
                                String string = cursorQuery.getString(0);
                                if (string == null) {
                                    string = "";
                                }
                                arrayList2.add(new zzmh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                            } while (cursorQuery.moveToNext());
                            cursorQuery.close();
                            arrayList = arrayList2;
                        } else {
                            cursorQuery.close();
                            arrayList = arrayList2;
                        }
                    } catch (SQLiteException e13) {
                        c36908k2.zzj().f354889f.a(S1.i(str), "Error querying trigger uris. appId", e13);
                        ?? EmptyList = Collections.emptyList();
                        arrayList = EmptyList;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            arrayList = EmptyList;
                        }
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
        }
        return new ArrayList();
    }
}
