package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime;", "", "", "duration", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime$Type;", "b", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime$Type;", "Type", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotTime {

    @c("duration")
    @k
    private final String duration;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotTime$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "WorkedTime", "ShiftDuration", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("shiftDuration")
        public static final Type ShiftDuration;

        @c("workedTime")
        public static final Type WorkedTime;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f159492b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159493c;

        static {
            Type type = new Type("WorkedTime", 0, "workedTime");
            WorkedTime = type;
            Type type2 = new Type("ShiftDuration", 1, "shiftDuration");
            ShiftDuration = type2;
            Type[] typeArr = {type, type2};
            f159492b = typeArr;
            f159493c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f159492b.clone();
        }
    }

    public SlotTime(@k String str, @k Type type) {
        this.duration = str;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
