package com.avito.android.account;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.account.AccountInteractorImpl", f = "AccountInteractorImpl.kt", i = {0, 1}, l = {123, WebSocketProtocol.PAYLOAD_SHORT}, m = "logoutOnForbidden", n = {"this", "e"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.account.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27677o<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f68165q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68166r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C27672j f68167s;

    /* renamed from: t, reason: collision with root package name */
    public int f68168t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27677o(C27672j c27672j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f68167s = c27672j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f68166r = obj;
        this.f68168t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f68167s.h(null, this);
    }
}
