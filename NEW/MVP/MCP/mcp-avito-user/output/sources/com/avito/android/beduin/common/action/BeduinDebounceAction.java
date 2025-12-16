package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinDebounceAction.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinDebounceAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "id", "", "duration", "", "actions", "<init>", "(Ljava/lang/String;FLjava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "F", "c", "()F", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinDebounceAction implements BeduinAction {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c("duration")
    private final float duration;

    @com.google.gson.annotations.c("id")
    @l
    private final String id;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f99976b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinDebounceAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f99977c = "debounce";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinDebounceAction> f99978d = BeduinDebounceAction.class;

    /* compiled from: BeduinDebounceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinDebounceAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinDebounceAction> getAction() {
            return BeduinDebounceAction.f99978d;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99969c() {
            return BeduinDebounceAction.f99977c;
        }

        public a() {
        }
    }

    /* compiled from: BeduinDebounceAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinDebounceAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinDebounceAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            float f12 = parcel.readFloat();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinDebounceAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinDebounceAction(string, f12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinDebounceAction[] newArray(int i12) {
            return new BeduinDebounceAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinDebounceAction(@l String str, float f12, @Y61.k List<? extends BeduinAction> list) {
        this.id = str;
        this.duration = f12;
        this.actions = list;
    }

    /* renamed from: c, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinDebounceAction)) {
            return false;
        }
        BeduinDebounceAction beduinDebounceAction = (BeduinDebounceAction) obj;
        return L.f(this.id, beduinDebounceAction.id) && Float.compare(this.duration, beduinDebounceAction.duration) == 0 && L.f(this.actions, beduinDebounceAction.actions);
    }

    @Y61.k
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        return this.actions.hashCode() + r.d(this.duration, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinDebounceAction(id=");
        sb2.append(this.id);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeFloat(this.duration);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
