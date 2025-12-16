package com.avito.android.onboarding.dialog.view.carousel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.onboarding.dialog.view.OnboardingDialogItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.UniversalLinearGradientColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingCarouselItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/OnboardingCarouselItem;", "Lcom/avito/android/onboarding/dialog/view/OnboardingDialogItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingCarouselItem implements OnboardingDialogItem {

    @Y61.k
    public static final Parcelable.Creator<OnboardingCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f208969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f208970c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f208971d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f208972e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f208973f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Uri f208974g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ButtonAction f208975h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final List<AdditionalActionItem> f208976i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<UniversalLinearGradientColor> f208977j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f208978k;

    /* compiled from: OnboardingCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingCarouselItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            String string = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdditionalActionItem.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(OnboardingCarouselItem.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new OnboardingCarouselItem(j12, universalImage, attributedText, attributedText2, string, uri, buttonActionValueOf, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingCarouselItem[] newArray(int i12) {
            return new OnboardingCarouselItem[i12];
        }
    }

    public OnboardingCarouselItem(long j12, @Y61.l UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l String str, @Y61.l Uri uri, @Y61.l ButtonAction buttonAction, @Y61.l List<AdditionalActionItem> list, @Y61.l List<UniversalLinearGradientColor> list2, @Y61.l Integer num) {
        this.f208969b = j12;
        this.f208970c = universalImage;
        this.f208971d = attributedText;
        this.f208972e = attributedText2;
        this.f208973f = str;
        this.f208974g = uri;
        this.f208975h = buttonAction;
        this.f208976i = list;
        this.f208977j = list2;
        this.f208978k = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCarouselItem)) {
            return false;
        }
        OnboardingCarouselItem onboardingCarouselItem = (OnboardingCarouselItem) obj;
        return this.f208969b == onboardingCarouselItem.f208969b && L.f(this.f208970c, onboardingCarouselItem.f208970c) && L.f(this.f208971d, onboardingCarouselItem.f208971d) && L.f(this.f208972e, onboardingCarouselItem.f208972e) && L.f(this.f208973f, onboardingCarouselItem.f208973f) && L.f(this.f208974g, onboardingCarouselItem.f208974g) && this.f208975h == onboardingCarouselItem.f208975h && L.f(this.f208976i, onboardingCarouselItem.f208976i) && L.f(this.f208977j, onboardingCarouselItem.f208977j) && L.f(this.f208978k, onboardingCarouselItem.f208978k);
    }

    @Override // com.avito.android.onboarding.dialog.view.OnboardingDialogItem
    /* renamed from: getId, reason: from getter */
    public final long getF209031b() {
        return this.f208969b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f208969b) * 31;
        UniversalImage universalImage = this.f208970c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f208971d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f208972e;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f208973f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f208974g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        ButtonAction buttonAction = this.f208975h;
        int iHashCode7 = (iHashCode6 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        List<AdditionalActionItem> list = this.f208976i;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<UniversalLinearGradientColor> list2 = this.f208977j;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f208978k;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingCarouselItem(id=");
        sb2.append(this.f208969b);
        sb2.append(", image=");
        sb2.append(this.f208970c);
        sb2.append(", title=");
        sb2.append(this.f208971d);
        sb2.append(", description=");
        sb2.append(this.f208972e);
        sb2.append(", buttonTitle=");
        sb2.append(this.f208973f);
        sb2.append(", uri=");
        sb2.append(this.f208974g);
        sb2.append(", buttonAction=");
        sb2.append(this.f208975h);
        sb2.append(", additionalButtons=");
        sb2.append(this.f208976i);
        sb2.append(", gradient=");
        sb2.append(this.f208977j);
        sb2.append(", page=");
        return s.j(sb2, this.f208978k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f208969b);
        parcel.writeParcelable(this.f208970c, i12);
        parcel.writeParcelable(this.f208971d, i12);
        parcel.writeParcelable(this.f208972e, i12);
        parcel.writeString(this.f208973f);
        parcel.writeParcelable(this.f208974g, i12);
        ButtonAction buttonAction = this.f208975h;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        List<AdditionalActionItem> list = this.f208976i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdditionalActionItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<UniversalLinearGradientColor> list2 = this.f208977j;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        Integer num = this.f208978k;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
