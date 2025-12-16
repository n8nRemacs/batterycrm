package com.vk.dto.common.id;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserId.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/dto/common/id/UserId;", "Landroid/os/Parcelable;", "b", "GsonSerializer", "id_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserId implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<UserId> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    @f
    @k
    public static final UserId f366760c;

    /* renamed from: b, reason: collision with root package name */
    public final long f366761b;

    /* compiled from: UserId.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/dto/common/id/UserId$GsonSerializer;", "Lcom/google/gson/o;", "Lcom/vk/dto/common/id/UserId;", "Lcom/google/gson/h;", "id_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GsonSerializer implements o<UserId>, h<UserId> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f366762a;

        public GsonSerializer() {
            this(false, 1, null);
        }

        @Override // com.google.gson.o
        public final i a(Object obj, n nVar) {
            boolean z12 = this.f366762a;
            long j12 = ((UserId) obj).f366761b;
            if (z12) {
                j12 = j12 < 0 ? j12 - Integer.MAX_VALUE : j12 + Integer.MAX_VALUE;
            }
            return new m(Long.valueOf(j12));
        }

        @Override // com.google.gson.h
        public final UserId deserialize(i iVar, Type type, g gVar) {
            if (iVar instanceof j) {
                return null;
            }
            long jL2 = iVar.l();
            if (!this.f366762a) {
                return new UserId(jL2);
            }
            boolean z12 = jL2 < 0;
            long jAbs = Math.abs(jL2);
            if (jAbs < 2147483647L) {
                throw new IllegalStateException("abs of owner id should be >= MAX_INT");
            }
            long j12 = jAbs - Integer.MAX_VALUE;
            if (z12) {
                j12 = -j12;
            }
            return new UserId(j12);
        }

        public GsonSerializer(boolean z12, int i12, C42822w c42822w) {
            this.f366762a = (i12 & 1) != 0 ? false : z12;
        }
    }

    /* compiled from: UserId.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/vk/dto/common/id/UserId$a", "Landroid/os/Parcelable$Creator;", "Lcom/vk/dto/common/id/UserId;", "id_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<UserId> {
        @Override // android.os.Parcelable.Creator
        public final UserId createFromParcel(Parcel parcel) {
            return new UserId(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final UserId[] newArray(int i12) {
            return new UserId[i12];
        }
    }

    /* compiled from: UserId.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/dto/common/id/UserId$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/vk/dto/common/id/UserId;", "CREATOR", "Landroid/os/Parcelable$Creator;", "DEFAULT", "Lcom/vk/dto/common/id/UserId;", "id_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f366760c = new UserId(0L);
        CREATOR = new a();
    }

    public UserId(long j12) {
        this.f366761b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserId) && this.f366761b == ((UserId) obj).f366761b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f366761b);
    }

    @k
    public final String toString() {
        return String.valueOf(this.f366761b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f366761b);
    }
}
