package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/PageResult;", "", "pageId", "", "close", "", LocalPublishState.FIELDS, "", "Lfeedback/shared/sdk/api/network/entities/FieldResult;", "externalLink", "(Ljava/lang/String;ILjava/util/List;I)V", "getClose", "()I", "getExternalLink", "getFields", "()Ljava/util/List;", "getPageId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PageResult {
    private final int close;
    private final int externalLink;

    @k
    private final List<FieldResult> fields;

    @k
    private final String pageId;

    public PageResult(@k String str, int i12, @k List<FieldResult> list, int i13) {
        this.pageId = str;
        this.close = i12;
        this.fields = list;
        this.externalLink = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageResult copy$default(PageResult pageResult, String str, int i12, List list, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = pageResult.pageId;
        }
        if ((i14 & 2) != 0) {
            i12 = pageResult.close;
        }
        if ((i14 & 4) != 0) {
            list = pageResult.fields;
        }
        if ((i14 & 8) != 0) {
            i13 = pageResult.externalLink;
        }
        return pageResult.copy(str, i12, list, i13);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getClose() {
        return this.close;
    }

    @k
    public final List<FieldResult> component3() {
        return this.fields;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExternalLink() {
        return this.externalLink;
    }

    @k
    public final PageResult copy(@k String pageId, int close, @k List<FieldResult> fields, int externalLink) {
        return new PageResult(pageId, close, fields, externalLink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageResult)) {
            return false;
        }
        PageResult pageResult = (PageResult) other;
        return L.f(this.pageId, pageResult.pageId) && this.close == pageResult.close && L.f(this.fields, pageResult.fields) && this.externalLink == pageResult.externalLink;
    }

    public final int getClose() {
        return this.close;
    }

    public final int getExternalLink() {
        return this.externalLink;
    }

    @k
    public final List<FieldResult> getFields() {
        return this.fields;
    }

    @k
    public final String getPageId() {
        return this.pageId;
    }

    public int hashCode() {
        return Integer.hashCode(this.externalLink) + H.e(r.e(this.close, this.pageId.hashCode() * 31, 31), 31, this.fields);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PageResult(pageId=");
        sb2.append(this.pageId);
        sb2.append(", close=");
        sb2.append(this.close);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", externalLink=");
        return r.t(sb2, this.externalLink, ')');
    }

    public /* synthetic */ PageResult(String str, int i12, List list, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? 0 : i12, list, (i14 & 8) != 0 ? 0 : i13);
    }
}
