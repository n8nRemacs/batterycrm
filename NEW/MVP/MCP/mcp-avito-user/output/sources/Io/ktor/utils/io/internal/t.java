package io.ktor.utils.io.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriteSessionImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.internal.WriteSessionImpl", f = "WriteSessionImpl.kt", i = {0}, l = {86}, m = "tryAwaitJoinSwitch", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public u f401074q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401075r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f401076s;

    /* renamed from: t, reason: collision with root package name */
    public int f401077t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401076s = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401075r = obj;
        this.f401077t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401076s.f(0, this);
    }
}
