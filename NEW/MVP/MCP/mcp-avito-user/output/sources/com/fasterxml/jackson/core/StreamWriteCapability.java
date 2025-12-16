package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public enum StreamWriteCapability implements com.fasterxml.jackson.core.util.h {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;


    /* renamed from: b, reason: collision with root package name */
    public final int f341114b = 1 << ordinal();

    StreamWriteCapability() {
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final int a() {
        return this.f341114b;
    }

    @Override // com.fasterxml.jackson.core.util.h
    public final boolean b() {
        return false;
    }
}
