package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.B;
import com.google.firebase.crashlytics.internal.model.C37604a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.json.d;
import j.N;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f361385a;

    /* compiled from: CrashlyticsReportJsonTransform.java */
    public interface a<T> {
        T a(@N JsonReader jsonReader);
    }

    static {
        d dVar = new d();
        C37604a.f361080a.configure(dVar);
        dVar.f361556d = true;
        f361385a = dVar.a();
    }

    public static CrashlyticsReport.f.d.a.b.e.AbstractC10712b a(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a abstractC10713aA = CrashlyticsReport.f.d.a.b.e.AbstractC10712b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC10713aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC10713aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC10713aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC10713aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC10713aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC10713aA.a();
    }

    public static CrashlyticsReport.d b(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.d.a aVarA = CrashlyticsReport.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @N
    public static CrashlyticsReport.a c(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.a.b bVarA = CrashlyticsReport.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(d(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a(0)));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @N
    public static <T> B<T> d(@N JsonReader jsonReader, @N a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new B<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d e(@j.N android.util.JsonReader r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.serialization.b.e(android.util.JsonReader):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d");
    }

    @N
    public static CrashlyticsReport.f.d.a.b.c f(@N JsonReader jsonReader) throws IOException {
        CrashlyticsReport.f.d.a.b.c.AbstractC10708a abstractC10708aA = CrashlyticsReport.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC10708aA.c(d(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a(4)));
                    break;
                case "reason":
                    abstractC10708aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC10708aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC10708aA.b(f(jsonReader));
                    break;
                case "overflowCount":
                    abstractC10708aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC10708aA.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport g(@j.N android.util.JsonReader r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.serialization.b.g(android.util.JsonReader):com.google.firebase.crashlytics.internal.model.CrashlyticsReport");
    }

    @N
    public static CrashlyticsReport h(@N String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportG = g(jsonReader);
                jsonReader.close();
                return crashlyticsReportG;
            } finally {
            }
        } catch (IllegalStateException e12) {
            throw new IOException(e12);
        }
    }
}
