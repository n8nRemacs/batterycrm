package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.m;

/* compiled from: TSFBuilder.java */
/* loaded from: classes3.dex */
public abstract class m<F extends JsonFactory, B extends m<F, B>> {
    static {
        for (JsonFactory.Feature feature : JsonFactory.Feature.values()) {
            feature.getClass();
            feature.a();
        }
        for (JsonParser.Feature feature2 : JsonParser.Feature.values()) {
            boolean z12 = feature2.f341072b;
        }
        JsonGenerator.Feature.a();
    }
}
