package com.avito.android.autoteka.data;

import Hj0.InterfaceC13998a;
import Hj0.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseAutotekaStatusInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.BaseAutotekaStatusPollingInteractorImpl", f = "BaseAutotekaStatusInteractor.kt", i = {}, l = {23}, m = "checkStatus$suspendImpl", n = {}, s = {})
/* loaded from: classes11.dex */
final class l<T extends Hj0.d & InterfaceC13998a> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96127q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.autoteka.data.previewSearch.b f96128r;

    /* renamed from: s, reason: collision with root package name */
    public int f96129s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.avito.android.autoteka.data.previewSearch.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96128r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96127q = obj;
        this.f96129s |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.b(this.f96128r, null, this);
    }
}
