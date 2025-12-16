package com.avito.android.promo_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoSnippetState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo_snippet/ActionButton;", "Landroid/os/Parcelable;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ActionButton implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231690b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f231691c;

    /* compiled from: PromoSnippetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionButton> {
        @Override // android.os.Parcelable.Creator
        public final ActionButton createFromParcel(Parcel parcel) {
            return new ActionButton(parcel.readString(), (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionButton[] newArray(int i12) {
            return new ActionButton[i12];
        }
    }

    public ActionButton(@k String str, @k DeepLink deepLink) {
        this.f231690b = str;
        this.f231691c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return L.f(this.f231690b, actionButton.f231690b) && L.f(this.f231691c, actionButton.f231691c);
    }

    public final int hashCode() {
        return this.f231691c.hashCode() + (this.f231690b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionButton(title=");
        sb2.append(this.f231690b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f231691c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231690b);
        parcel.writeParcelable(this.f231691c, i12);
    }
}
