package com.avito.android.confirm_documents_bottom_sheet.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConfirmDocumentsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.confirm_documents_bottom_sheet.domain.ConfirmDocumentsInteractorImpl", f = "ConfirmDocumentsInteractor.kt", i = {0, 0, 0, 0, 0, 0, 2, 2, 2, 2}, l = {44, 46, 55, 82}, m = "loadScreenInfo", n = {"this", MessageBody.SystemMessageBody.Platform.FLOW, "shiftId", "itemId", "fromPage", "screenName", "this", MessageBody.SystemMessageBody.Platform.FLOW, "itemId", "fromPage"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f125558q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f125559r;

    /* renamed from: s, reason: collision with root package name */
    public String f125560s;

    /* renamed from: t, reason: collision with root package name */
    public String f125561t;

    /* renamed from: u, reason: collision with root package name */
    public String f125562u;

    /* renamed from: v, reason: collision with root package name */
    public String f125563v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f125564w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f125565x;

    /* renamed from: y, reason: collision with root package name */
    public int f125566y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f125565x = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f125564w = obj;
        this.f125566y |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f125565x.a(null, null, null, null, null, this);
    }
}
