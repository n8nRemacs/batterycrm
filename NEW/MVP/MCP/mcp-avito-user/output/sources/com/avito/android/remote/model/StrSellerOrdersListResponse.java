package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.O2;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u0019R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0011R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b8\u0010\u0011R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u00078F¢\u0006\u0006\u001a\u0004\b:\u0010\u0011¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrdersListResponse;", "Landroid/os/Parcelable;", "", "title", "header", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingDeeplink", "", "Lcom/avito/android/remote/model/StrSellerOrdersListSection;", "_sections", "Lcom/avito/android/remote/model/StrSellerOrdersScreenWidget;", "_widgets", "Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;", "importantToNote", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;)V", "component4", "()Ljava/util/List;", "component5", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "()Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;)Lcom/avito/android/remote/model/StrSellerOrdersListResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getHeader", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnboardingDeeplink", "Ljava/util/List;", "Lcom/avito/android/remote/model/StrSellerOrdersImportantToNote;", "getImportantToNote", "getNotEmptySections", "getNotEmptySections$annotations", "()V", "notEmptySections", "getSections", "sections", "getWidgets", "widgets", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrdersListResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrdersListResponse> CREATOR = new Creator();

    @c("sections")
    @l
    private final List<StrSellerOrdersListSection> _sections;

    @c("widgets")
    @l
    private final List<StrSellerOrdersScreenWidget> _widgets;

    @c("header")
    @l
    private final String header;

    @c("importantToNote")
    @l
    private final StrSellerOrdersImportantToNote importantToNote;

    @c("onboardingDeeplink")
    @l
    private final DeepLink onboardingDeeplink;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrdersListResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StrSellerOrdersListResponse.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(StrSellerOrdersListSection.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(StrSellerOrdersScreenWidget.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new StrSellerOrdersListResponse(string, string2, deepLink, arrayList, arrayList2, parcel.readInt() != 0 ? StrSellerOrdersImportantToNote.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListResponse[] newArray(int i12) {
            return new StrSellerOrdersListResponse[i12];
        }
    }

    public StrSellerOrdersListResponse(@l String str, @l String str2, @l DeepLink deepLink, @l List<StrSellerOrdersListSection> list, @l List<StrSellerOrdersScreenWidget> list2, @l StrSellerOrdersImportantToNote strSellerOrdersImportantToNote) {
        this.title = str;
        this.header = str2;
        this.onboardingDeeplink = deepLink;
        this._sections = list;
        this._widgets = list2;
        this.importantToNote = strSellerOrdersImportantToNote;
    }

    private final List<StrSellerOrdersListSection> component4() {
        return this._sections;
    }

    private final List<StrSellerOrdersScreenWidget> component5() {
        return this._widgets;
    }

    public static /* synthetic */ StrSellerOrdersListResponse copy$default(StrSellerOrdersListResponse strSellerOrdersListResponse, String str, String str2, DeepLink deepLink, List list, List list2, StrSellerOrdersImportantToNote strSellerOrdersImportantToNote, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strSellerOrdersListResponse.title;
        }
        if ((i12 & 2) != 0) {
            str2 = strSellerOrdersListResponse.header;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            deepLink = strSellerOrdersListResponse.onboardingDeeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            list = strSellerOrdersListResponse._sections;
        }
        List list3 = list;
        if ((i12 & 16) != 0) {
            list2 = strSellerOrdersListResponse._widgets;
        }
        List list4 = list2;
        if ((i12 & 32) != 0) {
            strSellerOrdersImportantToNote = strSellerOrdersListResponse.importantToNote;
        }
        return strSellerOrdersListResponse.copy(str, str3, deepLink2, list3, list4, strSellerOrdersImportantToNote);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getOnboardingDeeplink() {
        return this.onboardingDeeplink;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final StrSellerOrdersImportantToNote getImportantToNote() {
        return this.importantToNote;
    }

    @k
    public final StrSellerOrdersListResponse copy(@l String title, @l String header, @l DeepLink onboardingDeeplink, @l List<StrSellerOrdersListSection> _sections, @l List<StrSellerOrdersScreenWidget> _widgets, @l StrSellerOrdersImportantToNote importantToNote) {
        return new StrSellerOrdersListResponse(title, header, onboardingDeeplink, _sections, _widgets, importantToNote);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrdersListResponse)) {
            return false;
        }
        StrSellerOrdersListResponse strSellerOrdersListResponse = (StrSellerOrdersListResponse) other;
        return L.f(this.title, strSellerOrdersListResponse.title) && L.f(this.header, strSellerOrdersListResponse.header) && L.f(this.onboardingDeeplink, strSellerOrdersListResponse.onboardingDeeplink) && L.f(this._sections, strSellerOrdersListResponse._sections) && L.f(this._widgets, strSellerOrdersListResponse._widgets) && L.f(this.importantToNote, strSellerOrdersListResponse.importantToNote);
    }

    @l
    public final String getHeader() {
        return this.header;
    }

    @l
    public final StrSellerOrdersImportantToNote getImportantToNote() {
        return this.importantToNote;
    }

    @k
    public final List<StrSellerOrdersListSection> getNotEmptySections() {
        List<StrSellerOrdersListSection> sections = getSections();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            if (O2.a(((StrSellerOrdersListSection) obj).getOrders())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @l
    public final DeepLink getOnboardingDeeplink() {
        return this.onboardingDeeplink;
    }

    @k
    public final List<StrSellerOrdersListSection> getSections() {
        List<StrSellerOrdersListSection> list = this._sections;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<StrSellerOrdersScreenWidget> getWidgets() {
        List<StrSellerOrdersScreenWidget> list = this._widgets;
        return list == null ? C42784z0.f406748b : list;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.header;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.onboardingDeeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<StrSellerOrdersListSection> list = this._sections;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<StrSellerOrdersScreenWidget> list2 = this._widgets;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote = this.importantToNote;
        return iHashCode5 + (strSellerOrdersImportantToNote != null ? strSellerOrdersImportantToNote.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrSellerOrdersListResponse(title=" + this.title + ", header=" + this.header + ", onboardingDeeplink=" + this.onboardingDeeplink + ", _sections=" + this._sections + ", _widgets=" + this._widgets + ", importantToNote=" + this.importantToNote + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.header);
        parcel.writeParcelable(this.onboardingDeeplink, flags);
        List<StrSellerOrdersListSection> list = this._sections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrSellerOrdersListSection) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<StrSellerOrdersScreenWidget> list2 = this._widgets;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((StrSellerOrdersScreenWidget) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote = this.importantToNote;
        if (strSellerOrdersImportantToNote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerOrdersImportantToNote.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getNotEmptySections$annotations() {
    }
}
