package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Privacy;", "", "declaration", "", "enabled", "", "warningMessage", "privacyPages", "", "type", "Lfeedback/shared/sdk/api/network/entities/PrivacyType;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lfeedback/shared/sdk/api/network/entities/PrivacyType;)V", "getDeclaration", "()Ljava/lang/String;", "getEnabled", "()Z", "getPrivacyPages", "()Ljava/util/List;", "getType", "()Lfeedback/shared/sdk/api/network/entities/PrivacyType;", "getWarningMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Privacy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String declaration;
    private final boolean enabled;

    @k
    private final List<String> privacyPages;

    @k
    private final PrivacyType type;

    @k
    private final String warningMessage;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Privacy$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Privacy;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final Privacy parseJson(@l JSONObject json) {
            if (json != null) {
                return new Privacy(json.getString("declaration"), json.getBoolean("enabled"), json.getString("warningMessage"), R7.a("privacyPages", json), PrivacyType.INSTANCE.from(json.getString("type")));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Privacy(@k String str, boolean z12, @k String str2, @k List<String> list, @k PrivacyType privacyType) {
        this.declaration = str;
        this.enabled = z12;
        this.warningMessage = str2;
        this.privacyPages = list;
        this.type = privacyType;
    }

    public static /* synthetic */ Privacy copy$default(Privacy privacy, String str, boolean z12, String str2, List list, PrivacyType privacyType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = privacy.declaration;
        }
        if ((i12 & 2) != 0) {
            z12 = privacy.enabled;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            str2 = privacy.warningMessage;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            list = privacy.privacyPages;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            privacyType = privacy.type;
        }
        return privacy.copy(str, z13, str3, list2, privacyType);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDeclaration() {
        return this.declaration;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    @k
    public final List<String> component4() {
        return this.privacyPages;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final PrivacyType getType() {
        return this.type;
    }

    @k
    public final Privacy copy(@k String declaration, boolean enabled, @k String warningMessage, @k List<String> privacyPages, @k PrivacyType type) {
        return new Privacy(declaration, enabled, warningMessage, privacyPages, type);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Privacy)) {
            return false;
        }
        Privacy privacy = (Privacy) other;
        return L.f(this.declaration, privacy.declaration) && this.enabled == privacy.enabled && L.f(this.warningMessage, privacy.warningMessage) && L.f(this.privacyPages, privacy.privacyPages) && this.type == privacy.type;
    }

    @k
    public final String getDeclaration() {
        return this.declaration;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    public final List<String> getPrivacyPages() {
        return this.privacyPages;
    }

    @k
    public final PrivacyType getType() {
        return this.type;
    }

    @k
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.declaration.hashCode() * 31;
        boolean z12 = this.enabled;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return this.type.hashCode() + H.e(H.d((iHashCode + i12) * 31, 31, this.warningMessage), 31, this.privacyPages);
    }

    @k
    public String toString() {
        return "Privacy(declaration=" + this.declaration + ", enabled=" + this.enabled + ", warningMessage=" + this.warningMessage + ", privacyPages=" + this.privacyPages + ", type=" + this.type + ')';
    }
}
