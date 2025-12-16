package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: ObservableScopeInvalidator.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/F0;", "", VoiceInfo.STATE, "Landroidx/compose/runtime/y1;", "Lkotlin/G0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f29273a;

    public static InterfaceC22204y1 a() {
        return C22126m3.f(kotlin.G0.f406611a, C22126m3.h());
    }

    public static final void b(InterfaceC22204y1<kotlin.G0> interfaceC22204y1) {
        interfaceC22204y1.setValue(kotlin.G0.f406611a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F0) {
            return kotlin.jvm.internal.L.f(this.f29273a, ((F0) obj).f29273a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29273a.hashCode();
    }

    public final String toString() {
        return "ObservableScopeInvalidator(state=" + this.f29273a + ')';
    }
}
