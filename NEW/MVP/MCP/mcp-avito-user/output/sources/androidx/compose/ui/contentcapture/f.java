package androidx.compose.ui.contentcapture;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidContentCaptureManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f38981b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f38982c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f38983d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f38984e;

    static {
        f fVar = new f("VIEW_APPEAR", 0);
        f38981b = fVar;
        f fVar2 = new f("VIEW_DISAPPEAR", 1);
        f38982c = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f38983d = fVarArr;
        f38984e = kotlin.enums.c.a(fVarArr);
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f38983d.clone();
    }
}
