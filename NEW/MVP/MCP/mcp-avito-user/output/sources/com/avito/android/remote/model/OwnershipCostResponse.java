package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipCostResponse.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;", "ownershipCostForm", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;", "ownershipCostResults", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;", "ownershipCostDisclaimer", "<init>", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;)V", "component1", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;", "component2", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;", "component3", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;", "copy", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;)Lcom/avito/android/remote/model/OwnershipCostResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;", "getOwnershipCostForm", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;", "getOwnershipCostResults", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;", "getOwnershipCostDisclaimer", "OwnershipCostDisclaimer", "OwnershipCostForm", "OwnershipCostResults", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OwnershipCostResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<OwnershipCostResponse> CREATOR = new Creator();

    @c("ownershipCostDisclaimer")
    @k
    private final OwnershipCostDisclaimer ownershipCostDisclaimer;

    @c("ownershipCostForm")
    @k
    private final OwnershipCostForm ownershipCostForm;

    @c("ownershipCostResults")
    @k
    private final OwnershipCostResults ownershipCostResults;

    /* compiled from: OwnershipCostResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OwnershipCostResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OwnershipCostResponse createFromParcel(@k Parcel parcel) {
            return new OwnershipCostResponse(OwnershipCostForm.CREATOR.createFromParcel(parcel), OwnershipCostResults.CREATOR.createFromParcel(parcel), OwnershipCostDisclaimer.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OwnershipCostResponse[] newArray(int i12) {
            return new OwnershipCostResponse[i12];
        }
    }

    /* compiled from: OwnershipCostResponse.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;", "Landroid/os/Parcelable;", "", "title", "", "paragraphs", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;", "disclaimerLink", "buttonText", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;Ljava/lang/String;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getParagraphs", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;", "getDisclaimerLink", "getButtonText", "DisclaimerLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class OwnershipCostDisclaimer implements Parcelable {

        @k
        public static final Parcelable.Creator<OwnershipCostDisclaimer> CREATOR = new Creator();

        @c("buttonText")
        @k
        private final String buttonText;

        @c("supportLink")
        @k
        private final DisclaimerLink disclaimerLink;

        @c("paragraphs")
        @k
        private final List<String> paragraphs;

        @c("title")
        @k
        private final String title;

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OwnershipCostDisclaimer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostDisclaimer createFromParcel(@k Parcel parcel) {
                return new OwnershipCostDisclaimer(parcel.readString(), parcel.createStringArrayList(), DisclaimerLink.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostDisclaimer[] newArray(int i12) {
                return new OwnershipCostDisclaimer[i12];
            }
        }

        /* compiled from: OwnershipCostResponse.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;", "Landroid/os/Parcelable;", "", "text", "linkKey", "linkText", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostDisclaimer$DisclaimerLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getLinkKey", "getLinkText", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisclaimerLink implements Parcelable {

            @k
            public static final Parcelable.Creator<DisclaimerLink> CREATOR = new Creator();

            @c("linkKey")
            @k
            private final String linkKey;

            @c("linkText")
            @k
            private final String linkText;

            @c("text")
            @k
            private final String text;

            @c(ContextActionHandler.Link.URL)
            @k
            private final String url;

            /* compiled from: OwnershipCostResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisclaimerLink> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerLink createFromParcel(@k Parcel parcel) {
                    return new DisclaimerLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerLink[] newArray(int i12) {
                    return new DisclaimerLink[i12];
                }
            }

            public DisclaimerLink(@k String str, @k String str2, @k String str3, @k String str4) {
                this.text = str;
                this.linkKey = str2;
                this.linkText = str3;
                this.url = str4;
            }

            public static /* synthetic */ DisclaimerLink copy$default(DisclaimerLink disclaimerLink, String str, String str2, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = disclaimerLink.text;
                }
                if ((i12 & 2) != 0) {
                    str2 = disclaimerLink.linkKey;
                }
                if ((i12 & 4) != 0) {
                    str3 = disclaimerLink.linkText;
                }
                if ((i12 & 8) != 0) {
                    str4 = disclaimerLink.url;
                }
                return disclaimerLink.copy(str, str2, str3, str4);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getLinkKey() {
                return this.linkKey;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getLinkText() {
                return this.linkText;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @k
            public final DisclaimerLink copy(@k String text, @k String linkKey, @k String linkText, @k String url) {
                return new DisclaimerLink(text, linkKey, linkText, url);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisclaimerLink)) {
                    return false;
                }
                DisclaimerLink disclaimerLink = (DisclaimerLink) other;
                return L.f(this.text, disclaimerLink.text) && L.f(this.linkKey, disclaimerLink.linkKey) && L.f(this.linkText, disclaimerLink.linkText) && L.f(this.url, disclaimerLink.url);
            }

            @k
            public final String getLinkKey() {
                return this.linkKey;
            }

            @k
            public final String getLinkText() {
                return this.linkText;
            }

            @k
            public final String getText() {
                return this.text;
            }

            @k
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode() + H.d(H.d(this.text.hashCode() * 31, 31, this.linkKey), 31, this.linkText);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("DisclaimerLink(text=");
                sb2.append(this.text);
                sb2.append(", linkKey=");
                sb2.append(this.linkKey);
                sb2.append(", linkText=");
                sb2.append(this.linkText);
                sb2.append(", url=");
                return C22026a.c(sb2, this.url, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                parcel.writeString(this.linkKey);
                parcel.writeString(this.linkText);
                parcel.writeString(this.url);
            }
        }

        public OwnershipCostDisclaimer(@k String str, @k List<String> list, @k DisclaimerLink disclaimerLink, @k String str2) {
            this.title = str;
            this.paragraphs = list;
            this.disclaimerLink = disclaimerLink;
            this.buttonText = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OwnershipCostDisclaimer copy$default(OwnershipCostDisclaimer ownershipCostDisclaimer, String str, List list, DisclaimerLink disclaimerLink, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = ownershipCostDisclaimer.title;
            }
            if ((i12 & 2) != 0) {
                list = ownershipCostDisclaimer.paragraphs;
            }
            if ((i12 & 4) != 0) {
                disclaimerLink = ownershipCostDisclaimer.disclaimerLink;
            }
            if ((i12 & 8) != 0) {
                str2 = ownershipCostDisclaimer.buttonText;
            }
            return ownershipCostDisclaimer.copy(str, list, disclaimerLink, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<String> component2() {
            return this.paragraphs;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DisclaimerLink getDisclaimerLink() {
            return this.disclaimerLink;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        public final OwnershipCostDisclaimer copy(@k String title, @k List<String> paragraphs, @k DisclaimerLink disclaimerLink, @k String buttonText) {
            return new OwnershipCostDisclaimer(title, paragraphs, disclaimerLink, buttonText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnershipCostDisclaimer)) {
                return false;
            }
            OwnershipCostDisclaimer ownershipCostDisclaimer = (OwnershipCostDisclaimer) other;
            return L.f(this.title, ownershipCostDisclaimer.title) && L.f(this.paragraphs, ownershipCostDisclaimer.paragraphs) && L.f(this.disclaimerLink, ownershipCostDisclaimer.disclaimerLink) && L.f(this.buttonText, ownershipCostDisclaimer.buttonText);
        }

        @k
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        public final DisclaimerLink getDisclaimerLink() {
            return this.disclaimerLink;
        }

        @k
        public final List<String> getParagraphs() {
            return this.paragraphs;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.buttonText.hashCode() + ((this.disclaimerLink.hashCode() + H.e(this.title.hashCode() * 31, 31, this.paragraphs)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OwnershipCostDisclaimer(title=");
            sb2.append(this.title);
            sb2.append(", paragraphs=");
            sb2.append(this.paragraphs);
            sb2.append(", disclaimerLink=");
            sb2.append(this.disclaimerLink);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.buttonText, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeStringList(this.paragraphs);
            this.disclaimerLink.writeToParcel(parcel, flags);
            parcel.writeString(this.buttonText);
        }
    }

    /* compiled from: OwnershipCostResponse.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u000278BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u0019¨\u00069"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;", "Landroid/os/Parcelable;", "", "title", "text", "modalTitle", "modalText", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;", "distanceInput", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;", "regionSelect", "Lcom/avito/android/remote/model/OwnershipCostButton;", "calculateButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;Lcom/avito/android/remote/model/OwnershipCostButton;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;", "component6", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;", "component7", "()Lcom/avito/android/remote/model/OwnershipCostButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;Lcom/avito/android/remote/model/OwnershipCostButton;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "getModalTitle", "getModalText", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;", "getDistanceInput", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;", "getRegionSelect", "Lcom/avito/android/remote/model/OwnershipCostButton;", "getCalculateButton", "DistanceInput", "RegionSelect", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class OwnershipCostForm implements Parcelable {

        @k
        public static final Parcelable.Creator<OwnershipCostForm> CREATOR = new Creator();

        @c("calculateButton")
        @k
        private final OwnershipCostButton calculateButton;

        @c("distanceInput")
        @k
        private final DistanceInput distanceInput;

        @c("modalText")
        @l
        private final String modalText;

        @c("modalTitle")
        @l
        private final String modalTitle;

        @c("regionSelect")
        @k
        private final RegionSelect regionSelect;

        @c("text")
        @k
        private final String text;

        @c("title")
        @k
        private final String title;

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OwnershipCostForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostForm createFromParcel(@k Parcel parcel) {
                return new OwnershipCostForm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), DistanceInput.CREATOR.createFromParcel(parcel), RegionSelect.CREATOR.createFromParcel(parcel), OwnershipCostButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostForm[] newArray(int i12) {
                return new OwnershipCostForm[i12];
            }
        }

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0011¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;", "Landroid/os/Parcelable;", "", "label", ChannelContext.Item.PLACEHOLDER, "", "value", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;", "validation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getPlaceholder", "Ljava/lang/Long;", "getValue", "setValue", "(Ljava/lang/Long;)V", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;", "getValidation", "Validation", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class DistanceInput implements Parcelable {

            @k
            public static final Parcelable.Creator<DistanceInput> CREATOR = new Creator();

            @c("label")
            @k
            private final String label;

            @c(ChannelContext.Item.PLACEHOLDER)
            @l
            private final String placeholder;

            @c("validation")
            @l
            private final Validation validation;

            @c("value")
            @l
            private Long value;

            /* compiled from: OwnershipCostResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DistanceInput> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DistanceInput createFromParcel(@k Parcel parcel) {
                    return new DistanceInput(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Validation.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DistanceInput[] newArray(int i12) {
                    return new DistanceInput[i12];
                }
            }

            /* compiled from: OwnershipCostResponse.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;", "Landroid/os/Parcelable;", "", "minValue", "", "errorText", "maxValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getMinValue", "Ljava/lang/String;", "getErrorText", "getMaxValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Validation implements Parcelable {

                @k
                public static final Parcelable.Creator<Validation> CREATOR = new Creator();

                @c("errorText")
                @l
                private final String errorText;

                @c("maxValue")
                @l
                private final Long maxValue;

                @c("minValue")
                @l
                private final Long minValue;

                /* compiled from: OwnershipCostResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Validation> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Validation createFromParcel(@k Parcel parcel) {
                        return new Validation(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Validation[] newArray(int i12) {
                        return new Validation[i12];
                    }
                }

                public Validation(@l Long l12, @l String str, @l Long l13) {
                    this.minValue = l12;
                    this.errorText = str;
                    this.maxValue = l13;
                }

                public static /* synthetic */ Validation copy$default(Validation validation, Long l12, String str, Long l13, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        l12 = validation.minValue;
                    }
                    if ((i12 & 2) != 0) {
                        str = validation.errorText;
                    }
                    if ((i12 & 4) != 0) {
                        l13 = validation.maxValue;
                    }
                    return validation.copy(l12, str, l13);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final Long getMinValue() {
                    return this.minValue;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getErrorText() {
                    return this.errorText;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final Long getMaxValue() {
                    return this.maxValue;
                }

                @k
                public final Validation copy(@l Long minValue, @l String errorText, @l Long maxValue) {
                    return new Validation(minValue, errorText, maxValue);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Validation)) {
                        return false;
                    }
                    Validation validation = (Validation) other;
                    return L.f(this.minValue, validation.minValue) && L.f(this.errorText, validation.errorText) && L.f(this.maxValue, validation.maxValue);
                }

                @l
                public final String getErrorText() {
                    return this.errorText;
                }

                @l
                public final Long getMaxValue() {
                    return this.maxValue;
                }

                @l
                public final Long getMinValue() {
                    return this.minValue;
                }

                public int hashCode() {
                    Long l12 = this.minValue;
                    int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
                    String str = this.errorText;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Long l13 = this.maxValue;
                    return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Validation(minValue=");
                    sb2.append(this.minValue);
                    sb2.append(", errorText=");
                    sb2.append(this.errorText);
                    sb2.append(", maxValue=");
                    return m.m(sb2, this.maxValue, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Long l12 = this.minValue;
                    if (l12 == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.m(parcel, 1, l12);
                    }
                    parcel.writeString(this.errorText);
                    Long l13 = this.maxValue;
                    if (l13 == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.m(parcel, 1, l13);
                    }
                }
            }

            public DistanceInput(@k String str, @l String str2, @l Long l12, @l Validation validation) {
                this.label = str;
                this.placeholder = str2;
                this.value = l12;
                this.validation = validation;
            }

            public static /* synthetic */ DistanceInput copy$default(DistanceInput distanceInput, String str, String str2, Long l12, Validation validation, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = distanceInput.label;
                }
                if ((i12 & 2) != 0) {
                    str2 = distanceInput.placeholder;
                }
                if ((i12 & 4) != 0) {
                    l12 = distanceInput.value;
                }
                if ((i12 & 8) != 0) {
                    validation = distanceInput.validation;
                }
                return distanceInput.copy(str, str2, l12, validation);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Long getValue() {
                return this.value;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final Validation getValidation() {
                return this.validation;
            }

            @k
            public final DistanceInput copy(@k String label, @l String placeholder, @l Long value, @l Validation validation) {
                return new DistanceInput(label, placeholder, value, validation);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DistanceInput)) {
                    return false;
                }
                DistanceInput distanceInput = (DistanceInput) other;
                return L.f(this.label, distanceInput.label) && L.f(this.placeholder, distanceInput.placeholder) && L.f(this.value, distanceInput.value) && L.f(this.validation, distanceInput.validation);
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @l
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @l
            public final Validation getValidation() {
                return this.validation;
            }

            @l
            public final Long getValue() {
                return this.value;
            }

            public int hashCode() {
                int iHashCode = this.label.hashCode() * 31;
                String str = this.placeholder;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l12 = this.value;
                int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Validation validation = this.validation;
                return iHashCode3 + (validation != null ? validation.hashCode() : 0);
            }

            public final void setValue(@l Long l12) {
                this.value = l12;
            }

            @k
            public String toString() {
                return "DistanceInput(label=" + this.label + ", placeholder=" + this.placeholder + ", value=" + this.value + ", validation=" + this.validation + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.label);
                parcel.writeString(this.placeholder);
                Long l12 = this.value;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                Validation validation = this.validation;
                if (validation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    validation.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;", "Landroid/os/Parcelable;", "", "label", "", "value", "", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "values", "<init>", "(Ljava/lang/String;JLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;JLjava/util/List;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "J", "getValue", "setValue", "(J)V", "Ljava/util/List;", "getValues", "Region", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class RegionSelect implements Parcelable {

            @k
            public static final Parcelable.Creator<RegionSelect> CREATOR = new Creator();

            @c("label")
            @k
            private final String label;

            @c("value")
            private long value;

            @c("values")
            @k
            private final List<Region> values;

            /* compiled from: OwnershipCostResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RegionSelect> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RegionSelect createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    long j12 = parcel.readLong();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Region.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new RegionSelect(string, j12, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RegionSelect[] newArray(int i12) {
                    return new RegionSelect[i12];
                }
            }

            /* compiled from: OwnershipCostResponse.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "Landroid/os/Parcelable;", "", "id", "", "label", "<init>", "(JLjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getLabel", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Region implements Parcelable {

                @k
                public static final Parcelable.Creator<Region> CREATOR = new Creator();

                @c("id")
                private final long id;

                @c("label")
                @k
                private final String label;

                /* compiled from: OwnershipCostResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Region> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Region createFromParcel(@k Parcel parcel) {
                        return new Region(parcel.readLong(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Region[] newArray(int i12) {
                        return new Region[i12];
                    }
                }

                public Region(long j12, @k String str) {
                    this.id = j12;
                    this.label = str;
                }

                public static /* synthetic */ Region copy$default(Region region, long j12, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        j12 = region.id;
                    }
                    if ((i12 & 2) != 0) {
                        str = region.label;
                    }
                    return region.copy(j12, str);
                }

                /* renamed from: component1, reason: from getter */
                public final long getId() {
                    return this.id;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                @k
                public final Region copy(long id2, @k String label) {
                    return new Region(id2, label);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Region)) {
                        return false;
                    }
                    Region region = (Region) other;
                    return this.id == region.id && L.f(this.label, region.label);
                }

                public final long getId() {
                    return this.id;
                }

                @k
                public final String getLabel() {
                    return this.label;
                }

                public int hashCode() {
                    return this.label.hashCode() + (Long.hashCode(this.id) * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Region(id=");
                    sb2.append(this.id);
                    sb2.append(", label=");
                    return C22026a.c(sb2, this.label, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeLong(this.id);
                    parcel.writeString(this.label);
                }
            }

            public RegionSelect(@k String str, long j12, @k List<Region> list) {
                this.label = str;
                this.value = j12;
                this.values = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RegionSelect copy$default(RegionSelect regionSelect, String str, long j12, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = regionSelect.label;
                }
                if ((i12 & 2) != 0) {
                    j12 = regionSelect.value;
                }
                if ((i12 & 4) != 0) {
                    list = regionSelect.values;
                }
                return regionSelect.copy(str, j12, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final long getValue() {
                return this.value;
            }

            @k
            public final List<Region> component3() {
                return this.values;
            }

            @k
            public final RegionSelect copy(@k String label, long value, @k List<Region> values) {
                return new RegionSelect(label, value, values);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RegionSelect)) {
                    return false;
                }
                RegionSelect regionSelect = (RegionSelect) other;
                return L.f(this.label, regionSelect.label) && this.value == regionSelect.value && L.f(this.values, regionSelect.values);
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            public final long getValue() {
                return this.value;
            }

            @k
            public final List<Region> getValues() {
                return this.values;
            }

            public int hashCode() {
                return this.values.hashCode() + r.g(this.label.hashCode() * 31, 31, this.value);
            }

            public final void setValue(long j12) {
                this.value = j12;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("RegionSelect(label=");
                sb2.append(this.label);
                sb2.append(", value=");
                sb2.append(this.value);
                sb2.append(", values=");
                return H.p(sb2, this.values, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.label);
                parcel.writeLong(this.value);
                Iterator itJ = C0.j(this.values, parcel);
                while (itJ.hasNext()) {
                    ((Region) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        public OwnershipCostForm(@k String str, @k String str2, @l String str3, @l String str4, @k DistanceInput distanceInput, @k RegionSelect regionSelect, @k OwnershipCostButton ownershipCostButton) {
            this.title = str;
            this.text = str2;
            this.modalTitle = str3;
            this.modalText = str4;
            this.distanceInput = distanceInput;
            this.regionSelect = regionSelect;
            this.calculateButton = ownershipCostButton;
        }

        public static /* synthetic */ OwnershipCostForm copy$default(OwnershipCostForm ownershipCostForm, String str, String str2, String str3, String str4, DistanceInput distanceInput, RegionSelect regionSelect, OwnershipCostButton ownershipCostButton, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = ownershipCostForm.title;
            }
            if ((i12 & 2) != 0) {
                str2 = ownershipCostForm.text;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = ownershipCostForm.modalTitle;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                str4 = ownershipCostForm.modalText;
            }
            String str7 = str4;
            if ((i12 & 16) != 0) {
                distanceInput = ownershipCostForm.distanceInput;
            }
            DistanceInput distanceInput2 = distanceInput;
            if ((i12 & 32) != 0) {
                regionSelect = ownershipCostForm.regionSelect;
            }
            RegionSelect regionSelect2 = regionSelect;
            if ((i12 & 64) != 0) {
                ownershipCostButton = ownershipCostForm.calculateButton;
            }
            return ownershipCostForm.copy(str, str5, str6, str7, distanceInput2, regionSelect2, ownershipCostButton);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getModalTitle() {
            return this.modalTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getModalText() {
            return this.modalText;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final DistanceInput getDistanceInput() {
            return this.distanceInput;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final RegionSelect getRegionSelect() {
            return this.regionSelect;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final OwnershipCostButton getCalculateButton() {
            return this.calculateButton;
        }

        @k
        public final OwnershipCostForm copy(@k String title, @k String text, @l String modalTitle, @l String modalText, @k DistanceInput distanceInput, @k RegionSelect regionSelect, @k OwnershipCostButton calculateButton) {
            return new OwnershipCostForm(title, text, modalTitle, modalText, distanceInput, regionSelect, calculateButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnershipCostForm)) {
                return false;
            }
            OwnershipCostForm ownershipCostForm = (OwnershipCostForm) other;
            return L.f(this.title, ownershipCostForm.title) && L.f(this.text, ownershipCostForm.text) && L.f(this.modalTitle, ownershipCostForm.modalTitle) && L.f(this.modalText, ownershipCostForm.modalText) && L.f(this.distanceInput, ownershipCostForm.distanceInput) && L.f(this.regionSelect, ownershipCostForm.regionSelect) && L.f(this.calculateButton, ownershipCostForm.calculateButton);
        }

        @k
        public final OwnershipCostButton getCalculateButton() {
            return this.calculateButton;
        }

        @k
        public final DistanceInput getDistanceInput() {
            return this.distanceInput;
        }

        @l
        public final String getModalText() {
            return this.modalText;
        }

        @l
        public final String getModalTitle() {
            return this.modalTitle;
        }

        @k
        public final RegionSelect getRegionSelect() {
            return this.regionSelect;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.text);
            String str = this.modalTitle;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.modalText;
            return this.calculateButton.hashCode() + ((this.regionSelect.hashCode() + ((this.distanceInput.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @k
        public String toString() {
            return "OwnershipCostForm(title=" + this.title + ", text=" + this.text + ", modalTitle=" + this.modalTitle + ", modalText=" + this.modalText + ", distanceInput=" + this.distanceInput + ", regionSelect=" + this.regionSelect + ", calculateButton=" + this.calculateButton + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.modalTitle);
            parcel.writeString(this.modalText);
            this.distanceInput.writeToParcel(parcel, flags);
            this.regionSelect.writeToParcel(parcel, flags);
            this.calculateButton.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: OwnershipCostResponse.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b)\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;", "Landroid/os/Parcelable;", "", "title", "text", "", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab;", "tabs", "Lcom/avito/android/remote/model/OwnershipCostButton;", "links", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "Ljava/util/List;", "getTabs", "getLinks", "CostResultTab", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class OwnershipCostResults implements Parcelable {

        @k
        public static final Parcelable.Creator<OwnershipCostResults> CREATOR = new Creator();

        @c("links")
        @k
        private final List<OwnershipCostButton> links;

        @c("tabs")
        @k
        private final List<CostResultTab> tabs;

        @c("text")
        @k
        private final String text;

        @c("title")
        @k
        private final String title;

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;", "rows", "total", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRows", "Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;", "getTotal", "CostResultTabRow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class CostResultTab implements Parcelable {

            @k
            public static final Parcelable.Creator<CostResultTab> CREATOR = new Creator();

            @c("rows")
            @k
            private final List<CostResultTabRow> rows;

            @c("title")
            @k
            private final String title;

            @c("total")
            @k
            private final CostResultTabRow total;

            /* compiled from: OwnershipCostResponse.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;", "Landroid/os/Parcelable;", "", "label", "value", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostResults$CostResultTab$CostResultTabRow;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getValue", "getSubtitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class CostResultTabRow implements Parcelable {

                @k
                public static final Parcelable.Creator<CostResultTabRow> CREATOR = new Creator();

                @c("label")
                @k
                private final String label;

                @c("subtitle")
                @l
                private final String subtitle;

                @c("value")
                @k
                private final String value;

                /* compiled from: OwnershipCostResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<CostResultTabRow> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final CostResultTabRow createFromParcel(@k Parcel parcel) {
                        return new CostResultTabRow(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final CostResultTabRow[] newArray(int i12) {
                        return new CostResultTabRow[i12];
                    }
                }

                public CostResultTabRow(@k String str, @k String str2, @l String str3) {
                    this.label = str;
                    this.value = str2;
                    this.subtitle = str3;
                }

                public static /* synthetic */ CostResultTabRow copy$default(CostResultTabRow costResultTabRow, String str, String str2, String str3, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = costResultTabRow.label;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = costResultTabRow.value;
                    }
                    if ((i12 & 4) != 0) {
                        str3 = costResultTabRow.subtitle;
                    }
                    return costResultTabRow.copy(str, str2, str3);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                public final CostResultTabRow copy(@k String label, @k String value, @l String subtitle) {
                    return new CostResultTabRow(label, value, subtitle);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CostResultTabRow)) {
                        return false;
                    }
                    CostResultTabRow costResultTabRow = (CostResultTabRow) other;
                    return L.f(this.label, costResultTabRow.label) && L.f(this.value, costResultTabRow.value) && L.f(this.subtitle, costResultTabRow.subtitle);
                }

                @k
                public final String getLabel() {
                    return this.label;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    int iD2 = H.d(this.label.hashCode() * 31, 31, this.value);
                    String str = this.subtitle;
                    return iD2 + (str == null ? 0 : str.hashCode());
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("CostResultTabRow(label=");
                    sb2.append(this.label);
                    sb2.append(", value=");
                    sb2.append(this.value);
                    sb2.append(", subtitle=");
                    return C22026a.c(sb2, this.subtitle, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.label);
                    parcel.writeString(this.value);
                    parcel.writeString(this.subtitle);
                }
            }

            /* compiled from: OwnershipCostResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CostResultTab> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CostResultTab createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(CostResultTabRow.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new CostResultTab(string, arrayList, CostResultTabRow.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CostResultTab[] newArray(int i12) {
                    return new CostResultTab[i12];
                }
            }

            public CostResultTab(@k String str, @k List<CostResultTabRow> list, @k CostResultTabRow costResultTabRow) {
                this.title = str;
                this.rows = list;
                this.total = costResultTabRow;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CostResultTab copy$default(CostResultTab costResultTab, String str, List list, CostResultTabRow costResultTabRow, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = costResultTab.title;
                }
                if ((i12 & 2) != 0) {
                    list = costResultTab.rows;
                }
                if ((i12 & 4) != 0) {
                    costResultTabRow = costResultTab.total;
                }
                return costResultTab.copy(str, list, costResultTabRow);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            public final List<CostResultTabRow> component2() {
                return this.rows;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final CostResultTabRow getTotal() {
                return this.total;
            }

            @k
            public final CostResultTab copy(@k String title, @k List<CostResultTabRow> rows, @k CostResultTabRow total) {
                return new CostResultTab(title, rows, total);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CostResultTab)) {
                    return false;
                }
                CostResultTab costResultTab = (CostResultTab) other;
                return L.f(this.title, costResultTab.title) && L.f(this.rows, costResultTab.rows) && L.f(this.total, costResultTab.total);
            }

            @k
            public final List<CostResultTabRow> getRows() {
                return this.rows;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @k
            public final CostResultTabRow getTotal() {
                return this.total;
            }

            public int hashCode() {
                return this.total.hashCode() + H.e(this.title.hashCode() * 31, 31, this.rows);
            }

            @k
            public String toString() {
                return "CostResultTab(title=" + this.title + ", rows=" + this.rows + ", total=" + this.total + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                Iterator itJ = C0.j(this.rows, parcel);
                while (itJ.hasNext()) {
                    ((CostResultTabRow) itJ.next()).writeToParcel(parcel, flags);
                }
                this.total.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: OwnershipCostResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OwnershipCostResults> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostResults createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(CostResultTab.CREATOR, parcel, arrayList, iC3, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(OwnershipCostButton.CREATOR, parcel, arrayList2, iC2, 1);
                }
                return new OwnershipCostResults(string, string2, arrayList, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OwnershipCostResults[] newArray(int i12) {
                return new OwnershipCostResults[i12];
            }
        }

        public OwnershipCostResults(@k String str, @k String str2, @k List<CostResultTab> list, @k List<OwnershipCostButton> list2) {
            this.title = str;
            this.text = str2;
            this.tabs = list;
            this.links = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OwnershipCostResults copy$default(OwnershipCostResults ownershipCostResults, String str, String str2, List list, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = ownershipCostResults.title;
            }
            if ((i12 & 2) != 0) {
                str2 = ownershipCostResults.text;
            }
            if ((i12 & 4) != 0) {
                list = ownershipCostResults.tabs;
            }
            if ((i12 & 8) != 0) {
                list2 = ownershipCostResults.links;
            }
            return ownershipCostResults.copy(str, str2, list, list2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final List<CostResultTab> component3() {
            return this.tabs;
        }

        @k
        public final List<OwnershipCostButton> component4() {
            return this.links;
        }

        @k
        public final OwnershipCostResults copy(@k String title, @k String text, @k List<CostResultTab> tabs, @k List<OwnershipCostButton> links) {
            return new OwnershipCostResults(title, text, tabs, links);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnershipCostResults)) {
                return false;
            }
            OwnershipCostResults ownershipCostResults = (OwnershipCostResults) other;
            return L.f(this.title, ownershipCostResults.title) && L.f(this.text, ownershipCostResults.text) && L.f(this.tabs, ownershipCostResults.tabs) && L.f(this.links, ownershipCostResults.links);
        }

        @k
        public final List<OwnershipCostButton> getLinks() {
            return this.links;
        }

        @k
        public final List<CostResultTab> getTabs() {
            return this.tabs;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.links.hashCode() + H.e(H.d(this.title.hashCode() * 31, 31, this.text), 31, this.tabs);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OwnershipCostResults(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", tabs=");
            sb2.append(this.tabs);
            sb2.append(", links=");
            return H.p(sb2, this.links, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            Iterator itJ = C0.j(this.tabs, parcel);
            while (itJ.hasNext()) {
                ((CostResultTab) itJ.next()).writeToParcel(parcel, flags);
            }
            Iterator itJ2 = C0.j(this.links, parcel);
            while (itJ2.hasNext()) {
                ((OwnershipCostButton) itJ2.next()).writeToParcel(parcel, flags);
            }
        }
    }

    public OwnershipCostResponse(@k OwnershipCostForm ownershipCostForm, @k OwnershipCostResults ownershipCostResults, @k OwnershipCostDisclaimer ownershipCostDisclaimer) {
        this.ownershipCostForm = ownershipCostForm;
        this.ownershipCostResults = ownershipCostResults;
        this.ownershipCostDisclaimer = ownershipCostDisclaimer;
    }

    public static /* synthetic */ OwnershipCostResponse copy$default(OwnershipCostResponse ownershipCostResponse, OwnershipCostForm ownershipCostForm, OwnershipCostResults ownershipCostResults, OwnershipCostDisclaimer ownershipCostDisclaimer, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            ownershipCostForm = ownershipCostResponse.ownershipCostForm;
        }
        if ((i12 & 2) != 0) {
            ownershipCostResults = ownershipCostResponse.ownershipCostResults;
        }
        if ((i12 & 4) != 0) {
            ownershipCostDisclaimer = ownershipCostResponse.ownershipCostDisclaimer;
        }
        return ownershipCostResponse.copy(ownershipCostForm, ownershipCostResults, ownershipCostDisclaimer);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final OwnershipCostForm getOwnershipCostForm() {
        return this.ownershipCostForm;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final OwnershipCostResults getOwnershipCostResults() {
        return this.ownershipCostResults;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final OwnershipCostDisclaimer getOwnershipCostDisclaimer() {
        return this.ownershipCostDisclaimer;
    }

    @k
    public final OwnershipCostResponse copy(@k OwnershipCostForm ownershipCostForm, @k OwnershipCostResults ownershipCostResults, @k OwnershipCostDisclaimer ownershipCostDisclaimer) {
        return new OwnershipCostResponse(ownershipCostForm, ownershipCostResults, ownershipCostDisclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnershipCostResponse)) {
            return false;
        }
        OwnershipCostResponse ownershipCostResponse = (OwnershipCostResponse) other;
        return L.f(this.ownershipCostForm, ownershipCostResponse.ownershipCostForm) && L.f(this.ownershipCostResults, ownershipCostResponse.ownershipCostResults) && L.f(this.ownershipCostDisclaimer, ownershipCostResponse.ownershipCostDisclaimer);
    }

    @k
    public final OwnershipCostDisclaimer getOwnershipCostDisclaimer() {
        return this.ownershipCostDisclaimer;
    }

    @k
    public final OwnershipCostForm getOwnershipCostForm() {
        return this.ownershipCostForm;
    }

    @k
    public final OwnershipCostResults getOwnershipCostResults() {
        return this.ownershipCostResults;
    }

    public int hashCode() {
        return this.ownershipCostDisclaimer.hashCode() + ((this.ownershipCostResults.hashCode() + (this.ownershipCostForm.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        return "OwnershipCostResponse(ownershipCostForm=" + this.ownershipCostForm + ", ownershipCostResults=" + this.ownershipCostResults + ", ownershipCostDisclaimer=" + this.ownershipCostDisclaimer + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.ownershipCostForm.writeToParcel(parcel, flags);
        this.ownershipCostResults.writeToParcel(parcel, flags);
        this.ownershipCostDisclaimer.writeToParcel(parcel, flags);
    }
}
