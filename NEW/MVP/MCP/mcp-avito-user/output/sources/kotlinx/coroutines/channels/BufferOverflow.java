package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BufferOverflow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BufferOverflow {

    /* renamed from: b, reason: collision with root package name */
    public static final BufferOverflow f410777b;

    /* renamed from: c, reason: collision with root package name */
    public static final BufferOverflow f410778c;

    /* renamed from: d, reason: collision with root package name */
    public static final BufferOverflow f410779d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BufferOverflow[] f410780e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410781f;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        f410777b = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        f410778c = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        f410779d = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        f410780e = bufferOverflowArr;
        f410781f = kotlin.enums.c.a(bufferOverflowArr);
    }

    public BufferOverflow() {
        throw null;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f410780e.clone();
    }
}
