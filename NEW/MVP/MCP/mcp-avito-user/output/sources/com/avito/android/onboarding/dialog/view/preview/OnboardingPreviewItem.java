package com.avito.android.onboarding.dialog.view.preview;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.onboarding.dialog.view.OnboardingDialogItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingPreviewItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/preview/OnboardingPreviewItem;", "Lcom/avito/android/onboarding/dialog/view/OnboardingDialogItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingPreviewItem implements OnboardingDialogItem {

    @k
    public static final Parcelable.Creator<OnboardingPreviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f209023b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f209024c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f209025d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f209026e;

    /* compiled from: OnboardingPreviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingPreviewItem> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPreviewItem createFromParcel(Parcel parcel) {
            return new OnboardingPreviewItem(parcel.readLong(), (UniversalImage) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()), (Uri) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPreviewItem[] newArray(int i12) {
            return new OnboardingPreviewItem[i12];
        }
    }

    public OnboardingPreviewItem(long j12, @l UniversalImage universalImage, @l AttributedText attributedText, @l Uri uri) {
        this.f209023b = j12;
        this.f209024c = universalImage;
        this.f209025d = attributedText;
        this.f209026e = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPreviewItem)) {
            return false;
        }
        OnboardingPreviewItem onboardingPreviewItem = (OnboardingPreviewItem) obj;
        return this.f209023b == onboardingPreviewItem.f209023b && L.f(this.f209024c, onboardingPreviewItem.f209024c) && L.f(this.f209025d, onboardingPreviewItem.f209025d) && L.f(this.f209026e, onboardingPreviewItem.f209026e);
    }

    @Override // com.avito.android.onboarding.dialog.view.OnboardingDialogItem
    /* renamed from: getId, reason: from getter */
    public final long getF209031b() {
        return this.f209023b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f209023b) * 31;
        UniversalImage universalImage = this.f209024c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f209025d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Uri uri = this.f209026e;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingPreviewItem(id=");
        sb2.append(this.f209023b);
        sb2.append(", image=");
        sb2.append(this.f209024c);
        sb2.append(", title=");
        sb2.append(this.f209025d);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f209026e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f209023b);
        parcel.writeParcelable(this.f209024c, i12);
        parcel.writeParcelable(this.f209025d, i12);
        parcel.writeParcelable(this.f209026e, i12);
    }
}
