package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C23108t;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.C23179x;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@J
/* loaded from: classes.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f48761b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48762c;

        /* renamed from: d, reason: collision with root package name */
        public final C23108t f48763d;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i12, int i13, int i14, int i15, C23108t c23108t, boolean z12, @P RuntimeException runtimeException) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "AudioTrack init failed ", " Config(", ", ");
            C23179x.a(sbY, i14, ", ", i15, ") ");
            sbY.append(c23108t);
            sbY.append(z12 ? " (recoverable)" : "");
            super(sbY.toString(), runtimeException);
            this.f48761b = i12;
            this.f48762c = z12;
            this.f48763d = c23108t;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
    }

    public static final class WriteException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f48764b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48765c;

        /* renamed from: d, reason: collision with root package name */
        public final C23108t f48766d;

        public WriteException(int i12, C23108t c23108t, boolean z12) {
            super(AK.c.g(i12, "AudioTrack write failed: "));
            this.f48765c = z12;
            this.f48764b = i12;
            this.f48766d = c23108t;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class ConfigurationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final C23108t f48760b;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, C23108t c23108t) {
            super(unhandledAudioFormatException);
            this.f48760b = c23108t;
        }

        public ConfigurationException(String str, C23108t c23108t) {
            super(str);
            this.f48760b = c23108t;
        }
    }

    public interface a {
        void b(int i12, long j12, long j13);

        void d();

        void onSkipSilenceEnabledChanged(boolean z12);

        default void c() {
        }

        default void e() {
        }

        default void f() {
        }

        default void a(long j12) {
        }

        default void b1(Exception exc) {
        }
    }

    @X
    default void a(@P AudioDeviceInfo audioDeviceInfo) {
    }
}
