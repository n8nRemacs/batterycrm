package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventPass {

    /* renamed from: b, reason: collision with root package name */
    public static final PointerEventPass f40173b;

    /* renamed from: c, reason: collision with root package name */
    public static final PointerEventPass f40174c;

    /* renamed from: d, reason: collision with root package name */
    public static final PointerEventPass f40175d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PointerEventPass[] f40176e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f40177f;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        f40173b = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        f40174c = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        f40175d = pointerEventPass3;
        PointerEventPass[] pointerEventPassArr = {pointerEventPass, pointerEventPass2, pointerEventPass3};
        f40176e = pointerEventPassArr;
        f40177f = kotlin.enums.c.a(pointerEventPassArr);
    }

    public PointerEventPass() {
        throw null;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) f40176e.clone();
    }
}
