package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/StatDto;", "Landroid/os/Parcelable;", "", "title", "", "count", "additionalCount", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "I", "getCount", "()I", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StatDto implements Parcelable {

    @k
    public static final Parcelable.Creator<StatDto> CREATOR = new a();

    @c("additionalCount")
    @l
    private final Integer additionalCount;

    @c("count")
    private final int count;

    @c("title")
    @k
    private final String title;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatDto> {
        @Override // android.os.Parcelable.Creator
        public final StatDto createFromParcel(Parcel parcel) {
            return new StatDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StatDto[] newArray(int i12) {
            return new StatDto[i12];
        }
    }

    public StatDto(@k String str, int i12, @l Integer num) {
        this.title = str;
        this.count = i12;
        this.additionalCount = num;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getAdditionalCount() {
        return this.additionalCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatDto)) {
            return false;
        }
        StatDto statDto = (StatDto) obj;
        return L.f(this.title, statDto.title) && this.count == statDto.count && L.f(this.additionalCount, statDto.additionalCount);
    }

    public final int getCount() {
        return this.count;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = r.e(this.count, this.title.hashCode() * 31, 31);
        Integer num = this.additionalCount;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatDto(title=");
        sb2.append(this.title);
        sb2.append(", count=");
        sb2.append(this.count);
        sb2.append(", additionalCount=");
        return s.j(sb2, this.additionalCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        Integer num = this.additionalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
