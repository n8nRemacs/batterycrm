package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22889e extends AbstractC22892f {

    /* renamed from: a, reason: collision with root package name */
    public int f45818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f45819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45821d;

    public C22889e(byte[] bArr, int i12, int i13) {
        this.f45819b = bArr;
        this.f45820c = i12;
        this.f45821d = i13;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final byte[] a() {
        return this.f45819b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int b() {
        return this.f45820c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final boolean c() {
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final boolean d() {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int e() {
        return this.f45821d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final ByteBuffer f() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int g() {
        return this.f45818a;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final AbstractC22892f h(int i12) {
        if (i12 < 0 || i12 > this.f45821d) {
            throw new IllegalArgumentException(AK.c.g(i12, "Invalid position: "));
        }
        this.f45818a = i12;
        return this;
    }
}
