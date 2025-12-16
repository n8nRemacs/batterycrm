package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/q;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/p;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43423q extends J0<Character, char[], C43421p> implements KSerializer<char[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43423q f412903c = new C43423q();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43423q() {
        super(r.f412904a);
        int i12 = kotlin.jvm.internal.r.f406849a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        C43421p c43421p = (C43421p) obj;
        char cO2 = cVar.o(this.f412784b, i12);
        c43421p.b(c43421p.getF412902b() + 1);
        char[] cArr = c43421p.f412901a;
        int i13 = c43421p.f412902b;
        c43421p.f412902b = i13 + 1;
        cArr[i13] = cO2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        C43421p c43421p = new C43421p();
        c43421p.f412901a = cArr;
        c43421p.f412902b = cArr.length;
        c43421p.b(10);
        return c43421p;
    }

    @Override // kotlinx.serialization.internal.J0
    public final char[] j() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, char[] cArr, int i12) {
        char[] cArr2 = cArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.v(this.f412784b, i13, cArr2[i13]);
        }
    }
}
