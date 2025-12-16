package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;

/* loaded from: classes3.dex */
public enum StreamWriteFeature implements com.fasterxml.jackson.core.util.h {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_TARGET(JsonGenerator.Feature.AUTO_CLOSE_TARGET),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_CONTENT(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    FLUSH_PASSED_TO_STREAM(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_BIGDECIMAL_AS_PLAIN(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(JsonGenerator.Feature.IGNORE_UNKNOWN);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f341116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341117c;

    StreamWriteFeature(JsonGenerator.Feature feature) {
        this.f341117c = feature.f341052c;
        this.f341116b = feature.f341051b;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341117c;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return this.f341116b;
    }
}
