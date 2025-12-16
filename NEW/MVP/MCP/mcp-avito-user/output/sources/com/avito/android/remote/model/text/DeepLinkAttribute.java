package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Attribute.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001e¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/text/DeepLinkAttribute;", "Lcom/avito/android/remote/model/text/ParametersAttribute;", "", "name", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "fallbackUrl", "deepLinkString", "", "Lcom/avito/android/remote/model/text/FontParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/text/DeepLinkAttribute;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getFallbackUrl", "getDeepLinkString", "Ljava/util/List;", "getParameters", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeepLinkAttribute extends ParametersAttribute {

    @k
    public static final Parcelable.Creator<DeepLinkAttribute> CREATOR = new Creator();

    @k
    private final DeepLink deepLink;

    @l
    private final String deepLinkString;

    @l
    private final String fallbackUrl;

    @k
    private final String name;

    @l
    private final List<FontParameter> parameters;

    @k
    private final String title;

    /* compiled from: Attribute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeepLinkAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeepLinkAttribute createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DeepLinkAttribute.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(DeepLinkAttribute.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new DeepLinkAttribute(string, string2, deepLink, string3, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeepLinkAttribute[] newArray(int i12) {
            return new DeepLinkAttribute[i12];
        }
    }

    public /* synthetic */ DeepLinkAttribute(String str, String str2, DeepLink deepLink, String str3, String str4, List list, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : list);
    }

    public static /* synthetic */ DeepLinkAttribute copy$default(DeepLinkAttribute deepLinkAttribute, String str, String str2, DeepLink deepLink, String str3, String str4, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deepLinkAttribute.name;
        }
        if ((i12 & 2) != 0) {
            str2 = deepLinkAttribute.title;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            deepLink = deepLinkAttribute.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            str3 = deepLinkAttribute.fallbackUrl;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = deepLinkAttribute.deepLinkString;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            list = deepLinkAttribute.parameters;
        }
        return deepLinkAttribute.copy(str, str5, deepLink2, str6, str7, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDeepLinkString() {
        return this.deepLinkString;
    }

    @l
    public final List<FontParameter> component6() {
        return this.parameters;
    }

    @k
    public final DeepLinkAttribute copy(@k String name, @k String title, @k DeepLink deepLink, @l String fallbackUrl, @l String deepLinkString, @l List<? extends FontParameter> parameters) {
        return new DeepLinkAttribute(name, title, deepLink, fallbackUrl, deepLinkString, parameters);
    }

    @Override // com.avito.android.remote.model.text.Attribute, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!DeepLinkAttribute.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) other;
        return L.f(getName(), deepLinkAttribute.getName()) && L.f(getTitle(), deepLinkAttribute.getTitle()) && L.f(this.deepLink.getUri(), deepLinkAttribute.deepLink.getUri()) && L.f(this.fallbackUrl, deepLinkAttribute.fallbackUrl);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDeepLinkString() {
        return this.deepLinkString;
    }

    @l
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getName() {
        return this.name;
    }

    @Override // com.avito.android.remote.model.text.ParametersAttribute
    @l
    public List<FontParameter> getParameters() {
        return this.parameters;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.deepLink.getUri().hashCode() * 31;
        String str = this.fallbackUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeepLinkAttribute(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", fallbackUrl=");
        sb2.append(this.fallbackUrl);
        sb2.append(", deepLinkString=");
        sb2.append(this.deepLinkString);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.deepLinkString);
        List<FontParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeepLinkAttribute(@k String str, @k String str2, @k DeepLink deepLink, @l String str3, @l String str4, @l List<? extends FontParameter> list) {
        this.name = str;
        this.title = str2;
        this.deepLink = deepLink;
        this.fallbackUrl = str3;
        this.deepLinkString = str4;
        this.parameters = list;
    }
}
