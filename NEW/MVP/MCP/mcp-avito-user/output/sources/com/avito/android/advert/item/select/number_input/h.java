package com.avito.android.advert.item.select.number_input;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectRecallMeInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.select.number_input.SelectRecallMeInteractorImpl", f = "SelectRecallMeInteractor.kt", i = {}, l = {19}, m = "getContactInfo", n = {}, s = {})
/* loaded from: classes10.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f79526q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f79527r;

    /* renamed from: s, reason: collision with root package name */
    public int f79528s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f79527r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f79526q = obj;
        this.f79528s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f79527r.b(null, this);
    }
}
