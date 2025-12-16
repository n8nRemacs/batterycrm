package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PretendResult.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\rR\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\u0011¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "Landroid/os/Parcelable;", "", "success", "", "", "Lcom/avito/android/remote/model/PretendErrorValue;", "errors", "<init>", "(ZLjava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/util/Map;", "copy", "(ZLjava/util/Map;)Lcom/avito/android/remote/model/PretendResult;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getSuccess", "Ljava/util/Map;", "getErrors", "getMessage", "message", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PretendResult implements Parcelable {

    @k
    public static final Parcelable.Creator<PretendResult> CREATOR = new Creator();

    @k
    private final Map<String, PretendErrorValue> errors;
    private final boolean success;

    /* compiled from: PretendResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PretendResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PretendResult createFromParcel(@k Parcel parcel) {
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = f.c(PretendResult.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new PretendResult(z12, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PretendResult[] newArray(int i12) {
            return new PretendResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PretendResult() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PretendResult copy$default(PretendResult pretendResult, boolean z12, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = pretendResult.success;
        }
        if ((i12 & 2) != 0) {
            map = pretendResult.errors;
        }
        return pretendResult.copy(z12, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @k
    public final Map<String, PretendErrorValue> component2() {
        return this.errors;
    }

    @k
    public final PretendResult copy(boolean success, @k Map<String, ? extends PretendErrorValue> errors) {
        return new PretendResult(success, errors);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PretendResult)) {
            return false;
        }
        PretendResult pretendResult = (PretendResult) other;
        return this.success == pretendResult.success && L.f(this.errors, pretendResult.errors);
    }

    @k
    public final Map<String, PretendErrorValue> getErrors() {
        return this.errors;
    }

    @k
    public final String getMessage() {
        PretendErrorValue pretendErrorValue = (PretendErrorValue) C42745f0.R(this.errors.values());
        String singleMessage = pretendErrorValue != null ? pretendErrorValue.getSingleMessage() : null;
        return singleMessage == null ? "" : singleMessage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.errors.hashCode() + (Boolean.hashCode(this.success) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PretendResult(success=");
        sb2.append(this.success);
        sb2.append(", errors=");
        return r.w(sb2, this.errors, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.success ? 1 : 0);
        Iterator itI = C0.i(parcel, this.errors);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PretendResult(boolean z12, @k Map<String, ? extends PretendErrorValue> map) {
        this.success = z12;
        this.errors = map;
    }

    public /* synthetic */ PretendResult(boolean z12, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? P0.c() : map);
    }
}
