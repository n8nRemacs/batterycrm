package com.avito.android.advert_item_actions;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.AdvertItemActions;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AdvertItemActionsDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final /* data */ class AdvertItemActionsDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<AdvertItemActionsDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85810b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AdvertItemActions f85811c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f85812d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f85813e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f85814f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f85815g;

    /* compiled from: AdvertItemActionsDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertItemActionsDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertItemActionsDeeplink createFromParcel(Parcel parcel) {
            return new AdvertItemActionsDeeplink(parcel.readString(), (AdvertItemActions) parcel.readParcelable(AdvertItemActionsDeeplink.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertItemActionsDeeplink[] newArray(int i12) {
            return new AdvertItemActionsDeeplink[i12];
        }
    }

    /* compiled from: AdvertItemActionsDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$a;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$b;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$c;", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: AdvertItemActionsDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$a;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b;", "LJu/a$a;", "<init>", "()V", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f85816b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: AdvertItemActionsDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$b;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b;", "LJu/a$a;", "<init>", "()V", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert_item_actions.AdvertItemActionsDeeplink$b$b, reason: collision with other inner class name */
        public static final class C2558b extends b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C2558b f85817b = new C2558b();

            public C2558b() {
                super(null);
            }
        }

        /* compiled from: AdvertItemActionsDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b$c;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink$b;", "LJu/a$b;", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f85818b;

            public c(@k String str) {
                super(null);
                this.f85818b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f85818b, ((c) obj).f85818b);
            }

            public final int hashCode() {
                return this.f85818b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("HideItem(itemId="), this.f85818b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AdvertItemActionsDeeplink(@k String str, @l AdvertItemActions advertItemActions, @l String str2, @l Integer num, @l String str3, @l Integer num2) {
        this.f85810b = str;
        this.f85811c = advertItemActions;
        this.f85812d = str2;
        this.f85813e = num;
        this.f85814f = str3;
        this.f85815g = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertItemActionsDeeplink)) {
            return false;
        }
        AdvertItemActionsDeeplink advertItemActionsDeeplink = (AdvertItemActionsDeeplink) obj;
        return L.f(this.f85810b, advertItemActionsDeeplink.f85810b) && L.f(this.f85811c, advertItemActionsDeeplink.f85811c) && L.f(this.f85812d, advertItemActionsDeeplink.f85812d) && L.f(this.f85813e, advertItemActionsDeeplink.f85813e) && L.f(this.f85814f, advertItemActionsDeeplink.f85814f) && L.f(this.f85815g, advertItemActionsDeeplink.f85815g);
    }

    public final int hashCode() {
        int iHashCode = this.f85810b.hashCode() * 31;
        AdvertItemActions advertItemActions = this.f85811c;
        int iHashCode2 = (iHashCode + (advertItemActions == null ? 0 : advertItemActions.hashCode())) * 31;
        String str = this.f85812d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f85813e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f85814f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f85815g;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertItemActionsDeeplink(id=");
        sb2.append(this.f85810b);
        sb2.append(", actions=");
        sb2.append(this.f85811c);
        sb2.append(", categoryId=");
        sb2.append(this.f85812d);
        sb2.append(", locationId=");
        sb2.append(this.f85813e);
        sb2.append(", feedId=");
        sb2.append(this.f85814f);
        sb2.append(", position=");
        return s.j(sb2, this.f85815g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85810b);
        parcel.writeParcelable(this.f85811c, i12);
        parcel.writeString(this.f85812d);
        Integer num = this.f85813e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f85814f);
        Integer num2 = this.f85815g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
