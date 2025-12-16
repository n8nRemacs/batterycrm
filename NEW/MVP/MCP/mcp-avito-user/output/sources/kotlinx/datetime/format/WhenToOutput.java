package kotlinx.datetime.format;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtcOffsetFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/format/WhenToOutput;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WhenToOutput {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WhenToOutput[] f412391b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412392c;

    static {
        WhenToOutput[] whenToOutputArr = {new WhenToOutput("NEVER", 0), new WhenToOutput("IF_NONZERO", 1), new WhenToOutput("ALWAYS", 2)};
        f412391b = whenToOutputArr;
        f412392c = kotlin.enums.c.a(whenToOutputArr);
    }

    public WhenToOutput() {
        throw null;
    }

    public static WhenToOutput valueOf(String str) {
        return (WhenToOutput) Enum.valueOf(WhenToOutput.class, str);
    }

    public static WhenToOutput[] values() {
        return (WhenToOutput[]) f412391b.clone();
    }
}
