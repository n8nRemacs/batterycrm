package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.Filter;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchFormResult.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/Form;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/search/Filter;", "filters", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "additionalAction", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetSubmitParam;", "submitParams", "", "selectedFiltersCount", "Lcom/avito/android/remote/model/vertical_main/BottomContent;", "bottomContent", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/vertical_main/BottomContent;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "getAction", "()Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAdditionalAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getSubmitParams", "Ljava/lang/Integer;", "getSelectedFiltersCount", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/vertical_main/BottomContent;", "getBottomContent", "()Lcom/avito/android/remote/model/vertical_main/BottomContent;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Form implements Parcelable {

    @k
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    @c("action")
    @k
    private final SearchFormWidgetAction action;

    @c("additionalAction")
    @l
    private final DeepLink additionalAction;

    @c("bottomContent")
    @l
    private final BottomContent bottomContent;

    @c("filters")
    @k
    private final List<Filter> filters;

    @c("selectedFiltersCount")
    @l
    private final Integer selectedFiltersCount;

    @c("submitParams")
    @k
    private final List<SearchFormWidgetSubmitParam> submitParams;

    /* compiled from: SearchFormResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Form createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(Filter.CREATOR, parcel, arrayList, iC3, 1);
            }
            SearchFormWidgetAction searchFormWidgetActionCreateFromParcel = SearchFormWidgetAction.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(Form.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(SearchFormWidgetSubmitParam.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new Form(arrayList, searchFormWidgetActionCreateFromParcel, deepLink, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BottomContent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Form[] newArray(int i12) {
            return new Form[i12];
        }
    }

    public Form(@k List<Filter> list, @k SearchFormWidgetAction searchFormWidgetAction, @l DeepLink deepLink, @k List<SearchFormWidgetSubmitParam> list2, @l Integer num, @l BottomContent bottomContent) {
        this.filters = list;
        this.action = searchFormWidgetAction;
        this.additionalAction = deepLink;
        this.submitParams = list2;
        this.selectedFiltersCount = num;
        this.bottomContent = bottomContent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final SearchFormWidgetAction getAction() {
        return this.action;
    }

    @l
    public final DeepLink getAdditionalAction() {
        return this.additionalAction;
    }

    @l
    public final BottomContent getBottomContent() {
        return this.bottomContent;
    }

    @k
    public final List<Filter> getFilters() {
        return this.filters;
    }

    @l
    public final Integer getSelectedFiltersCount() {
        return this.selectedFiltersCount;
    }

    @k
    public final List<SearchFormWidgetSubmitParam> getSubmitParams() {
        return this.submitParams;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.filters, parcel);
        while (itJ.hasNext()) {
            ((Filter) itJ.next()).writeToParcel(parcel, flags);
        }
        this.action.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.additionalAction, flags);
        Iterator itJ2 = C0.j(this.submitParams, parcel);
        while (itJ2.hasNext()) {
            ((SearchFormWidgetSubmitParam) itJ2.next()).writeToParcel(parcel, flags);
        }
        Integer num = this.selectedFiltersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        BottomContent bottomContent = this.bottomContent;
        if (bottomContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomContent.writeToParcel(parcel, flags);
        }
    }

    public Form(List list, SearchFormWidgetAction searchFormWidgetAction, DeepLink deepLink, List list2, Integer num, BottomContent bottomContent, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, searchFormWidgetAction, deepLink, (i12 & 8) != 0 ? C42784z0.f406748b : list2, num, (i12 & 32) != 0 ? null : bottomContent);
    }
}
