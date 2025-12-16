package com.avito.android.remote.model.teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TeaserInsight.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/teaser/TeaserInsight;", "Lcom/avito/android/remote/model/teaser/TeaserInsightGeneral;", "Landroid/os/Parcelable;", "", "text", "description", "Lcom/avito/android/remote/model/teaser/TeaserStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/teaser/TeaserStatus;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/teaser/TeaserStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/teaser/TeaserStatus;)Lcom/avito/android/remote/model/teaser/TeaserInsight;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getDescription", "Lcom/avito/android/remote/model/teaser/TeaserStatus;", "getStatus", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TeaserInsight implements TeaserInsightGeneral, Parcelable {

    @k
    public static final Parcelable.Creator<TeaserInsight> CREATOR = new Creator();

    @c("description")
    @l
    private final String description;

    @c("status")
    @k
    private final TeaserStatus status;

    @c("text")
    @k
    private final String text;

    /* compiled from: TeaserInsight.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TeaserInsight> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TeaserInsight createFromParcel(@k Parcel parcel) {
            return new TeaserInsight(parcel.readString(), parcel.readString(), TeaserStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TeaserInsight[] newArray(int i12) {
            return new TeaserInsight[i12];
        }
    }

    public TeaserInsight(@k String str, @l String str2, @k TeaserStatus teaserStatus) {
        this.text = str;
        this.description = str2;
        this.status = teaserStatus;
    }

    public static /* synthetic */ TeaserInsight copy$default(TeaserInsight teaserInsight, String str, String str2, TeaserStatus teaserStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = teaserInsight.text;
        }
        if ((i12 & 2) != 0) {
            str2 = teaserInsight.description;
        }
        if ((i12 & 4) != 0) {
            teaserStatus = teaserInsight.status;
        }
        return teaserInsight.copy(str, str2, teaserStatus);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final TeaserStatus getStatus() {
        return this.status;
    }

    @k
    public final TeaserInsight copy(@k String text, @l String description, @k TeaserStatus status) {
        return new TeaserInsight(text, description, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeaserInsight)) {
            return false;
        }
        TeaserInsight teaserInsight = (TeaserInsight) other;
        return L.f(this.text, teaserInsight.text) && L.f(this.description, teaserInsight.description) && this.status == teaserInsight.status;
    }

    @Override // com.avito.android.remote.model.teaser.TeaserInsightGeneral
    @l
    public String getDescription() {
        return this.description;
    }

    @Override // com.avito.android.remote.model.teaser.TeaserInsightGeneral
    @k
    public TeaserStatus getStatus() {
        return this.status;
    }

    @Override // com.avito.android.remote.model.teaser.TeaserInsightGeneral
    @k
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.description;
        return this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "TeaserInsight(text=" + this.text + ", description=" + this.description + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.description);
        parcel.writeString(this.status.name());
    }
}
