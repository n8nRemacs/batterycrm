package com.avito.android.remote.model.category_parameters.slot.imv;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo;", "", "type", "Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo$Type;", "text", "", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo$Type;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo$Type;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Type", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NotificationInfo {

    @c("text")
    @k
    private final String text;

    @c("type")
    @l
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstantMarketValueResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo$Type;", "", "(Ljava/lang/String;I)V", "WARNING", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c(ConstraintKt.WARNING)
        public static final Type WARNING = new Type("WARNING", 0);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{WARNING};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12) {
        }

        @k
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public NotificationInfo(@l Type type, @k String str) {
        this.type = type;
        this.text = str;
    }

    public static /* synthetic */ NotificationInfo copy$default(NotificationInfo notificationInfo, Type type, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            type = notificationInfo.type;
        }
        if ((i12 & 2) != 0) {
            str = notificationInfo.text;
        }
        return notificationInfo.copy(type, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    public final NotificationInfo copy(@l Type type, @k String text) {
        return new NotificationInfo(type, text);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationInfo)) {
            return false;
        }
        NotificationInfo notificationInfo = (NotificationInfo) other;
        return this.type == notificationInfo.type && L.f(this.text, notificationInfo.text);
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = this.type;
        return this.text.hashCode() + ((type == null ? 0 : type.hashCode()) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationInfo(type=");
        sb2.append(this.type);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }
}
