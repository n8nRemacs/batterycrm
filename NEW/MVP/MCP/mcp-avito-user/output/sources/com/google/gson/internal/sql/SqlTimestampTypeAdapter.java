package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes6.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f362160b = new r() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.g(Date.class), null);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter<Date> f362161a;

    public SqlTimestampTypeAdapter() {
        throw null;
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter, AnonymousClass1 anonymousClass1) {
        this.f362161a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Timestamp read(com.google.gson.stream.a aVar) {
        Date date = this.f362161a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, Timestamp timestamp) {
        this.f362161a.write(cVar, timestamp);
    }
}
