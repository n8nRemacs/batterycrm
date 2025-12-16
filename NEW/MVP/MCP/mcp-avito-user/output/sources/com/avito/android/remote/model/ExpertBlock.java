package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealExpertBlock.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/ExpertBlock;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "avatar", "", "name", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "leftImage", "rightImage", "", "Lcom/avito/android/remote/model/Achievement;", "achievements", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;)V", "getIconType", "()Ljava/lang/String;", "component1", "()Landroid/net/Uri;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/UniversalImage;", "component6", "component7", "()Ljava/util/List;", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;)Lcom/avito/android/remote/model/ExpertBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getAvatar", "Ljava/lang/String;", "getName", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/UniversalImage;", "getLeftImage", "getRightImage", "Ljava/util/List;", "getAchievements", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExpertBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<ExpertBlock> CREATOR = new Creator();

    @c("features")
    @k
    private final List<Achievement> achievements;

    @c("avatar")
    @l
    private final Uri avatar;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("leftImage")
    @k
    private final UniversalImage leftImage;

    @c("name")
    @k
    private final String name;

    @c("rightImage")
    @k
    private final UniversalImage rightImage;

    @c("text")
    @k
    private final String text;

    /* compiled from: ComfortableDealExpertBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExpertBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExpertBlock createFromParcel(@k Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(ExpertBlock.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ExpertBlock.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(ExpertBlock.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(ExpertBlock.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Achievement.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ExpertBlock(uri, string, string2, deepLink, universalImage, universalImage2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExpertBlock[] newArray(int i12) {
            return new ExpertBlock[i12];
        }
    }

    public ExpertBlock(@l Uri uri, @k String str, @k String str2, @l DeepLink deepLink, @k UniversalImage universalImage, @k UniversalImage universalImage2, @k List<Achievement> list) {
        this.avatar = uri;
        this.name = str;
        this.text = str2;
        this.deepLink = deepLink;
        this.leftImage = universalImage;
        this.rightImage = universalImage2;
        this.achievements = list;
    }

    public static /* synthetic */ ExpertBlock copy$default(ExpertBlock expertBlock, Uri uri, String str, String str2, DeepLink deepLink, UniversalImage universalImage, UniversalImage universalImage2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = expertBlock.avatar;
        }
        if ((i12 & 2) != 0) {
            str = expertBlock.name;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = expertBlock.text;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            deepLink = expertBlock.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            universalImage = expertBlock.leftImage;
        }
        UniversalImage universalImage3 = universalImage;
        if ((i12 & 32) != 0) {
            universalImage2 = expertBlock.rightImage;
        }
        UniversalImage universalImage4 = universalImage2;
        if ((i12 & 64) != 0) {
            list = expertBlock.achievements;
        }
        return expertBlock.copy(uri, str3, str4, deepLink2, universalImage3, universalImage4, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Uri getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getLeftImage() {
        return this.leftImage;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final UniversalImage getRightImage() {
        return this.rightImage;
    }

    @k
    public final List<Achievement> component7() {
        return this.achievements;
    }

    @k
    public final ExpertBlock copy(@l Uri avatar, @k String name, @k String text, @l DeepLink deepLink, @k UniversalImage leftImage, @k UniversalImage rightImage, @k List<Achievement> achievements) {
        return new ExpertBlock(avatar, name, text, deepLink, leftImage, rightImage, achievements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpertBlock)) {
            return false;
        }
        ExpertBlock expertBlock = (ExpertBlock) other;
        return L.f(this.avatar, expertBlock.avatar) && L.f(this.name, expertBlock.name) && L.f(this.text, expertBlock.text) && L.f(this.deepLink, expertBlock.deepLink) && L.f(this.leftImage, expertBlock.leftImage) && L.f(this.rightImage, expertBlock.rightImage) && L.f(this.achievements, expertBlock.achievements);
    }

    @k
    public final List<Achievement> getAchievements() {
        return this.achievements;
    }

    @l
    public final Uri getAvatar() {
        return this.avatar;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getIconType() {
        Uri uri = this.avatar;
        return (uri == null || L.f(uri, Uri.EMPTY)) ? "0" : "1";
    }

    @k
    public final UniversalImage getLeftImage() {
        return this.leftImage;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final UniversalImage getRightImage() {
        return this.rightImage;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Uri uri = this.avatar;
        int iD2 = H.d(H.d((uri == null ? 0 : uri.hashCode()) * 31, 31, this.name), 31, this.text);
        DeepLink deepLink = this.deepLink;
        return this.achievements.hashCode() + a.a(a.a((iD2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.leftImage), 31, this.rightImage);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExpertBlock(avatar=");
        sb2.append(this.avatar);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", leftImage=");
        sb2.append(this.leftImage);
        sb2.append(", rightImage=");
        sb2.append(this.rightImage);
        sb2.append(", achievements=");
        return H.p(sb2, this.achievements, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeParcelable(this.leftImage, flags);
        parcel.writeParcelable(this.rightImage, flags);
        Iterator itJ = C0.j(this.achievements, parcel);
        while (itJ.hasNext()) {
            ((Achievement) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
