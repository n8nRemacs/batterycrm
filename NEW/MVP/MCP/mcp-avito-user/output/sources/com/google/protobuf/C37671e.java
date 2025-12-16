package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37671e extends AbstractC37673f {

    /* renamed from: a, reason: collision with root package name */
    public int f362861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f362862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f362863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362864d;

    public C37671e(byte[] bArr, int i12, int i13) {
        this.f362862b = bArr;
        this.f362863c = i12;
        this.f362864d = i13;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final byte[] a() {
        return this.f362862b;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int b() {
        return this.f362863c;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final boolean c() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final boolean d() {
        return false;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int e() {
        return this.f362864d;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final ByteBuffer f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final int g() {
        return this.f362861a;
    }

    @Override // com.google.protobuf.AbstractC37673f
    public final AbstractC37673f h(int i12) {
        if (i12 < 0 || i12 > this.f362864d) {
            throw new IllegalArgumentException(AK.c.g(i12, "Invalid position: "));
        }
        this.f362861a = i12;
        return this;
    }
}
