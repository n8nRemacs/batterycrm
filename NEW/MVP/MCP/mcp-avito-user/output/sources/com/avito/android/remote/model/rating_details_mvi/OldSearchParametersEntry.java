package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters;", SearchParamsConverterKt.SORT, "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters;", "getSort", "()Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters;", "SortParameters", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OldSearchParametersEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<OldSearchParametersEntry> CREATOR = new Creator();

    @c(SearchParamsConverterKt.SORT)
    @l
    private final SortParameters sort;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OldSearchParametersEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OldSearchParametersEntry createFromParcel(@k Parcel parcel) {
            return new OldSearchParametersEntry(parcel.readInt() == 0 ? null : SortParameters.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OldSearchParametersEntry[] newArray(int i12) {
            return new OldSearchParametersEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters;", "Landroid/os/Parcelable;", "", "paramName", "selectedOption", "updateLabel", "", "Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters$SortOption;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getParamName", "()Ljava/lang/String;", "getSelectedOption", "getUpdateLabel", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "SortOption", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class SortParameters implements Parcelable {

        @k
        public static final Parcelable.Creator<SortParameters> CREATOR = new Creator();

        @c("options")
        @k
        private final List<SortOption> options;

        @c("paramName")
        @k
        private final String paramName;

        @c("selectedOption")
        @k
        private final String selectedOption;

        @c("updateLabel")
        @l
        private final String updateLabel;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SortParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SortParameters createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(SortOption.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new SortParameters(string, string2, string3, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SortParameters[] newArray(int i12) {
                return new SortParameters[i12];
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/OldSearchParametersEntry$SortParameters$SortOption;", "Landroid/os/Parcelable;", "", "value", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getLabel", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SortOption implements Parcelable {

            @k
            public static final Parcelable.Creator<SortOption> CREATOR = new Creator();

            @c("label")
            @k
            private final String label;

            @c("value")
            @k
            private final String value;

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SortOption> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SortOption createFromParcel(@k Parcel parcel) {
                    return new SortOption(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SortOption[] newArray(int i12) {
                    return new SortOption[i12];
                }
            }

            public SortOption(@k String str, @k String str2) {
                this.value = str;
                this.label = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @k
            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.value);
                parcel.writeString(this.label);
            }
        }

        public SortParameters(@k String str, @k String str2, @l String str3, @k List<SortOption> list) {
            this.paramName = str;
            this.selectedOption = str2;
            this.updateLabel = str3;
            this.options = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<SortOption> getOptions() {
            return this.options;
        }

        @k
        public final String getParamName() {
            return this.paramName;
        }

        @k
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @l
        public final String getUpdateLabel() {
            return this.updateLabel;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.paramName);
            parcel.writeString(this.selectedOption);
            parcel.writeString(this.updateLabel);
            Iterator itJ = C0.j(this.options, parcel);
            while (itJ.hasNext()) {
                ((SortOption) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    public OldSearchParametersEntry(@l SortParameters sortParameters) {
        this.sort = sortParameters;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SortParameters getSort() {
        return this.sort;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SortParameters sortParameters = this.sort;
        if (sortParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sortParameters.writeToParcel(parcel, flags);
        }
    }
}
