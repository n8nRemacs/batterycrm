package androidx.compose.foundation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MutatorMutex.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatePriority {

    /* renamed from: b, reason: collision with root package name */
    public static final MutatePriority f26797b;

    /* renamed from: c, reason: collision with root package name */
    public static final MutatePriority f26798c;

    /* renamed from: d, reason: collision with root package name */
    public static final MutatePriority f26799d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MutatePriority[] f26800e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f26801f;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        f26797b = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        f26798c = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        f26799d = mutatePriority3;
        MutatePriority[] mutatePriorityArr = {mutatePriority, mutatePriority2, mutatePriority3};
        f26800e = mutatePriorityArr;
        f26801f = kotlin.enums.c.a(mutatePriorityArr);
    }

    public MutatePriority() {
        throw null;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f26800e.clone();
    }
}
