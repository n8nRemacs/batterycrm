package com.avito.android.remote.model;

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

/* compiled from: ExtendedProfileSelections.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSelections;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "name", "", "Lcom/avito/android/remote/model/ExtendedProfileSelectionItem;", "selections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/ExtendedProfileSelections;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "getName", "Ljava/util/List;", "getSelections", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSelections implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileSelections> CREATOR = new Creator();

    @c("name")
    @l
    private final String name;

    @c("selections")
    @k
    private final List<ExtendedProfileSelectionItem> selections;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileSelections.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileSelections> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSelections createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(ExtendedProfileSelectionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ExtendedProfileSelections(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSelections[] newArray(int i12) {
            return new ExtendedProfileSelections[i12];
        }
    }

    public ExtendedProfileSelections(@l String str, @l String str2, @k List<ExtendedProfileSelectionItem> list) {
        this.widgetName = str;
        this.name = str2;
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileSelections copy$default(ExtendedProfileSelections extendedProfileSelections, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileSelections.widgetName;
        }
        if ((i12 & 2) != 0) {
            str2 = extendedProfileSelections.name;
        }
        if ((i12 & 4) != 0) {
            list = extendedProfileSelections.selections;
        }
        return extendedProfileSelections.copy(str, str2, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final List<ExtendedProfileSelectionItem> component3() {
        return this.selections;
    }

    @k
    public final ExtendedProfileSelections copy(@l String widgetName, @l String name, @k List<ExtendedProfileSelectionItem> selections) {
        return new ExtendedProfileSelections(widgetName, name, selections);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileSelections)) {
            return false;
        }
        ExtendedProfileSelections extendedProfileSelections = (ExtendedProfileSelections) other;
        return L.f(this.widgetName, extendedProfileSelections.widgetName) && L.f(this.name, extendedProfileSelections.name) && L.f(this.selections, extendedProfileSelections.selections);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @k
    public final List<ExtendedProfileSelectionItem> getSelections() {
        return this.selections;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        String str = this.widgetName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return this.selections.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSelections(widgetName=");
        sb2.append(this.widgetName);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", selections=");
        return H.p(sb2, this.selections, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        parcel.writeString(this.name);
        Iterator itJ = C0.j(this.selections, parcel);
        while (itJ.hasNext()) {
            ((ExtendedProfileSelectionItem) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
