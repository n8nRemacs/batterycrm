package com.avito.android.ticket_view;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TicketMenuIconRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.ticket_view.TicketMenuIconRepository", f = "TicketMenuIconRepository.kt", i = {}, l = {14}, m = "getTicketQuantity", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f301398q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f301399r;

    /* renamed from: s, reason: collision with root package name */
    public int f301400s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f301399r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f301398q = obj;
        this.f301400s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f301399r.a(this);
    }
}
