package io.ktor.client.engine.android;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidClientEngine.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", i = {}, l = {116, 123}, m = "writeTo", n = {}, s = {})
/* loaded from: classes8.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public OutputStream f398869q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f398870r;

    /* renamed from: s, reason: collision with root package name */
    public int f398871s;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398870r = obj;
        this.f398871s |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.a(null, null, null, this);
    }
}
