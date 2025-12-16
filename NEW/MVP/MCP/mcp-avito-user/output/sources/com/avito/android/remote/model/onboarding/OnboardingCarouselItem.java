package com.avito.android.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnboradingCarousel.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/onboarding/OnboardingCarouselItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "buttonTitle", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "buttonAction", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "", "Lcom/avito/android/remote/model/onboarding/UniversalLinearGradientColor;", "gradient", "Lcom/avito/android/remote/model/onboarding/AdditionalAction;", "additionalActions", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/onboarding/ButtonAction;Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "getButtonTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "getButtonAction", "()Lcom/avito/android/remote/model/onboarding/ButtonAction;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/util/List;", "getGradient", "()Ljava/util/List;", "getAdditionalActions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingCarouselItem implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingCarouselItem> CREATOR = new Creator();

    @c("additionalActions")
    @l
    private final List<AdditionalAction> additionalActions;

    @c("buttonAction")
    @l
    private final ButtonAction buttonAction;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("description")
    @l
    private final AttributedText description;

    @c("gradient")
    @l
    private final List<UniversalLinearGradientColor> gradient;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @l
    private final AttributedText title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final Uri uri;

    /* compiled from: OnboradingCarousel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingCarouselItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingCarouselItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            Uri uri = (Uri) parcel.readParcelable(OnboardingCarouselItem.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(UniversalLinearGradientColor.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(AdditionalAction.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new OnboardingCarouselItem(universalImage, attributedText, attributedText2, string, buttonActionValueOf, uri, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingCarouselItem[] newArray(int i12) {
            return new OnboardingCarouselItem[i12];
        }
    }

    public OnboardingCarouselItem(@l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l ButtonAction buttonAction, @l Uri uri, @l List<UniversalLinearGradientColor> list, @l List<AdditionalAction> list2) {
        this.image = universalImage;
        this.title = attributedText;
        this.description = attributedText2;
        this.buttonTitle = str;
        this.buttonAction = buttonAction;
        this.uri = uri;
        this.gradient = list;
        this.additionalActions = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<AdditionalAction> getAdditionalActions() {
        return this.additionalActions;
    }

    @l
    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<UniversalLinearGradientColor> getGradient() {
        return this.gradient;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final Uri getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.buttonTitle);
        ButtonAction buttonAction = this.buttonAction;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        parcel.writeParcelable(this.uri, flags);
        List<UniversalLinearGradientColor> list = this.gradient;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((UniversalLinearGradientColor) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<AdditionalAction> list2 = this.additionalActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((AdditionalAction) itA2.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ OnboardingCarouselItem(UniversalImage universalImage, AttributedText attributedText, AttributedText attributedText2, String str, ButtonAction buttonAction, Uri uri, List list, List list2, int i12, C42822w c42822w) {
        this(universalImage, attributedText, attributedText2, str, (i12 & 16) != 0 ? null : buttonAction, uri, (i12 & 64) != 0 ? null : list, list2);
    }
}
