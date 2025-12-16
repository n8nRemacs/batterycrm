package io.ktor.client.engine.android;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.request.e0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidURLConnectionUtils.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", i = {0, 0}, l = {60}, m = "timeoutAwareConnection", n = {"request", "cause"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class j<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e0 f398882q;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f398883r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f398884s;

    /* renamed from: t, reason: collision with root package name */
    public int f398885t;

    public j() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f398884s = obj;
        this.f398885t |= BeduinInputModel.MIN_TEXT_VERSION;
        return k.a(null, null, null, this);
    }
}
