package com.avito.android.ai_assistant.screens.chat.use_case;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DiscoverUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.use_case.DiscoverUseCaseImpl", f = "DiscoverUseCase.kt", i = {0, 0}, l = {31}, m = "invoke", n = {"this", "iID"}, s = {"L$0", "L$1"})
/* loaded from: classes11.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f89530q;

    /* renamed from: r, reason: collision with root package name */
    public String f89531r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89532s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f89533t;

    /* renamed from: u, reason: collision with root package name */
    public int f89534u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89533t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f89532s = obj;
        this.f89534u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f89533t.a(null, null, this);
    }
}
