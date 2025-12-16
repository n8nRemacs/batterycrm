package com.avito.android.service_order_widget.link;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler", f = "SendServiceOrderRequestLinkHandler.kt", i = {}, l = {340}, m = "sendImages", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f278984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f278985r;

    /* renamed from: s, reason: collision with root package name */
    public int f278986s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f278985r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f278984q = obj;
        this.f278986s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.b(this.f278985r, null, null, this);
    }
}
