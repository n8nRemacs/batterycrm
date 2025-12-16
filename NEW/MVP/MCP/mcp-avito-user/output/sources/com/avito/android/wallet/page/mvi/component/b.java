package com.avito.android.wallet.page.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPageActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.page.mvi.component.WalletPageActor", f = "WalletPageActor.kt", i = {0, 0, 1, 1, 1, 2}, l = {161, 164, 166, 171}, m = "loadContent", n = {"this", "$this$loadContent", "this", "$this$loadContent", "response", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328117q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f328118r;

    /* renamed from: s, reason: collision with root package name */
    public PO0.b f328119s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f328120t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f328121u;

    /* renamed from: v, reason: collision with root package name */
    public int f328122v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328121u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328120t = obj;
        this.f328122v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f328121u, null, this);
    }
}
