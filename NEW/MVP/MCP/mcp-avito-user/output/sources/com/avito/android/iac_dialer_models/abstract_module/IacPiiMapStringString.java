package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacPii.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ&\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "Lcom/avito/android/iac_dialer_models/abstract_module/b;", "Landroid/os/Parcelable;", "LdL/d;", "", "", "value", "<init>", "(Ljava/util/Map;)V", "toStringUnmasked", "()Ljava/lang/String;", "unwrap", "()Ljava/util/Map;", "component1", "copy", "(Ljava/util/Map;)Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getValue", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPiiMapStringString extends b implements Parcelable, dL.d {

    @k
    public static final Parcelable.Creator<IacPiiMapStringString> CREATOR = new a();

    @k
    private final Map<String, String> value;

    /* compiled from: IacPii.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPiiMapStringString> {
        @Override // android.os.Parcelable.Creator
        public final IacPiiMapStringString createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new IacPiiMapStringString(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final IacPiiMapStringString[] newArray(int i12) {
            return new IacPiiMapStringString[i12];
        }
    }

    public IacPiiMapStringString(@k Map<String, String> map) {
        this.value = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacPiiMapStringString copy$default(IacPiiMapStringString iacPiiMapStringString, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = iacPiiMapStringString.value;
        }
        return iacPiiMapStringString.copy(map);
    }

    @k
    public final Map<String, String> component1() {
        return this.value;
    }

    @k
    public final IacPiiMapStringString copy(@k Map<String, String> value) {
        return new IacPiiMapStringString(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacPiiMapStringString) && L.f(this.value, ((IacPiiMapStringString) other).value);
    }

    @k
    public final Map<String, String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.avito.android.iac_dialer_models.abstract_module.b
    @k
    public String toStringUnmasked() {
        return toStringMasked();
    }

    @k
    public final Map<String, String> unwrap() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itI = C0.i(parcel, this.value);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
