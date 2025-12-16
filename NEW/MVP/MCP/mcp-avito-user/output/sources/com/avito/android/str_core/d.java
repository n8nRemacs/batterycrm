package com.avito.android.str_core;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StrUxFeedbackInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_core.StrUxFeedbackInteractorImpl", f = "StrUxFeedbackInteractor.kt", i = {}, l = {18}, m = "loadProperties", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f288530q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f288531r;

    /* renamed from: s, reason: collision with root package name */
    public int f288532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f288531r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f288530q = obj;
        this.f288532s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f288531r.a(this);
    }
}
