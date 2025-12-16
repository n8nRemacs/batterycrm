package com.avito.android.mortgage.api.model.landing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingHeader.kt */
@d
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/LandingHeader;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "Lcom/avito/android/mortgage/api/model/landing/TitlePart;", "titleParts", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;", "primaryAction", "secondaryAction", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;", "c", "()Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;", "d", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingHeader implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingHeader> CREATOR = new a();

    @c("image")
    @l
    private final UniversalImage image;

    @c("primaryAction")
    @l
    private final LandingHeaderAction primaryAction;

    @c("secondaryAction")
    @l
    private final LandingHeaderAction secondaryAction;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final List<TitlePart> titleParts;

    /* compiled from: LandingHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingHeader> {
        @Override // android.os.Parcelable.Creator
        public final LandingHeader createFromParcel(Parcel parcel) {
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(LandingHeader.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TitlePart.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LandingHeader(universalImage, arrayList, (AttributedText) parcel.readParcelable(LandingHeader.class.getClassLoader()), parcel.readInt() == 0 ? null : LandingHeaderAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LandingHeaderAction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LandingHeader[] newArray(int i12) {
            return new LandingHeader[i12];
        }
    }

    public LandingHeader(@l UniversalImage universalImage, @k List<TitlePart> list, @l AttributedText attributedText, @l LandingHeaderAction landingHeaderAction, @l LandingHeaderAction landingHeaderAction2) {
        this.image = universalImage;
        this.titleParts = list;
        this.subtitle = attributedText;
        this.primaryAction = landingHeaderAction;
        this.secondaryAction = landingHeaderAction2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final LandingHeaderAction getPrimaryAction() {
        return this.primaryAction;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final LandingHeaderAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<TitlePart> e() {
        return this.titleParts;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingHeader)) {
            return false;
        }
        LandingHeader landingHeader = (LandingHeader) obj;
        return L.f(this.image, landingHeader.image) && L.f(this.titleParts, landingHeader.titleParts) && L.f(this.subtitle, landingHeader.subtitle) && L.f(this.primaryAction, landingHeader.primaryAction) && L.f(this.secondaryAction, landingHeader.secondaryAction);
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.image;
        int iE2 = H.e((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.titleParts);
        AttributedText attributedText = this.subtitle;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        LandingHeaderAction landingHeaderAction = this.primaryAction;
        int iHashCode2 = (iHashCode + (landingHeaderAction == null ? 0 : landingHeaderAction.hashCode())) * 31;
        LandingHeaderAction landingHeaderAction2 = this.secondaryAction;
        return iHashCode2 + (landingHeaderAction2 != null ? landingHeaderAction2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "LandingHeader(image=" + this.image + ", titleParts=" + this.titleParts + ", subtitle=" + this.subtitle + ", primaryAction=" + this.primaryAction + ", secondaryAction=" + this.secondaryAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        Iterator itJ = C0.j(this.titleParts, parcel);
        while (itJ.hasNext()) {
            ((TitlePart) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.subtitle, i12);
        LandingHeaderAction landingHeaderAction = this.primaryAction;
        if (landingHeaderAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingHeaderAction.writeToParcel(parcel, i12);
        }
        LandingHeaderAction landingHeaderAction2 = this.secondaryAction;
        if (landingHeaderAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingHeaderAction2.writeToParcel(parcel, i12);
        }
    }
}
