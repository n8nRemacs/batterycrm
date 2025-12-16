package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gb0 implements AutoCloseable {
    public final AtomicBoolean X;
    public final dy Y;
    public final xw5 Z;
    public final kce a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference o;
    public final Executor s0;
    public final ju3 t0;
    public final boolean u0;
    public final boolean v0;
    public final long w0;

    public gb0(xw5 xw5Var, Executor executor, ju3 ju3Var, boolean z, boolean z2, long j) {
        kce kceVar;
        if (Build.VERSION.SDK_INT >= 30) {
            kceVar = new kce(11, new mc3());
        } else {
            kceVar = new kce(11, new qha(16));
        }
        this.a = kceVar;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        this.o = new AtomicReference(new bba(15));
        this.X = new AtomicBoolean(false);
        this.Y = new dy(Boolean.FALSE);
        if (xw5Var == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.Z = xw5Var;
        this.s0 = executor;
        this.t0 = ju3Var;
        this.u0 = z;
        this.v0 = z2;
        this.w0 = j;
    }

    public final void c(Uri uri) {
        if (this.b.get()) {
            d((ju3) this.o.getAndSet(null), uri);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c(Uri.EMPTY);
    }

    public final void d(ju3 ju3Var, Uri uri) {
        if (ju3Var != null) {
            ((nc3) this.a.b).close();
            ju3Var.accept(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        xw5 xw5Var = gb0Var.Z;
        ju3 ju3Var = gb0Var.t0;
        Executor executor = gb0Var.s0;
        if (!this.Z.equals(xw5Var)) {
            return false;
        }
        Executor executor2 = this.s0;
        if (executor2 == null) {
            if (executor != null) {
                return false;
            }
        } else if (!executor2.equals(executor)) {
            return false;
        }
        ju3 ju3Var2 = this.t0;
        if (ju3Var2 == null) {
            if (ju3Var != null) {
                return false;
            }
        } else if (!ju3Var2.equals(ju3Var)) {
            return false;
        }
        return this.u0 == gb0Var.u0 && this.v0 == gb0Var.v0 && this.w0 == gb0Var.w0;
    }

    public final void finalize() throws Throwable {
        try {
            ((nc3) this.a.b).b();
            ju3 ju3Var = (ju3) this.o.getAndSet(null);
            if (ju3Var != null) {
                d(ju3Var, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final int hashCode() {
        int iHashCode = (this.Z.b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.s0;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        ju3 ju3Var = this.t0;
        int iHashCode3 = (((iHashCode2 ^ (ju3Var != null ? ju3Var.hashCode() : 0)) * 1000003) ^ (this.u0 ? 1231 : 1237)) * 1000003;
        int i = this.v0 ? 1231 : 1237;
        long j = this.w0;
        return ((iHashCode3 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final void i(Context context) {
        if (this.b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((nc3) this.a.b).c("finalizeRecording");
        this.c.set(new wgd(this.Z));
        if (this.u0) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.d;
            if (i >= 31) {
                atomicReference.set(new xgd(this, context));
            } else {
                atomicReference.set(new ygd(this));
            }
        }
    }

    public final MediaMuxer l(int i, s32 s32Var) throws IOException {
        if (!this.b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        wgd wgdVar = (wgd) this.c.getAndSet(null);
        if (wgdVar == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return wgdVar.a(i, s32Var);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create MediaMuxer by " + e, e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.Z);
        sb.append(", getCallbackExecutor=");
        sb.append(this.s0);
        sb.append(", getEventListener=");
        sb.append(this.t0);
        sb.append(", hasAudioEnabled=");
        sb.append(this.u0);
        sb.append(", isPersistent=");
        sb.append(this.v0);
        sb.append(", getRecordingId=");
        return ho7.k(sb, this.w0, "}");
    }

    public final void w(ach achVar) {
        int i;
        String strE;
        xw5 xw5Var = achVar.a;
        xw5 xw5Var2 = this.Z;
        if (!Objects.equals(xw5Var, xw5Var2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + xw5Var + ", Expected: " + xw5Var2 + "]");
        }
        String strConcat = "Sending VideoRecordEvent ".concat(achVar.getClass().getSimpleName());
        boolean z = achVar instanceof vbh;
        if (z && (i = ((vbh) achVar).c) != 0) {
            StringBuilder sbM = az1.m(strConcat);
            switch (i) {
                case 0:
                    strE = "ERROR_NONE";
                    break;
                case 1:
                    strE = "ERROR_UNKNOWN";
                    break;
                case 2:
                    strE = "ERROR_FILE_SIZE_LIMIT_REACHED";
                    break;
                case 3:
                    strE = "ERROR_INSUFFICIENT_STORAGE";
                    break;
                case 4:
                    strE = "ERROR_SOURCE_INACTIVE";
                    break;
                case 5:
                    strE = "ERROR_INVALID_OUTPUT_OPTIONS";
                    break;
                case 6:
                    strE = "ERROR_ENCODING_FAILED";
                    break;
                case 7:
                    strE = "ERROR_RECORDER_ERROR";
                    break;
                case 8:
                    strE = "ERROR_NO_VALID_DATA";
                    break;
                case 9:
                    strE = "ERROR_DURATION_LIMIT_REACHED";
                    break;
                case 10:
                    strE = "ERROR_RECORDING_GARBAGE_COLLECTED";
                    break;
                default:
                    strE = wy1.e(i, "Unknown(", ")");
                    break;
            }
            sbM.append(" [error: " + strE + "]");
            strConcat = sbM.toString();
        }
        gri.a("Recorder", strConcat);
        boolean z2 = achVar instanceof ybh;
        dy dyVar = this.Y;
        if (z2 || (achVar instanceof xbh)) {
            dyVar.D(Boolean.TRUE);
        } else if ((achVar instanceof wbh) || z) {
            dyVar.D(Boolean.FALSE);
        }
        Executor executor = this.s0;
        if (executor == null || this.t0 == null) {
            return;
        }
        try {
            executor.execute(new d8c(this, 15, achVar));
        } catch (RejectedExecutionException e) {
            gri.c("Recorder", "The callback executor is invalid.", e);
        }
    }
}
