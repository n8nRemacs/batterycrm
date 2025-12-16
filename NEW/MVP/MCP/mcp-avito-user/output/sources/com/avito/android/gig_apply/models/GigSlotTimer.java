package com.avito.android.gig_apply.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42150f;
import j.e0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/models/GigSlotTimer;", "", "Direction", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GigSlotTimer {

    /* renamed from: a, reason: collision with root package name */
    public final long f159686a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f159687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159688c;

    /* renamed from: d, reason: collision with root package name */
    public final int f159689d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Direction f159690e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f159691f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigSlotState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/models/GigSlotTimer$Direction;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        /* renamed from: b, reason: collision with root package name */
        public static final Direction f159692b;

        /* renamed from: c, reason: collision with root package name */
        public static final Direction f159693c;

        /* renamed from: d, reason: collision with root package name */
        public static final Direction f159694d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f159695e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a f159696f;

        static {
            Direction direction = new Direction("AFTER_START", 0);
            f159692b = direction;
            Direction direction2 = new Direction("UNTIL_START", 1);
            f159693c = direction2;
            Direction direction3 = new Direction("UNTIL_FINISH", 2);
            f159694d = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            f159695e = directionArr;
            f159696f = c.a(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f159695e.clone();
        }
    }

    public GigSlotTimer(long j12, boolean z12, @InterfaceC42150f int i12, @e0 int i13, @k Direction direction, @l String str) {
        this.f159686a = j12;
        this.f159687b = z12;
        this.f159688c = i12;
        this.f159689d = i13;
        this.f159690e = direction;
        this.f159691f = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigSlotTimer)) {
            return false;
        }
        GigSlotTimer gigSlotTimer = (GigSlotTimer) obj;
        return this.f159686a == gigSlotTimer.f159686a && this.f159687b == gigSlotTimer.f159687b && this.f159688c == gigSlotTimer.f159688c && this.f159689d == gigSlotTimer.f159689d && this.f159690e == gigSlotTimer.f159690e && L.f(this.f159691f, gigSlotTimer.f159691f);
    }

    public final int hashCode() {
        int iHashCode = (this.f159690e.hashCode() + r.e(this.f159689d, r.e(this.f159688c, r.i(Long.hashCode(this.f159686a) * 31, 31, this.f159687b), 31), 31)) * 31;
        String str = this.f159691f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotTimer(time=");
        sb2.append(this.f159686a);
        sb2.append(", isCountDown=");
        sb2.append(this.f159687b);
        sb2.append(", colorRes=");
        sb2.append(this.f159688c);
        sb2.append(", title=");
        sb2.append(this.f159689d);
        sb2.append(", direction=");
        sb2.append(this.f159690e);
        sb2.append(", date=");
        return C22026a.c(sb2, this.f159691f, ')');
    }
}
