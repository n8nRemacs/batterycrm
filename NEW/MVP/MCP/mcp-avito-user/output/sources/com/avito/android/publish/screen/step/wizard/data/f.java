package com.avito.android.publish.screen.step.wizard.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WizardRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.data.WizardRepositoryImpl", f = "WizardRepository.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "loadWizardParams", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f242454q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f242455r;

    /* renamed from: s, reason: collision with root package name */
    public int f242456s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242455r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f242454q = obj;
        this.f242456s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f242455r.a(this);
    }
}
