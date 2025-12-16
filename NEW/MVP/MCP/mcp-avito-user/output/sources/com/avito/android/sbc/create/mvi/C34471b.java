package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 0, 0, 0, 0}, l = {2675}, m = "autoDispatchBudgetChanged", n = {"this", "$this$autoDispatchBudgetChanged", VoiceInfo.STATE, "budgetValueNumeric", "budgetMessage", "invalidEnteredBudget"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
/* renamed from: com.avito.android.sbc.create.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34471b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C34469a f259564q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259565r;

    /* renamed from: s, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259566s;

    /* renamed from: t, reason: collision with root package name */
    public Long f259567t;

    /* renamed from: u, reason: collision with root package name */
    public String f259568u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f259569v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259570w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C34469a f259571x;

    /* renamed from: y, reason: collision with root package name */
    public int f259572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34471b(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259571x = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259570w = obj;
        this.f259572y |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34469a.c(this.f259571x, null, null, this);
    }
}
