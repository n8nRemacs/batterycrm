package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42813m;
import kotlinx.serialization.KSerializer;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/h;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/J0;", "", "Lkotlinx/serialization/internal/g;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43405h extends J0<Boolean, boolean[], C43403g> implements KSerializer<boolean[]> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43405h f412862c = new C43405h();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43405h() {
        super(C43407i.f412866a);
        int i12 = C42813m.f406843a;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // kotlinx.serialization.internal.AbstractC43438y, kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        C43403g c43403g = (C43403g) obj;
        boolean zD2 = cVar.D(this.f412784b, i12);
        c43403g.b(c43403g.getF412858b() + 1);
        boolean[] zArr = c43403g.f412857a;
        int i13 = c43403g.f412858b;
        c43403g.f412858b = i13 + 1;
        zArr[i13] = zD2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C43403g c43403g = new C43403g();
        c43403g.f412857a = zArr;
        c43403g.f412858b = zArr.length;
        c43403g.b(10);
        return c43403g;
    }

    @Override // kotlinx.serialization.internal.J0
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.J0
    public final void k(kotlinx.serialization.encoding.d dVar, boolean[] zArr, int i12) {
        boolean[] zArr2 = zArr;
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.k(this.f412784b, i13, zArr2[i13]);
        }
    }
}
