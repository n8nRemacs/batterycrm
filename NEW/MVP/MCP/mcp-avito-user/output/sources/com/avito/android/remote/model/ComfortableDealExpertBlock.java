package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealExpertBlock.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealExpertBlock;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/ExpertBlock;", "expertBlock", "", "Lcom/avito/android/remote/model/Benefit;", "benefits", "Lcom/avito/android/remote/model/ButtonInfo;", "buttonInfo", "Lcom/avito/android/remote/model/BottomSheetContent;", "bottomSheetContent", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExpertBlock;Ljava/util/List;Lcom/avito/android/remote/model/ButtonInfo;Lcom/avito/android/remote/model/BottomSheetContent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/ExpertBlock;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/ButtonInfo;", "component5", "()Lcom/avito/android/remote/model/BottomSheetContent;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExpertBlock;Ljava/util/List;Lcom/avito/android/remote/model/ButtonInfo;Lcom/avito/android/remote/model/BottomSheetContent;)Lcom/avito/android/remote/model/ComfortableDealExpertBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/ExpertBlock;", "getExpertBlock", "Ljava/util/List;", "getBenefits", "Lcom/avito/android/remote/model/ButtonInfo;", "getButtonInfo", "Lcom/avito/android/remote/model/BottomSheetContent;", "getBottomSheetContent", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealExpertBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealExpertBlock> CREATOR = new Creator();

    @c("benefits")
    @k
    private final List<Benefit> benefits;

    @c("bottomSheet")
    @k
    private final BottomSheetContent bottomSheetContent;

    @c("contactButton")
    @k
    private final ButtonInfo buttonInfo;

    @c("expertBlock")
    @k
    private final ExpertBlock expertBlock;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComfortableDealExpertBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealExpertBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealExpertBlock createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            ExpertBlock expertBlockCreateFromParcel = ExpertBlock.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ComfortableDealExpertBlock(string, expertBlockCreateFromParcel, arrayList, ButtonInfo.CREATOR.createFromParcel(parcel), BottomSheetContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealExpertBlock[] newArray(int i12) {
            return new ComfortableDealExpertBlock[i12];
        }
    }

    public ComfortableDealExpertBlock(@k String str, @k ExpertBlock expertBlock, @k List<Benefit> list, @k ButtonInfo buttonInfo, @k BottomSheetContent bottomSheetContent) {
        this.title = str;
        this.expertBlock = expertBlock;
        this.benefits = list;
        this.buttonInfo = buttonInfo;
        this.bottomSheetContent = bottomSheetContent;
    }

    public static /* synthetic */ ComfortableDealExpertBlock copy$default(ComfortableDealExpertBlock comfortableDealExpertBlock, String str, ExpertBlock expertBlock, List list, ButtonInfo buttonInfo, BottomSheetContent bottomSheetContent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = comfortableDealExpertBlock.title;
        }
        if ((i12 & 2) != 0) {
            expertBlock = comfortableDealExpertBlock.expertBlock;
        }
        ExpertBlock expertBlock2 = expertBlock;
        if ((i12 & 4) != 0) {
            list = comfortableDealExpertBlock.benefits;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            buttonInfo = comfortableDealExpertBlock.buttonInfo;
        }
        ButtonInfo buttonInfo2 = buttonInfo;
        if ((i12 & 16) != 0) {
            bottomSheetContent = comfortableDealExpertBlock.bottomSheetContent;
        }
        return comfortableDealExpertBlock.copy(str, expertBlock2, list2, buttonInfo2, bottomSheetContent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ExpertBlock getExpertBlock() {
        return this.expertBlock;
    }

    @k
    public final List<Benefit> component3() {
        return this.benefits;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final ButtonInfo getButtonInfo() {
        return this.buttonInfo;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final BottomSheetContent getBottomSheetContent() {
        return this.bottomSheetContent;
    }

    @k
    public final ComfortableDealExpertBlock copy(@k String title, @k ExpertBlock expertBlock, @k List<Benefit> benefits, @k ButtonInfo buttonInfo, @k BottomSheetContent bottomSheetContent) {
        return new ComfortableDealExpertBlock(title, expertBlock, benefits, buttonInfo, bottomSheetContent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealExpertBlock)) {
            return false;
        }
        ComfortableDealExpertBlock comfortableDealExpertBlock = (ComfortableDealExpertBlock) other;
        return L.f(this.title, comfortableDealExpertBlock.title) && L.f(this.expertBlock, comfortableDealExpertBlock.expertBlock) && L.f(this.benefits, comfortableDealExpertBlock.benefits) && L.f(this.buttonInfo, comfortableDealExpertBlock.buttonInfo) && L.f(this.bottomSheetContent, comfortableDealExpertBlock.bottomSheetContent);
    }

    @k
    public final List<Benefit> getBenefits() {
        return this.benefits;
    }

    @k
    public final BottomSheetContent getBottomSheetContent() {
        return this.bottomSheetContent;
    }

    @k
    public final ButtonInfo getButtonInfo() {
        return this.buttonInfo;
    }

    @k
    public final ExpertBlock getExpertBlock() {
        return this.expertBlock;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.bottomSheetContent.hashCode() + ((this.buttonInfo.hashCode() + H.e((this.expertBlock.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.benefits)) * 31);
    }

    @k
    public String toString() {
        return "ComfortableDealExpertBlock(title=" + this.title + ", expertBlock=" + this.expertBlock + ", benefits=" + this.benefits + ", buttonInfo=" + this.buttonInfo + ", bottomSheetContent=" + this.bottomSheetContent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.expertBlock.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.benefits, parcel);
        while (itJ.hasNext()) {
            ((Benefit) itJ.next()).writeToParcel(parcel, flags);
        }
        this.buttonInfo.writeToParcel(parcel, flags);
        this.bottomSheetContent.writeToParcel(parcel, flags);
    }
}
