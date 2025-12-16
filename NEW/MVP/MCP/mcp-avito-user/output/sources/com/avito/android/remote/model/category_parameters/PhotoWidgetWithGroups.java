package com.avito.android.remote.model.category_parameters;

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

/* compiled from: PhotoRealtyLayouts.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJB\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/ImageAction;", "actions", "Lcom/avito/android/remote/model/category_parameters/ImageBadgeGroup;", "badges", "Lcom/avito/android/remote/model/category_parameters/ImageGroup;", "groups", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getActions", "getBadges", "getGroups", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhotoWidgetWithGroups implements Parcelable {

    @k
    public static final Parcelable.Creator<PhotoWidgetWithGroups> CREATOR = new Creator();

    @c("imageActions")
    @k
    private final List<ImageAction> actions;

    @c("imageBadgeGroups")
    @k
    private final List<ImageBadgeGroup> badges;

    @c("imageGroups")
    @l
    private final List<ImageGroup> groups;

    /* compiled from: PhotoRealtyLayouts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoWidgetWithGroups> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoWidgetWithGroups createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(ImageAction.CREATOR, parcel, arrayList2, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iC4 = 0;
            while (iC4 != i13) {
                iC4 = a.c(ImageBadgeGroup.CREATOR, parcel, arrayList3, iC4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = a.c(ImageGroup.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList = arrayList4;
            }
            return new PhotoWidgetWithGroups(arrayList2, arrayList3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoWidgetWithGroups[] newArray(int i12) {
            return new PhotoWidgetWithGroups[i12];
        }
    }

    public PhotoWidgetWithGroups(@k List<ImageAction> list, @k List<ImageBadgeGroup> list2, @l List<ImageGroup> list3) {
        this.actions = list;
        this.badges = list2;
        this.groups = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoWidgetWithGroups copy$default(PhotoWidgetWithGroups photoWidgetWithGroups, List list, List list2, List list3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = photoWidgetWithGroups.actions;
        }
        if ((i12 & 2) != 0) {
            list2 = photoWidgetWithGroups.badges;
        }
        if ((i12 & 4) != 0) {
            list3 = photoWidgetWithGroups.groups;
        }
        return photoWidgetWithGroups.copy(list, list2, list3);
    }

    @k
    public final List<ImageAction> component1() {
        return this.actions;
    }

    @k
    public final List<ImageBadgeGroup> component2() {
        return this.badges;
    }

    @l
    public final List<ImageGroup> component3() {
        return this.groups;
    }

    @k
    public final PhotoWidgetWithGroups copy(@k List<ImageAction> actions, @k List<ImageBadgeGroup> badges, @l List<ImageGroup> groups) {
        return new PhotoWidgetWithGroups(actions, badges, groups);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoWidgetWithGroups)) {
            return false;
        }
        PhotoWidgetWithGroups photoWidgetWithGroups = (PhotoWidgetWithGroups) other;
        return L.f(this.actions, photoWidgetWithGroups.actions) && L.f(this.badges, photoWidgetWithGroups.badges) && L.f(this.groups, photoWidgetWithGroups.groups);
    }

    @k
    public final List<ImageAction> getActions() {
        return this.actions;
    }

    @k
    public final List<ImageBadgeGroup> getBadges() {
        return this.badges;
    }

    @l
    public final List<ImageGroup> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        int iE2 = H.e(this.actions.hashCode() * 31, 31, this.badges);
        List<ImageGroup> list = this.groups;
        return iE2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoWidgetWithGroups(actions=");
        sb2.append(this.actions);
        sb2.append(", badges=");
        sb2.append(this.badges);
        sb2.append(", groups=");
        return H.p(sb2, this.groups, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            ((ImageAction) itJ.next()).writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.badges, parcel);
        while (itJ2.hasNext()) {
            ((ImageBadgeGroup) itJ2.next()).writeToParcel(parcel, flags);
        }
        List<ImageGroup> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ImageGroup) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
