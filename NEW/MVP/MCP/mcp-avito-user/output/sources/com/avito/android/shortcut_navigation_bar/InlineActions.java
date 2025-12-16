package com.avito.android.shortcut_navigation_bar;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineActions.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/InlineActions;", "Landroid/os/Parcelable;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InlineActions implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<InlineActions> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InlineAction f283126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InlineAction f283127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f283128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f283129e;

    /* compiled from: InlineActions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InlineActions> {
        @Override // android.os.Parcelable.Creator
        public final InlineActions createFromParcel(Parcel parcel) {
            return new InlineActions((InlineAction) parcel.readParcelable(InlineActions.class.getClassLoader()), (InlineAction) parcel.readParcelable(InlineActions.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InlineActions[] newArray(int i12) {
            return new InlineActions[i12];
        }
    }

    public InlineActions(@Y61.l InlineAction inlineAction, @Y61.l InlineAction inlineAction2, boolean z12, boolean z13) {
        this.f283126b = inlineAction;
        this.f283127c = inlineAction2;
        this.f283128d = z12;
        this.f283129e = z13;
    }

    public static InlineActions a(InlineActions inlineActions, InlineAction inlineAction, InlineAction inlineAction2, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            inlineAction = inlineActions.f283126b;
        }
        if ((i12 & 2) != 0) {
            inlineAction2 = inlineActions.f283127c;
        }
        if ((i12 & 8) != 0) {
            z12 = inlineActions.f283129e;
        }
        return new InlineActions(inlineAction, inlineAction2, inlineActions.f283128d, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineActions)) {
            return false;
        }
        InlineActions inlineActions = (InlineActions) obj;
        return kotlin.jvm.internal.L.f(this.f283126b, inlineActions.f283126b) && kotlin.jvm.internal.L.f(this.f283127c, inlineActions.f283127c) && this.f283128d == inlineActions.f283128d && this.f283129e == inlineActions.f283129e;
    }

    public final int hashCode() {
        InlineAction inlineAction = this.f283126b;
        int iHashCode = (inlineAction == null ? 0 : inlineAction.hashCode()) * 31;
        InlineAction inlineAction2 = this.f283127c;
        return Boolean.hashCode(this.f283129e) + androidx.appcompat.app.r.i((iHashCode + (inlineAction2 != null ? inlineAction2.hashCode() : 0)) * 31, 31, this.f283128d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InlineActions(leftAction=");
        sb2.append(this.f283126b);
        sb2.append(", rightAction=");
        sb2.append(this.f283127c);
        sb2.append(", saveSearchInHeaderOnScroll=");
        sb2.append(this.f283128d);
        sb2.append(", visible=");
        return androidx.appcompat.app.r.x(sb2, this.f283129e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f283126b, i12);
        parcel.writeParcelable(this.f283127c, i12);
        parcel.writeInt(this.f283128d ? 1 : 0);
        parcel.writeInt(this.f283129e ? 1 : 0);
    }

    public /* synthetic */ InlineActions(InlineAction inlineAction, InlineAction inlineAction2, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : inlineAction, (i12 & 2) != 0 ? null : inlineAction2, z12, z13);
    }
}
