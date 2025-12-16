package one.me.sdk.media.ffmpeg;

import defpackage.qca;
import defpackage.rca;
import defpackage.tk4;
import defpackage.vu5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0005\u0010\t\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmConfig;", "", "<init>", "()V", "Lone/me/sdk/media/ffmpeg/WebmConfig$Config;", "config", "Lqqg;", "init", "(Lone/me/sdk/media/ffmpeg/WebmConfig$Config;)V", "Lone/me/sdk/media/ffmpeg/WebmConfig$Config;", "getConfig", "()Lone/me/sdk/media/ffmpeg/WebmConfig$Config;", "setConfig", "getConfig$annotations", "Lrca;", "getLogger", "()Lrca;", "getLogger$annotations", "logger", "Config", "media-ffmpeg_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebmConfig {
    public static final WebmConfig INSTANCE = new WebmConfig();
    public static Config config;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/sdk/media/ffmpeg/WebmConfig$Config;", "", "Lone/me/sdk/media/ffmpeg/FfmpegLibraryLoader;", "nativeLibraryLoader", "Lrca;", "logger", "<init>", "(Lone/me/sdk/media/ffmpeg/FfmpegLibraryLoader;Lrca;)V", "Lone/me/sdk/media/ffmpeg/FfmpegLibraryLoader;", "getNativeLibraryLoader", "()Lone/me/sdk/media/ffmpeg/FfmpegLibraryLoader;", "Lrca;", "getLogger", "()Lrca;", "media-ffmpeg_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        private final rca logger;
        private final FfmpegLibraryLoader nativeLibraryLoader;

        public Config() {
            this(null, null, 3, null);
        }

        public final rca getLogger() {
            return this.logger;
        }

        public final FfmpegLibraryLoader getNativeLibraryLoader() {
            return this.nativeLibraryLoader;
        }

        public Config(FfmpegLibraryLoader ffmpegLibraryLoader) {
            this(ffmpegLibraryLoader, null, 2, null);
        }

        public Config(FfmpegLibraryLoader ffmpegLibraryLoader, rca rcaVar) {
            this.nativeLibraryLoader = ffmpegLibraryLoader;
            this.logger = rcaVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Config(FfmpegLibraryLoader ffmpegLibraryLoader, rca rcaVar, int i, tk4 tk4Var) {
            if ((i & 1) != 0) {
                FfmpegLibraryLoader.Companion.getClass();
                ffmpegLibraryLoader = vu5.b;
            }
            this(ffmpegLibraryLoader, (i & 2) != 0 ? qca.a : rcaVar);
        }
    }

    private WebmConfig() {
    }

    public static final Config getConfig() {
        Config config2 = config;
        if (config2 != null) {
            return config2;
        }
        return null;
    }

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static final rca getLogger() {
        return getConfig().getLogger();
    }

    public static /* synthetic */ void getLogger$annotations() {
    }

    public static final void init(Config config2) {
        setConfig(config2);
        config2.getNativeLibraryLoader().load();
    }

    public static final void setConfig(Config config2) {
        config = config2;
    }
}
