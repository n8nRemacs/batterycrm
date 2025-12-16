package com.avito.android.rubricator.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RubricatorRefinedItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "SerpRubricatorCategoryItem", "SerpRubricatorGridServiceItem", "SerpRubricatorLinearServiceItem", "SerpRubricatorServiceItem", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorCategoryItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorServiceItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RubricatorRefinedItem extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: RubricatorRefinedItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorServiceItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorGridServiceItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorLinearServiceItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SerpRubricatorServiceItem extends RubricatorRefinedItem {

        /* compiled from: RubricatorRefinedItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        @k
        List<RubricatorWidget.RubricatorWidgetAction> e1();

        @l
        /* renamed from: getDisplayTitle */
        String getF255772e();
    }

    /* compiled from: RubricatorRefinedItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: RubricatorRefinedItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorCategoryItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SerpRubricatorCategoryItem implements RubricatorRefinedItem {

        @k
        public static final Parcelable.Creator<SerpRubricatorCategoryItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255754b;

        /* renamed from: c, reason: collision with root package name */
        public final int f255755c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f255756d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f255757e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final UniversalImage f255758f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Analytics f255759g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<RubricatorWidget.RubricatorWidgetAction> f255760h;

        /* compiled from: RubricatorRefinedItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SerpRubricatorCategoryItem> {
            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorCategoryItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SerpRubricatorCategoryItem.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SerpRubricatorCategoryItem.class.getClassLoader());
                Analytics analytics = (Analytics) parcel.readParcelable(SerpRubricatorCategoryItem.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(SerpRubricatorCategoryItem.class, parcel, arrayList, iL2, 1);
                }
                return new SerpRubricatorCategoryItem(string, i12, string2, deepLink, universalImage, analytics, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorCategoryItem[] newArray(int i12) {
                return new SerpRubricatorCategoryItem[i12];
            }
        }

        public SerpRubricatorCategoryItem(@k String str, int i12, @k String str2, @l DeepLink deepLink, @l UniversalImage universalImage, @l Analytics analytics, @k List<RubricatorWidget.RubricatorWidgetAction> list) {
            this.f255754b = str;
            this.f255755c = i12;
            this.f255756d = str2;
            this.f255757e = deepLink;
            this.f255758f = universalImage;
            this.f255759g = analytics;
            this.f255760h = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerpRubricatorCategoryItem)) {
                return false;
            }
            SerpRubricatorCategoryItem serpRubricatorCategoryItem = (SerpRubricatorCategoryItem) obj;
            return L.f(this.f255754b, serpRubricatorCategoryItem.f255754b) && this.f255755c == serpRubricatorCategoryItem.f255755c && L.f(this.f255756d, serpRubricatorCategoryItem.f255756d) && L.f(this.f255757e, serpRubricatorCategoryItem.f255757e) && L.f(this.f255758f, serpRubricatorCategoryItem.f255758f) && L.f(this.f255759g, serpRubricatorCategoryItem.f255759g) && L.f(this.f255760h, serpRubricatorCategoryItem.f255760h);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF247713b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF247714c() {
            return this.f255754b;
        }

        public final int hashCode() {
            int iD2 = H.d(r.e(this.f255755c, this.f255754b.hashCode() * 31, 31), 31, this.f255756d);
            DeepLink deepLink = this.f255757e;
            int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f255758f;
            int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            Analytics analytics = this.f255759g;
            return this.f255760h.hashCode() + ((iHashCode2 + (analytics != null ? analytics.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SerpRubricatorCategoryItem(stringId=");
            sb2.append(this.f255754b);
            sb2.append(", widgetPosition=");
            sb2.append(this.f255755c);
            sb2.append(", text=");
            sb2.append(this.f255756d);
            sb2.append(", deepLink=");
            sb2.append(this.f255757e);
            sb2.append(", icon=");
            sb2.append(this.f255758f);
            sb2.append(", analytics=");
            sb2.append(this.f255759g);
            sb2.append(", subCategories=");
            return H.p(sb2, this.f255760h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f255754b);
            parcel.writeInt(this.f255755c);
            parcel.writeString(this.f255756d);
            parcel.writeParcelable(this.f255757e, i12);
            parcel.writeParcelable(this.f255758f, i12);
            parcel.writeParcelable(this.f255759g, i12);
            Iterator itJ = C0.j(this.f255760h, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }

        public /* synthetic */ SerpRubricatorCategoryItem(String str, int i12, String str2, DeepLink deepLink, UniversalImage universalImage, Analytics analytics, List list, int i13, C42822w c42822w) {
            this(str, i12, str2, deepLink, (i13 & 16) != 0 ? null : universalImage, analytics, list);
        }
    }

    /* compiled from: RubricatorRefinedItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorGridServiceItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorServiceItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SerpRubricatorGridServiceItem implements SerpRubricatorServiceItem {

        @k
        public static final Parcelable.Creator<SerpRubricatorGridServiceItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255761b;

        /* renamed from: c, reason: collision with root package name */
        public final int f255762c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f255763d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f255764e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f255765f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final UniversalImage f255766g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<RubricatorWidget.RubricatorWidgetAction> f255767h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Analytics f255768i;

        /* compiled from: RubricatorRefinedItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SerpRubricatorGridServiceItem> {
            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorGridServiceItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SerpRubricatorGridServiceItem.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SerpRubricatorGridServiceItem.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(SerpRubricatorGridServiceItem.class, parcel, arrayList, iL2, 1);
                }
                return new SerpRubricatorGridServiceItem(string, i12, string2, string3, deepLink, universalImage, arrayList, (Analytics) parcel.readParcelable(SerpRubricatorGridServiceItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorGridServiceItem[] newArray(int i12) {
                return new SerpRubricatorGridServiceItem[i12];
            }
        }

        public SerpRubricatorGridServiceItem(@k String str, int i12, @k String str2, @l String str3, @l DeepLink deepLink, @l UniversalImage universalImage, @k List<RubricatorWidget.RubricatorWidgetAction> list, @l Analytics analytics) {
            this.f255761b = str;
            this.f255762c = i12;
            this.f255763d = str2;
            this.f255764e = str3;
            this.f255765f = deepLink;
            this.f255766g = universalImage;
            this.f255767h = list;
            this.f255768i = analytics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.rubricator.items.RubricatorRefinedItem.SerpRubricatorServiceItem
        @k
        public final List<RubricatorWidget.RubricatorWidgetAction> e1() {
            return this.f255767h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerpRubricatorGridServiceItem)) {
                return false;
            }
            SerpRubricatorGridServiceItem serpRubricatorGridServiceItem = (SerpRubricatorGridServiceItem) obj;
            return L.f(this.f255761b, serpRubricatorGridServiceItem.f255761b) && this.f255762c == serpRubricatorGridServiceItem.f255762c && L.f(this.f255763d, serpRubricatorGridServiceItem.f255763d) && L.f(this.f255764e, serpRubricatorGridServiceItem.f255764e) && L.f(this.f255765f, serpRubricatorGridServiceItem.f255765f) && L.f(this.f255766g, serpRubricatorGridServiceItem.f255766g) && L.f(this.f255767h, serpRubricatorGridServiceItem.f255767h) && L.f(this.f255768i, serpRubricatorGridServiceItem.f255768i);
        }

        @Override // com.avito.android.rubricator.items.RubricatorRefinedItem.SerpRubricatorServiceItem
        @l
        /* renamed from: getDisplayTitle, reason: from getter */
        public final String getF255772e() {
            return this.f255764e;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF247713b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF247714c() {
            return this.f255761b;
        }

        public final int hashCode() {
            int iD2 = H.d(r.e(this.f255762c, this.f255761b.hashCode() * 31, 31), 31, this.f255763d);
            String str = this.f255764e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f255765f;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f255766g;
            int iE2 = H.e((iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f255767h);
            Analytics analytics = this.f255768i;
            return iE2 + (analytics != null ? analytics.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "SerpRubricatorGridServiceItem(stringId=" + this.f255761b + ", widgetPosition=" + this.f255762c + ", text=" + this.f255763d + ", displayTitle=" + this.f255764e + ", deepLink=" + this.f255765f + ", icon=" + this.f255766g + ", subServices=" + this.f255767h + ", analytics=" + this.f255768i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f255761b);
            parcel.writeInt(this.f255762c);
            parcel.writeString(this.f255763d);
            parcel.writeString(this.f255764e);
            parcel.writeParcelable(this.f255765f, i12);
            parcel.writeParcelable(this.f255766g, i12);
            Iterator itJ = C0.j(this.f255767h, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f255768i, i12);
        }

        public /* synthetic */ SerpRubricatorGridServiceItem(String str, int i12, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, List list, Analytics analytics, int i13, C42822w c42822w) {
            this(str, i12, str2, str3, deepLink, (i13 & 32) != 0 ? null : universalImage, list, analytics);
        }
    }

    /* compiled from: RubricatorRefinedItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorLinearServiceItem;", "Lcom/avito/android/rubricator/items/RubricatorRefinedItem$SerpRubricatorServiceItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SerpRubricatorLinearServiceItem implements SerpRubricatorServiceItem {

        @k
        public static final Parcelable.Creator<SerpRubricatorLinearServiceItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255769b;

        /* renamed from: c, reason: collision with root package name */
        public final int f255770c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f255771d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f255772e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f255773f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final UniversalImage f255774g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<RubricatorWidget.RubricatorWidgetAction> f255775h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Analytics f255776i;

        /* compiled from: RubricatorRefinedItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SerpRubricatorLinearServiceItem> {
            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorLinearServiceItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SerpRubricatorLinearServiceItem.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SerpRubricatorLinearServiceItem.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(SerpRubricatorLinearServiceItem.class, parcel, arrayList, iL2, 1);
                }
                return new SerpRubricatorLinearServiceItem(string, i12, string2, string3, deepLink, universalImage, arrayList, (Analytics) parcel.readParcelable(SerpRubricatorLinearServiceItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SerpRubricatorLinearServiceItem[] newArray(int i12) {
                return new SerpRubricatorLinearServiceItem[i12];
            }
        }

        public SerpRubricatorLinearServiceItem(@k String str, int i12, @k String str2, @l String str3, @l DeepLink deepLink, @l UniversalImage universalImage, @k List<RubricatorWidget.RubricatorWidgetAction> list, @l Analytics analytics) {
            this.f255769b = str;
            this.f255770c = i12;
            this.f255771d = str2;
            this.f255772e = str3;
            this.f255773f = deepLink;
            this.f255774g = universalImage;
            this.f255775h = list;
            this.f255776i = analytics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.rubricator.items.RubricatorRefinedItem.SerpRubricatorServiceItem
        @k
        public final List<RubricatorWidget.RubricatorWidgetAction> e1() {
            return this.f255775h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerpRubricatorLinearServiceItem)) {
                return false;
            }
            SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem = (SerpRubricatorLinearServiceItem) obj;
            return L.f(this.f255769b, serpRubricatorLinearServiceItem.f255769b) && this.f255770c == serpRubricatorLinearServiceItem.f255770c && L.f(this.f255771d, serpRubricatorLinearServiceItem.f255771d) && L.f(this.f255772e, serpRubricatorLinearServiceItem.f255772e) && L.f(this.f255773f, serpRubricatorLinearServiceItem.f255773f) && L.f(this.f255774g, serpRubricatorLinearServiceItem.f255774g) && L.f(this.f255775h, serpRubricatorLinearServiceItem.f255775h) && L.f(this.f255776i, serpRubricatorLinearServiceItem.f255776i);
        }

        @Override // com.avito.android.rubricator.items.RubricatorRefinedItem.SerpRubricatorServiceItem
        @l
        /* renamed from: getDisplayTitle, reason: from getter */
        public final String getF255772e() {
            return this.f255772e;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF247713b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF247714c() {
            return this.f255769b;
        }

        public final int hashCode() {
            int iD2 = H.d(r.e(this.f255770c, this.f255769b.hashCode() * 31, 31), 31, this.f255771d);
            String str = this.f255772e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f255773f;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            UniversalImage universalImage = this.f255774g;
            int iE2 = H.e((iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f255775h);
            Analytics analytics = this.f255776i;
            return iE2 + (analytics != null ? analytics.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "SerpRubricatorLinearServiceItem(stringId=" + this.f255769b + ", widgetPosition=" + this.f255770c + ", text=" + this.f255771d + ", displayTitle=" + this.f255772e + ", deepLink=" + this.f255773f + ", icon=" + this.f255774g + ", subServices=" + this.f255775h + ", analytics=" + this.f255776i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f255769b);
            parcel.writeInt(this.f255770c);
            parcel.writeString(this.f255771d);
            parcel.writeString(this.f255772e);
            parcel.writeParcelable(this.f255773f, i12);
            parcel.writeParcelable(this.f255774g, i12);
            Iterator itJ = C0.j(this.f255775h, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f255776i, i12);
        }

        public /* synthetic */ SerpRubricatorLinearServiceItem(String str, int i12, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, List list, Analytics analytics, int i13, C42822w c42822w) {
            this(str, i12, str2, str3, deepLink, (i13 & 32) != 0 ? null : universalImage, list, analytics);
        }
    }
}
