package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001UB¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010%J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010%JÊ\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000202HÖ\u0001¢\u0006\u0004\b:\u00104J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bE\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bF\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bG\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010#R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bL\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bQ\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bR\u0010\u001eR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bS\u0010%R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bT\u0010%¨\u0006V"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "id", "", "createdAt", "status", "statusText", "rejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;", "recipient", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "reviewSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "", "score", "itemTitle", "stageTitle", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection;", "textSections", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action;", "actions", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/avito/android/remote/model/text/AttributedText;", "component10", "()Ljava/lang/Float;", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "Ljava/lang/String;", "getCreatedAt", "getStatus", "getStatusText", "getRejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;", "getRecipient", "Ljava/util/List;", "getImages", "getReviewSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedStatusText", "Ljava/lang/Float;", "getScore", "getItemTitle", "getStageTitle", "getTextSections", "getActions", "Recipient", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuyerReviewEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<BuyerReviewEntry> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<ReviewEntry.Action> actions;

    @c("attributedStatusText")
    @l
    private final AttributedText attributedStatusText;

    @c("createdAt")
    @l
    private final String createdAt;

    @c("id")
    @l
    private final Long id;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("recipient")
    @l
    private final Recipient recipient;

    @c("rejectMessage")
    @l
    private final String rejectMessage;

    @c("reviewSubtitle")
    @l
    private final String reviewSubtitle;

    @c("score")
    @l
    private final Float score;

    @c("stageTitle")
    @l
    private final String stageTitle;

    @c("status")
    @l
    private final String status;

    @c("statusText")
    @l
    private final String statusText;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerReviewEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerReviewEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Recipient recipientCreateFromParcel = parcel.readInt() == 0 ? null : Recipient.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BuyerReviewEntry.class, parcel, arrayList, iL2, 1);
                }
            }
            String string5 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BuyerReviewEntry.class.getClassLoader());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string7;
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(TextSection.CREATOR, parcel, arrayList2, iC2, 1);
                    i13 = i13;
                    string7 = string7;
                }
                str = string7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = a.c(ReviewEntry.Action.CREATOR, parcel, arrayList5, iC3, 1);
                    i14 = i14;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList5;
            }
            return new BuyerReviewEntry(lValueOf, string, string2, string3, string4, recipientCreateFromParcel, arrayList, string5, attributedText, fValueOf, string6, str, arrayList3, arrayList4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerReviewEntry[] newArray(int i12) {
            return new BuyerReviewEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "avatar", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/rating_details_mvi/BuyerReviewEntry$Recipient;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getAvatar", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Recipient implements Parcelable {

        @k
        public static final Parcelable.Creator<Recipient> CREATOR = new Creator();

        @c("avatar")
        @l
        private final Image avatar;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Recipient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Recipient createFromParcel(@k Parcel parcel) {
                return new Recipient(parcel.readString(), (Image) parcel.readParcelable(Recipient.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Recipient[] newArray(int i12) {
                return new Recipient[i12];
            }
        }

        public Recipient(@k String str, @l Image image) {
            this.title = str;
            this.avatar = image;
        }

        public static /* synthetic */ Recipient copy$default(Recipient recipient, String str, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recipient.title;
            }
            if ((i12 & 2) != 0) {
                image = recipient.avatar;
            }
            return recipient.copy(str, image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @k
        public final Recipient copy(@k String title, @l Image avatar) {
            return new Recipient(title, avatar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recipient)) {
                return false;
            }
            Recipient recipient = (Recipient) other;
            return L.f(this.title, recipient.title) && L.f(this.avatar, recipient.avatar);
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Image image = this.avatar;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Recipient(title=");
            sb2.append(this.title);
            sb2.append(", avatar=");
            return AK.c.o(sb2, this.avatar, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.avatar, flags);
        }
    }

    public BuyerReviewEntry(@l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l Recipient recipient, @l List<TnsGalleryImage> list, @l String str5, @l AttributedText attributedText, @l Float f12, @l String str6, @l String str7, @l List<TextSection> list2, @l List<ReviewEntry.Action> list3) {
        this.id = l12;
        this.createdAt = str;
        this.status = str2;
        this.statusText = str3;
        this.rejectMessage = str4;
        this.recipient = recipient;
        this.images = list;
        this.reviewSubtitle = str5;
        this.attributedStatusText = attributedText;
        this.score = f12;
        this.itemTitle = str6;
        this.stageTitle = str7;
        this.textSections = list2;
        this.actions = list3;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    public final List<TextSection> component13() {
        return this.textSections;
    }

    @l
    public final List<ReviewEntry.Action> component14() {
        return this.actions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Recipient getRecipient() {
        return this.recipient;
    }

    @l
    public final List<TnsGalleryImage> component7() {
        return this.images;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getReviewSubtitle() {
        return this.reviewSubtitle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AttributedText getAttributedStatusText() {
        return this.attributedStatusText;
    }

    @k
    public final BuyerReviewEntry copy(@l Long id2, @l String createdAt, @l String status, @l String statusText, @l String rejectMessage, @l Recipient recipient, @l List<TnsGalleryImage> images, @l String reviewSubtitle, @l AttributedText attributedStatusText, @l Float score, @l String itemTitle, @l String stageTitle, @l List<TextSection> textSections, @l List<ReviewEntry.Action> actions) {
        return new BuyerReviewEntry(id2, createdAt, status, statusText, rejectMessage, recipient, images, reviewSubtitle, attributedStatusText, score, itemTitle, stageTitle, textSections, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyerReviewEntry)) {
            return false;
        }
        BuyerReviewEntry buyerReviewEntry = (BuyerReviewEntry) other;
        return L.f(this.id, buyerReviewEntry.id) && L.f(this.createdAt, buyerReviewEntry.createdAt) && L.f(this.status, buyerReviewEntry.status) && L.f(this.statusText, buyerReviewEntry.statusText) && L.f(this.rejectMessage, buyerReviewEntry.rejectMessage) && L.f(this.recipient, buyerReviewEntry.recipient) && L.f(this.images, buyerReviewEntry.images) && L.f(this.reviewSubtitle, buyerReviewEntry.reviewSubtitle) && L.f(this.attributedStatusText, buyerReviewEntry.attributedStatusText) && L.f(this.score, buyerReviewEntry.score) && L.f(this.itemTitle, buyerReviewEntry.itemTitle) && L.f(this.stageTitle, buyerReviewEntry.stageTitle) && L.f(this.textSections, buyerReviewEntry.textSections) && L.f(this.actions, buyerReviewEntry.actions);
    }

    @l
    public final List<ReviewEntry.Action> getActions() {
        return this.actions;
    }

    @l
    public final AttributedText getAttributedStatusText() {
        return this.attributedStatusText;
    }

    @l
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    public final Long getId() {
        return this.id;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final Recipient getRecipient() {
        return this.recipient;
    }

    @l
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @l
    public final String getReviewSubtitle() {
        return this.reviewSubtitle;
    }

    @l
    public final Float getScore() {
        return this.score;
    }

    @l
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    public final List<TextSection> getTextSections() {
        return this.textSections;
    }

    public int hashCode() {
        Long l12 = this.id;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.createdAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rejectMessage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Recipient recipient = this.recipient;
        int iHashCode6 = (iHashCode5 + (recipient == null ? 0 : recipient.hashCode())) * 31;
        List<TnsGalleryImage> list = this.images;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.reviewSubtitle;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AttributedText attributedText = this.attributedStatusText;
        int iHashCode9 = (iHashCode8 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Float f12 = this.score;
        int iHashCode10 = (iHashCode9 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str6 = this.itemTitle;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.stageTitle;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TextSection> list2 = this.textSections;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ReviewEntry.Action> list3 = this.actions;
        return iHashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerReviewEntry(id=");
        sb2.append(this.id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", statusText=");
        sb2.append(this.statusText);
        sb2.append(", rejectMessage=");
        sb2.append(this.rejectMessage);
        sb2.append(", recipient=");
        sb2.append(this.recipient);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", reviewSubtitle=");
        sb2.append(this.reviewSubtitle);
        sb2.append(", attributedStatusText=");
        sb2.append(this.attributedStatusText);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", itemTitle=");
        sb2.append(this.itemTitle);
        sb2.append(", stageTitle=");
        sb2.append(this.stageTitle);
        sb2.append(", textSections=");
        sb2.append(this.textSections);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.createdAt);
        parcel.writeString(this.status);
        parcel.writeString(this.statusText);
        parcel.writeString(this.rejectMessage);
        Recipient recipient = this.recipient;
        if (recipient == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recipient.writeToParcel(parcel, flags);
        }
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.reviewSubtitle);
        parcel.writeParcelable(this.attributedStatusText, flags);
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.stageTitle);
        List<TextSection> list2 = this.textSections;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((TextSection) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<ReviewEntry.Action> list3 = this.actions;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            ((ReviewEntry.Action) itA3.next()).writeToParcel(parcel, flags);
        }
    }
}
