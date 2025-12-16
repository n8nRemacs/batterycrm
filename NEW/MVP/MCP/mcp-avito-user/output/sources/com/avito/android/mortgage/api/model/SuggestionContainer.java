package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.suggestions.FmsUnitSuggestion;
import com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionsResponse.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "T", "Landroid/os/Parcelable;", "data", "", "valueMeta", "<init>", "(Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;Ljava/lang/String;)V", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "c", "()Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "Ljava/lang/String;", "getValueMeta", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class SuggestionContainer<T extends Suggestion> implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestionContainer<?>> CREATOR = new a();

    @c("data")
    @k
    private final T data;

    @c("value")
    @l
    private final String valueMeta;

    /* compiled from: SuggestionsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestionContainer<?>> {
        @Override // android.os.Parcelable.Creator
        public final SuggestionContainer<?> createFromParcel(Parcel parcel) {
            return new SuggestionContainer<>((Suggestion) parcel.readParcelable(SuggestionContainer.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestionContainer<?>[] newArray(int i12) {
            return new SuggestionContainer[i12];
        }
    }

    public SuggestionContainer(@k T t12, @l String str) {
        this.data = t12;
        this.valueMeta = str;
    }

    public static SuggestionContainer a(SuggestionContainer suggestionContainer, OrganizationSuggestion organizationSuggestion, String str, int i12) {
        if ((i12 & 1) != 0) {
            organizationSuggestion = suggestionContainer.data;
        }
        if ((i12 & 2) != 0) {
            str = suggestionContainer.valueMeta;
        }
        suggestionContainer.getClass();
        return new SuggestionContainer(organizationSuggestion, str);
    }

    @k
    public final T c() {
        return this.data;
    }

    public final boolean c0() {
        return this.data.c0();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionContainer)) {
            return false;
        }
        SuggestionContainer suggestionContainer = (SuggestionContainer) obj;
        return L.f(this.data, suggestionContainer.data) && L.f(this.valueMeta, suggestionContainer.valueMeta);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getSubtitle() {
        /*
            r9 = this;
            T extends com.avito.android.mortgage.api.model.suggestions.Suggestion r0 = r9.data
            boolean r1 = r0 instanceof com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion
            r2 = 0
            if (r1 == 0) goto L57
            com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion r0 = (com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion) r0
            java.lang.String r1 = r0.getInn()
            if (r1 == 0) goto L29
            int r1 = r1.length()
            if (r1 != 0) goto L16
            goto L29
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "ИНН: "
            r1.<init>(r3)
            java.lang.String r3 = r0.getInn()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L2a
        L29:
            r1 = r2
        L2a:
            com.avito.android.mortgage.api.model.SuggestionContainer r0 = r0.c()
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.getValue()
            int r3 = r0.length()
            if (r3 != 0) goto L3b
        L3a:
            r0 = r2
        L3b:
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.ArrayList r3 = kotlin.collections.C42756l.B(r0)
            r6 = 0
            r8 = 62
            java.lang.String r4 = ", "
            r5 = 0
            r7 = 0
            java.lang.String r0 = kotlin.collections.C42745f0.O(r3, r4, r5, r6, r7, r8)
            int r1 = r0.length()
            if (r1 != 0) goto L55
            goto L63
        L55:
            r2 = r0
            goto L63
        L57:
            boolean r1 = r0 instanceof com.avito.android.mortgage.api.model.suggestions.FioSuggestion
            if (r1 == 0) goto L63
            com.avito.android.mortgage.api.model.suggestions.FioSuggestion r0 = (com.avito.android.mortgage.api.model.suggestions.FioSuggestion) r0
            boolean r0 = r0.f198264b
            if (r0 == 0) goto L63
            java.lang.String r2 = "Без отчества"
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.api.model.SuggestionContainer.getSubtitle():java.lang.String");
    }

    @k
    public final String getTitle() {
        T t12 = this.data;
        if (!(t12 instanceof OrganizationSuggestion)) {
            return getValue();
        }
        String name = ((OrganizationSuggestion) t12).getName();
        return name == null ? getValue() : name;
    }

    @k
    public final String getValue() {
        T t12 = this.data;
        if (t12 instanceof FmsUnitSuggestion) {
            return C42745f0.O(C42756l.B(new String[]{((FmsUnitSuggestion) t12).getCode(), ((FmsUnitSuggestion) this.data).getName()}), ", ", null, null, null, 62);
        }
        if (t12 instanceof OrganizationSuggestion) {
            return C42745f0.O(C42756l.B(new String[]{((OrganizationSuggestion) t12).getInn(), ((OrganizationSuggestion) this.data).getName()}), ", ", null, null, null, 62);
        }
        String str = this.valueMeta;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        String str = this.valueMeta;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionContainer(data=");
        sb2.append(this.data);
        sb2.append(", valueMeta=");
        return C22026a.c(sb2, this.valueMeta, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.data, i12);
        parcel.writeString(this.valueMeta);
    }
}
