package androidx.emoji2.text;

import androidx.annotation.RestrictTo;
import j.F;
import j.InterfaceC42148d;
import j.N;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: TypefaceEmojiRasterizer.java */
@X
@InterfaceC42148d
/* loaded from: classes.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<androidx.emoji2.text.flatbuffer.n> f46157d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f46158a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final r f46159b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f46160c = 0;

    /* compiled from: TypefaceEmojiRasterizer.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    @RestrictTo
    public t(@N r rVar, @F int i12) {
        this.f46159b = rVar;
        this.f46158a = i12;
    }

    public final int a(int i12) {
        androidx.emoji2.text.flatbuffer.n nVarC = c();
        int iA2 = nVarC.a(16);
        if (iA2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = nVarC.f46105b;
        int i13 = iA2 + nVarC.f46104a;
        return byteBuffer.getInt((i12 * 4) + byteBuffer.getInt(i13) + i13 + 4);
    }

    public final int b() {
        androidx.emoji2.text.flatbuffer.n nVarC = c();
        int iA2 = nVarC.a(16);
        if (iA2 == 0) {
            return 0;
        }
        int i12 = iA2 + nVarC.f46104a;
        return nVarC.f46105b.getInt(nVarC.f46105b.getInt(i12) + i12);
    }

    public final androidx.emoji2.text.flatbuffer.n c() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.n> threadLocal = f46157d;
        androidx.emoji2.text.flatbuffer.n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new androidx.emoji2.text.flatbuffer.n();
            threadLocal.set(nVar);
        }
        androidx.emoji2.text.flatbuffer.o oVar = this.f46159b.f46147a;
        int iA2 = oVar.a(6);
        if (iA2 != 0) {
            int i12 = iA2 + oVar.f46104a;
            int i13 = (this.f46158a * 4) + oVar.f46105b.getInt(i12) + i12 + 4;
            int i14 = oVar.f46105b.getInt(i13) + i13;
            ByteBuffer byteBuffer = oVar.f46105b;
            nVar.f46105b = byteBuffer;
            if (byteBuffer != null) {
                nVar.f46104a = i14;
                int i15 = i14 - byteBuffer.getInt(i14);
                nVar.f46106c = i15;
                nVar.f46107d = nVar.f46105b.getShort(i15);
            } else {
                nVar.f46104a = 0;
                nVar.f46106c = 0;
                nVar.f46107d = 0;
            }
        }
        return nVar;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        androidx.emoji2.text.flatbuffer.n nVarC = c();
        int iA2 = nVarC.a(4);
        sb2.append(Integer.toHexString(iA2 != 0 ? nVarC.f46105b.getInt(iA2 + nVarC.f46104a) : 0));
        sb2.append(", codepoints:");
        int iB2 = b();
        for (int i12 = 0; i12 < iB2; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
