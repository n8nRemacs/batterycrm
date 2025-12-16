package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ss.InterfaceC15218a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmInlineFiltersLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.features.inline_filters.logics.JobCrmInlineFiltersLoader", f = "JobCrmInlineFiltersLoader.kt", i = {0, 0, 1}, l = {12, 13, 14, 15}, m = "loadFilters$_avito_job_crm_candidates_impl", n = {"$this$loadFilters", "interactor", "$this$loadFilters"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f129658q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC15218a f129659r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f129660s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f129661t;

    /* renamed from: u, reason: collision with root package name */
    public int f129662u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129661t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129660s = obj;
        this.f129662u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129661t.a(null, null, this);
    }
}
