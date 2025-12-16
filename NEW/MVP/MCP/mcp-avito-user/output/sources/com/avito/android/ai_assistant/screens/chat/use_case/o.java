package com.avito.android.ai_assistant.screens.chat.use_case;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendMessageUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.use_case.SendMessageUseCaseImpl", f = "SendMessageUseCase.kt", i = {0, 0}, l = {36}, m = "invoke", n = {"this", "iID"}, s = {"L$0", "L$1"})
/* loaded from: classes11.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f89548q;

    /* renamed from: r, reason: collision with root package name */
    public String f89549r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89550s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f89551t;

    /* renamed from: u, reason: collision with root package name */
    public int f89552u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89551t = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f89550s = obj;
        this.f89552u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f89551t.a(null, null, null, this);
    }
}
