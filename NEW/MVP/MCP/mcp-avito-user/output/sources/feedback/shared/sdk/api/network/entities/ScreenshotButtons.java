package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;", "", "create", "", "upload", "(Ljava/lang/String;Ljava/lang/String;)V", "getCreate", "()Ljava/lang/String;", "getUpload", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ScreenshotButtons {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final String create;

    @l
    private final String upload;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final ScreenshotButtons parseJson(@l JSONObject json) {
            if (json != null) {
                return new ScreenshotButtons(R7.b(json, "create"), R7.b(json, "upload"));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public ScreenshotButtons(@l String str, @l String str2) {
        this.create = str;
        this.upload = str2;
    }

    public static /* synthetic */ ScreenshotButtons copy$default(ScreenshotButtons screenshotButtons, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = screenshotButtons.create;
        }
        if ((i12 & 2) != 0) {
            str2 = screenshotButtons.upload;
        }
        return screenshotButtons.copy(str, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getCreate() {
        return this.create;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getUpload() {
        return this.upload;
    }

    @k
    public final ScreenshotButtons copy(@l String create, @l String upload) {
        return new ScreenshotButtons(create, upload);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenshotButtons)) {
            return false;
        }
        ScreenshotButtons screenshotButtons = (ScreenshotButtons) other;
        return L.f(this.create, screenshotButtons.create) && L.f(this.upload, screenshotButtons.upload);
    }

    @l
    public final String getCreate() {
        return this.create;
    }

    @l
    public final String getUpload() {
        return this.upload;
    }

    public int hashCode() {
        String str = this.create;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.upload;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotButtons(create=");
        sb2.append(this.create);
        sb2.append(", upload=");
        return C22026a.c(sb2, this.upload, ')');
    }
}
