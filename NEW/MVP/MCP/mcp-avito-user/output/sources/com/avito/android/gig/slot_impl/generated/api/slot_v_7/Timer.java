package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer;", "", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer$Direction;", "direction", "<init>", "(Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer$Direction;)V", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer$Direction;", "a", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer$Direction;", "Direction", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Timer {

    @c("direction")
    @k
    private final Direction direction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer$Direction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UntilStart", "AfterStart", "UntilFinished", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        @c("afterStart")
        public static final Direction AfterStart;

        @c("untilFinished")
        public static final Direction UntilFinished;

        @c("untilStart")
        public static final Direction UntilStart;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f159503b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159504c;

        static {
            Direction direction = new Direction("UntilStart", 0, "untilStart");
            UntilStart = direction;
            Direction direction2 = new Direction("AfterStart", 1, "afterStart");
            AfterStart = direction2;
            Direction direction3 = new Direction("UntilFinished", 2, "untilFinished");
            UntilFinished = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            f159503b = directionArr;
            f159504c = kotlin.enums.c.a(directionArr);
        }

        private Direction(String str, int i12, String str2) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f159503b.clone();
        }
    }

    public Timer(@k Direction direction) {
        this.direction = direction;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }
}
