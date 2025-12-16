package com.avito.android.feeds_global;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SerpElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedsGlobalWidget.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/feeds_global/FeedsGlobalWidget;", "Lcom/avito/android/remote/model/SerpElement;", "", "Lcom/avito/android/feeds_global/FeedsGlobalWidget$FeedsTab;", "tabs", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "FeedsTab", "_avito_bx-content_widget_feeds-global_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedsGlobalWidget implements SerpElement {

    @Y61.k
    public static final Parcelable.Creator<FeedsGlobalWidget> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f157918b;

    @com.google.gson.annotations.c("tabs")
    @Y61.l
    private final List<FeedsTab> tabs;

    /* compiled from: FeedsGlobalWidget.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/feeds_global/FeedsGlobalWidget$FeedsTab;", "Landroid/os/Parcelable;", "", "feedId", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getTitle", "_avito_bx-content_widget_feeds-global_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeedsTab implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<FeedsTab> CREATOR = new a();

        @com.google.gson.annotations.c("feedId")
        @Y61.k
        private final String feedId;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: FeedsGlobalWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FeedsTab> {
            @Override // android.os.Parcelable.Creator
            public final FeedsTab createFromParcel(Parcel parcel) {
                return new FeedsTab(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FeedsTab[] newArray(int i12) {
                return new FeedsTab[i12];
            }
        }

        public FeedsTab(@Y61.k String str, @Y61.k String str2) {
            this.feedId = str;
            this.title = str2;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getFeedId() {
            return this.feedId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedsTab)) {
                return false;
            }
            FeedsTab feedsTab = (FeedsTab) obj;
            return L.f(this.feedId, feedsTab.feedId) && L.f(this.title, feedsTab.title);
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.feedId.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FeedsTab(feedId=");
            sb2.append(this.feedId);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.feedId);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: FeedsGlobalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeedsGlobalWidget> {
        @Override // android.os.Parcelable.Creator
        public final FeedsGlobalWidget createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(FeedsTab.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FeedsGlobalWidget(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FeedsGlobalWidget[] newArray(int i12) {
            return new FeedsGlobalWidget[i12];
        }
    }

    public FeedsGlobalWidget(@Y61.l List<FeedsTab> list) {
        this.tabs = list;
    }

    @Y61.l
    public final List<FeedsTab> c() {
        return this.tabs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsGlobalWidget) && L.f(this.tabs, ((FeedsGlobalWidget) obj).tabs);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final long getUniqueId() {
        return this.f157918b;
    }

    public final int hashCode() {
        List<FeedsTab> list = this.tabs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f157918b = j12;
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("FeedsGlobalWidget(tabs="), this.tabs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<FeedsTab> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((FeedsTab) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
