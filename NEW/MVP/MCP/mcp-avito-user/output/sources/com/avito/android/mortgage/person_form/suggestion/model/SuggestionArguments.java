package com.avito.android.mortgage.person_form.suggestion.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/model/SuggestionArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SuggestionArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestionArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f201410b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f201411c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f201412d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f201413e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SuggestFormSuggestType f201414f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f201415g;

    /* compiled from: SuggestionArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestionArguments> {
        @Override // android.os.Parcelable.Creator
        public final SuggestionArguments createFromParcel(Parcel parcel) {
            return new SuggestionArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), SuggestFormSuggestType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestionArguments[] newArray(int i12) {
            return new SuggestionArguments[i12];
        }
    }

    public SuggestionArguments(@k String str, @k String str2, @k String str3, @k String str4, @k SuggestFormSuggestType suggestFormSuggestType, @k String str5) {
        this.f201410b = str;
        this.f201411c = str2;
        this.f201412d = str3;
        this.f201413e = str4;
        this.f201414f = suggestFormSuggestType;
        this.f201415g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionArguments)) {
            return false;
        }
        SuggestionArguments suggestionArguments = (SuggestionArguments) obj;
        return L.f(this.f201410b, suggestionArguments.f201410b) && L.f(this.f201411c, suggestionArguments.f201411c) && L.f(this.f201412d, suggestionArguments.f201412d) && L.f(this.f201413e, suggestionArguments.f201413e) && this.f201414f == suggestionArguments.f201414f && L.f(this.f201415g, suggestionArguments.f201415g);
    }

    public final int hashCode() {
        return this.f201415g.hashCode() + ((this.f201414f.hashCode() + H.d(H.d(H.d(this.f201410b.hashCode() * 31, 31, this.f201411c), 31, this.f201412d), 31, this.f201413e)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionArguments(fieldId=");
        sb2.append(this.f201410b);
        sb2.append(", fieldTitle=");
        sb2.append(this.f201411c);
        sb2.append(", fieldValue=");
        sb2.append(this.f201412d);
        sb2.append(", fieldHint=");
        sb2.append(this.f201413e);
        sb2.append(", fieldContentType=");
        sb2.append(this.f201414f);
        sb2.append(", requestId=");
        return C22026a.c(sb2, this.f201415g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f201410b);
        parcel.writeString(this.f201411c);
        parcel.writeString(this.f201412d);
        parcel.writeString(this.f201413e);
        parcel.writeString(this.f201414f.name());
        parcel.writeString(this.f201415g);
    }
}
