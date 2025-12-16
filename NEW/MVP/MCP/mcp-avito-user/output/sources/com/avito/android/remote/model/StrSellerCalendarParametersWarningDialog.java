package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/StrCalendarWarningDialogCondition;", "conditions", "Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;)Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getConditions", "Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;", "getActions", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerCalendarParametersWarningDialog implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerCalendarParametersWarningDialog> CREATOR = new Creator();

    @c("actions")
    @l
    private final StrCalendarWarningDialogActions actions;

    @c("conditions")
    @l
    private final List<StrCalendarWarningDialogCondition> conditions;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerCalendarParametersWarningDialog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParametersWarningDialog createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrCalendarWarningDialogCondition.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new StrSellerCalendarParametersWarningDialog(string, arrayList, parcel.readInt() != 0 ? StrCalendarWarningDialogActions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParametersWarningDialog[] newArray(int i12) {
            return new StrSellerCalendarParametersWarningDialog[i12];
        }
    }

    public StrSellerCalendarParametersWarningDialog(@l String str, @l List<StrCalendarWarningDialogCondition> list, @l StrCalendarWarningDialogActions strCalendarWarningDialogActions) {
        this.title = str;
        this.conditions = list;
        this.actions = strCalendarWarningDialogActions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrSellerCalendarParametersWarningDialog copy$default(StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog, String str, List list, StrCalendarWarningDialogActions strCalendarWarningDialogActions, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strSellerCalendarParametersWarningDialog.title;
        }
        if ((i12 & 2) != 0) {
            list = strSellerCalendarParametersWarningDialog.conditions;
        }
        if ((i12 & 4) != 0) {
            strCalendarWarningDialogActions = strSellerCalendarParametersWarningDialog.actions;
        }
        return strSellerCalendarParametersWarningDialog.copy(str, list, strCalendarWarningDialogActions);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<StrCalendarWarningDialogCondition> component2() {
        return this.conditions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final StrCalendarWarningDialogActions getActions() {
        return this.actions;
    }

    @k
    public final StrSellerCalendarParametersWarningDialog copy(@l String title, @l List<StrCalendarWarningDialogCondition> conditions, @l StrCalendarWarningDialogActions actions) {
        return new StrSellerCalendarParametersWarningDialog(title, conditions, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerCalendarParametersWarningDialog)) {
            return false;
        }
        StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog = (StrSellerCalendarParametersWarningDialog) other;
        return L.f(this.title, strSellerCalendarParametersWarningDialog.title) && L.f(this.conditions, strSellerCalendarParametersWarningDialog.conditions) && L.f(this.actions, strSellerCalendarParametersWarningDialog.actions);
    }

    @l
    public final StrCalendarWarningDialogActions getActions() {
        return this.actions;
    }

    @l
    public final List<StrCalendarWarningDialogCondition> getConditions() {
        return this.conditions;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<StrCalendarWarningDialogCondition> list = this.conditions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        StrCalendarWarningDialogActions strCalendarWarningDialogActions = this.actions;
        return iHashCode2 + (strCalendarWarningDialogActions != null ? strCalendarWarningDialogActions.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrSellerCalendarParametersWarningDialog(title=" + this.title + ", conditions=" + this.conditions + ", actions=" + this.actions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<StrCalendarWarningDialogCondition> list = this.conditions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrCalendarWarningDialogCondition) itA.next()).writeToParcel(parcel, flags);
            }
        }
        StrCalendarWarningDialogActions strCalendarWarningDialogActions = this.actions;
        if (strCalendarWarningDialogActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strCalendarWarningDialogActions.writeToParcel(parcel, flags);
        }
    }
}
