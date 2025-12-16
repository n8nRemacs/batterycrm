package com.avito.android.phones_actualization.deep_linking;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActualizePhonesStatusInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.phones_actualization.deep_linking.ActualizePhonesStatusInteractorImpl", f = "ActualizePhonesStatusInteractor.kt", i = {0, 0, 1, 1}, l = {75, 37}, m = "getScenario", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f216204q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f216205r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f216206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f216207t;

    /* renamed from: u, reason: collision with root package name */
    public int f216208u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f216207t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f216206s = obj;
        this.f216208u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f216207t.a(this);
    }
}
