package com.avito.android.comfortable_deal.deal.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor", f = "DealActor.kt", i = {0, 0, 0, 0, 1}, l = {290, 291, 292, 293}, m = "updateComments", n = {"this", "$this$updateComments", "dealId", "filter", "$this$updateComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes12.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f121716q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f121717r;

    /* renamed from: s, reason: collision with root package name */
    public String f121718s;

    /* renamed from: t, reason: collision with root package name */
    public CommentsFilter f121719t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f121720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C29453a f121721v;

    /* renamed from: w, reason: collision with root package name */
    public int f121722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C29453a c29453a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f121721v = c29453a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f121720u = obj;
        this.f121722w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C29453a.c(this.f121721v, null, null, null, this);
    }
}
