package com.avito.android.remote.model.social_reg;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SocialRegRequestCodeResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/social_reg/SocialRegRequestCodeResult;", "", "lastTryTime", "", "nextTryTime", "(JJ)V", "getLastTryTime", "()J", "getNextTryTime", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SocialRegRequestCodeResult {

    @c("lastTryTime")
    private final long lastTryTime;

    @c("nextTryTime")
    private final long nextTryTime;

    public SocialRegRequestCodeResult(long j12, long j13) {
        this.lastTryTime = j12;
        this.nextTryTime = j13;
    }

    public static /* synthetic */ SocialRegRequestCodeResult copy$default(SocialRegRequestCodeResult socialRegRequestCodeResult, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = socialRegRequestCodeResult.lastTryTime;
        }
        if ((i12 & 2) != 0) {
            j13 = socialRegRequestCodeResult.nextTryTime;
        }
        return socialRegRequestCodeResult.copy(j12, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLastTryTime() {
        return this.lastTryTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNextTryTime() {
        return this.nextTryTime;
    }

    @k
    public final SocialRegRequestCodeResult copy(long lastTryTime, long nextTryTime) {
        return new SocialRegRequestCodeResult(lastTryTime, nextTryTime);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialRegRequestCodeResult)) {
            return false;
        }
        SocialRegRequestCodeResult socialRegRequestCodeResult = (SocialRegRequestCodeResult) other;
        return this.lastTryTime == socialRegRequestCodeResult.lastTryTime && this.nextTryTime == socialRegRequestCodeResult.nextTryTime;
    }

    public final long getLastTryTime() {
        return this.lastTryTime;
    }

    public final long getNextTryTime() {
        return this.nextTryTime;
    }

    public int hashCode() {
        return Long.hashCode(this.nextTryTime) + (Long.hashCode(this.lastTryTime) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SocialRegRequestCodeResult(lastTryTime=");
        sb2.append(this.lastTryTime);
        sb2.append(", nextTryTime=");
        return r.u(sb2, this.nextTryTime, ')');
    }
}
