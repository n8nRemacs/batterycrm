package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;

/* compiled from: ErrorThrowingDeserializer.java */
/* loaded from: classes4.dex */
public class f extends com.fasterxml.jackson.databind.i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final NoClassDefFoundError f341629b;

    public f(NoClassDefFoundError noClassDefFoundError) {
        this.f341629b = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        throw this.f341629b;
    }
}
