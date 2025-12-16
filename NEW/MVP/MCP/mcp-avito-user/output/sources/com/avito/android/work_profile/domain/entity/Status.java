package com.avito.android.work_profile.domain.entity;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/Status;", "", "title", "", "code", "color", "Lcom/avito/android/remote/model/UniversalColor;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "getCode", "()Ljava/lang/String;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Status {

    @k
    private final String code;

    @l
    private final UniversalColor color;

    @k
    private final String title;

    public Status(@k String str, @k String str2, @l UniversalColor universalColor) {
        this.title = str;
        this.code = str2;
        this.color = universalColor;
    }

    public static /* synthetic */ Status copy$default(Status status, String str, String str2, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = status.title;
        }
        if ((i12 & 2) != 0) {
            str2 = status.code;
        }
        if ((i12 & 4) != 0) {
            universalColor = status.color;
        }
        return status.copy(str, str2, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final Status copy(@k String title, @k String code, @l UniversalColor color) {
        return new Status(title, code, color);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return L.f(this.title, status.title) && L.f(this.code, status.code) && L.f(this.color, status.color);
    }

    @k
    public final String getCode() {
        return this.code;
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.code);
        UniversalColor universalColor = this.color;
        return iD2 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Status(title=");
        sb2.append(this.title);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }
}
