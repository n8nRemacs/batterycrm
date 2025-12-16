package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MultiUrgencyToggleInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyToggleInteractor", f = "MultiUrgencyToggleInteractor.kt", i = {0}, l = {19}, m = "setMultiUrgencyTyped", n = {"item"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.user_advert.advert.items.multi_urgency.c f308706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f308707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f308708s;

    /* renamed from: t, reason: collision with root package name */
    public int f308709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f308708s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f308707r = obj;
        this.f308709t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f308708s.a(null, this);
    }
}
