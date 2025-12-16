package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/text/LinkAttribute;", "Lcom/avito/android/remote/model/text/ParametersAttribute;", "", "name", "title", ContextActionHandler.Link.URL, "", "Lcom/avito/android/remote/model/text/FontParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/text/LinkAttribute;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTitle", "getUrl", "Ljava/util/List;", "getParameters", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LinkAttribute extends ParametersAttribute {

    @k
    public static final Parcelable.Creator<LinkAttribute> CREATOR = new Creator();

    @k
    private final String name;

    @l
    private final List<FontParameter> parameters;

    @k
    private final String title;

    @k
    private final String url;

    /* compiled from: Attribute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LinkAttribute createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(LinkAttribute.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new LinkAttribute(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LinkAttribute[] newArray(int i12) {
            return new LinkAttribute[i12];
        }
    }

    public /* synthetic */ LinkAttribute(String str, String str2, String str3, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkAttribute copy$default(LinkAttribute linkAttribute, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = linkAttribute.name;
        }
        if ((i12 & 2) != 0) {
            str2 = linkAttribute.title;
        }
        if ((i12 & 4) != 0) {
            str3 = linkAttribute.url;
        }
        if ((i12 & 8) != 0) {
            list = linkAttribute.parameters;
        }
        return linkAttribute.copy(str, str2, str3, list);
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
    public final String getUrl() {
        return this.url;
    }

    @l
    public final List<FontParameter> component4() {
        return this.parameters;
    }

    @k
    public final LinkAttribute copy(@k String name, @k String title, @k String url, @l List<? extends FontParameter> parameters) {
        return new LinkAttribute(name, title, url, parameters);
    }

    @Override // com.avito.android.remote.model.text.Attribute, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAttribute)) {
            return false;
        }
        LinkAttribute linkAttribute = (LinkAttribute) other;
        return L.f(this.name, linkAttribute.name) && L.f(this.title, linkAttribute.title) && L.f(this.url, linkAttribute.url) && L.f(this.parameters, linkAttribute.parameters);
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

    @k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.name.hashCode() * 31, 31, this.title), 31, this.url);
        List<FontParameter> list = this.parameters;
        return iD2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LinkAttribute(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
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
    public LinkAttribute(@k String str, @k String str2, @k String str3, @l List<? extends FontParameter> list) {
        this.name = str;
        this.title = str2;
        this.url = str3;
        this.parameters = list;
    }
}
