package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37669d extends AbstractC37673f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f362856a;

    public C37669d(ByteBuffer byteBuffer) {
        this.f362856a = byteBuffer;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final byte[] a() {
        return this.f362856a.array();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int b() {
        return this.f362856a.arrayOffset();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final boolean c() {
        return this.f362856a.hasArray();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final boolean d() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int e() {
        return this.f362856a.limit();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final ByteBuffer f() {
        return this.f362856a;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int g() {
        return this.f362856a.position();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final AbstractC37673f h(int i12) {
        this.f362856a.position(i12);
        return this;
    }
}
