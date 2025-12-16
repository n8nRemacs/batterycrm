package com.avito.android.server_time;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.r;
import com.avito.android.util.C35744a4;
import com.avito.android.util.Y2;
import com.avito.android.util.rx3.F;
import java.util.TimeZone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ServerTimeSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/server_time/g;", "Lcom/avito/android/server_time/f;", "_common_server-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f273997c = {m0.f406844a.e(new Y(g.class, "timeDiff", "getTimeDiff()J", 0))};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.a f273998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y2 f273999b;

    /* compiled from: ServerTimeSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Long, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            Y2 y22 = g.this.f273999b;
            n<Object> nVar = g.f273997c[0];
            y22.getClass();
            y22.f318782a.getValue().edit().putLong("timeDiff", Long.valueOf(jLongValue).longValue()).apply();
            return G0.f406611a;
        }
    }

    public g(@k Context context, @k d dVar, @k com.avito.android.server_time.a aVar) {
        this.f273998a = aVar;
        this.f273999b = C35744a4.a(context);
        F.a(dVar, new a());
    }

    @Override // com.avito.android.server_time.h
    @k
    /* renamed from: a */
    public final TimeZone getF274002b() {
        return TimeZone.getDefault();
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj instanceof f;
    }

    public final int hashCode() {
        return 398979339;
    }

    @Override // com.avito.android.server_time.h
    public final long now() {
        this.f273998a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        n<Object> nVar = f273997c[0];
        SharedPreferences value = this.f273999b.f318782a.getValue();
        Long lValueOf = null;
        if (value.contains("timeDiff")) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(Long.class);
            if (dVarB.equals(n0Var.b(Integer.TYPE))) {
                lValueOf = (Long) Integer.valueOf(value.getInt("timeDiff", 0));
            } else if (dVarB.equals(n0Var.b(Long.TYPE))) {
                lValueOf = Long.valueOf(value.getLong("timeDiff", 0L));
            } else if (dVarB.equals(n0Var.b(Float.TYPE))) {
                lValueOf = (Long) Float.valueOf(value.getFloat("timeDiff", 0.0f));
            } else if (dVarB.equals(n0Var.b(String.class))) {
                Object string = value.getString("timeDiff", "");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                lValueOf = (Long) string;
            } else if (dVarB.equals(n0Var.b(Boolean.TYPE))) {
                lValueOf = (Long) Boolean.valueOf(value.getBoolean("timeDiff", false));
            }
        }
        return jCurrentTimeMillis - (lValueOf != null ? lValueOf.longValue() : 0L);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServerTimeSource(now=");
        sb2.append(now());
        sb2.append(",timeDiff=");
        n<Object> nVar = f273997c[0];
        SharedPreferences value = this.f273999b.f318782a.getValue();
        Long lValueOf = null;
        if (value.contains("timeDiff")) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(Long.class);
            if (dVarB.equals(n0Var.b(Integer.TYPE))) {
                lValueOf = (Long) Integer.valueOf(value.getInt("timeDiff", 0));
            } else if (dVarB.equals(n0Var.b(Long.TYPE))) {
                lValueOf = Long.valueOf(value.getLong("timeDiff", 0L));
            } else if (dVarB.equals(n0Var.b(Float.TYPE))) {
                lValueOf = (Long) Float.valueOf(value.getFloat("timeDiff", 0.0f));
            } else if (dVarB.equals(n0Var.b(String.class))) {
                Object string = value.getString("timeDiff", "");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                lValueOf = (Long) string;
            } else if (dVarB.equals(n0Var.b(Boolean.TYPE))) {
                lValueOf = (Long) Boolean.valueOf(value.getBoolean("timeDiff", false));
            }
        }
        return r.u(sb2, lValueOf != null ? lValueOf.longValue() : 0L, ')');
    }
}
