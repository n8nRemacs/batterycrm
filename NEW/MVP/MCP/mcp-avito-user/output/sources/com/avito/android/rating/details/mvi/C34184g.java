package com.avito.android.rating.details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor", f = "RatingDetailsActor.kt", i = {0}, l = {545, 546, 550, 554}, m = "handleDeleteReviewFailure", n = {"$this$handleDeleteReviewFailure"}, s = {"L$0"})
/* renamed from: com.avito.android.rating.details.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34184g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f247447q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247448r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247449s;

    /* renamed from: t, reason: collision with root package name */
    public int f247450t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34184g(C34175a c34175a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247449s = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247448r = obj;
        this.f247450t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34175a.f(this.f247449s, null, null, this);
    }
}
