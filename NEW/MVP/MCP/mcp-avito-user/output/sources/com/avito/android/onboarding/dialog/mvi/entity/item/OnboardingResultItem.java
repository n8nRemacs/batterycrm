package com.avito.android.onboarding.dialog.mvi.entity.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem;
import com.avito.android.onboarding.dialog.view.preview.OnboardingPreviewItem;
import com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingResultItem.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem;", "Landroid/os/Parcelable;", "OnboardingResultCarouselItem", "OnboardingResultPreviewItem", "OnboardingResultQuizItem", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultCarouselItem;", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultPreviewItem;", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultQuizItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OnboardingResultItem extends Parcelable {

    /* compiled from: OnboardingResultItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultCarouselItem;", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnboardingResultCarouselItem implements OnboardingResultItem {

        @k
        public static final Parcelable.Creator<OnboardingResultCarouselItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f208914b;

        /* compiled from: OnboardingResultItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnboardingResultCarouselItem> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingResultCarouselItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(OnboardingCarouselItem.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OnboardingResultCarouselItem(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingResultCarouselItem[] newArray(int i12) {
                return new OnboardingResultCarouselItem[i12];
            }
        }

        public OnboardingResultCarouselItem(@l ArrayList arrayList) {
            this.f208914b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnboardingResultCarouselItem) && L.f(this.f208914b, ((OnboardingResultCarouselItem) obj).f208914b);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f208914b;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("OnboardingResultCarouselItem(items="), this.f208914b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ArrayList arrayList = this.f208914b;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((OnboardingCarouselItem) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: OnboardingResultItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultPreviewItem;", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnboardingResultPreviewItem implements OnboardingResultItem {

        @k
        public static final Parcelable.Creator<OnboardingResultPreviewItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f208915b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ArrayList f208916c;

        /* compiled from: OnboardingResultItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnboardingResultPreviewItem> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingResultPreviewItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AttributedText attributedText = (AttributedText) parcel.readParcelable(OnboardingResultPreviewItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(OnboardingPreviewItem.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OnboardingResultPreviewItem(attributedText, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingResultPreviewItem[] newArray(int i12) {
                return new OnboardingResultPreviewItem[i12];
            }
        }

        public OnboardingResultPreviewItem(@l AttributedText attributedText, @l ArrayList arrayList) {
            this.f208915b = attributedText;
            this.f208916c = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingResultPreviewItem)) {
                return false;
            }
            OnboardingResultPreviewItem onboardingResultPreviewItem = (OnboardingResultPreviewItem) obj;
            return L.f(this.f208915b, onboardingResultPreviewItem.f208915b) && L.f(this.f208916c, onboardingResultPreviewItem.f208916c);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f208915b;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            ArrayList arrayList = this.f208916c;
            return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnboardingResultPreviewItem(title=");
            sb2.append(this.f208915b);
            sb2.append(", items=");
            return e.p(sb2, this.f208916c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f208915b, i12);
            ArrayList arrayList = this.f208916c;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((OnboardingPreviewItem) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: OnboardingResultItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem$OnboardingResultQuizItem;", "Lcom/avito/android/onboarding/dialog/mvi/entity/item/OnboardingResultItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnboardingResultQuizItem implements OnboardingResultItem {

        @k
        public static final Parcelable.Creator<OnboardingResultQuizItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f208917b;

        /* compiled from: OnboardingResultItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnboardingResultQuizItem> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingResultQuizItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(OnboardingQuizItem.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OnboardingResultQuizItem(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingResultQuizItem[] newArray(int i12) {
                return new OnboardingResultQuizItem[i12];
            }
        }

        public OnboardingResultQuizItem(@l ArrayList arrayList) {
            this.f208917b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnboardingResultQuizItem) && L.f(this.f208917b, ((OnboardingResultQuizItem) obj).f208917b);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f208917b;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("OnboardingResultQuizItem(items="), this.f208917b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ArrayList arrayList = this.f208917b;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((OnboardingQuizItem) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }
}
