package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollLink.kt */
@K51.d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/avito/android/deep_linking/links/ImvGoodsPollLinkBody;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/ImvGoodsOptionType;", "selectType", "", "Lcom/avito/android/deep_linking/links/ImvGoodsPollLinkBodyOption;", "options", "actionTitle", "selectErrorMessage", "successTitle", "successDescription", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/ImvGoodsOptionType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/ImvGoodsOptionType;", "f", "()Lcom/avito/android/deep_linking/links/ImvGoodsOptionType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "e", "h", "g", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImvGoodsPollLinkBody implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvGoodsPollLinkBody> CREATOR = new a();

    @com.google.gson.annotations.c("actionTitle")
    @Y61.l
    private final String actionTitle;

    @com.google.gson.annotations.c("options")
    @Y61.l
    private final List<ImvGoodsPollLinkBodyOption> options;

    @com.google.gson.annotations.c("selectErrorMessage")
    @Y61.l
    private final String selectErrorMessage;

    @com.google.gson.annotations.c("selectType")
    @Y61.l
    private final ImvGoodsOptionType selectType;

    @com.google.gson.annotations.c("successDescription")
    @Y61.l
    private final String successDescription;

    @com.google.gson.annotations.c("successTitle")
    @Y61.l
    private final String successTitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: ImvGoodsPollLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvGoodsPollLinkBody> {
        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollLinkBody createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            ImvGoodsOptionType imvGoodsOptionTypeValueOf = parcel.readInt() == 0 ? null : ImvGoodsOptionType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ImvGoodsPollLinkBodyOption.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ImvGoodsPollLinkBody(string, imvGoodsOptionTypeValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollLinkBody[] newArray(int i12) {
            return new ImvGoodsPollLinkBody[i12];
        }
    }

    public ImvGoodsPollLinkBody() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Y61.l
    public final List<ImvGoodsPollLinkBodyOption> d() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getSelectErrorMessage() {
        return this.selectErrorMessage;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvGoodsPollLinkBody)) {
            return false;
        }
        ImvGoodsPollLinkBody imvGoodsPollLinkBody = (ImvGoodsPollLinkBody) obj;
        return kotlin.jvm.internal.L.f(this.title, imvGoodsPollLinkBody.title) && this.selectType == imvGoodsPollLinkBody.selectType && kotlin.jvm.internal.L.f(this.options, imvGoodsPollLinkBody.options) && kotlin.jvm.internal.L.f(this.actionTitle, imvGoodsPollLinkBody.actionTitle) && kotlin.jvm.internal.L.f(this.selectErrorMessage, imvGoodsPollLinkBody.selectErrorMessage) && kotlin.jvm.internal.L.f(this.successTitle, imvGoodsPollLinkBody.successTitle) && kotlin.jvm.internal.L.f(this.successDescription, imvGoodsPollLinkBody.successDescription);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final ImvGoodsOptionType getSelectType() {
        return this.selectType;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getSuccessDescription() {
        return this.successDescription;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getSuccessTitle() {
        return this.successTitle;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImvGoodsOptionType imvGoodsOptionType = this.selectType;
        int iHashCode2 = (iHashCode + (imvGoodsOptionType == null ? 0 : imvGoodsOptionType.hashCode())) * 31;
        List<ImvGoodsPollLinkBodyOption> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.actionTitle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectErrorMessage;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.successTitle;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.successDescription;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvGoodsPollLinkBody(title=");
        sb2.append(this.title);
        sb2.append(", selectType=");
        sb2.append(this.selectType);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", actionTitle=");
        sb2.append(this.actionTitle);
        sb2.append(", selectErrorMessage=");
        sb2.append(this.selectErrorMessage);
        sb2.append(", successTitle=");
        sb2.append(this.successTitle);
        sb2.append(", successDescription=");
        return C22026a.c(sb2, this.successDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        ImvGoodsOptionType imvGoodsOptionType = this.selectType;
        if (imvGoodsOptionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(imvGoodsOptionType.name());
        }
        List<ImvGoodsPollLinkBodyOption> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ImvGoodsPollLinkBodyOption) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.selectErrorMessage);
        parcel.writeString(this.successTitle);
        parcel.writeString(this.successDescription);
    }

    public ImvGoodsPollLinkBody(@Y61.l String str, @Y61.l ImvGoodsOptionType imvGoodsOptionType, @Y61.l List<ImvGoodsPollLinkBodyOption> list, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.title = str;
        this.selectType = imvGoodsOptionType;
        this.options = list;
        this.actionTitle = str2;
        this.selectErrorMessage = str3;
        this.successTitle = str4;
        this.successDescription = str5;
    }

    public /* synthetic */ ImvGoodsPollLinkBody(String str, ImvGoodsOptionType imvGoodsOptionType, List list, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : imvGoodsOptionType, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5);
    }
}
