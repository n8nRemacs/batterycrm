package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Portfolio.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b1\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/PortfolioProject;", "Landroid/os/Parcelable;", "", "id", "", "title", "priceText", "Lcom/avito/android/remote/model/Image;", "image", "subtitle", "Lcom/avito/android/remote/model/PortfolioAction;", "action", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/PortfolioAction;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "()Lcom/avito/android/remote/model/PortfolioAction;", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/PortfolioAction;)Lcom/avito/android/remote/model/PortfolioProject;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getTitle", "getPriceText", "Lcom/avito/android/remote/model/Image;", "getImage", "getSubtitle", "Lcom/avito/android/remote/model/PortfolioAction;", "getAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PortfolioProject implements Parcelable {

    @k
    public static final Parcelable.Creator<PortfolioProject> CREATOR = new Creator();

    @c("action")
    @k
    private final PortfolioAction action;

    @c("id")
    private final long id;

    @c("image")
    @k
    private final Image image;

    @c("priceText")
    @l
    private final String priceText;

    @c("subTitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: Portfolio.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PortfolioProject> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PortfolioProject createFromParcel(@k Parcel parcel) {
            return new PortfolioProject(parcel.readLong(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(PortfolioProject.class.getClassLoader()), parcel.readString(), PortfolioAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PortfolioProject[] newArray(int i12) {
            return new PortfolioProject[i12];
        }
    }

    public PortfolioProject(long j12, @k String str, @l String str2, @k Image image, @k String str3, @k PortfolioAction portfolioAction) {
        this.id = j12;
        this.title = str;
        this.priceText = str2;
        this.image = image;
        this.subtitle = str3;
        this.action = portfolioAction;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final PortfolioAction getAction() {
        return this.action;
    }

    @k
    public final PortfolioProject copy(long id2, @k String title, @l String priceText, @k Image image, @k String subtitle, @k PortfolioAction action) {
        return new PortfolioProject(id2, title, priceText, image, subtitle, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioProject)) {
            return false;
        }
        PortfolioProject portfolioProject = (PortfolioProject) other;
        return this.id == portfolioProject.id && L.f(this.title, portfolioProject.title) && L.f(this.priceText, portfolioProject.priceText) && L.f(this.image, portfolioProject.image) && L.f(this.subtitle, portfolioProject.subtitle) && L.f(this.action, portfolioProject.action);
    }

    @k
    public final PortfolioAction getAction() {
        return this.action;
    }

    public final long getId() {
        return this.id;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getPriceText() {
        return this.priceText;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.priceText;
        return this.action.hashCode() + H.d(a.g(this.image, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.subtitle);
    }

    @k
    public String toString() {
        return "PortfolioProject(id=" + this.id + ", title=" + this.title + ", priceText=" + this.priceText + ", image=" + this.image + ", subtitle=" + this.subtitle + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.priceText);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.subtitle);
        this.action.writeToParcel(parcel, flags);
    }
}
