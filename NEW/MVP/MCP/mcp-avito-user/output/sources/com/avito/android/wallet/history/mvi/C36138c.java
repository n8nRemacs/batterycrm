package com.avito.android.wallet.history.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletHistoryInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.history.mvi.WalletHistoryInteractor", f = "WalletHistoryInteractor.kt", i = {0, 0, 1, 1}, l = {37, 39, 50}, m = "loadInitialV1", n = {"this", "$this$loadInitialV1", "this", "it"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.wallet.history.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36138c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C36137b f327572q;

    /* renamed from: r, reason: collision with root package name */
    public Object f327573r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f327574s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36137b f327575t;

    /* renamed from: u, reason: collision with root package name */
    public int f327576u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36138c(C36137b c36137b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327575t = c36137b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f327574s = obj;
        this.f327576u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C36137b.a(this.f327575t, null, this);
    }
}
