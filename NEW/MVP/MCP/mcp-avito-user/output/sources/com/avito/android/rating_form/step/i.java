package com.avito.android.rating_form.step;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormFileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor", f = "RatingFormFileInteractor.kt", i = {0, 0}, l = {122}, m = "retryUploadFile", n = {"this", "file"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f249508q;

    /* renamed from: r, reason: collision with root package name */
    public e f249509r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f249510s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f249511t;

    /* renamed from: u, reason: collision with root package name */
    public int f249512u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249511t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f249510s = obj;
        this.f249512u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f249511t.d(null, null, this);
    }
}
