package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RouteButtons.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/RouteButtons;", "Landroid/os/Parcelable;", "", "hasCreateRouteButton", "hasCreateFollowTheRoute", "needToNewRouteFlow", "", "abToken", "<init>", "(ZZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getHasCreateRouteButton", "()Z", "getHasCreateFollowTheRoute", "getNeedToNewRouteFlow", "Ljava/lang/String;", "getAbToken", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RouteButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<RouteButtons> CREATOR = new Creator();

    @c("abToken")
    @l
    private final String abToken;

    @c("hasCreateFollowTheRoute")
    private final boolean hasCreateFollowTheRoute;

    @c("hasCreateRouteButton")
    private final boolean hasCreateRouteButton;

    @c("needToNewRouteFlow")
    private final boolean needToNewRouteFlow;

    /* compiled from: RouteButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RouteButtons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RouteButtons createFromParcel(@k Parcel parcel) {
            return new RouteButtons(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RouteButtons[] newArray(int i12) {
            return new RouteButtons[i12];
        }
    }

    public RouteButtons() {
        this(false, false, false, null, 15, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAbToken() {
        return this.abToken;
    }

    public final boolean getHasCreateFollowTheRoute() {
        return this.hasCreateFollowTheRoute;
    }

    public final boolean getHasCreateRouteButton() {
        return this.hasCreateRouteButton;
    }

    public final boolean getNeedToNewRouteFlow() {
        return this.needToNewRouteFlow;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.hasCreateRouteButton ? 1 : 0);
        parcel.writeInt(this.hasCreateFollowTheRoute ? 1 : 0);
        parcel.writeInt(this.needToNewRouteFlow ? 1 : 0);
        parcel.writeString(this.abToken);
    }

    public RouteButtons(boolean z12, boolean z13, boolean z14, @l String str) {
        this.hasCreateRouteButton = z12;
        this.hasCreateFollowTheRoute = z13;
        this.needToNewRouteFlow = z14;
        this.abToken = str;
    }

    public /* synthetic */ RouteButtons(boolean z12, boolean z13, boolean z14, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? null : str);
    }
}
