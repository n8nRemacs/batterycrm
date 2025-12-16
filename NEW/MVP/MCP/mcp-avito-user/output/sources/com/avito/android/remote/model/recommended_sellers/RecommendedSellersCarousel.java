package com.avito.android.remote.model.recommended_sellers;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.util.O2;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RecommendedSellersCarousel.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0014\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\"\u0010\u0014\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u001fR \u0010&\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b(\u0010!\u001a\u0004\b&\u0010\u0018R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/recommended_sellers/RecommendedSellersCarousel;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "", "title", "", "isAvailableToHide", "", "Lcom/avito/android/remote/model/recommended_sellers/RecommendedSellerElement;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "id", "getId", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "iconUri", "getIconUri", "setIconUri", "getIconUri$annotations", "isCollapsed", "Z", "isCollapsed$annotations", "getHasContent", "()Z", "hasContent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RecommendedSellersCarousel implements SectionTypeElement {

    @k
    public static final Parcelable.Creator<RecommendedSellersCarousel> CREATOR = new Creator();

    @c("isAvailableToHide")
    @l
    private final Boolean isAvailableToHide;

    @c("list")
    @l
    private final List<RecommendedSellerElement> items;

    @c("title")
    @l
    private final String title;

    @k
    private String id = "";

    @k
    private String iconUri = "";
    private final boolean isCollapsed = true;

    /* compiled from: RecommendedSellersCarousel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendedSellersCarousel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendedSellersCarousel createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(RecommendedSellersCarousel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new RecommendedSellersCarousel(string, boolValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendedSellersCarousel[] newArray(int i12) {
            return new RecommendedSellersCarousel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendedSellersCarousel(@l String str, @l Boolean bool, @l List<? extends RecommendedSellerElement> list) {
        this.title = str;
        this.isAvailableToHide = bool;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public boolean getHasContent() {
        return O2.a(this.items);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    public String getIconUri() {
        return this.iconUri;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final List<RecommendedSellerElement> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    public String getSectionId() {
        return SectionTypeElement.DefaultImpls.getSectionId(this);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @l
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @l
    /* renamed from: isAvailableToHide, reason: from getter */
    public Boolean getIsAvailableToHide() {
        return this.isAvailableToHide;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    /* renamed from: isCollapsed */
    public Boolean getIsCollapsed() {
        return Boolean.valueOf(this.isCollapsed);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public boolean isSectionWithId(@k String str) {
        return SectionTypeElement.DefaultImpls.isSectionWithId(this, str);
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public void setIconUri(@k String str) {
        this.iconUri = str;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    public void setId(@k String str) {
        this.id = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Boolean bool = this.isAvailableToHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<RecommendedSellerElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public static /* synthetic */ void getIconUri$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void isCollapsed$annotations() {
    }
}
