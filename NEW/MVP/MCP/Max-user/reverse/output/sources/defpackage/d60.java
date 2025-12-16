package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d60 implements b60 {
    public static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public static final /* synthetic */ int n = 0;
    public AudioRecord a;
    public final f90 b;
    public final int f;
    public final int g;
    public r5j h;
    public qee i;
    public long j;
    public c60 k;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean l = false;

    public d60(f90 f90Var, Context context) throws AudioStream$AudioStreamException, IllegalArgumentException {
        int i = f90Var.b;
        int i2 = f90Var.c;
        int i3 = f90Var.d;
        if (i > 0 && i2 > 0) {
            if (AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3) > 0) {
                this.b = f90Var;
                this.g = f90Var.a();
                int minBufferSize = AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
                z5j.f(null, minBufferSize > 0);
                int i4 = minBufferSize * 2;
                this.f = i4;
                AudioRecord audioRecordB = b(i4, f90Var, context);
                this.a = audioRecordB;
                if (audioRecordB.getState() == 1) {
                    return;
                }
                audioRecordB.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static AudioRecord b(int i, f90 f90Var, Context context) throws IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(f90Var.b).setChannelMask(f90Var.c == 1 ? 16 : 12).setEncoding(f90Var.d).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i2 >= 31 && context != null) {
            jl.c(builder, context);
        }
        builder.setAudioSource(f90Var.a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    public final void a() {
        z5j.f("AudioStream has been released.", !this.c.get());
    }

    public final void c(boolean z) {
        qee qeeVar = this.i;
        r5j r5jVar = this.h;
        if (qeeVar == null || r5jVar == null || Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        qeeVar.execute(new ui(4, r5jVar, z));
    }

    public final void d() throws IllegalStateException, AudioStream$AudioStreamException {
        a();
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (pv4.a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.a.startRecording();
        boolean z = false;
        if (this.a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
        this.j = 0L;
        this.l = false;
        this.e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationB = il.b(this.a);
            z = audioRecordingConfigurationB != null && il.c(audioRecordingConfigurationB);
        }
        c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // defpackage.b60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i90 read(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.z5j.f(r1, r0)
            android.media.AudioRecord r0 = r13.a
            int r1 = r13.f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L8e
            r14.limit(r0)
            boolean r14 = r13.l
            r3 = -1
            if (r14 != 0) goto L79
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.a
            r6 = 0
            int r5 = r5.getTimestamp(r14, r6)
            if (r5 != 0) goto L72
            f90 r5 = r13.b
            int r5 = r5.b
            long r7 = r13.j
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L3f
            r9 = r10
            goto L40
        L3f:
            r9 = r6
        L40:
            java.lang.String r11 = "sampleRate must be greater than 0."
            defpackage.z5j.a(r11, r9)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4a
            r6 = r10
        L4a:
            java.lang.String r9 = "framePosition must be no less than 0."
            defpackage.z5j.a(r9, r6)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = defpackage.eti.b(r5, r7)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L5e
            goto L5f
        L5e:
            r1 = r7
        L5f:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = defpackage.d60.m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L7a
            r13.l = r10
            goto L79
        L72:
            java.lang.String r14 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            defpackage.gri.i(r14, r1)
        L79:
            r1 = r3
        L7a:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L82
            long r1 = java.lang.System.nanoTime()
        L82:
            long r3 = r13.j
            long r5 = (long) r0
            int r14 = r13.g
            long r5 = defpackage.eti.k(r14, r5)
            long r5 = r5 + r3
            r13.j = r5
        L8e:
            i90 r14 = new i90
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d60.read(java.nio.ByteBuffer):i90");
    }
}
