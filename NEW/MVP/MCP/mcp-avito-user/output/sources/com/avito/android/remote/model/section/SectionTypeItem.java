package com.avito.android.remote.model.section;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.util.O2;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionTypeItem.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b-\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b.\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R(\u00102\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b2\u0010\u001e\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010 \"\u0004\b4\u00105R(\u00108\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b8\u0010\u001e\u0012\u0004\b;\u00107\u001a\u0004\b9\u0010 \"\u0004\b:\u00105R\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010 R\u0014\u0010@\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/section/SectionTypeItem;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "", "title", "subtitle", "", "isAvailableToHide", "isCollapsed", "Lcom/avito/android/remote/model/Action;", "action", "", "Lcom/avito/android/remote/model/section/SectionElement;", "items", "Lcom/avito/android/remote/model/section/SectionDisplaying;", Navigation.DISPLAYING, "context", "engine", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Action;Ljava/util/List;Lcom/avito/android/remote/model/section/SectionDisplaying;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/section/SectionDisplaying;", "getDisplaying", "()Lcom/avito/android/remote/model/section/SectionDisplaying;", "getContext", "getEngine", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "id", "getId", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "iconUri", "getIconUri", "setIconUri", "getIconUri$annotations", "getSectionId", "sectionId", "getHasContent", "()Z", "hasContent", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SectionTypeItem implements SectionTypeElement {

    @k
    public static final Parcelable.Creator<SectionTypeItem> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("context")
    @l
    private final String context;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c(Navigation.DISPLAYING)
    @l
    private final SectionDisplaying displaying;

    @c("engine")
    @l
    private final String engine;

    @c("isAvailableToHide")
    @l
    private final Boolean isAvailableToHide;

    @c("isCollapsed")
    @l
    private final Boolean isCollapsed;

    @c("list")
    @l
    private final List<SectionElement> items;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @k
    private String id = "";

    @k
    private String iconUri = "";

    /* compiled from: SectionTypeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SectionTypeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionTypeItem createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Action action = (Action) parcel.readParcelable(SectionTypeItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(SectionTypeItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new SectionTypeItem(string, string2, boolValueOf, boolValueOf2, action, arrayList, parcel.readInt() == 0 ? null : SectionDisplaying.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionTypeItem[] newArray(int i12) {
            return new SectionTypeItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionTypeItem(@l String str, @l String str2, @l Boolean bool, @l Boolean bool2, @l Action action, @l List<? extends SectionElement> list, @l SectionDisplaying sectionDisplaying, @l String str3, @l String str4, @l SerpDisplayType serpDisplayType) {
        this.title = str;
        this.subtitle = str2;
        this.isAvailableToHide = bool;
        this.isCollapsed = bool2;
        this.action = action;
        this.items = list;
        this.displaying = sectionDisplaying;
        this.context = str3;
        this.engine = str4;
        this.displayType = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final SectionDisplaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final String getEngine() {
        return this.engine;
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
    public final List<SectionElement> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    @k
    public String getSectionId() {
        String str = this.engine;
        return str == null ? getId() : str;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
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
    @l
    /* renamed from: isCollapsed, reason: from getter */
    public Boolean getIsCollapsed() {
        return this.isCollapsed;
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
        parcel.writeString(this.subtitle);
        Boolean bool = this.isAvailableToHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isCollapsed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.action, flags);
        List<SectionElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        SectionDisplaying sectionDisplaying = this.displaying;
        if (sectionDisplaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionDisplaying.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.context);
        parcel.writeString(this.engine);
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
    }

    public static /* synthetic */ void getIconUri$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }
}
