package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public enum StreamReadCapability implements com.fasterxml.jackson.core.util.h {
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS;


    /* renamed from: b, reason: collision with root package name */
    public final int f341107b = 1 << ordinal();

    StreamReadCapability() {
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341107b;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return false;
    }
}
