package kotlin;

import kotlin.jvm.internal.C42822w;

/* compiled from: Standard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G;", "Ljava/lang/Error;", "Lkotlin/Error;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G extends Error {
    public G() {
        this(null, 1, null);
    }

    public G(String str, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
