package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersOnboardingDto.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersOnboardingDto;", "Landroid/os/Parcelable;", "", "title", "description", "idempotencyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "c", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersOnboardingDto implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetFiltersOnboardingDto> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("idempotencyKey")
    @l
    private final String idempotencyKey;

    @c("title")
    @l
    private final String title;

    /* compiled from: WidgetFiltersOnboardingDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersOnboardingDto> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersOnboardingDto createFromParcel(Parcel parcel) {
            return new WidgetFiltersOnboardingDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersOnboardingDto[] newArray(int i12) {
            return new WidgetFiltersOnboardingDto[i12];
        }
    }

    public WidgetFiltersOnboardingDto(@l String str, @l String str2, @l String str3) {
        this.title = str;
        this.description = str2;
        this.idempotencyKey = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersOnboardingDto)) {
            return false;
        }
        WidgetFiltersOnboardingDto widgetFiltersOnboardingDto = (WidgetFiltersOnboardingDto) obj;
        return L.f(this.title, widgetFiltersOnboardingDto.title) && L.f(this.description, widgetFiltersOnboardingDto.description) && L.f(this.idempotencyKey, widgetFiltersOnboardingDto.idempotencyKey);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idempotencyKey;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersOnboardingDto(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", idempotencyKey=");
        return C22026a.c(sb2, this.idempotencyKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.idempotencyKey);
    }
}
