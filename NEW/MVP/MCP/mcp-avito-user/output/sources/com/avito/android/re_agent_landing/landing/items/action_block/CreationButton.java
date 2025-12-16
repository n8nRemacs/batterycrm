package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/CreationButton;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreationButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CreationButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250717b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f250718c;

    /* compiled from: ActionBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreationButton> {
        @Override // android.os.Parcelable.Creator
        public final CreationButton createFromParcel(Parcel parcel) {
            return new CreationButton(parcel.readString(), (DeepLink) parcel.readParcelable(CreationButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreationButton[] newArray(int i12) {
            return new CreationButton[i12];
        }
    }

    public CreationButton(@k String str, @l DeepLink deepLink) {
        this.f250717b = str;
        this.f250718c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationButton)) {
            return false;
        }
        CreationButton creationButton = (CreationButton) obj;
        return L.f(this.f250717b, creationButton.f250717b) && L.f(this.f250718c, creationButton.f250718c);
    }

    public final int hashCode() {
        int iHashCode = this.f250717b.hashCode() * 31;
        DeepLink deepLink = this.f250718c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationButton(title=");
        sb2.append(this.f250717b);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f250718c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250717b);
        parcel.writeParcelable(this.f250718c, i12);
    }
}
