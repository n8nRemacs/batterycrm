package com.avito.android.mortgage.person_form.suggestion.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult;", "Landroid/os/Parcelable;", "FillByHandsSelected", "SuggestionSelected", "Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult$FillByHandsSelected;", "Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult$SuggestionSelected;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SuggestionResult extends Parcelable {

    /* compiled from: SuggestionResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult$FillByHandsSelected;", "Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class FillByHandsSelected implements SuggestionResult {

        @k
        public static final Parcelable.Creator<FillByHandsSelected> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201416b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SuggestionContainer<? extends Suggestion> f201417c;

        /* compiled from: SuggestionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FillByHandsSelected> {
            @Override // android.os.Parcelable.Creator
            public final FillByHandsSelected createFromParcel(Parcel parcel) {
                return new FillByHandsSelected(parcel.readString(), parcel.readInt() == 0 ? null : SuggestionContainer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final FillByHandsSelected[] newArray(int i12) {
                return new FillByHandsSelected[i12];
            }
        }

        public FillByHandsSelected(@k String str, @l SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f201416b = str;
            this.f201417c = suggestionContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FillByHandsSelected)) {
                return false;
            }
            FillByHandsSelected fillByHandsSelected = (FillByHandsSelected) obj;
            return L.f(this.f201416b, fillByHandsSelected.f201416b) && L.f(this.f201417c, fillByHandsSelected.f201417c);
        }

        public final int hashCode() {
            int iHashCode = this.f201416b.hashCode() * 31;
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201417c;
            return iHashCode + (suggestionContainer == null ? 0 : suggestionContainer.hashCode());
        }

        @k
        public final String toString() {
            return "FillByHandsSelected(fieldId=" + this.f201416b + ", lastAppliedSuggestion=" + this.f201417c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f201416b);
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201417c;
            if (suggestionContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                suggestionContainer.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: SuggestionResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult$SuggestionSelected;", "Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionResult;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SuggestionSelected implements SuggestionResult {

        @k
        public static final Parcelable.Creator<SuggestionSelected> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201418b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SuggestionContainer<? extends Suggestion> f201419c;

        /* compiled from: SuggestionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SuggestionSelected> {
            @Override // android.os.Parcelable.Creator
            public final SuggestionSelected createFromParcel(Parcel parcel) {
                return new SuggestionSelected(parcel.readString(), parcel.readInt() == 0 ? null : SuggestionContainer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuggestionSelected[] newArray(int i12) {
                return new SuggestionSelected[i12];
            }
        }

        public SuggestionSelected(@k String str, @l SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f201418b = str;
            this.f201419c = suggestionContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestionSelected)) {
                return false;
            }
            SuggestionSelected suggestionSelected = (SuggestionSelected) obj;
            return L.f(this.f201418b, suggestionSelected.f201418b) && L.f(this.f201419c, suggestionSelected.f201419c);
        }

        public final int hashCode() {
            int iHashCode = this.f201418b.hashCode() * 31;
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201419c;
            return iHashCode + (suggestionContainer == null ? 0 : suggestionContainer.hashCode());
        }

        @k
        public final String toString() {
            return "SuggestionSelected(fieldId=" + this.f201418b + ", lastAppliedSuggestion=" + this.f201419c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f201418b);
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201419c;
            if (suggestionContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                suggestionContainer.writeToParcel(parcel, i12);
            }
        }
    }
}
