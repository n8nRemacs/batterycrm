package com.avito.android.connection_quality.reactive_network;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Connectivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/a;", "", "a", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3733a f125715f = new C3733a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NetworkInfo.State f125716a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final NetworkInfo.DetailedState f125717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125718c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f125719d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f125720e;

    /* compiled from: Connectivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/connection_quality/reactive_network/a$a;", "", "<init>", "()V", "", "UNKNOWN_TYPE", "I", "_common_connection-quality_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.connection_quality.reactive_network.a$a, reason: collision with other inner class name */
    public static final class C3733a {
        public /* synthetic */ C3733a(C42822w c42822w) {
            this();
        }

        @k
        public static a a(@k Context context) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                a.f125715f.getClass();
                return new a(activeNetworkInfo.getState(), activeNetworkInfo.getDetailedState(), activeNetworkInfo.getType(), activeNetworkInfo.getTypeName(), activeNetworkInfo.getSubtypeName());
            }
            return new a(null, null, 0, null, null, 31, null);
        }

        public C3733a() {
        }
    }

    public a() {
        this(null, null, 0, null, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f125716a == aVar.f125716a && this.f125717b == aVar.f125717b && this.f125718c == aVar.f125718c && L.f(this.f125719d, aVar.f125719d) && L.f(this.f125720e, aVar.f125720e);
    }

    public final int hashCode() {
        int iHashCode = this.f125716a.hashCode() * 31;
        NetworkInfo.DetailedState detailedState = this.f125717b;
        int iE2 = r.e(this.f125718c, (iHashCode + (detailedState == null ? 0 : detailedState.hashCode())) * 31, 31);
        String str = this.f125719d;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125720e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connectivity(state=");
        sb2.append(this.f125716a);
        sb2.append(", detailedState=");
        sb2.append(this.f125717b);
        sb2.append(", type=");
        sb2.append(this.f125718c);
        sb2.append(", typeName=");
        sb2.append(this.f125719d);
        sb2.append(", subTypeName=");
        return C22026a.c(sb2, this.f125720e, ')');
    }

    public a(@k NetworkInfo.State state, @l NetworkInfo.DetailedState detailedState, int i12, @l String str, @l String str2) {
        this.f125716a = state;
        this.f125717b = detailedState;
        this.f125718c = i12;
        this.f125719d = str;
        this.f125720e = str2;
    }

    public /* synthetic */ a(NetworkInfo.State state, NetworkInfo.DetailedState detailedState, int i12, String str, String str2, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? NetworkInfo.State.DISCONNECTED : state, (i13 & 2) != 0 ? NetworkInfo.DetailedState.IDLE : detailedState, (i13 & 4) != 0 ? -1 : i12, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2);
    }
}
