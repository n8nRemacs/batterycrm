package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.g;
import j.N;
import j.P;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes6.dex */
final class e implements com.google.firebase.encoders.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f361559a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f361560b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f361561c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f361562d;

    /* renamed from: e, reason: collision with root package name */
    public final b f361563e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f361564f;

    public e(@N Writer writer, @N HashMap map, @N HashMap map2, b bVar, boolean z12) {
        this.f361560b = new JsonWriter(writer);
        this.f361561c = map;
        this.f361562d = map2;
        this.f361563e = bVar;
        this.f361564f = z12;
    }

    @N
    public final e a(@P Object obj) {
        JsonWriter jsonWriter = this.f361560b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e12) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e12);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            com.google.firebase.encoders.d dVar = (com.google.firebase.encoders.d) this.f361561c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            com.google.firebase.encoders.f fVar = (com.google.firebase.encoders.f) this.f361562d.get(obj.getClass());
            if (fVar != null) {
                fVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f361563e.encode(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            c();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i12 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i12 < length) {
                jsonWriter.value(r6[i12]);
                i12++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i12 < length2) {
                long j12 = jArr[i12];
                c();
                jsonWriter.value(j12);
                i12++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i12 < length3) {
                jsonWriter.value(dArr[i12]);
                i12++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i12 < length4) {
                jsonWriter.value(zArr[i12]);
                i12++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i12 < length5) {
                a(numberArr[i12]);
                i12++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i12 < length6) {
                a(objArr[i12]);
                i12++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, int i12) throws IOException {
        String str = cVar.f361544a;
        c();
        JsonWriter jsonWriter = this.f361560b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i12);
        return this;
    }

    @N
    public final e b(@P Object obj, @N String str) throws IOException {
        boolean z12 = this.f361564f;
        JsonWriter jsonWriter = this.f361560b;
        if (z12) {
            if (obj != null) {
                c();
                jsonWriter.name(str);
                a(obj);
            }
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            a(obj);
        }
        return this;
    }

    public final void c() {
        if (!this.f361559a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, long j12) throws IOException {
        String str = cVar.f361544a;
        c();
        JsonWriter jsonWriter = this.f361560b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j12);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, @P Object obj) throws IOException {
        b(obj, cVar.f361544a);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, boolean z12) throws IOException {
        String str = cVar.f361544a;
        c();
        JsonWriter jsonWriter = this.f361560b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z12);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) throws IOException {
        c();
        this.f361560b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) throws IOException {
        c();
        this.f361560b.value(z12);
        return this;
    }
}
