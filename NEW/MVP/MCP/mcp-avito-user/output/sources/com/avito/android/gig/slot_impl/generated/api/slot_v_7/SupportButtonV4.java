package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4;", "", "", "chatDeepLink", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4$Position;", "position", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4$Position;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4$Position;", "b", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4$Position;", "Position", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SupportButtonV4 {

    @c("chatDeepLink")
    @l
    private final String chatDeepLink;

    @c("position")
    @k
    private final Position position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4$Position;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Top", "Bottom", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Position {

        @c("bottom")
        public static final Position Bottom;

        @c("top")
        public static final Position Top;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Position[] f159500b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159501c;

        static {
            Position position = new Position("Top", 0, "top");
            Top = position;
            Position position2 = new Position("Bottom", 1, "bottom");
            Bottom = position2;
            Position[] positionArr = {position, position2};
            f159500b = positionArr;
            f159501c = kotlin.enums.c.a(positionArr);
        }

        private Position(String str, int i12, String str2) {
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) f159500b.clone();
        }
    }

    public SupportButtonV4(@l String str, @k Position position) {
        this.chatDeepLink = str;
        this.position = position;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getChatDeepLink() {
        return this.chatDeepLink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }
}
