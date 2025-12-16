package ru.cyberity.cbr.core.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IntroParams.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/domain/model/c;", "Landroid/os/Parcelable;", "", "step", "scene", "idDocType", "", "isAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "b", "f", "c", "e", "d", "Z", "h", "()Z", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class c implements Parcelable {

    @k
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String step;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String scene;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String idDocType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isAction;

    /* compiled from: IntroParams.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(@k Parcel parcel) {
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i12) {
            return new c[i12];
        }
    }

    public c(@k String str, @k String str2, @l String str3, boolean z12) {
        this.step = str;
        this.scene = str2;
        this.idDocType = str3;
        this.isAction = z12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return L.f(this.step, cVar.step) && L.f(this.scene, cVar.scene) && L.f(this.idDocType, cVar.idDocType) && this.isAction == cVar.isAction;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getStep() {
        return this.step;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsAction() {
        return this.isAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD2 = H.d(this.step.hashCode() * 31, 31, this.scene);
        String str = this.idDocType;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z12 = this.isAction;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iHashCode + i12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntroParams(step=");
        sb2.append(this.step);
        sb2.append(", scene=");
        sb2.append(this.scene);
        sb2.append(", idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", isAction=");
        return r.x(sb2, this.isAction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.step);
        parcel.writeString(this.scene);
        parcel.writeString(this.idDocType);
        parcel.writeInt(this.isAction ? 1 : 0);
    }

    public /* synthetic */ c(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12);
    }
}
