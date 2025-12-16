package com.avito.android.mortgage.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CheckAccessUseCaseImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.domain.CheckAccessUseCaseImpl", f = "CheckAccessUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 40, 42}, m = "checkAccess", n = {"this", "applicationId", "applicantId", "flowType", "onCompleted", "onFailed", "onCompleted", "onFailed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f199460q;

    /* renamed from: r, reason: collision with root package name */
    public Object f199461r;

    /* renamed from: s, reason: collision with root package name */
    public String f199462s;

    /* renamed from: t, reason: collision with root package name */
    public String f199463t;

    /* renamed from: u, reason: collision with root package name */
    public p f199464u;

    /* renamed from: v, reason: collision with root package name */
    public p f199465v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f199466w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f199467x;

    /* renamed from: y, reason: collision with root package name */
    public int f199468y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f199467x = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f199466w = obj;
        this.f199468y |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f199467x.a(null, null, null, null, null, null, this);
    }
}
