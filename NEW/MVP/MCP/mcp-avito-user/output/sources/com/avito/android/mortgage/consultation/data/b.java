package com.avito.android.mortgage.consultation.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MortgageConsultationRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.consultation.data.MortgageConsultationRepositoryImpl", f = "MortgageConsultationRepository.kt", i = {}, l = {65}, m = "assignMortgageConsultationTimeSlot", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f198536q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f198537r;

    /* renamed from: s, reason: collision with root package name */
    public int f198538s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f198537r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f198536q = obj;
        this.f198538s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f198537r.a(null, null, null, null, null, null, this);
    }
}
