package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42815o;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/k;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/j;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43411k extends J0<Byte, byte[], C43409j> implements KSerializer<byte[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43411k f412876c = new C43411k();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43411k() {
        super(C43413l.f412881a);
        int i12 = C42815o.f406846a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        C43409j c43409j = (C43409j) obj;
        byte bY2 = cVar.y(this.f412784b, i12);
        c43409j.b(c43409j.getF412872b() + 1);
        byte[] bArr = c43409j.f412871a;
        int i13 = c43409j.f412872b;
        c43409j.f412872b = i13 + 1;
        bArr[i13] = bY2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        C43409j c43409j = new C43409j();
        c43409j.f412871a = bArr;
        c43409j.f412872b = bArr.length;
        c43409j.b(10);
        return c43409j;
    }

    @Override // kotlinx.serialization.internal.J0
    public final byte[] j() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, byte[] bArr, int i12) {
        byte[] bArr2 = bArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.q(this.f412784b, i13, bArr2[i13]);
        }
    }
}
