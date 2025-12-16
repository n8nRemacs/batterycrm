package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ObservingUtils.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.logging.ObservingUtilsKt", f = "ObservingUtils.kt", i = {0, 0}, l = {14}, m = "observe", n = {"$this$observe", "log"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.http.content.p f399566q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC41649d1 f399567r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399568s;

    /* renamed from: t, reason: collision with root package name */
    public int f399569t;

    public y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399568s = obj;
        this.f399569t |= BeduinInputModel.MIN_TEXT_VERSION;
        return A.a(null, null, this);
    }
}
