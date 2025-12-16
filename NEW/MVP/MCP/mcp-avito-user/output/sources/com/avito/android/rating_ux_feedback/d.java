package com.avito.android.rating_ux_feedback;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingUxFeedbackDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_ux_feedback.RatingUxFeedbackDelegateImpl", f = "RatingUxFeedbackDelegate.kt", i = {0}, l = {21}, m = "startUxFeedback", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f250488q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f250489r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f250490s;

    /* renamed from: t, reason: collision with root package name */
    public int f250491t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f250490s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f250489r = obj;
        this.f250491t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f250490s.a(null, this);
    }
}
