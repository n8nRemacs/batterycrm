package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22886d extends AbstractC22892f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f45811a;

    public C22886d(ByteBuffer byteBuffer) {
        this.f45811a = byteBuffer;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final byte[] a() {
        return this.f45811a.array();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int b() {
        return this.f45811a.arrayOffset();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final boolean c() {
        return this.f45811a.hasArray();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final boolean d() {
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int e() {
        return this.f45811a.limit();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final ByteBuffer f() {
        return this.f45811a;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final int g() {
        return this.f45811a.position();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22892f
    public final AbstractC22892f h(int i12) {
        this.f45811a.position(i12);
        return this;
    }
}
