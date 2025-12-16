package com.avito.android.phones_actualization.scenario;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesPhoneRequestInteractor", f = "ActualizePhonesPhoneRequestInteractor.kt", i = {0}, l = {48}, m = "getRequestResult-qkHeqaA", n = {"phone"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f216244q;

    /* renamed from: r, reason: collision with root package name */
    public j f216245r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f216246s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f216247t;

    /* renamed from: u, reason: collision with root package name */
    public int f216248u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f216247t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f216246s = obj;
        this.f216248u |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.d(this.f216247t, null, this);
    }
}
