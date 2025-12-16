package com.avito.android.beduin.common.displaying;

import K51.d;
import Y61.k;
import Y61.l;
import ai.InterfaceC19892b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContainsParameterEqualToStringDisplayingPredicate.kt */
@d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/displaying/ContainsParameterEqualToStringDisplayingPredicate;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "", "id", "string", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "", "", "store", "", "getVisibility", "(Ljava/util/Map;)Z", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/displaying/ContainsParameterEqualToStringDisplayingPredicate;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContainsParameterEqualToStringDisplayingPredicate implements DisplayingPredicate {

    @k
    public static final Parcelable.Creator<ContainsParameterEqualToStringDisplayingPredicate> CREATOR = new a();

    @k
    private final String id;

    @l
    private final String string;

    /* compiled from: ContainsParameterEqualToStringDisplayingPredicate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContainsParameterEqualToStringDisplayingPredicate> {
        @Override // android.os.Parcelable.Creator
        public final ContainsParameterEqualToStringDisplayingPredicate createFromParcel(Parcel parcel) {
            return new ContainsParameterEqualToStringDisplayingPredicate(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContainsParameterEqualToStringDisplayingPredicate[] newArray(int i12) {
            return new ContainsParameterEqualToStringDisplayingPredicate[i12];
        }
    }

    /* compiled from: ContainsParameterEqualToStringDisplayingPredicate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/displaying/ContainsParameterEqualToStringDisplayingPredicate$b;", "Lai/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC19892b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Class<? extends DisplayingPredicate> f103294a = ContainsParameterEqualToStringDisplayingPredicate.class;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f103295b = "containsParameterEqualToString";

        @Override // ai.InterfaceC19892b
        @k
        public final Class<? extends DisplayingPredicate> a() {
            return this.f103294a;
        }

        @Override // ai.InterfaceC19892b
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF103298b() {
            return this.f103295b;
        }
    }

    public ContainsParameterEqualToStringDisplayingPredicate(@k String str, @l String str2) {
        this.id = str;
        this.string = str2;
    }

    /* renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    private final String getString() {
        return this.string;
    }

    public static /* synthetic */ ContainsParameterEqualToStringDisplayingPredicate copy$default(ContainsParameterEqualToStringDisplayingPredicate containsParameterEqualToStringDisplayingPredicate, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = containsParameterEqualToStringDisplayingPredicate.id;
        }
        if ((i12 & 2) != 0) {
            str2 = containsParameterEqualToStringDisplayingPredicate.string;
        }
        return containsParameterEqualToStringDisplayingPredicate.copy(str, str2);
    }

    @k
    public final ContainsParameterEqualToStringDisplayingPredicate copy(@k String id2, @l String string) {
        return new ContainsParameterEqualToStringDisplayingPredicate(id2, string);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainsParameterEqualToStringDisplayingPredicate)) {
            return false;
        }
        ContainsParameterEqualToStringDisplayingPredicate containsParameterEqualToStringDisplayingPredicate = (ContainsParameterEqualToStringDisplayingPredicate) other;
        return L.f(this.id, containsParameterEqualToStringDisplayingPredicate.id) && L.f(this.string, containsParameterEqualToStringDisplayingPredicate.string);
    }

    @Override // com.avito.android.beduin_models.DisplayingPredicate
    public boolean getVisibility(@k Map<String, ? extends Object> store) {
        Object obj = store.get(this.id);
        if (obj == null) {
            obj = "";
        }
        String str = this.string;
        return obj.equals(str != null ? str : "");
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.string;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContainsParameterEqualToStringDisplayingPredicate(id=");
        sb2.append(this.id);
        sb2.append(", string=");
        return C22026a.c(sb2, this.string, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.string);
    }
}
