package com.avito.android.work_profile.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WorkProfileRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.work_profile.data.WorkProfileRepositoryImpl", f = "WorkProfileRepositoryImpl.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "getAppliesToVacancy", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.work_profile.domain.mapper.a f330602q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f330603r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f330604s;

    /* renamed from: t, reason: collision with root package name */
    public int f330605t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f330604s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f330603r = obj;
        this.f330605t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f330604s.a(this);
    }
}
