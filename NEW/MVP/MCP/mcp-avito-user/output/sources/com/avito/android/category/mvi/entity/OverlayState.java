package com.avito.android.category.mvi.entity;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CategoryState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/mvi/entity/OverlayState;", "", "Landroid/os/Parcelable;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverlayState implements Parcelable {

    @k
    public static final Parcelable.Creator<OverlayState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final OverlayState f116682b;

    /* renamed from: c, reason: collision with root package name */
    public static final OverlayState f116683c;

    /* renamed from: d, reason: collision with root package name */
    public static final OverlayState f116684d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OverlayState[] f116685e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116686f;

    static {
        OverlayState overlayState = new OverlayState("PROGRESS", 0);
        f116682b = overlayState;
        OverlayState overlayState2 = new OverlayState("RETRY", 1);
        f116683c = overlayState2;
        OverlayState overlayState3 = new OverlayState("CONTENT", 2);
        f116684d = overlayState3;
        OverlayState[] overlayStateArr = {overlayState, overlayState2, overlayState3};
        f116685e = overlayStateArr;
        f116686f = c.a(overlayStateArr);
        CREATOR = new Parcelable.Creator<OverlayState>() { // from class: com.avito.android.category.mvi.entity.OverlayState.a
            @Override // android.os.Parcelable.Creator
            public final OverlayState createFromParcel(Parcel parcel) {
                return OverlayState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OverlayState[] newArray(int i12) {
                return new OverlayState[i12];
            }
        };
    }

    public OverlayState() {
        throw null;
    }

    public static OverlayState valueOf(String str) {
        return (OverlayState) Enum.valueOf(OverlayState.class, str);
    }

    public static OverlayState[] values() {
        return (OverlayState[]) f116685e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
