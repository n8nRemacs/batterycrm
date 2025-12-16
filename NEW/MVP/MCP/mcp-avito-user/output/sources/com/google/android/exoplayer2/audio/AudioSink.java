package com.google.android.exoplayer2.audio;

import androidx.media3.exoplayer.C23179x;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.AudioProcessor;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes6.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f343853b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f343854c;

        /* renamed from: d, reason: collision with root package name */
        public final I f343855d;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i12, int i13, int i14, int i15, I i16, boolean z12, @P RuntimeException runtimeException) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "AudioTrack init failed ", " Config(", ", ");
            C23179x.a(sbY, i14, ", ", i15, ")");
            sbY.append(z12 ? " (recoverable)" : "");
            super(sbY.toString(), runtimeException);
            this.f343853b = i12;
            this.f343854c = z12;
            this.f343855d = i16;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
    }

    public static final class WriteException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f343856b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f343857c;

        /* renamed from: d, reason: collision with root package name */
        public final I f343858d;

        public WriteException(int i12, I i13, boolean z12) {
            super(AK.c.g(i12, "AudioTrack write failed: "));
            this.f343857c = z12;
            this.f343856b = i12;
            this.f343858d = i13;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class ConfigurationException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final I f343852b;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, I i12) {
            super(unhandledAudioFormatException);
            this.f343852b = i12;
        }

        public ConfigurationException(String str, I i12) {
            super(str);
            this.f343852b = i12;
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

        default void a(long j12) {
        }

        default void b1(Exception exc) {
        }
    }
}
