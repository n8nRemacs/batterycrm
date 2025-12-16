package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySubsidySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySummary;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "legal", "promoLegal", "", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidy;", "subsidies", "titleSlotId", "defaultSubsidyId", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getLegal", "getPromoLegal", "Ljava/util/List;", "getSubsidies", "()Ljava/util/List;", "getTitleSlotId", "getDefaultSubsidyId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySubsidySummary implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliverySubsidySummary> CREATOR = new Creator();

    @c("defaultSubsidyId")
    @l
    private final String defaultSubsidyId;

    @c("legal")
    @l
    private final AttributedText legal;

    @c("promoLegal")
    @l
    private final AttributedText promoLegal;

    @c("subsidies")
    @l
    private final List<DeliverySubsidy> subsidies;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    @c("titleSlotId")
    @l
    private final String titleSlotId;

    /* compiled from: DeliverySubsidySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySubsidySummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidySummary createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DeliverySubsidySummary.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(DeliverySubsidySummary.class.getClassLoader());
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(DeliverySubsidySummary.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(DeliverySubsidy.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new DeliverySubsidySummary(string, attributedText, attributedText2, attributedText3, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidySummary[] newArray(int i12) {
            return new DeliverySubsidySummary[i12];
        }
    }

    public DeliverySubsidySummary(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l List<DeliverySubsidy> list, @l String str2, @l String str3) {
        this.title = str;
        this.subtitle = attributedText;
        this.legal = attributedText2;
        this.promoLegal = attributedText3;
        this.subsidies = list;
        this.titleSlotId = str2;
        this.defaultSubsidyId = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDefaultSubsidyId() {
        return this.defaultSubsidyId;
    }

    @l
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    public final AttributedText getPromoLegal() {
        return this.promoLegal;
    }

    @l
    public final List<DeliverySubsidy> getSubsidies() {
        return this.subsidies;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTitleSlotId() {
        return this.titleSlotId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.legal, flags);
        parcel.writeParcelable(this.promoLegal, flags);
        List<DeliverySubsidy> list = this.subsidies;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DeliverySubsidy) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.titleSlotId);
        parcel.writeString(this.defaultSubsidyId);
    }

    public /* synthetic */ DeliverySubsidySummary(String str, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, List list, String str2, String str3, int i12, C42822w c42822w) {
        this(str, attributedText, attributedText2, (i12 & 8) != 0 ? null : attributedText3, list, str2, str3);
    }
}
