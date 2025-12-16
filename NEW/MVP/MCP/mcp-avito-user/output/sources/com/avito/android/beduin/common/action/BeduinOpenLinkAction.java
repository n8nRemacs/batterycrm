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

/* compiled from: BeduinOpenLinkAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\b\u0002\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022(\b\u0002\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR7\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenLinkAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "link", "", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinOpenLinkAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getFormParamsMap", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenLinkAction implements BeduinAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenLinkAction> CREATOR = new a();

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @Y61.k
    private final String link;

    /* compiled from: BeduinOpenLinkAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinOpenLinkAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenLinkAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    String string2 = parcel.readString();
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap3, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap2.put(string2, linkedHashMap3);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinOpenLinkAction(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenLinkAction[] newArray(int i12) {
            return new BeduinOpenLinkAction[i12];
        }
    }

    /* compiled from: BeduinOpenLinkAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenLinkAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f99986b = BeduinOpenLinkAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f99987c = "openLink";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f99986b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF99987c() {
            return this.f99987c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOpenLinkAction(@Y61.k String str, @l Map<String, ? extends Map<String, String>> map) {
        this.link = str;
        this.formParamsMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinOpenLinkAction copy$default(BeduinOpenLinkAction beduinOpenLinkAction, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOpenLinkAction.link;
        }
        if ((i12 & 2) != 0) {
            map = beduinOpenLinkAction.formParamsMap;
        }
        return beduinOpenLinkAction.copy(str, map);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @l
    public final Map<String, Map<String, String>> component2() {
        return this.formParamsMap;
    }

    @Y61.k
    public final BeduinOpenLinkAction copy(@Y61.k String link, @l Map<String, ? extends Map<String, String>> formParamsMap) {
        return new BeduinOpenLinkAction(link, formParamsMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenLinkAction)) {
            return false;
        }
        BeduinOpenLinkAction beduinOpenLinkAction = (BeduinOpenLinkAction) other;
        return L.f(this.link, beduinOpenLinkAction.link) && L.f(this.formParamsMap, beduinOpenLinkAction.formParamsMap);
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @Y61.k
    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        int iHashCode = this.link.hashCode() * 31;
        Map<String, Map<String, String>> map = this.formParamsMap;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenLinkAction(link=");
        sb2.append(this.link);
        sb2.append(", formParamsMap=");
        return r.w(sb2, this.formParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.link);
        Map<String, Map<String, String>> map = this.formParamsMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            Iterator itI = C0.i(parcel, (Map) entry.getValue());
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
    }

    public /* synthetic */ BeduinOpenLinkAction(String str, Map map, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : map);
    }
}
