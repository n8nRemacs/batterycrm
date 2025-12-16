package jh;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: BbipConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ljh/d;", "", "", "successCampaign", "rejectCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jh.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42383d {

    @com.google.gson.annotations.c("rejectCampaign")
    @Y61.l
    private final String rejectCampaign;

    @com.google.gson.annotations.c("successCampaign")
    @Y61.l
    private final String successCampaign;

    public C42383d(@Y61.l String str, @Y61.l String str2) {
        this.successCampaign = str;
        this.rejectCampaign = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getRejectCampaign() {
        return this.rejectCampaign;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getSuccessCampaign() {
        return this.successCampaign;
    }
}
