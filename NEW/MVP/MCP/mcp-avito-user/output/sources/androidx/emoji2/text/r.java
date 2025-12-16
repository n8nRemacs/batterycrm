package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.util.z;
import j.InterfaceC42148d;
import j.N;
import j.X;

/* compiled from: MetadataRepo.java */
@X
@InterfaceC42148d
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final androidx.emoji2.text.flatbuffer.o f46147a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final char[] f46148b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final a f46149c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Typeface f46150d;

    /* compiled from: MetadataRepo.java */
    @RestrictTo
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f46151a;

        /* renamed from: b, reason: collision with root package name */
        public t f46152b;

        public a() {
            this(1);
        }

        public final void a(@N t tVar, int i12, int i13) {
            int iA2 = tVar.a(i12);
            SparseArray<a> sparseArray = this.f46151a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA2);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(tVar.a(i12), aVar);
            }
            if (i13 > i12) {
                aVar.a(tVar, i12 + 1, i13);
            } else {
                aVar.f46152b = tVar;
            }
        }

        public a(int i12) {
            this.f46151a = new SparseArray<>(i12);
        }
    }

    public r(@N Typeface typeface, @N androidx.emoji2.text.flatbuffer.o oVar) {
        int i12;
        int i13;
        this.f46150d = typeface;
        this.f46147a = oVar;
        int iA2 = oVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + oVar.f46104a;
            i12 = oVar.f46105b.getInt(oVar.f46105b.getInt(i14) + i14);
        } else {
            i12 = 0;
        }
        this.f46148b = new char[i12 * 2];
        int iA3 = oVar.a(6);
        if (iA3 != 0) {
            int i15 = iA3 + oVar.f46104a;
            i13 = oVar.f46105b.getInt(oVar.f46105b.getInt(i15) + i15);
        } else {
            i13 = 0;
        }
        for (int i16 = 0; i16 < i13; i16++) {
            t tVar = new t(this, i16);
            androidx.emoji2.text.flatbuffer.n nVarC = tVar.c();
            int iA4 = nVarC.a(4);
            Character.toChars(iA4 != 0 ? nVarC.f46105b.getInt(iA4 + nVarC.f46104a) : 0, this.f46148b, i16 * 2);
            z.a("invalid metadata codepoint length", tVar.b() > 0);
            this.f46149c.a(tVar, 0, tVar.b() - 1);
        }
    }
}
