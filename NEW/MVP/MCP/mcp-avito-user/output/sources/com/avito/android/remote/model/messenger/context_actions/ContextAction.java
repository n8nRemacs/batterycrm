package com.avito.android.remote.model.messenger.context_actions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContextAction.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextAction;", "Landroid/os/Parcelable;", "", "title", "type", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "handler", "Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "confirmation", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;Lcom/avito/android/remote/model/messenger/ActionConfirmation;Ljava/lang/String;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getType", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "getHandler", "()Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "getConfirmation", "()Lcom/avito/android/remote/model/messenger/ActionConfirmation;", "getAnalytics", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContextAction implements Parcelable {

    @k
    public static final Parcelable.Creator<ContextAction> CREATOR = new Creator();

    @c("analytics")
    @l
    private final String analytics;

    @c("confirmation")
    @l
    private final ActionConfirmation confirmation;

    @c("handler")
    @k
    private final ContextActionHandler handler;

    @c("text")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    /* compiled from: ContextAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContextAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContextAction createFromParcel(@k Parcel parcel) {
            return new ContextAction(parcel.readString(), parcel.readString(), (ContextActionHandler) parcel.readParcelable(ContextAction.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionConfirmation.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContextAction[] newArray(int i12) {
            return new ContextAction[i12];
        }
    }

    public ContextAction(@k String str, @k String str2, @k ContextActionHandler contextActionHandler, @l ActionConfirmation actionConfirmation, @l String str3) {
        this.title = str;
        this.type = str2;
        this.handler = contextActionHandler;
        this.confirmation = actionConfirmation;
        this.analytics = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextAction)) {
            return false;
        }
        ContextAction contextAction = (ContextAction) other;
        return L.f(this.title, contextAction.title) && L.f(this.type, contextAction.type) && L.f(this.handler, contextAction.handler) && L.f(this.confirmation, contextAction.confirmation) && L.f(this.analytics, contextAction.analytics);
    }

    @l
    public final String getAnalytics() {
        return this.analytics;
    }

    @l
    public final ActionConfirmation getConfirmation() {
        return this.confirmation;
    }

    @k
    public final ContextActionHandler getHandler() {
        return this.handler;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.handler.hashCode() + H.d(this.title.hashCode() * 31, 31, this.type)) * 31;
        ActionConfirmation actionConfirmation = this.confirmation;
        int iHashCode2 = (iHashCode + (actionConfirmation != null ? actionConfirmation.hashCode() : 0)) * 31;
        String str = this.analytics;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ContextAction(title='" + this.title + "', type='" + this.type + "', handler=" + this.handler + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.handler, flags);
        ActionConfirmation actionConfirmation = this.confirmation;
        if (actionConfirmation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionConfirmation.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analytics);
    }

    public /* synthetic */ ContextAction(String str, String str2, ContextActionHandler contextActionHandler, ActionConfirmation actionConfirmation, String str3, int i12, C42822w c42822w) {
        this(str, str2, contextActionHandler, (i12 & 8) != 0 ? null : actionConfirmation, (i12 & 16) != 0 ? null : str3);
    }
}
