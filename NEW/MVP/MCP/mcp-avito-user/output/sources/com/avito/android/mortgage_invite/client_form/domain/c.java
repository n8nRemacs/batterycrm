package com.avito.android.mortgage_invite.client_form.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActionProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.domain.ApplicationClientFormActionProcessorImpl", f = "ApplicationClientFormActionProcessor.kt", i = {1}, l = {100, 102, 103, 107}, m = "processCreateParticipantResult", n = {"$this$processCreateParticipantResult"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f205145q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205146r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f205147s;

    /* renamed from: t, reason: collision with root package name */
    public int f205148t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f205147s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f205146r = obj;
        this.f205148t |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.c(this.f205147s, null, null, null, this);
    }
}
