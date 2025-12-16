package com.avito.android.publish.slots.address_from_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectAddressInListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListInteractorImpl", f = "SelectAddressInListInteractor.kt", i = {1}, l = {33, 34}, m = "requestList", n = {"result"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult f242851q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242852r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f242853s;

    /* renamed from: t, reason: collision with root package name */
    public int f242854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f242853s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f242852r = obj;
        this.f242854t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f242853s.c(0L, this);
    }
}
