package com.avito.android.onboarding.dialog.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingDialogState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingDialogState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f208911b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final OnboardingResultItem f208912c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f208913d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f208909e = new a(null);

    @k
    public static final Parcelable.Creator<OnboardingDialogState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final OnboardingDialogState f208910f = new OnboardingDialogState(null, null, false, 7, null);

    /* compiled from: OnboardingDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState$a;", "", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OnboardingDialogState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OnboardingDialogState> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingDialogState createFromParcel(Parcel parcel) {
            return new OnboardingDialogState(parcel.readString(), (OnboardingResultItem) parcel.readParcelable(OnboardingDialogState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingDialogState[] newArray(int i12) {
            return new OnboardingDialogState[i12];
        }
    }

    public OnboardingDialogState() {
        this(null, null, false, 7, null);
    }

    public static OnboardingDialogState a(OnboardingDialogState onboardingDialogState, String str, OnboardingResultItem onboardingResultItem, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = onboardingDialogState.f208911b;
        }
        if ((i12 & 2) != 0) {
            onboardingResultItem = onboardingDialogState.f208912c;
        }
        if ((i12 & 4) != 0) {
            z12 = onboardingDialogState.f208913d;
        }
        onboardingDialogState.getClass();
        return new OnboardingDialogState(str, onboardingResultItem, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingDialogState)) {
            return false;
        }
        OnboardingDialogState onboardingDialogState = (OnboardingDialogState) obj;
        return L.f(this.f208911b, onboardingDialogState.f208911b) && L.f(this.f208912c, onboardingDialogState.f208912c) && this.f208913d == onboardingDialogState.f208913d;
    }

    public final int hashCode() {
        String str = this.f208911b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OnboardingResultItem onboardingResultItem = this.f208912c;
        return Boolean.hashCode(this.f208913d) + ((iHashCode + (onboardingResultItem != null ? onboardingResultItem.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingDialogState(id=");
        sb2.append(this.f208911b);
        sb2.append(", item=");
        sb2.append(this.f208912c);
        sb2.append(", contentWasShown=");
        return r.x(sb2, this.f208913d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208911b);
        parcel.writeParcelable(this.f208912c, i12);
        parcel.writeInt(this.f208913d ? 1 : 0);
    }

    public /* synthetic */ OnboardingDialogState(String str, OnboardingResultItem onboardingResultItem, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : onboardingResultItem, (i12 & 4) != 0 ? false : z12);
    }

    public OnboardingDialogState(@l String str, @l OnboardingResultItem onboardingResultItem, boolean z12) {
        this.f208911b = str;
        this.f208912c = onboardingResultItem;
        this.f208913d = z12;
    }
}
