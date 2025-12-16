package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileBanner.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ@\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBanner;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "", "Lcom/avito/android/remote/model/ExtendedProfileBannerElement;", "elements", "mobileElements", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/ExtendedProfileBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "Ljava/util/List;", "getElements", "getMobileElements", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileBanner implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileBanner> CREATOR = new Creator();

    @c("content")
    @l
    private final List<ExtendedProfileBannerElement> elements;

    @c("contentMobile")
    @l
    private final List<ExtendedProfileBannerElement> mobileElements;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBanner createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(ExtendedProfileBanner.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(ExtendedProfileBanner.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new ExtendedProfileBanner(string, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBanner[] newArray(int i12) {
            return new ExtendedProfileBanner[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileBanner(@l String str, @l List<? extends ExtendedProfileBannerElement> list, @l List<? extends ExtendedProfileBannerElement> list2) {
        this.widgetName = str;
        this.elements = list;
        this.mobileElements = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileBanner copy$default(ExtendedProfileBanner extendedProfileBanner, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileBanner.widgetName;
        }
        if ((i12 & 2) != 0) {
            list = extendedProfileBanner.elements;
        }
        if ((i12 & 4) != 0) {
            list2 = extendedProfileBanner.mobileElements;
        }
        return extendedProfileBanner.copy(str, list, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    public final List<ExtendedProfileBannerElement> component2() {
        return this.elements;
    }

    @l
    public final List<ExtendedProfileBannerElement> component3() {
        return this.mobileElements;
    }

    @k
    public final ExtendedProfileBanner copy(@l String widgetName, @l List<? extends ExtendedProfileBannerElement> elements, @l List<? extends ExtendedProfileBannerElement> mobileElements) {
        return new ExtendedProfileBanner(widgetName, elements, mobileElements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileBanner)) {
            return false;
        }
        ExtendedProfileBanner extendedProfileBanner = (ExtendedProfileBanner) other;
        return L.f(this.widgetName, extendedProfileBanner.widgetName) && L.f(this.elements, extendedProfileBanner.elements) && L.f(this.mobileElements, extendedProfileBanner.mobileElements);
    }

    @l
    public final List<ExtendedProfileBannerElement> getElements() {
        return this.elements;
    }

    @l
    public final List<ExtendedProfileBannerElement> getMobileElements() {
        return this.mobileElements;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        String str = this.widgetName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ExtendedProfileBannerElement> list = this.elements;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ExtendedProfileBannerElement> list2 = this.mobileElements;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileBanner(widgetName=");
        sb2.append(this.widgetName);
        sb2.append(", elements=");
        sb2.append(this.elements);
        sb2.append(", mobileElements=");
        return H.p(sb2, this.mobileElements, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        List<ExtendedProfileBannerElement> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<ExtendedProfileBannerElement> list2 = this.mobileElements;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
