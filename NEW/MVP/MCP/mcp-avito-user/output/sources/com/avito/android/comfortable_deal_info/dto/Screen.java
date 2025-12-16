package com.avito.android.comfortable_deal_info.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Model.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/dto/Screen;", "Landroid/os/Parcelable;", "_avito_comfortable-deal-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Screen implements Parcelable {

    @k
    public static final Parcelable.Creator<Screen> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f123485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f123486c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Action f123487d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f123488e;

    /* compiled from: Model.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Screen> {
        @Override // android.os.Parcelable.Creator
        public final Screen createFromParcel(Parcel parcel) {
            return new Screen((UniversalImage) parcel.readParcelable(Screen.class.getClassLoader()), (AttributedText) parcel.readParcelable(Screen.class.getClassLoader()), Action.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Screen[] newArray(int i12) {
            return new Screen[i12];
        }
    }

    public Screen(@k UniversalImage universalImage, @k AttributedText attributedText, @k Action action, @k String str) {
        this.f123485b = universalImage;
        this.f123486c = attributedText;
        this.f123487d = action;
        this.f123488e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) obj;
        return L.f(this.f123485b, screen.f123485b) && L.f(this.f123486c, screen.f123486c) && L.f(this.f123487d, screen.f123487d) && L.f(this.f123488e, screen.f123488e);
    }

    public final int hashCode() {
        return this.f123488e.hashCode() + ((this.f123487d.hashCode() + com.avito.android.actions_sheet.a.b(this.f123485b.hashCode() * 31, 31, this.f123486c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Screen(image=");
        sb2.append(this.f123485b);
        sb2.append(", content=");
        sb2.append(this.f123486c);
        sb2.append(", action=");
        sb2.append(this.f123487d);
        sb2.append(", pageType=");
        return C22026a.c(sb2, this.f123488e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f123485b, i12);
        parcel.writeParcelable(this.f123486c, i12);
        this.f123487d.writeToParcel(parcel, i12);
        parcel.writeString(this.f123488e);
    }
}
