package com.avito.android.remote.model.promo_mechanics;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoMechanics.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/promo_mechanics/PromoMechanics;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "entryPointTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/promo_mechanics/PromoMechanics;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getEntryPointTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnTapDeepLink", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoMechanics implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoMechanics> CREATOR = new Creator();

    @c("entryPointTitle")
    @k
    private final AttributedText entryPointTitle;

    @c("onTapDeepLink")
    @k
    private final DeepLink onTapDeepLink;

    /* compiled from: PromoMechanics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoMechanics> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoMechanics createFromParcel(@k Parcel parcel) {
            return new PromoMechanics((AttributedText) parcel.readParcelable(PromoMechanics.class.getClassLoader()), (DeepLink) parcel.readParcelable(PromoMechanics.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoMechanics[] newArray(int i12) {
            return new PromoMechanics[i12];
        }
    }

    public PromoMechanics(@k AttributedText attributedText, @k DeepLink deepLink) {
        this.entryPointTitle = attributedText;
        this.onTapDeepLink = deepLink;
    }

    public static /* synthetic */ PromoMechanics copy$default(PromoMechanics promoMechanics, AttributedText attributedText, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = promoMechanics.entryPointTitle;
        }
        if ((i12 & 2) != 0) {
            deepLink = promoMechanics.onTapDeepLink;
        }
        return promoMechanics.copy(attributedText, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getEntryPointTitle() {
        return this.entryPointTitle;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @k
    public final PromoMechanics copy(@k AttributedText entryPointTitle, @k DeepLink onTapDeepLink) {
        return new PromoMechanics(entryPointTitle, onTapDeepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoMechanics)) {
            return false;
        }
        PromoMechanics promoMechanics = (PromoMechanics) other;
        return L.f(this.entryPointTitle, promoMechanics.entryPointTitle) && L.f(this.onTapDeepLink, promoMechanics.onTapDeepLink);
    }

    @k
    public final AttributedText getEntryPointTitle() {
        return this.entryPointTitle;
    }

    @k
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    public int hashCode() {
        return this.onTapDeepLink.hashCode() + (this.entryPointTitle.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoMechanics(entryPointTitle=");
        sb2.append(this.entryPointTitle);
        sb2.append(", onTapDeepLink=");
        return a.v(sb2, this.onTapDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.entryPointTitle, flags);
        parcel.writeParcelable(this.onTapDeepLink, flags);
    }
}
