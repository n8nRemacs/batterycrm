package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.b;

/* loaded from: classes3.dex */
public enum JsonWriteFeature implements b {
    /* JADX INFO: Fake field, exist only in values array */
    QUOTE_FIELD_NAMES(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NAN_AS_STRINGS(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NUMBERS_AS_STRINGS(false),
    /* JADX INFO: Fake field, exist only in values array */
    ESCAPE_NON_ASCII(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f341211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341212c = 1 << ordinal();

    static {
        JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    }

    JsonWriteFeature(boolean z12) {
        this.f341211b = z12;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341212c;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return this.f341211b;
    }
}
