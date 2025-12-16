package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JsxCvInfoActualizationLoadInfoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.job.cv_info_actualization.mvi.domain.JsxCvInfoActualizationLoadInfoInteractor", f = "JsxCvInfoActualizationLoadInfoInteractor.kt", i = {}, l = {18}, m = "getCvActualizationInfo", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.job.cv_info_actualization.data.mapper.a f174144q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f174146s;

    /* renamed from: t, reason: collision with root package name */
    public int f174147t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f174146s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f174145r = obj;
        this.f174147t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f174146s.a(this);
    }
}
