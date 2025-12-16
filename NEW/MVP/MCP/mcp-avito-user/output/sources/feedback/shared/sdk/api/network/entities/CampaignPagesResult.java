package feedback.shared.sdk.api.network.entities;

import Fc1.C13602e5;
import Y61.k;
import Y61.l;
import android.util.Base64;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

@s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b \u0010!JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0019R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010!¨\u00064"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CampaignPagesResult;", "", "", "campaignId", "projectId", "Ljava/util/Date;", "createdAtClient", "", "Lfeedback/shared/sdk/api/network/entities/PageResult;", "pages", "", "", "properties", "<init>", "(IILjava/util/Date;Ljava/util/List;Ljava/util/Map;)V", "Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "campaignInfo", "(Lfeedback/shared/sdk/api/network/entities/CampaignInfo;)V", "pageResult", "Lkotlin/G0;", "append", "(Lfeedback/shared/sdk/api/network/entities/PageResult;)V", "", "Lkotlin/Q;", "getScreenshots", "()Ljava/util/List;", "component1", "()I", "component2", "component3", "()Ljava/util/Date;", "component4", "component5", "()Ljava/util/Map;", "copy", "(IILjava/util/Date;Ljava/util/List;Ljava/util/Map;)Lfeedback/shared/sdk/api/network/entities/CampaignPagesResult;", "toString", "()Ljava/lang/String;", "hashCode", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaignId", "getProjectId", "Ljava/util/Date;", "getCreatedAtClient", "Ljava/util/List;", "getPages", "Ljava/util/Map;", "getProperties", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CampaignPagesResult {
    private final int campaignId;

    @k
    private final Date createdAtClient;

    @k
    private final List<PageResult> pages;
    private final int projectId;

    @k
    @a
    private final Map<String, String> properties;

    public CampaignPagesResult(int i12, int i13, @k Date date, @k List<PageResult> list, @k Map<String, String> map) {
        this.campaignId = i12;
        this.projectId = i13;
        this.createdAtClient = date;
        this.pages = list;
        this.properties = map;
    }

    public static /* synthetic */ CampaignPagesResult copy$default(CampaignPagesResult campaignPagesResult, int i12, int i13, Date date, List list, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = campaignPagesResult.campaignId;
        }
        if ((i14 & 2) != 0) {
            i13 = campaignPagesResult.projectId;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            date = campaignPagesResult.createdAtClient;
        }
        Date date2 = date;
        if ((i14 & 8) != 0) {
            list = campaignPagesResult.pages;
        }
        List list2 = list;
        if ((i14 & 16) != 0) {
            map = campaignPagesResult.properties;
        }
        return campaignPagesResult.copy(i12, i15, date2, list2, map);
    }

    public final void append(@k PageResult pageResult) {
        this.pages.add(pageResult);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Date getCreatedAtClient() {
        return this.createdAtClient;
    }

    @k
    public final List<PageResult> component4() {
        return this.pages;
    }

    @k
    public final Map<String, String> component5() {
        return this.properties;
    }

    @k
    public final CampaignPagesResult copy(int campaignId, int projectId, @k Date createdAtClient, @k List<PageResult> pages, @k Map<String, String> properties) {
        return new CampaignPagesResult(campaignId, projectId, createdAtClient, pages, properties);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignPagesResult)) {
            return false;
        }
        CampaignPagesResult campaignPagesResult = (CampaignPagesResult) other;
        return this.campaignId == campaignPagesResult.campaignId && this.projectId == campaignPagesResult.projectId && L.f(this.createdAtClient, campaignPagesResult.createdAtClient) && L.f(this.pages, campaignPagesResult.pages) && L.f(this.properties, campaignPagesResult.properties);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    public final Date getCreatedAtClient() {
        return this.createdAtClient;
    }

    @k
    public final List<PageResult> getPages() {
        return this.pages;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @k
    public final Map<String, String> getProperties() {
        return this.properties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final List<Q<String, String>> getScreenshots() {
        ArrayList arrayList = new ArrayList();
        int size = this.pages.size();
        for (int i12 = 0; i12 < size; i12++) {
            PageResult pageResult = this.pages.get(i12);
            int size2 = pageResult.getFields().size();
            for (int i13 = 0; i13 < size2; i13++) {
                FieldResult fieldResult = pageResult.getFields().get(i13);
                if (fieldResult.getType() == FieldType.SCREENSHOT) {
                    ArrayList arrayListT0 = C42745f0.T0(fieldResult.getValues(), fieldResult.getScreenshots());
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListT0, 10));
                    Iterator it = arrayListT0.iterator();
                    while (it.hasNext()) {
                        Q q12 = (Q) it.next();
                        arrayList2.add(new Q(q12.f406619b, new String(Base64.encode(((C13602e5) q12.f406620c).f5489c, 11), C43047d.f410589b)));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return this.properties.hashCode() + H.e(m.f(this.createdAtClient, r.e(this.projectId, Integer.hashCode(this.campaignId) * 31, 31), 31), 31, this.pages);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignPagesResult(campaignId=");
        sb2.append(this.campaignId);
        sb2.append(", projectId=");
        sb2.append(this.projectId);
        sb2.append(", createdAtClient=");
        sb2.append(this.createdAtClient);
        sb2.append(", pages=");
        sb2.append(this.pages);
        sb2.append(", properties=");
        return r.w(sb2, this.properties, ')');
    }

    public /* synthetic */ CampaignPagesResult(int i12, int i13, Date date, List list, Map map, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 4) != 0 ? new Date() : date, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? new LinkedHashMap() : map);
    }

    public CampaignPagesResult(@k CampaignInfo campaignInfo) {
        this(campaignInfo.getCampaignId(), campaignInfo.getProjectId(), null, null, null, 28, null);
    }
}
