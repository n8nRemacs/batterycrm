package com.avito.android.rating.details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor", f = "RatingDetailsActor.kt", i = {1}, l = {562, 566, 567, 585}, m = "handleRatingDetailsItemClicked", n = {"$this$handleRatingDetailsItemClicked"}, s = {"L$0"})
/* renamed from: com.avito.android.rating.details.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34186i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f247456q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247457r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247458s;

    /* renamed from: t, reason: collision with root package name */
    public int f247459t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34186i(C34175a c34175a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247458s = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247457r = obj;
        this.f247459t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34175a.h(this.f247458s, null, null, this);
    }
}
