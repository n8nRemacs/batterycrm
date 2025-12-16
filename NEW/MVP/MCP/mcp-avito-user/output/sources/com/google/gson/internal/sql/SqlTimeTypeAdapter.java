package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes6.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f362158b = new r() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f362159a;

    @Override // com.google.gson.TypeAdapter
    public final Time read(com.google.gson.stream.a aVar) {
        Time time;
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        String strB = aVar.B();
        try {
            synchronized (this) {
                time = new Time(this.f362159a.parse(strB).getTime());
            }
            return time;
        } catch (ParseException e12) {
            StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as SQL Time; at path ");
            sbA.append(aVar.j());
            throw new JsonSyntaxException(sbA.toString(), e12);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, Time time) throws IOException {
        String str;
        Time time2 = time;
        if (time2 == null) {
            cVar.j();
            return;
        }
        synchronized (this) {
            str = this.f362159a.format((Date) time2);
        }
        cVar.q(str);
    }

    private SqlTimeTypeAdapter() {
        this.f362159a = new SimpleDateFormat("hh:mm:ss a");
    }
}
