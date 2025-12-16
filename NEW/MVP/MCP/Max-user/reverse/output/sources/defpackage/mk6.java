package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mk6 implements s9a {
    public static final String X;
    public static final zjd Y;
    public static final zjd Z;
    public final MediaMuxer a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public boolean d;
    public boolean o;

    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        X = sb.toString();
        tg7 tg7Var = new tg7(4);
        tg7Var.b("video/avc", "video/3gpp", "video/mp4v-es");
        tg7Var.a("video/hevc");
        if (i >= 33) {
            tg7Var.a("video/dolby-vision");
        }
        if (i >= 34) {
            tg7Var.a("video/av01");
        }
        if (i >= 36) {
            tg7Var.a("video/apv");
        }
        Y = tg7Var.i();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        pyi.a(3, objArr);
        Z = wg7.h(3, objArr);
    }

    public mk6(MediaMuxer mediaMuxer) {
        this.a = mediaMuxer;
    }

    public static void c(MediaMuxer mediaMuxer) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (Build.VERSION.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    String str = zxg.a;
                    num.getClass();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    @Override // defpackage.s9a
    public final void A(ry9 ry9Var) {
        if (ry9Var instanceof v3a) {
            v3a v3aVar = (v3a) ry9Var;
            this.a.setLocation(v3aVar.a, v3aVar.b);
        }
    }

    @Override // defpackage.s9a
    public final void J(int i, ByteBuffer byteBuffer, zu0 zu0Var) throws MuxerException {
        long j = zu0Var.a;
        boolean z = this.d;
        MediaMuxer mediaMuxer = this.a;
        SparseArray sparseArray = this.c;
        if (!z) {
            if (Build.VERSION.SDK_INT < 30 && j < 0) {
                sparseArray.put(i, Long.valueOf(-j));
            }
            try {
                mediaMuxer.start();
                this.d = true;
            } catch (RuntimeException e) {
                throw new MuxerException("Failed to start the muxer", e);
            }
        }
        long jLongValue = ((Long) sparseArray.get(i, 0L)).longValue();
        long j2 = j + jLongValue;
        SparseArray sparseArray2 = this.b;
        if (zxg.k(sparseArray2, i)) {
            ((Long) sparseArray2.get(i)).longValue();
        }
        sparseArray2.put(i, Long.valueOf(j2));
        boolean z2 = jLongValue == 0 || j2 >= 0;
        Locale locale = Locale.US;
        StringBuilder sbL = az1.l(j2 - jLongValue, "Sample presentation time (", ") < first sample presentation time (");
        sbL.append(-jLongValue);
        sbL.append("). Ensure the first sample has the smallest timestamp when using the negative PTS workaround.");
        hsi.f(sbL.toString(), z2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iPosition = byteBuffer.position();
        int i2 = zu0Var.b;
        int i3 = zu0Var.c;
        int i4 = (i3 & 1) != 1 ? 0 : 1;
        if ((i3 & 4) == 4) {
            i4 |= 4;
        }
        bufferInfo.set(iPosition, i2, j2, i4);
        try {
            mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        } catch (RuntimeException e2) {
            StringBuilder sbL2 = az1.l(j2, "Failed to write sample for presentationTimeUs=", ", size=");
            sbL2.append(zu0Var.b);
            throw new MuxerException(sbL2.toString(), e2);
        }
    }

    @Override // defpackage.s9a
    public final int c0(hf6 hf6Var) throws MuxerException {
        MediaFormat mediaFormatCreateAudioFormat;
        String str = hf6Var.n;
        int i = hf6Var.z;
        int i2 = hf6Var.v;
        int i3 = hf6Var.u;
        str.getClass();
        boolean zM = xz9.m(str);
        MediaMuxer mediaMuxer = this.a;
        if (zM) {
            mediaFormatCreateAudioFormat = MediaFormat.createVideoFormat(str, i3, i2);
            vui.f(mediaFormatCreateAudioFormat, hf6Var.D);
            if (str.equals("video/dolby-vision") && Build.VERSION.SDK_INT >= 33) {
                int iIntValue = 256;
                mediaFormatCreateAudioFormat.setInteger("profile", 256);
                if (hf6Var.k != null) {
                    Pair pairB = ed3.b(hf6Var);
                    pairB.getClass();
                    iIntValue = ((Integer) pairB.second).intValue();
                } else {
                    int iMax = Integer.max(i3, i2);
                    hsi.g(iMax <= 7680);
                    float f = i3 * i2 * hf6Var.y;
                    if (iMax <= 1280) {
                        iIntValue = f <= 2.21184E7f ? 1 : 2;
                    } else if (iMax <= 1920 && f <= 4.97664E7f) {
                        iIntValue = 4;
                    } else if (iMax <= 2560 && f <= 6.2208E7f) {
                        iIntValue = 8;
                    } else if (iMax > 3840) {
                        iIntValue = iMax <= 7680 ? f <= 9.95328E8f ? 1024 : 2048 : -1;
                    } else if (f <= 1.24416E8f) {
                        iIntValue = 16;
                    } else if (f <= 1.990656E8f) {
                        iIntValue = 32;
                    } else if (f <= 2.48832E8f) {
                        iIntValue = 64;
                    } else if (f <= 3.981312E8f) {
                        iIntValue = 128;
                    } else if (f > 4.97664E8f) {
                        iIntValue = 512;
                    }
                }
                mediaFormatCreateAudioFormat.setInteger("level", iIntValue);
            }
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new MuxerException(ho7.f(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, hf6Var.G, hf6Var.F);
            String str2 = hf6Var.d;
            if (str2 != null) {
                mediaFormatCreateAudioFormat.setString("language", str2);
            }
        }
        vui.i(mediaFormatCreateAudioFormat, hf6Var.q);
        try {
            return mediaMuxer.addTrack(mediaFormatCreateAudioFormat);
        } catch (RuntimeException e2) {
            throw new MuxerException("Failed to add track with format=" + hf6Var, e2);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        if (this.o) {
            return;
        }
        boolean z = this.d;
        MediaMuxer mediaMuxer = this.a;
        if (!z) {
            try {
                mediaMuxer.start();
                this.d = true;
            } catch (RuntimeException e) {
                throw new MuxerException("Failed to start the muxer", e);
            }
        }
        this.d = false;
        try {
            try {
                c(mediaMuxer);
            } catch (RuntimeException e2) {
                throw new MuxerException("Failed to stop the MediaMuxer", e2);
            }
        } finally {
            mediaMuxer.release();
            this.o = true;
        }
    }
}
