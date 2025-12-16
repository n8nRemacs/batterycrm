package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchParameters.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/SearchParameters;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/category_parameters/AdditionalCategoryParameter;", "additionalParameters", "Lcom/avito/android/remote/model/ResetAction;", "resetAction", "", "searchContext", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/ResetAction;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/avito/android/remote/model/ResetAction;", "component4", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/ResetAction;Ljava/lang/String;)Lcom/avito/android/remote/model/SearchParameters;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getParameters", "getAdditionalParameters", "Lcom/avito/android/remote/model/ResetAction;", "getResetAction", "Ljava/lang/String;", "getSearchContext", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SearchParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchParameters> CREATOR = new Creator();

    @c("additionalParams")
    @l
    private final List<AdditionalCategoryParameter> additionalParameters;

    @c("params")
    @k
    private final List<ParameterSlot> parameters;

    @c("resetAction")
    @l
    private final ResetAction resetAction;

    @c("context")
    @l
    private final String searchContext;

    /* compiled from: SearchParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParameters createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = a.l(SearchParameters.class, parcel, arrayList2, iL3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(SearchParameters.class, parcel, arrayList, iL2, 1);
                }
            }
            return new SearchParameters(arrayList2, arrayList, parcel.readInt() != 0 ? ResetAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParameters[] newArray(int i12) {
            return new SearchParameters[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchParameters(@k List<? extends ParameterSlot> list, @l List<? extends AdditionalCategoryParameter> list2, @l ResetAction resetAction, @l String str) {
        this.parameters = list;
        this.additionalParameters = list2;
        this.resetAction = resetAction;
        this.searchContext = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchParameters copy$default(SearchParameters searchParameters, List list, List list2, ResetAction resetAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = searchParameters.parameters;
        }
        if ((i12 & 2) != 0) {
            list2 = searchParameters.additionalParameters;
        }
        if ((i12 & 4) != 0) {
            resetAction = searchParameters.resetAction;
        }
        if ((i12 & 8) != 0) {
            str = searchParameters.searchContext;
        }
        return searchParameters.copy(list, list2, resetAction, str);
    }

    @k
    public final List<ParameterSlot> component1() {
        return this.parameters;
    }

    @l
    public final List<AdditionalCategoryParameter> component2() {
        return this.additionalParameters;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ResetAction getResetAction() {
        return this.resetAction;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSearchContext() {
        return this.searchContext;
    }

    @k
    public final SearchParameters copy(@k List<? extends ParameterSlot> parameters, @l List<? extends AdditionalCategoryParameter> additionalParameters, @l ResetAction resetAction, @l String searchContext) {
        return new SearchParameters(parameters, additionalParameters, resetAction, searchContext);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchParameters)) {
            return false;
        }
        SearchParameters searchParameters = (SearchParameters) other;
        return L.f(this.parameters, searchParameters.parameters) && L.f(this.additionalParameters, searchParameters.additionalParameters) && L.f(this.resetAction, searchParameters.resetAction) && L.f(this.searchContext, searchParameters.searchContext);
    }

    @l
    public final List<AdditionalCategoryParameter> getAdditionalParameters() {
        return this.additionalParameters;
    }

    @k
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @l
    public final ResetAction getResetAction() {
        return this.resetAction;
    }

    @l
    public final String getSearchContext() {
        return this.searchContext;
    }

    public int hashCode() {
        int iHashCode = this.parameters.hashCode() * 31;
        List<AdditionalCategoryParameter> list = this.additionalParameters;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ResetAction resetAction = this.resetAction;
        int iHashCode3 = (iHashCode2 + (resetAction == null ? 0 : resetAction.hashCode())) * 31;
        String str = this.searchContext;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchParameters(parameters=");
        sb2.append(this.parameters);
        sb2.append(", additionalParameters=");
        sb2.append(this.additionalParameters);
        sb2.append(", resetAction=");
        sb2.append(this.resetAction);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.searchContext, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.parameters, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<AdditionalCategoryParameter> list = this.additionalParameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ResetAction resetAction = this.resetAction;
        if (resetAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resetAction.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.searchContext);
    }
}
