package io.ktor.client.engine;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.engine.InterfaceC41434a;
import io.ktor.client.request.e0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientEngine.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {91, 100}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
/* renamed from: io.ktor.client.engine.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41435b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41434a f398886q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f398887r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f398888s;

    /* renamed from: t, reason: collision with root package name */
    public int f398889t;

    public C41435b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398888s = obj;
        this.f398889t |= BeduinInputModel.MIN_TEXT_VERSION;
        return InterfaceC41434a.C11397a.a(null, null, this);
    }
}
