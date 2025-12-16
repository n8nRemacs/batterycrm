package com.avito.android.crm_candidates.features.full_filters.logics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FiltersActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.features.full_filters.logics.FiltersActor", f = "FiltersActor.kt", i = {0, 0, 1, 1, 2, 2}, l = {93, 106, 107, 108}, m = "updateFilters", n = {"this", "$this$updateFilters", "this", "$this$updateFilters", "$this$updateFilters", "newFilters"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f129594q;

    /* renamed from: r, reason: collision with root package name */
    public Object f129595r;

    /* renamed from: s, reason: collision with root package name */
    public kP.o f129596s;

    /* renamed from: t, reason: collision with root package name */
    public com.avito.android.crm_candidates.domain.o f129597t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f129598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f129599v;

    /* renamed from: w, reason: collision with root package name */
    public int f129600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129599v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129598u = obj;
        this.f129600w |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f129599v, null, null, this);
    }
}
