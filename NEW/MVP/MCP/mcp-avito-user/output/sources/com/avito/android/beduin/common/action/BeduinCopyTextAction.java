package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCopyTextAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinCopyTextAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "text", "toastMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinCopyTextAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getToastMessage", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCopyTextAction implements BeduinAction {

    @Y61.k
    private final String text;

    @Y61.k
    private final String toastMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinCopyTextAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinCopyTextAction.class;

    @Y61.k
    private static final String type = "copyText";

    /* compiled from: BeduinCopyTextAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinCopyTextAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinCopyTextAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinCopyTextAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinCopyTextAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinCopyTextAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinCopyTextAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCopyTextAction createFromParcel(Parcel parcel) {
            return new BeduinCopyTextAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCopyTextAction[] newArray(int i12) {
            return new BeduinCopyTextAction[i12];
        }
    }

    public BeduinCopyTextAction(@Y61.k String str, @Y61.k String str2) {
        this.text = str;
        this.toastMessage = str2;
    }

    public static /* synthetic */ BeduinCopyTextAction copy$default(BeduinCopyTextAction beduinCopyTextAction, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinCopyTextAction.text;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinCopyTextAction.toastMessage;
        }
        return beduinCopyTextAction.copy(str, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getToastMessage() {
        return this.toastMessage;
    }

    @Y61.k
    public final BeduinCopyTextAction copy(@Y61.k String text, @Y61.k String toastMessage) {
        return new BeduinCopyTextAction(text, toastMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCopyTextAction)) {
            return false;
        }
        BeduinCopyTextAction beduinCopyTextAction = (BeduinCopyTextAction) other;
        return L.f(this.text, beduinCopyTextAction.text) && L.f(this.toastMessage, beduinCopyTextAction.toastMessage);
    }

    @Y61.k
    public final String getText() {
        return this.text;
    }

    @Y61.k
    public final String getToastMessage() {
        return this.toastMessage;
    }

    public int hashCode() {
        return this.toastMessage.hashCode() + (this.text.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCopyTextAction(text=");
        sb2.append(this.text);
        sb2.append(", toastMessage=");
        return C22026a.c(sb2, this.toastMessage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.toastMessage);
    }
}
