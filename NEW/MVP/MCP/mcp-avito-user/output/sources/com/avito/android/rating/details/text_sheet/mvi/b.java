package com.avito.android.rating.details.text_sheet.mvi;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TextSheetActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating.details.text_sheet.mvi.TextSheetActor", f = "TextSheetActor.kt", i = {0, 1, 1}, l = {58, 68, 70, 72, 74, 85}, m = "sendReviewActionNetworkRequest", n = {"$this$sendReviewActionNetworkRequest", "$this$sendReviewActionNetworkRequest", "result"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f247554q;

    /* renamed from: r, reason: collision with root package name */
    public ReviewActionNetworkRequestResult f247555r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f247556s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f247557t;

    /* renamed from: u, reason: collision with root package name */
    public int f247558u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f247557t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f247556s = obj;
        this.f247558u |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.c(this.f247557t, null, null, this);
    }
}
