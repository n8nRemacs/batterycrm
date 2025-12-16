package com.avito.android.mortgage.consultation.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MortgageConsultationRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.consultation.data.MortgageConsultationRepositoryImpl", f = "MortgageConsultationRepository.kt", i = {0}, l = {34}, m = "getMortgageConsultationTimeSlots", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f198539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f198540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f198541s;

    /* renamed from: t, reason: collision with root package name */
    public int f198542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f198541s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f198540r = obj;
        this.f198542t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f198541s.b(this);
    }
}
