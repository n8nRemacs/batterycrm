package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicsVas;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "period", "", "slug", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicsVas implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicsVas> CREATOR = new a();

    @c("icon")
    @l
    private final Image icon;

    @c("name")
    @l
    private final AttributedText name;

    @c("period")
    @l
    private final AttributedText period;

    @c("slug")
    @l
    private final String slug;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicsVas> {
        @Override // android.os.Parcelable.Creator
        public final DynamicsVas createFromParcel(Parcel parcel) {
            return new DynamicsVas((Image) parcel.readParcelable(DynamicsVas.class.getClassLoader()), (AttributedText) parcel.readParcelable(DynamicsVas.class.getClassLoader()), (AttributedText) parcel.readParcelable(DynamicsVas.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicsVas[] newArray(int i12) {
            return new DynamicsVas[i12];
        }
    }

    public DynamicsVas(@l Image image, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str) {
        this.icon = image;
        this.name = attributedText;
        this.period = attributedText2;
        this.slug = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getPeriod() {
        return this.period;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicsVas)) {
            return false;
        }
        DynamicsVas dynamicsVas = (DynamicsVas) obj;
        return L.f(this.icon, dynamicsVas.icon) && L.f(this.name, dynamicsVas.name) && L.f(this.period, dynamicsVas.period) && L.f(this.slug, dynamicsVas.slug);
    }

    public final int hashCode() {
        Image image = this.icon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        AttributedText attributedText = this.name;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.period;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.slug;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicsVas(icon=");
        sb2.append(this.icon);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", period=");
        sb2.append(this.period);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.slug, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeParcelable(this.name, i12);
        parcel.writeParcelable(this.period, i12);
        parcel.writeString(this.slug);
    }
}
