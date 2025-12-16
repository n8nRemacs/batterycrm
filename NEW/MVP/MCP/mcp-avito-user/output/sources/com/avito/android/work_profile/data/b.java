package com.avito.android.work_profile.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WorkProfileRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.work_profile.data.WorkProfileRepositoryImpl", f = "WorkProfileRepositoryImpl.kt", i = {}, l = {22}, m = "getCvs", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.work_profile.domain.mapper.c f330606q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f330607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f330608s;

    /* renamed from: t, reason: collision with root package name */
    public int f330609t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f330608s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f330607r = obj;
        this.f330609t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f330608s.c(this);
    }
}
