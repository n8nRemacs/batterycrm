package com.avito.android.personal_filters.filters_change_dialog.ui;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/ui/PersonalFiltersChangeDialogData;", "Landroid/os/Parcelable;", "ApplyButton", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonalFiltersChangeDialogData implements Parcelable {

    @k
    public static final Parcelable.Creator<PersonalFiltersChangeDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f215763c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ApplyButton f215764d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f215765e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f215766f;

    /* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/ui/PersonalFiltersChangeDialogData$ApplyButton;", "Landroid/os/Parcelable;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyButton implements Parcelable {

        @k
        public static final Parcelable.Creator<ApplyButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f215767b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f215768c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f215769d;

        /* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ApplyButton> {
            @Override // android.os.Parcelable.Creator
            public final ApplyButton createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new ApplyButton(string, linkedHashMap, (DeepLink) parcel.readParcelable(ApplyButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ApplyButton[] newArray(int i12) {
                return new ApplyButton[i12];
            }
        }

        public ApplyButton(@k String str, @k Map<String, String> map, @k DeepLink deepLink) {
            this.f215767b = str;
            this.f215768c = map;
            this.f215769d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyButton)) {
                return false;
            }
            ApplyButton applyButton = (ApplyButton) obj;
            return L.f(this.f215767b, applyButton.f215767b) && L.f(this.f215768c, applyButton.f215768c) && L.f(this.f215769d, applyButton.f215769d);
        }

        public final int hashCode() {
            return this.f215769d.hashCode() + c.c(this.f215767b.hashCode() * 31, 31, this.f215768c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyButton(title=");
            sb2.append(this.f215767b);
            sb2.append(", params=");
            sb2.append(this.f215768c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f215769d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f215767b);
            Iterator itI = C0.i(parcel, this.f215768c);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            parcel.writeParcelable(this.f215769d, i12);
        }
    }

    /* compiled from: PersonalFiltersChangeDialogOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PersonalFiltersChangeDialogData> {
        @Override // android.os.Parcelable.Creator
        public final PersonalFiltersChangeDialogData createFromParcel(Parcel parcel) {
            return new PersonalFiltersChangeDialogData(parcel.readString(), parcel.readString(), ApplyButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalFiltersChangeDialogData[] newArray(int i12) {
            return new PersonalFiltersChangeDialogData[i12];
        }
    }

    public PersonalFiltersChangeDialogData(@k String str, @k String str2, @k ApplyButton applyButton, @k String str3, @k String str4) {
        this.f215762b = str;
        this.f215763c = str2;
        this.f215764d = applyButton;
        this.f215765e = str3;
        this.f215766f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalFiltersChangeDialogData)) {
            return false;
        }
        PersonalFiltersChangeDialogData personalFiltersChangeDialogData = (PersonalFiltersChangeDialogData) obj;
        return L.f(this.f215762b, personalFiltersChangeDialogData.f215762b) && L.f(this.f215763c, personalFiltersChangeDialogData.f215763c) && L.f(this.f215764d, personalFiltersChangeDialogData.f215764d) && L.f(this.f215765e, personalFiltersChangeDialogData.f215765e) && L.f(this.f215766f, personalFiltersChangeDialogData.f215766f);
    }

    public final int hashCode() {
        return this.f215766f.hashCode() + H.d((this.f215764d.hashCode() + H.d(this.f215762b.hashCode() * 31, 31, this.f215763c)) * 31, 31, this.f215765e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalFiltersChangeDialogData(title=");
        sb2.append(this.f215762b);
        sb2.append(", subtitle=");
        sb2.append(this.f215763c);
        sb2.append(", applyButton=");
        sb2.append(this.f215764d);
        sb2.append(", checkboxTitle=");
        sb2.append(this.f215765e);
        sb2.append(", declineButtonTitle=");
        return C22026a.c(sb2, this.f215766f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215762b);
        parcel.writeString(this.f215763c);
        this.f215764d.writeToParcel(parcel, i12);
        parcel.writeString(this.f215765e);
        parcel.writeString(this.f215766f);
    }
}
