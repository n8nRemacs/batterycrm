package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u0016"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Copyright;", "", "isShow", "", "imageUrl", "", "href", "(ZLjava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getImageUrl", "()Z", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Copyright {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final String href;

    @l
    private final String imageUrl;
    private final boolean isShow;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Copyright$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Copyright;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final Copyright parseJson(@l JSONObject json) throws JSONException {
            if (json == null) {
                return null;
            }
            boolean z12 = json.getBoolean("isShow");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("image");
            return new Copyright(z12, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("3x") : null, json.optString("href"));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Copyright(boolean z12, @l String str, @l String str2) {
        this.isShow = z12;
        this.imageUrl = str;
        this.href = str2;
    }

    public static /* synthetic */ Copyright copy$default(Copyright copyright, boolean z12, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = copyright.isShow;
        }
        if ((i12 & 2) != 0) {
            str = copyright.imageUrl;
        }
        if ((i12 & 4) != 0) {
            str2 = copyright.href;
        }
        return copyright.copy(z12, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @k
    public final Copyright copy(boolean isShow, @l String imageUrl, @l String href) {
        return new Copyright(isShow, imageUrl, href);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Copyright)) {
            return false;
        }
        Copyright copyright = (Copyright) other;
        return this.isShow == copyright.isShow && L.f(this.imageUrl, copyright.imageUrl) && L.f(this.href, copyright.href);
    }

    @l
    public final String getHref() {
        return this.href;
    }

    @l
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z12 = this.isShow;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        String str = this.imageUrl;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.href;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isShow() {
        return this.isShow;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Copyright(isShow=");
        sb2.append(this.isShow);
        sb2.append(", imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", href=");
        return C22026a.c(sb2, this.href, ')');
    }
}
