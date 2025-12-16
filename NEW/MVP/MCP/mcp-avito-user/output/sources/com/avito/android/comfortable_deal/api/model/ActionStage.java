package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/ActionStage;", "Landroid/os/Parcelable;", "", "id", "label", "Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/ActionTransition;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getLabel", "Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "c", "()Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActionStage implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionStage> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("label")
    @k
    private final String label;

    @c("transition")
    @k
    private final ActionTransition transition;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionStage> {
        @Override // android.os.Parcelable.Creator
        public final ActionStage createFromParcel(Parcel parcel) {
            return new ActionStage(parcel.readString(), parcel.readString(), ActionTransition.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionStage[] newArray(int i12) {
            return new ActionStage[i12];
        }
    }

    public ActionStage(@k String str, @k String str2, @k ActionTransition actionTransition) {
        this.id = str;
        this.label = str2;
        this.transition = actionTransition;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ActionTransition getTransition() {
        return this.transition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStage)) {
            return false;
        }
        ActionStage actionStage = (ActionStage) obj;
        return L.f(this.id, actionStage.id) && L.f(this.label, actionStage.label) && this.transition == actionStage.transition;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        return this.transition.hashCode() + H.d(this.id.hashCode() * 31, 31, this.label);
    }

    @k
    public final String toString() {
        return "ActionStage(id=" + this.id + ", label=" + this.label + ", transition=" + this.transition + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.label);
        this.transition.writeToParcel(parcel, i12);
    }
}
