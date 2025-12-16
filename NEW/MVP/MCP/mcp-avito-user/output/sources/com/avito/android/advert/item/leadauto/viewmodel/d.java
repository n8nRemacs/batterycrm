package com.avito.android.advert.item.leadauto.viewmodel;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutoNewCarsLeadFormViewModelImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.leadauto.viewmodel.ConsultationAutoViewModel", f = "AutoNewCarsLeadFormViewModelImpl.kt", i = {}, l = {31}, m = "loadData", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f77332q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f77333r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f77334s;

    /* renamed from: t, reason: collision with root package name */
    public int f77335t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f77334s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f77333r = obj;
        this.f77335t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f77334s.ke(this);
    }
}
