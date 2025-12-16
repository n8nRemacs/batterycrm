package com.avito.android.publish.screen.step.wizard.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.mvi.WizardActor", f = "WizardActor.kt", i = {0}, l = {68, 69}, m = "leave", n = {"collector"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f242512q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242513r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f242514s;

    /* renamed from: t, reason: collision with root package name */
    public int f242515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242514s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f242513r = obj;
        this.f242515t |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f242514s, null, this);
    }
}
