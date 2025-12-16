package com.avito.android.installments.form.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InstallmentsFormActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.installments.form.mvi.InstallmentsFormActor", f = "InstallmentsFormActor.kt", i = {0, 0}, l = {142}, m = "showPostMessageDialog", n = {"this", "internalAction"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f172741q;

    /* renamed from: r, reason: collision with root package name */
    public InstallmentsFormInternalAction.ShowPostMessageDialog f172742r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f172743s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f172744t;

    /* renamed from: u, reason: collision with root package name */
    public int f172745u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f172744t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f172743s = obj;
        this.f172745u |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f172744t, null, null, null, this);
    }
}
