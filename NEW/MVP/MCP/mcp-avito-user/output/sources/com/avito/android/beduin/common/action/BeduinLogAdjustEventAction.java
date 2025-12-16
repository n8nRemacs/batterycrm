package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLogAdjustEventAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinLogAdjustEventAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "androidToken", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinLogAdjustEventAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAndroidToken", "Ljava/util/Map;", "getParams", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLogAdjustEventAction implements BeduinAction {

    @Y61.k
    private final String androidToken;

    @Y61.k
    private final Map<String, String> params;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinLogAdjustEventAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinLogAdjustEventAction.class;

    @Y61.k
    private static final String type = "logAdjustEvent";

    /* compiled from: BeduinLogAdjustEventAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinLogAdjustEventAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinLogAdjustEventAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinLogAdjustEventAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF100007c() {
            return BeduinLogAdjustEventAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinLogAdjustEventAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinLogAdjustEventAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLogAdjustEventAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new BeduinLogAdjustEventAction(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLogAdjustEventAction[] newArray(int i12) {
            return new BeduinLogAdjustEventAction[i12];
        }
    }

    public BeduinLogAdjustEventAction(@Y61.k String str, @Y61.k Map<String, String> map) {
        this.androidToken = str;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinLogAdjustEventAction copy$default(BeduinLogAdjustEventAction beduinLogAdjustEventAction, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinLogAdjustEventAction.androidToken;
        }
        if ((i12 & 2) != 0) {
            map = beduinLogAdjustEventAction.params;
        }
        return beduinLogAdjustEventAction.copy(str, map);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getAndroidToken() {
        return this.androidToken;
    }

    @Y61.k
    public final Map<String, String> component2() {
        return this.params;
    }

    @Y61.k
    public final BeduinLogAdjustEventAction copy(@Y61.k String androidToken, @Y61.k Map<String, String> params) {
        return new BeduinLogAdjustEventAction(androidToken, params);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLogAdjustEventAction)) {
            return false;
        }
        BeduinLogAdjustEventAction beduinLogAdjustEventAction = (BeduinLogAdjustEventAction) other;
        return L.f(this.androidToken, beduinLogAdjustEventAction.androidToken) && L.f(this.params, beduinLogAdjustEventAction.params);
    }

    @Y61.k
    public final String getAndroidToken() {
        return this.androidToken;
    }

    @Y61.k
    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.androidToken.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinLogAdjustEventAction(androidToken=");
        sb2.append(this.androidToken);
        sb2.append(", params=");
        return r.w(sb2, this.params, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.androidToken);
        Iterator itI = C0.i(parcel, this.params);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
