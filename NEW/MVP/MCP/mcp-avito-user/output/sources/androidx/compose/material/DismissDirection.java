package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DismissDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final DismissDirection f32536b;

    /* renamed from: c, reason: collision with root package name */
    public static final DismissDirection f32537c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DismissDirection[] f32538d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32539e;

    static {
        DismissDirection dismissDirection = new DismissDirection("StartToEnd", 0);
        f32536b = dismissDirection;
        DismissDirection dismissDirection2 = new DismissDirection("EndToStart", 1);
        f32537c = dismissDirection2;
        DismissDirection[] dismissDirectionArr = {dismissDirection, dismissDirection2};
        f32538d = dismissDirectionArr;
        f32539e = kotlin.enums.c.a(dismissDirectionArr);
    }

    public DismissDirection() {
        throw null;
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) f32538d.clone();
    }
}
