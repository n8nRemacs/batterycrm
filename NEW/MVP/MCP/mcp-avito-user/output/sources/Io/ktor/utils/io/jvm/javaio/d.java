package io.ktor.utils.io.jvm.javaio;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.jvm.javaio.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Blocking.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", f = "Blocking.kt", i = {0, 0, 1}, l = {319, 38}, m = "loop", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e.a f401112q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.a f401114s;

    /* renamed from: t, reason: collision with root package name */
    public int f401115t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401114s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401113r = obj;
        this.f401115t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401114s.b(this);
    }
}
