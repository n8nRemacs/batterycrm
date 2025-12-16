package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SelectionMode {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SelectionMode[] f31873b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f31874c;

    /* compiled from: SelectionMode.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$a;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends SelectionMode {
        public a() {
            throw null;
        }
    }

    /* compiled from: SelectionMode.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$b;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends SelectionMode {
        public b() {
            throw null;
        }
    }

    static {
        SelectionMode[] selectionModeArr = {new b("Vertical", 0, null), new a("Horizontal", 1, null)};
        f31873b = selectionModeArr;
        f31874c = kotlin.enums.c.a(selectionModeArr);
    }

    public SelectionMode() {
        throw null;
    }

    public SelectionMode(String str, int i12, C42822w c42822w) {
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) f31873b.clone();
    }
}
