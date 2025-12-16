package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/OpenQuizButton;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "onClickEvent", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;)Lcom/avito/android/remote/model/OpenQuizButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "getOnClickEvent", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OpenQuizButton implements Parcelable {

    @k
    public static final Parcelable.Creator<OpenQuizButton> CREATOR = new Creator();

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("onClickEvent")
    @l
    private final ComfortableDealAnalyticsEvent onClickEvent;

    @c("text")
    @k
    private final String text;

    /* compiled from: ComfortableDealPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenQuizButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OpenQuizButton createFromParcel(@k Parcel parcel) {
            return new OpenQuizButton(parcel.readString(), (DeepLink) parcel.readParcelable(OpenQuizButton.class.getClassLoader()), parcel.readInt() == 0 ? null : ComfortableDealAnalyticsEvent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OpenQuizButton[] newArray(int i12) {
            return new OpenQuizButton[i12];
        }
    }

    public OpenQuizButton(@k String str, @k DeepLink deepLink, @l ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent) {
        this.text = str;
        this.deeplink = deepLink;
        this.onClickEvent = comfortableDealAnalyticsEvent;
    }

    public static /* synthetic */ OpenQuizButton copy$default(OpenQuizButton openQuizButton, String str, DeepLink deepLink, ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = openQuizButton.text;
        }
        if ((i12 & 2) != 0) {
            deepLink = openQuizButton.deeplink;
        }
        if ((i12 & 4) != 0) {
            comfortableDealAnalyticsEvent = openQuizButton.onClickEvent;
        }
        return openQuizButton.copy(str, deepLink, comfortableDealAnalyticsEvent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ComfortableDealAnalyticsEvent getOnClickEvent() {
        return this.onClickEvent;
    }

    @k
    public final OpenQuizButton copy(@k String text, @k DeepLink deeplink, @l ComfortableDealAnalyticsEvent onClickEvent) {
        return new OpenQuizButton(text, deeplink, onClickEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenQuizButton)) {
            return false;
        }
        OpenQuizButton openQuizButton = (OpenQuizButton) other;
        return L.f(this.text, openQuizButton.text) && L.f(this.deeplink, openQuizButton.deeplink) && L.f(this.onClickEvent, openQuizButton.onClickEvent);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final ComfortableDealAnalyticsEvent getOnClickEvent() {
        return this.onClickEvent;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE2 = a.e(this.deeplink, this.text.hashCode() * 31, 31);
        ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent = this.onClickEvent;
        return iE2 + (comfortableDealAnalyticsEvent == null ? 0 : comfortableDealAnalyticsEvent.hashCode());
    }

    @k
    public String toString() {
        return "OpenQuizButton(text=" + this.text + ", deeplink=" + this.deeplink + ", onClickEvent=" + this.onClickEvent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deeplink, flags);
        ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent = this.onClickEvent;
        if (comfortableDealAnalyticsEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comfortableDealAnalyticsEvent.writeToParcel(parcel, flags);
        }
    }
}
