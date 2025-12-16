package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV2.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b2\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV2;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/Image;", "image", "description", "", "Lcom/avito/android/remote/model/auto_select/AutoSelectAdvantage;", "advantages", "footer", "", "componentSlug", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV2;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getImage", "getDescription", "Ljava/util/List;", "getAdvantages", "getFooter", "Ljava/lang/String;", "getComponentSlug", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectParametersV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectParametersV2> CREATOR = new Creator();

    @c("advantages")
    @k
    private final List<AutoSelectAdvantage> advantages;

    @c("componentSlug")
    @k
    private final String componentSlug;

    @c("description")
    @k
    private final AttributedText description;

    @c("footer")
    @k
    private final AttributedText footer;

    @c("image")
    @k
    private final Image image;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: AutoSelectParametersV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectParametersV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV2 createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoSelectParametersV2.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(AutoSelectParametersV2.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AutoSelectParametersV2.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(AutoSelectAdvantage.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectParametersV2(attributedText, image, attributedText2, arrayList, (AttributedText) parcel.readParcelable(AutoSelectParametersV2.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV2[] newArray(int i12) {
            return new AutoSelectParametersV2[i12];
        }
    }

    public AutoSelectParametersV2(@k AttributedText attributedText, @k Image image, @k AttributedText attributedText2, @k List<AutoSelectAdvantage> list, @k AttributedText attributedText3, @k String str) {
        this.title = attributedText;
        this.image = image;
        this.description = attributedText2;
        this.advantages = list;
        this.footer = attributedText3;
        this.componentSlug = str;
    }

    public static /* synthetic */ AutoSelectParametersV2 copy$default(AutoSelectParametersV2 autoSelectParametersV2, AttributedText attributedText, Image image, AttributedText attributedText2, List list, AttributedText attributedText3, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = autoSelectParametersV2.title;
        }
        if ((i12 & 2) != 0) {
            image = autoSelectParametersV2.image;
        }
        Image image2 = image;
        if ((i12 & 4) != 0) {
            attributedText2 = autoSelectParametersV2.description;
        }
        AttributedText attributedText4 = attributedText2;
        if ((i12 & 8) != 0) {
            list = autoSelectParametersV2.advantages;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            attributedText3 = autoSelectParametersV2.footer;
        }
        AttributedText attributedText5 = attributedText3;
        if ((i12 & 32) != 0) {
            str = autoSelectParametersV2.componentSlug;
        }
        return autoSelectParametersV2.copy(attributedText, image2, attributedText4, list2, attributedText5, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<AutoSelectAdvantage> component4() {
        return this.advantages;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    public final AutoSelectParametersV2 copy(@k AttributedText title, @k Image image, @k AttributedText description, @k List<AutoSelectAdvantage> advantages, @k AttributedText footer, @k String componentSlug) {
        return new AutoSelectParametersV2(title, image, description, advantages, footer, componentSlug);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectParametersV2)) {
            return false;
        }
        AutoSelectParametersV2 autoSelectParametersV2 = (AutoSelectParametersV2) other;
        return L.f(this.title, autoSelectParametersV2.title) && L.f(this.image, autoSelectParametersV2.image) && L.f(this.description, autoSelectParametersV2.description) && L.f(this.advantages, autoSelectParametersV2.advantages) && L.f(this.footer, autoSelectParametersV2.footer) && L.f(this.componentSlug, autoSelectParametersV2.componentSlug);
    }

    @k
    public final List<AutoSelectAdvantage> getAdvantages() {
        return this.advantages;
    }

    @k
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final AttributedText getFooter() {
        return this.footer;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.componentSlug.hashCode() + a.b(H.e(a.b(a.g(this.image, this.title.hashCode() * 31, 31), 31, this.description), 31, this.advantages), 31, this.footer);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectParametersV2(title=");
        sb2.append(this.title);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", advantages=");
        sb2.append(this.advantages);
        sb2.append(", footer=");
        sb2.append(this.footer);
        sb2.append(", componentSlug=");
        return C22026a.c(sb2, this.componentSlug, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.description, flags);
        Iterator itJ = C0.j(this.advantages, parcel);
        while (itJ.hasNext()) {
            ((AutoSelectAdvantage) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.footer, flags);
        parcel.writeString(this.componentSlug);
    }
}
