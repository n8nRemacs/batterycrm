package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class pe5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ pe5(bf5 bf5Var, long j, int i) {
        this.a = i;
        this.b = bf5Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf5 bf5Var = this.b;
                long j = this.c;
                switch (az1.v(bf5Var.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        gri.a(bf5Var.a, "Pause on ".concat(k8j.c(j)));
                        bf5Var.o.addLast(Range.create(Long.valueOf(j), Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD)));
                        bf5Var.i(3);
                        return;
                    case 4:
                        bf5Var.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var.D)));
                }
            default:
                bf5 bf5Var2 = this.b;
                long j2 = this.c;
                switch (az1.v(bf5Var2.D)) {
                    case 0:
                        bf5Var2.w = null;
                        gri.a(bf5Var2.a, "Start on ".concat(k8j.c(j2)));
                        try {
                            if (bf5Var2.z) {
                                bf5Var2.h();
                            }
                            bf5Var2.t = Range.create(Long.valueOf(j2), Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD));
                            bf5Var2.e.start();
                            ge5 ge5Var = bf5Var2.f;
                            if (ge5Var instanceof we5) {
                                ((we5) ge5Var).a(true);
                            }
                            bf5Var2.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            bf5Var2.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        bf5Var2.w = null;
                        Range range = (Range) bf5Var2.o.removeLast();
                        z5j.f("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == BuildConfig.MAX_TIME_TO_UPLOAD);
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        bf5Var2.o.addLast(Range.create(l, Long.valueOf(j2)));
                        gri.a(bf5Var2.a, "Resume on " + k8j.c(j2) + "\nPaused duration = " + k8j.c(j2 - jLongValue));
                        if ((bf5Var2.c || pv4.a.e(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!bf5Var2.c || pv4.a.e(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            bf5Var2.e.setParameters(ho7.e(0, "drop-input-frames"));
                            ge5 ge5Var2 = bf5Var2.f;
                            if (ge5Var2 instanceof we5) {
                                ((we5) ge5Var2).a(true);
                            }
                        }
                        if (bf5Var2.c) {
                            bf5Var2.g();
                        }
                        bf5Var2.i(2);
                        return;
                    case 3:
                    case 5:
                        bf5Var2.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var2.D)));
                }
        }
    }
}
