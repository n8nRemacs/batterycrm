package androidx.compose.material3;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismissBox.kt */
@InterfaceC21537e7
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DismissDirection;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class DismissDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DismissDirection[] f34638b = {new DismissDirection("StartToEnd", 0), new DismissDirection("EndToStart", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    DismissDirection EF5;

    public DismissDirection() {
        throw null;
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) f34638b.clone();
    }
}
