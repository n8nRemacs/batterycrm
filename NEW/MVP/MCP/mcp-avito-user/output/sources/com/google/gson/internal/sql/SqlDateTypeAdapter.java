package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes6.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f362156b = new r() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f362157a;

    @Override // com.google.gson.TypeAdapter
    public final Date read(com.google.gson.stream.a aVar) {
        java.util.Date date;
        if (aVar.F() == JsonToken.f362204j) {
            aVar.z();
            return null;
        }
        String strB = aVar.B();
        try {
            synchronized (this) {
                date = this.f362157a.parse(strB);
            }
            return new Date(date.getTime());
        } catch (ParseException e12) {
            StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as SQL Date; at path ");
            sbA.append(aVar.j());
            throw new JsonSyntaxException(sbA.toString(), e12);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, Date date) throws IOException {
        String str;
        Date date2 = date;
        if (date2 == null) {
            cVar.j();
            return;
        }
        synchronized (this) {
            str = this.f362157a.format((java.util.Date) date2);
        }
        cVar.q(str);
    }

    private SqlDateTypeAdapter() {
        this.f362157a = new SimpleDateFormat("MMM d, yyyy");
    }
}
