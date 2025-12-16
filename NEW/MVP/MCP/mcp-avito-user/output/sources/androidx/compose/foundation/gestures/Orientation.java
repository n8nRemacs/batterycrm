package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Orientation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Orientation {

    /* renamed from: b, reason: collision with root package name */
    public static final Orientation f27425b;

    /* renamed from: c, reason: collision with root package name */
    public static final Orientation f27426c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Orientation[] f27427d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f27428e;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        f27425b = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        f27426c = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        f27427d = orientationArr;
        f27428e = kotlin.enums.c.a(orientationArr);
    }

    public Orientation() {
        throw null;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f27427d.clone();
    }
}
