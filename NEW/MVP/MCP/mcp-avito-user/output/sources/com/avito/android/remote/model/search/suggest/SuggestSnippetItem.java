package com.avito.android.remote.model.search.suggest;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestItem.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012JV\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b4\u0010\u0012¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestSnippetItem;", "Lcom/avito/android/remote/model/search/suggest/SuggestItem;", "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "price", "oldPrice", "additionalInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/search/suggest/SuggestSnippetItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/lang/String;", "getPrice", "getOldPrice", "getAdditionalInfo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuggestSnippetItem extends SuggestItem {

    @k
    public static final Parcelable.Creator<SuggestSnippetItem> CREATOR = new Creator();

    @c("actions")
    @k
    private final List<SuggestAction> actions;

    @c("additionalInfo")
    @l
    private final AttributedText additionalInfo;

    @c("image")
    @k
    private final UniversalImage image;

    @c("oldPrice")
    @l
    private final String oldPrice;

    @c("price")
    @k
    private final String price;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuggestSnippetItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestSnippetItem createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(SuggestSnippetItem.class, parcel, arrayList, iL2, 1);
            }
            return new SuggestSnippetItem(arrayList, (AttributedText) parcel.readParcelable(SuggestSnippetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SuggestSnippetItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SuggestSnippetItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestSnippetItem[] newArray(int i12) {
            return new SuggestSnippetItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestSnippetItem(@k List<? extends SuggestAction> list, @k AttributedText attributedText, @k UniversalImage universalImage, @k String str, @l String str2, @l AttributedText attributedText2) {
        super(null);
        this.actions = list;
        this.title = attributedText;
        this.image = universalImage;
        this.price = str;
        this.oldPrice = str2;
        this.additionalInfo = attributedText2;
    }

    public static /* synthetic */ SuggestSnippetItem copy$default(SuggestSnippetItem suggestSnippetItem, List list, AttributedText attributedText, UniversalImage universalImage, String str, String str2, AttributedText attributedText2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = suggestSnippetItem.actions;
        }
        if ((i12 & 2) != 0) {
            attributedText = suggestSnippetItem.title;
        }
        AttributedText attributedText3 = attributedText;
        if ((i12 & 4) != 0) {
            universalImage = suggestSnippetItem.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            str = suggestSnippetItem.price;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            str2 = suggestSnippetItem.oldPrice;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            attributedText2 = suggestSnippetItem.additionalInfo;
        }
        return suggestSnippetItem.copy(list, attributedText3, universalImage2, str3, str4, attributedText2);
    }

    @k
    public final List<SuggestAction> component1() {
        return this.actions;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
    }

    @k
    public final SuggestSnippetItem copy(@k List<? extends SuggestAction> actions, @k AttributedText title, @k UniversalImage image, @k String price, @l String oldPrice, @l AttributedText additionalInfo) {
        return new SuggestSnippetItem(actions, title, image, price, oldPrice, additionalInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestSnippetItem)) {
            return false;
        }
        SuggestSnippetItem suggestSnippetItem = (SuggestSnippetItem) other;
        return L.f(this.actions, suggestSnippetItem.actions) && L.f(this.title, suggestSnippetItem.title) && L.f(this.image, suggestSnippetItem.image) && L.f(this.price, suggestSnippetItem.price) && L.f(this.oldPrice, suggestSnippetItem.oldPrice) && L.f(this.additionalInfo, suggestSnippetItem.additionalInfo);
    }

    @k
    public final List<SuggestAction> getActions() {
        return this.actions;
    }

    @l
    public final AttributedText getAdditionalInfo() {
        return this.additionalInfo;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(a.a(a.b(this.actions.hashCode() * 31, 31, this.title), 31, this.image), 31, this.price);
        String str = this.oldPrice;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.additionalInfo;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestSnippetItem(actions=");
        sb2.append(this.actions);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", oldPrice=");
        sb2.append(this.oldPrice);
        sb2.append(", additionalInfo=");
        return a.w(sb2, this.additionalInfo, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.price);
        parcel.writeString(this.oldPrice);
        parcel.writeParcelable(this.additionalInfo, flags);
    }
}
