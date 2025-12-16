package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public abstract class d7j {
    public static final ContextScope a(x74 x74Var) {
        if (x74Var.get(wha.w0) == null) {
            x74Var = x74Var.plus(eoi.a());
        }
        return new ContextScope(x74Var);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final void c(f84 f84Var, CancellationException cancellationException) {
        qt7 qt7Var = (qt7) f84Var.getCoroutineContext().get(wha.w0);
        if (qt7Var != null) {
            qt7Var.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + f84Var).toString());
        }
    }

    public static final Object d(sm6 sm6Var, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        return sni.b(scopeCoroutine, scopeCoroutine, sm6Var);
    }

    public static final void e(f84 f84Var) {
        eoi.d(f84Var.getCoroutineContext());
    }

    public static final boolean f(f84 f84Var) {
        qt7 qt7Var = (qt7) f84Var.getCoroutineContext().get(wha.w0);
        if (qt7Var != null) {
            return qt7Var.isActive();
        }
        return true;
    }

    public static uaj g(byte[] bArr) {
        UUID[] uuidArr;
        umb umbVar = new umb(bArr);
        if (umbVar.c < 32) {
            return null;
        }
        umbVar.J(0);
        int iA = umbVar.a();
        int iJ = umbVar.j();
        if (iJ != iA) {
            a8i.l("PsshAtomUtil", "Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
            return null;
        }
        int iJ2 = umbVar.j();
        if (iJ2 != 1886614376) {
            wy1.p(iJ2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = gt0.e(umbVar.j());
        if (iE > 1) {
            wy1.p(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(umbVar.r(), umbVar.r());
        if (iE == 1) {
            int iB = umbVar.B();
            uuidArr = new UUID[iB];
            for (int i = 0; i < iB; i++) {
                uuidArr[i] = new UUID(umbVar.r(), umbVar.r());
            }
        } else {
            uuidArr = null;
        }
        int iB2 = umbVar.B();
        int iA2 = umbVar.a();
        if (iB2 == iA2) {
            byte[] bArr2 = new byte[iB2];
            umbVar.h(0, bArr2, iB2);
            return new uaj(uuid, iE, bArr2, uuidArr);
        }
        a8i.l("PsshAtomUtil", "Atom data size (" + iB2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] h(UUID uuid, byte[] bArr) {
        uaj uajVarG = g(bArr);
        if (uajVarG == null) {
            return null;
        }
        UUID uuid2 = (UUID) uajVarG.c;
        if (uuid.equals(uuid2)) {
            return (byte[]) uajVarG.d;
        }
        a8i.l("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static final ContextScope i(f84 f84Var, v74 v74Var) {
        return new ContextScope(f84Var.getCoroutineContext().plus(v74Var));
    }
}
