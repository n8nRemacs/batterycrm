package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserDialog.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/UserDialog;", "Landroid/os/Parcelable;", "", "title", "", "message", "", "Lcom/avito/android/remote/model/Action;", "actions", "", "cancelable", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/CharSequence;", "component3", "()Ljava/util/List;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Z)Lcom/avito/android/remote/model/UserDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/CharSequence;", "getMessage", "Ljava/util/List;", "getActions", "Z", "getCancelable", "_common_network-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserDialog implements Parcelable {

    @k
    public static final Parcelable.Creator<UserDialog> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("cancelable")
    private final boolean cancelable;

    @c("message")
    @k
    private final CharSequence message;

    @c("title")
    @k
    private final String title;

    /* compiled from: UserDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserDialog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserDialog createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Action.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new UserDialog(string, charSequence, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserDialog[] newArray(int i12) {
            return new UserDialog[i12];
        }
    }

    public UserDialog(@k String str, @k CharSequence charSequence, @l List<Action> list, boolean z12) {
        this.title = str;
        this.message = charSequence;
        this.actions = list;
        this.cancelable = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserDialog copy$default(UserDialog userDialog, String str, CharSequence charSequence, List list, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = userDialog.title;
        }
        if ((i12 & 2) != 0) {
            charSequence = userDialog.message;
        }
        if ((i12 & 4) != 0) {
            list = userDialog.actions;
        }
        if ((i12 & 8) != 0) {
            z12 = userDialog.cancelable;
        }
        return userDialog.copy(str, charSequence, list, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final CharSequence getMessage() {
        return this.message;
    }

    @l
    public final List<Action> component3() {
        return this.actions;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @k
    public final UserDialog copy(@k String title, @k CharSequence message, @l List<Action> actions, boolean cancelable) {
        return new UserDialog(title, message, actions, cancelable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDialog)) {
            return false;
        }
        UserDialog userDialog = (UserDialog) other;
        return L.f(this.title, userDialog.title) && L.f(this.message, userDialog.message) && L.f(this.actions, userDialog.actions) && this.cancelable == userDialog.cancelable;
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @k
    public final CharSequence getMessage() {
        return this.message;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC2 = com.avito.android.advert.item.delivery_suggests.l.c(this.title.hashCode() * 31, 31, this.message);
        List<Action> list = this.actions;
        return Boolean.hashCode(this.cancelable) + ((iC2 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDialog(title=");
        sb2.append(this.title);
        sb2.append(", message=");
        sb2.append((Object) this.message);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", cancelable=");
        return r.x(sb2, this.cancelable, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        TextUtils.writeToParcel(this.message, parcel, flags);
        List<Action> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Action) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.cancelable ? 1 : 0);
    }

    public /* synthetic */ UserDialog(String str, CharSequence charSequence, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, charSequence, list, (i12 & 8) != 0 ? true : z12);
    }
}
