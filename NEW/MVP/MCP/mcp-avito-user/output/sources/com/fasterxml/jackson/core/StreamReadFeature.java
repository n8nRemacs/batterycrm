package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;

/* loaded from: classes3.dex */
public enum StreamReadFeature implements com.fasterxml.jackson.core.util.h {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_SOURCE(JsonParser.Feature.AUTO_CLOSE_SOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(JsonParser.Feature.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNDEFINED(JsonParser.Feature.IGNORE_UNDEFINED),
    /* JADX INFO: Fake field, exist only in values array */
    INCLUDE_SOURCE_IN_LOCATION(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f341109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341110c;

    StreamReadFeature(JsonParser.Feature feature) {
        this.f341110c = feature.f341073c;
        this.f341109b = feature.f341072b;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341110c;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return this.f341109b;
    }
}
