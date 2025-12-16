package ru.cyberity.cbr.prooface;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.CBRModule;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/prooface/CBRProoface;", "Lru/cyberity/cbr/core/CBRModule;", "feature", "", "(I)V", "isDebug", "", "()Z", "isShowSettingsDialog", "Companion", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRProoface extends CBRModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @Keep
    public static final int FEATURE_FACE_DETECTION_DEBUG = 1;
    public static final int FEATURE_FACE_SHOW_SETTINGS = 2;
    private final int feature;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/prooface/CBRProoface$Companion;", "", "()V", "FEATURE_FACE_DETECTION_DEBUG", "", "FEATURE_FACE_SHOW_SETTINGS", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public CBRProoface() {
        this(0, 1, null);
    }

    public final boolean isDebug() {
        return (this.feature & 1) != 0;
    }

    public final boolean isShowSettingsDialog() {
        return (this.feature & 2) != 0;
    }

    public /* synthetic */ CBRProoface(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public CBRProoface(int i12) {
        super("Advanced 3D Face Scanning");
        this.feature = i12;
    }
}
