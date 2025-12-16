package ru.cyberity.cbr.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CBRModule.kt */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/CBRCoreModule;", "Lru/cyberity/cbr/core/CBRModule;", "feature", "", "(I)V", "isFullScreenCamera", "", "()Z", "isSkipGeolocationForm", "Companion", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final class CBRCoreModule extends CBRModule {

    @Keep
    public static final int FEATURE_FULLSCREEN_CAMERA = 4;

    @Keep
    public static final int FEATURE_SKIP_GEOLOCATION_FORM = 2;
    private final int feature;

    public CBRCoreModule() {
        this(0, 1, null);
    }

    public final boolean isFullScreenCamera() {
        return (this.feature & 4) != 0;
    }

    public final boolean isSkipGeolocationForm() {
        return (this.feature & 2) != 0;
    }

    public /* synthetic */ CBRCoreModule(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public CBRCoreModule(int i12) {
        super("Core module");
        this.feature = i12;
    }
}
