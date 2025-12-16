package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PausableComposition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PausedCompositionState {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PausedCompositionState[] f38094b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f38095c;

    static {
        PausedCompositionState[] pausedCompositionStateArr = {new PausedCompositionState("Invalid", 0), new PausedCompositionState("Cancelled", 1), new PausedCompositionState("InitialPending", 2), new PausedCompositionState("RecomposePending", 3), new PausedCompositionState("ApplyPending", 4), new PausedCompositionState("Applied", 5)};
        f38094b = pausedCompositionStateArr;
        f38095c = kotlin.enums.c.a(pausedCompositionStateArr);
    }

    public PausedCompositionState() {
        throw null;
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) f38094b.clone();
    }
}
