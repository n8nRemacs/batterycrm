package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsCreateCallMetaInfo.kt */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J@\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "", "itemId", "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsItemIdLong;", "scenario", "", "extraInfo", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V", "getExtraInfo", "()Ljava/util/Map;", "getItemId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScenario", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCreateCallMetaInfo;", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvCallsCreateCallMetaInfo {

    @k
    private final Map<String, String> extraInfo;

    @l
    private final Long itemId;

    @k
    private final String scenario;

    public AvCallsCreateCallMetaInfo(@l Long l12, @k String str, @k Map<String, String> map) {
        this.itemId = l12;
        this.scenario = str;
        this.extraInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvCallsCreateCallMetaInfo copy$default(AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, Long l12, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            l12 = avCallsCreateCallMetaInfo.itemId;
        }
        if ((i12 & 2) != 0) {
            str = avCallsCreateCallMetaInfo.scenario;
        }
        if ((i12 & 4) != 0) {
            map = avCallsCreateCallMetaInfo.extraInfo;
        }
        return avCallsCreateCallMetaInfo.copy(l12, str, map);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getItemId() {
        return this.itemId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    @k
    public final Map<String, String> component3() {
        return this.extraInfo;
    }

    @k
    public final AvCallsCreateCallMetaInfo copy(@l Long itemId, @k String scenario, @k Map<String, String> extraInfo) {
        return new AvCallsCreateCallMetaInfo(itemId, scenario, extraInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvCallsCreateCallMetaInfo)) {
            return false;
        }
        AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo = (AvCallsCreateCallMetaInfo) other;
        return L.f(this.itemId, avCallsCreateCallMetaInfo.itemId) && L.f(this.scenario, avCallsCreateCallMetaInfo.scenario) && L.f(this.extraInfo, avCallsCreateCallMetaInfo.extraInfo);
    }

    @k
    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    @l
    public final Long getItemId() {
        return this.itemId;
    }

    @k
    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        Long l12 = this.itemId;
        return this.extraInfo.hashCode() + H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.scenario);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvCallsCreateCallMetaInfo(itemId=");
        sb2.append(this.itemId);
        sb2.append(", scenario=");
        sb2.append(this.scenario);
        sb2.append(", extraInfo=");
        return r.w(sb2, this.extraInfo, ')');
    }
}
