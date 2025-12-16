package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f37943b;

    public ComposeRuntimeError(@Y61.k String str) {
        this.f37943b = str;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return this.f37943b;
    }
}
