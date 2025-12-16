package com.avito.android.vacancy_call_action.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VacancyCallActionInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.vacancy_call_action.domain.VacancyCallActionInteractor", f = "VacancyCallActionInteractor.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f319218q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f319219r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f319220s;

    /* renamed from: t, reason: collision with root package name */
    public int f319221t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f319220s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f319219r = obj;
        this.f319221t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f319220s.a(0L, null, null, null, this);
    }
}
