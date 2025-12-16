package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import kotlin.Metadata;

/* compiled from: TextFieldKeyEventHandler.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/p;", "", "handler", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyCommand;", "Lkotlin/G0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20909p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<KeyCommand, kotlin.G0> f31198a;

    public final boolean equals(Object obj) {
        if (obj instanceof C20909p) {
            return kotlin.jvm.internal.L.f(this.f31198a, ((C20909p) obj).f31198a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31198a.hashCode();
    }

    public final String toString() {
        return "ClipboardKeyCommandsHandler(handler=" + this.f31198a + ')';
    }
}
