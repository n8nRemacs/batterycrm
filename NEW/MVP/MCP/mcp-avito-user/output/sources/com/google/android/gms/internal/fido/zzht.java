package com.google.android.gms.internal.fido;

import androidx.compose.foundation.H;
import androidx.compose.foundation.text.selection.C21030p;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzht {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f350429a = new ArrayDeque(16);

    public static zzht zza() {
        return new zzht();
    }

    public final long a() {
        ArrayDeque arrayDeque = this.f350429a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public final void zzb() throws IOException {
        ArrayDeque arrayDeque = this.f350429a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + a());
    }

    public final void zzc() throws IOException {
        long jA2 = a();
        if (jA2 >= 0) {
            throw new IOException(C21030p.a(jA2, "expected indefinite length scope but found "));
        }
        if (jA2 == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f350429a.pop();
    }

    public final void zzd() throws IOException {
        long jA2 = a();
        if (jA2 != -1) {
            if (jA2 != -2) {
                return;
            } else {
                jA2 = -2;
            }
        }
        throw new IOException(C21030p.a(jA2, "expected non-string scope but found "));
    }

    public final void zze(long j12) throws IOException {
        long jA2 = a();
        if (jA2 != j12) {
            if (jA2 != -1) {
                if (jA2 != -2) {
                    return;
                } else {
                    jA2 = -2;
                }
            }
            StringBuilder sbQ = H.q(j12, "expected non-string scope or scope ", " but found ");
            sbQ.append(jA2);
            throw new IOException(sbQ.toString());
        }
    }

    public final void zzf() {
        long jA2 = a();
        ArrayDeque arrayDeque = this.f350429a;
        if (jA2 == 1) {
            arrayDeque.pop();
            return;
        }
        if (jA2 > 1) {
            arrayDeque.pop();
            arrayDeque.push(Long.valueOf(jA2 - 1));
        } else if (jA2 == -4) {
            arrayDeque.pop();
            arrayDeque.push(-5L);
        } else if (jA2 == -5) {
            arrayDeque.pop();
            arrayDeque.push(-4L);
        }
    }

    public final void zzg(long j12) {
        this.f350429a.push(Long.valueOf(j12));
    }
}
