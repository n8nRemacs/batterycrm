package com.avito.android.shift_list.ui.list.time_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShiftTimeItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shift_list/ui/list/time_item/Action;", "Landroid/os/Parcelable;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Action implements Parcelable {

    @k
    public static final Parcelable.Creator<Action> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281150b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f281151c;

    /* compiled from: ShiftTimeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Action> {
        @Override // android.os.Parcelable.Creator
        public final Action createFromParcel(Parcel parcel) {
            return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Action[] newArray(int i12) {
            return new Action[i12];
        }
    }

    public Action(@k String str, @k DeepLink deepLink) {
        this.f281150b = str;
        this.f281151c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return L.f(this.f281150b, action.f281150b) && L.f(this.f281151c, action.f281151c);
    }

    public final int hashCode() {
        return this.f281151c.hashCode() + (this.f281150b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Action(title=");
        sb2.append(this.f281150b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f281151c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281150b);
        parcel.writeParcelable(this.f281151c, i12);
    }
}
