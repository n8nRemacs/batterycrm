package com.avito.android.travel_payment_selector.mvi.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PaymentSelectorApiInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.travel_payment_selector.mvi.interactor.PaymentSelectorApiInteractor", f = "PaymentSelectorApiInteractor.kt", i = {0}, l = {30, 32, 36}, m = "request", n = {"$this$request"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f302683q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f302684r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f302685s;

    /* renamed from: t, reason: collision with root package name */
    public int f302686t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f302685s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f302684r = obj;
        this.f302686t |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.a(this.f302685s, null, null, this);
    }
}
