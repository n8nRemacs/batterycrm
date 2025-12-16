package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenLocalDeeplinkAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenLocalDeeplinkAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "link", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinOpenLocalDeeplinkAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLink", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenLocalDeeplinkAction implements BeduinAction {

    @Y61.k
    private final String link;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenLocalDeeplinkAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinOpenLocalDeeplinkAction.class;

    @Y61.k
    private static final String TYPE = "openLocalDeeplink";

    @Y61.k
    private static final String type = TYPE;

    /* compiled from: BeduinOpenLocalDeeplinkAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenLocalDeeplinkAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenLocalDeeplinkAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinOpenLocalDeeplinkAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinOpenLocalDeeplinkAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenLocalDeeplinkAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenLocalDeeplinkAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenLocalDeeplinkAction createFromParcel(Parcel parcel) {
            return new BeduinOpenLocalDeeplinkAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenLocalDeeplinkAction[] newArray(int i12) {
            return new BeduinOpenLocalDeeplinkAction[i12];
        }
    }

    public BeduinOpenLocalDeeplinkAction(@Y61.k String str) {
        this.link = str;
    }

    public static /* synthetic */ BeduinOpenLocalDeeplinkAction copy$default(BeduinOpenLocalDeeplinkAction beduinOpenLocalDeeplinkAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOpenLocalDeeplinkAction.link;
        }
        return beduinOpenLocalDeeplinkAction.copy(str);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Y61.k
    public final BeduinOpenLocalDeeplinkAction copy(@Y61.k String link) {
        return new BeduinOpenLocalDeeplinkAction(link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinOpenLocalDeeplinkAction) && L.f(this.link, ((BeduinOpenLocalDeeplinkAction) other).link);
    }

    @Y61.k
    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        return this.link.hashCode();
    }

    @Y61.k
    public String toString() {
        return C22026a.c(new StringBuilder("BeduinOpenLocalDeeplinkAction(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.link);
    }
}
