package com.avito.android.publish.screen.step.wizard.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.WizardParameter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.data.WizardInteractorImpl", f = "WizardInteractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 3, 3, 3}, l = {50, 51, 53, 61, 62}, m = "next", n = {"this", "parameter", "previousParameter", "collector", "this", "parameter", "previousParameter", "collector", "parameter", "collector", "isAutoSelected"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "Z$0"})
/* loaded from: classes16.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f242444q;

    /* renamed from: r, reason: collision with root package name */
    public Object f242445r;

    /* renamed from: s, reason: collision with root package name */
    public WizardParameter f242446s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC43172j f242447t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f242448u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f242449v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f242450w;

    /* renamed from: x, reason: collision with root package name */
    public int f242451x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242450w = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f242449v = obj;
        this.f242451x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f242450w.a(null, null, false, null, this);
    }
}
