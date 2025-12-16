package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Handle {

    /* renamed from: b, reason: collision with root package name */
    public static final Handle f30328b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handle f30329c;

    /* renamed from: d, reason: collision with root package name */
    public static final Handle f30330d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Handle[] f30331e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f30332f;

    static {
        Handle handle = new Handle("Cursor", 0);
        f30328b = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        f30329c = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        f30330d = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        f30331e = handleArr;
        f30332f = kotlin.enums.c.a(handleArr);
    }

    public Handle() {
        throw null;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f30331e.clone();
    }
}
