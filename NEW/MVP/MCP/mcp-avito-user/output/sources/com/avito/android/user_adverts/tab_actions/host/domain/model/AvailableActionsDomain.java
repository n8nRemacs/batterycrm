package com.avito.android.user_adverts.tab_actions.host.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: AvailableActionsDomain.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/model/AvailableActionsDomain;", "Landroid/os/Parcelable;", "ActionItem", "ActionType", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvailableActionsDomain implements Parcelable {

    @k
    public static final Parcelable.Creator<AvailableActionsDomain> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f314259b;

    /* compiled from: AvailableActionsDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/model/AvailableActionsDomain$ActionItem;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionItem implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314260b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f314261c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314262d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ActionType f314263e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final DeepLink f314264f;

        /* compiled from: AvailableActionsDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActionItem> {
            @Override // android.os.Parcelable.Creator
            public final ActionItem createFromParcel(Parcel parcel) {
                return new ActionItem(parcel.readString(), parcel.readString(), parcel.readString(), ActionType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(ActionItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ActionItem[] newArray(int i12) {
                return new ActionItem[i12];
            }
        }

        public ActionItem(@k String str, @k String str2, @k String str3, @k ActionType actionType, @k DeepLink deepLink) {
            this.f314260b = str;
            this.f314261c = str2;
            this.f314262d = str3;
            this.f314263e = actionType;
            this.f314264f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionItem)) {
                return false;
            }
            ActionItem actionItem = (ActionItem) obj;
            return L.f(this.f314260b, actionItem.f314260b) && L.f(this.f314261c, actionItem.f314261c) && L.f(this.f314262d, actionItem.f314262d) && this.f314263e == actionItem.f314263e && L.f(this.f314264f, actionItem.f314264f);
        }

        public final int hashCode() {
            return this.f314264f.hashCode() + ((this.f314263e.hashCode() + H.d(H.d(this.f314260b.hashCode() * 31, 31, this.f314261c), 31, this.f314262d)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionItem(icon=");
            sb2.append(this.f314260b);
            sb2.append(", id=");
            sb2.append(this.f314261c);
            sb2.append(", title=");
            sb2.append(this.f314262d);
            sb2.append(", type=");
            sb2.append(this.f314263e);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f314264f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f314260b);
            parcel.writeString(this.f314261c);
            parcel.writeString(this.f314262d);
            parcel.writeString(this.f314263e.name());
            parcel.writeParcelable(this.f314264f, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvailableActionsDomain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/model/AvailableActionsDomain$ActionType;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f314265b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f314266c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f314267d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f314268e;

        static {
            ActionType actionType = new ActionType("Default", 0);
            f314265b = actionType;
            ActionType actionType2 = new ActionType("Danger", 1);
            f314266c = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f314267d = actionTypeArr;
            f314268e = c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f314267d.clone();
        }
    }

    /* compiled from: AvailableActionsDomain.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvailableActionsDomain> {
        @Override // android.os.Parcelable.Creator
        public final AvailableActionsDomain createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ActionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AvailableActionsDomain(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AvailableActionsDomain[] newArray(int i12) {
            return new AvailableActionsDomain[i12];
        }
    }

    public AvailableActionsDomain(@k ArrayList arrayList) {
        this.f314259b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvailableActionsDomain) && this.f314259b.equals(((AvailableActionsDomain) obj).f314259b);
    }

    public final int hashCode() {
        return this.f314259b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("AvailableActionsDomain(actions="), this.f314259b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f314259b, parcel);
        while (itZ.hasNext()) {
            ((ActionItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
