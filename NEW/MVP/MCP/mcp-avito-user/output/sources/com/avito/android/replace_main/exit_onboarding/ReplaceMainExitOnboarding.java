package com.avito.android.replace_main.exit_onboarding;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReplaceMainExitOnboarding.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/exit_onboarding/ReplaceMainExitOnboarding;", "Landroid/os/Parcelable;", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReplaceMainExitOnboarding implements Parcelable {

    @k
    public static final Parcelable.Creator<ReplaceMainExitOnboarding> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f254501c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f254502d;

    /* compiled from: ReplaceMainExitOnboarding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReplaceMainExitOnboarding> {
        @Override // android.os.Parcelable.Creator
        public final ReplaceMainExitOnboarding createFromParcel(Parcel parcel) {
            return new ReplaceMainExitOnboarding((PrintableText) parcel.readParcelable(ReplaceMainExitOnboarding.class.getClassLoader()), (PrintableText) parcel.readParcelable(ReplaceMainExitOnboarding.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReplaceMainExitOnboarding[] newArray(int i12) {
            return new ReplaceMainExitOnboarding[i12];
        }
    }

    public ReplaceMainExitOnboarding(@k PrintableText printableText, @k PrintableText printableText2, @k String str) {
        this.f254500b = str;
        this.f254501c = printableText;
        this.f254502d = printableText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceMainExitOnboarding)) {
            return false;
        }
        ReplaceMainExitOnboarding replaceMainExitOnboarding = (ReplaceMainExitOnboarding) obj;
        return L.f(this.f254500b, replaceMainExitOnboarding.f254500b) && L.f(this.f254501c, replaceMainExitOnboarding.f254501c) && L.f(this.f254502d, replaceMainExitOnboarding.f254502d);
    }

    public final int hashCode() {
        return this.f254502d.hashCode() + com.avito.android.actions_sheet.a.f(this.f254501c, this.f254500b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceMainExitOnboarding(onceShowId=");
        sb2.append(this.f254500b);
        sb2.append(", description=");
        sb2.append(this.f254501c);
        sb2.append(", buttonTitle=");
        return AK.c.m(sb2, this.f254502d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254500b);
        parcel.writeParcelable(this.f254501c, i12);
        parcel.writeParcelable(this.f254502d, i12);
    }
}
