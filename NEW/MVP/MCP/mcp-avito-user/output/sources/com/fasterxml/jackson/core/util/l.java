package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.util.C;
import java.util.ArrayList;

/* compiled from: JsonParserSequence.java */
/* loaded from: classes3.dex */
public class l extends k {

    /* renamed from: e, reason: collision with root package name */
    public final JsonParser[] f341307e;

    /* renamed from: f, reason: collision with root package name */
    public int f341308f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f341309g;

    public l(JsonParser[] jsonParserArr) {
        this.f341306d = jsonParserArr[0];
        this.f341309g = false;
        this.f341307e = jsonParserArr;
        this.f341308f = 1;
    }

    public static l n0(C.b bVar, JsonParser jsonParser) {
        if (!(jsonParser instanceof l)) {
            return new l(new JsonParser[]{bVar, jsonParser});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        if (jsonParser instanceof l) {
            ((l) jsonParser).m0(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        return new l((JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            this.f341306d.close();
            int i12 = this.f341308f;
            JsonParser[] jsonParserArr = this.f341307e;
            if (i12 >= jsonParserArr.length) {
                return;
            }
            this.f341308f = i12 + 1;
            this.f341306d = jsonParserArr[i12];
        }
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonToken g0() {
        JsonToken jsonTokenG0;
        JsonParser jsonParser = this.f341306d;
        if (jsonParser == null) {
            return null;
        }
        if (this.f341309g) {
            this.f341309g = false;
            return jsonParser.f();
        }
        JsonToken jsonTokenG02 = jsonParser.g0();
        if (jsonTokenG02 != null) {
            return jsonTokenG02;
        }
        do {
            int i12 = this.f341308f;
            JsonParser[] jsonParserArr = this.f341307e;
            if (i12 >= jsonParserArr.length) {
                return null;
            }
            this.f341308f = i12 + 1;
            JsonParser jsonParser2 = jsonParserArr[i12];
            this.f341306d = jsonParser2;
            jsonTokenG0 = jsonParser2.g0();
        } while (jsonTokenG0 == null);
        return jsonTokenG0;
    }

    @Override // com.fasterxml.jackson.core.util.k, com.fasterxml.jackson.core.JsonParser
    public final JsonParser l0() {
        if (this.f341306d.f() != JsonToken.START_OBJECT && this.f341306d.f() != JsonToken.START_ARRAY) {
            return this;
        }
        int i12 = 1;
        while (true) {
            JsonToken jsonTokenG0 = g0();
            if (jsonTokenG0 == null) {
                return this;
            }
            if (jsonTokenG0.f341100f) {
                i12++;
            } else if (jsonTokenG0.f341101g && i12 - 1 == 0) {
                return this;
            }
        }
    }

    public final void m0(ArrayList arrayList) {
        JsonParser[] jsonParserArr = this.f341307e;
        int length = jsonParserArr.length;
        for (int i12 = this.f341308f - 1; i12 < length; i12++) {
            JsonParser jsonParser = jsonParserArr[i12];
            if (jsonParser instanceof l) {
                ((l) jsonParser).m0(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
        }
    }
}
