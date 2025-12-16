package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/l;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC21022l {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC21022l f32064b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC21022l f32065c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC21022l f32066d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC21022l f32067e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC21022l[] f32068f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32069g;

    static {
        EnumC21022l enumC21022l = new EnumC21022l("Up", 0);
        f32064b = enumC21022l;
        EnumC21022l enumC21022l2 = new EnumC21022l("Drag", 1);
        f32065c = enumC21022l2;
        EnumC21022l enumC21022l3 = new EnumC21022l("Timeout", 2);
        f32066d = enumC21022l3;
        EnumC21022l enumC21022l4 = new EnumC21022l("Cancel", 3);
        f32067e = enumC21022l4;
        EnumC21022l[] enumC21022lArr = {enumC21022l, enumC21022l2, enumC21022l3, enumC21022l4};
        f32068f = enumC21022lArr;
        f32069g = kotlin.enums.c.a(enumC21022lArr);
    }

    public EnumC21022l() {
        throw null;
    }

    public static EnumC21022l valueOf(String str) {
        return (EnumC21022l) Enum.valueOf(EnumC21022l.class, str);
    }

    public static EnumC21022l[] values() {
        return (EnumC21022l[]) f32068f.clone();
    }
}
