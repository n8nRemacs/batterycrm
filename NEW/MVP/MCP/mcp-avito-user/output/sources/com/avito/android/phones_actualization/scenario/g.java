package com.avito.android.phones_actualization.scenario;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesPhoneRequestInteractor", f = "ActualizePhonesPhoneRequestInteractor.kt", i = {}, l = {86}, m = "getValidateErrorOrNull-qkHeqaA", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f216250q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f216251r;

    /* renamed from: s, reason: collision with root package name */
    public int f216252s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f216251r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f216250q = obj;
        this.f216252s |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.e(this.f216251r, null, this);
    }
}
