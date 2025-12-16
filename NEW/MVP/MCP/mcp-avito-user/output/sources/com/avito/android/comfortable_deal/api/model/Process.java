package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Process;", "Landroid/os/Parcelable;", "", "actionTitle", "id", "Lcom/avito/android/comfortable_deal/api/model/Stage;", "stage", "Lcom/avito/android/comfortable_deal/api/model/RealtyObject;", "item", "", "Lcom/avito/android/comfortable_deal/api/model/Team;", "teams", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/Stage;Lcom/avito/android/comfortable_deal/api/model/RealtyObject;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getActionTitle", "()Ljava/lang/String;", "getId", "Lcom/avito/android/comfortable_deal/api/model/Stage;", "d", "()Lcom/avito/android/comfortable_deal/api/model/Stage;", "Lcom/avito/android/comfortable_deal/api/model/RealtyObject;", "c", "()Lcom/avito/android/comfortable_deal/api/model/RealtyObject;", "Ljava/util/List;", "getTeams", "()Ljava/util/List;", "getType", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Process implements Parcelable {

    @k
    public static final Parcelable.Creator<Process> CREATOR = new a();

    @c("actionTitle")
    @k
    private final String actionTitle;

    @c("id")
    @k
    private final String id;

    @c("realtyObject")
    @k
    private final RealtyObject item;

    @c("stage")
    @k
    private final Stage stage;

    @c("team")
    @k
    private final List<Team> teams;

    @c("type")
    @k
    private final String type;

    /* compiled from: ClientResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Process> {
        @Override // android.os.Parcelable.Creator
        public final Process createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Stage stageCreateFromParcel = Stage.CREATOR.createFromParcel(parcel);
            RealtyObject realtyObjectCreateFromParcel = RealtyObject.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Team.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new Process(string, string2, stageCreateFromParcel, realtyObjectCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Process[] newArray(int i12) {
            return new Process[i12];
        }
    }

    public Process(@k String str, @k String str2, @k Stage stage, @k RealtyObject realtyObject, @k List<Team> list, @k String str3) {
        this.actionTitle = str;
        this.id = str2;
        this.stage = stage;
        this.item = realtyObject;
        this.teams = list;
        this.type = str3;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final RealtyObject getItem() {
        return this.item;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Process)) {
            return false;
        }
        Process process = (Process) obj;
        return L.f(this.actionTitle, process.actionTitle) && L.f(this.id, process.id) && L.f(this.stage, process.stage) && L.f(this.item, process.item) && L.f(this.teams, process.teams) && L.f(this.type, process.type);
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.type.hashCode() + H.e((this.item.hashCode() + ((this.stage.hashCode() + H.d(this.actionTitle.hashCode() * 31, 31, this.id)) * 31)) * 31, 31, this.teams);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Process(actionTitle=");
        sb2.append(this.actionTitle);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", stage=");
        sb2.append(this.stage);
        sb2.append(", item=");
        sb2.append(this.item);
        sb2.append(", teams=");
        sb2.append(this.teams);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.id);
        this.stage.writeToParcel(parcel, i12);
        this.item.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.teams, parcel);
        while (itJ.hasNext()) {
            ((Team) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.type);
    }
}
