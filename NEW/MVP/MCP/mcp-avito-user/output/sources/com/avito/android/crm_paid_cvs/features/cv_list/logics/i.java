package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import dt.InterfaceC39801a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvListLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_paid_cvs.features.cv_list.logics.CvListLoader", f = "CvListLoader.kt", i = {0, 0, 0, 0, 0, 1}, l = {71, 72, 80, 84, 88}, m = "changeStatus$_avito_job_crm_paid_cvs_impl", n = {"$this$changeStatus", "interactor", "itemId", "status", "noteText", "$this$changeStatus"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
/* loaded from: classes12.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f130575q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC39801a f130576r;

    /* renamed from: s, reason: collision with root package name */
    public String f130577s;

    /* renamed from: t, reason: collision with root package name */
    public CvStatus f130578t;

    /* renamed from: u, reason: collision with root package name */
    public String f130579u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f130580v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f130581w;

    /* renamed from: x, reason: collision with root package name */
    public int f130582x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f130581w = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f130580v = obj;
        this.f130582x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f130581w.a(null, null, null, null, null, this);
    }
}
