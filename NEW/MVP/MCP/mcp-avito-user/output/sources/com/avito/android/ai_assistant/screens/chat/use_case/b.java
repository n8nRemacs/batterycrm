package com.avito.android.ai_assistant.screens.chat.use_case;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChatHistoryUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.use_case.ChatHistoryUseCaseImpl", f = "ChatHistoryUseCase.kt", i = {0}, l = {30}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f89515q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89516r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f89517s;

    /* renamed from: t, reason: collision with root package name */
    public int f89518t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89517s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f89516r = obj;
        this.f89518t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f89517s.a(null, null, this);
    }
}
