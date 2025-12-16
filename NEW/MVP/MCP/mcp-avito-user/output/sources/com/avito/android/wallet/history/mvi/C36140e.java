package com.avito.android.wallet.history.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletHistoryInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.history.mvi.WalletHistoryInteractor", f = "WalletHistoryInteractor.kt", i = {0, 0, 0}, l = {86, 88, 98}, m = "loadNextV1", n = {"this", "$this$loadNextV1", "key"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.wallet.history.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36140e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C36137b f327640q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f327641r;

    /* renamed from: s, reason: collision with root package name */
    public String f327642s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f327643t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36137b f327644u;

    /* renamed from: v, reason: collision with root package name */
    public int f327645v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36140e(C36137b c36137b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327644u = c36137b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f327643t = obj;
        this.f327645v |= BeduinInputModel.MIN_TEXT_VERSION;
        return C36137b.c(this.f327644u, null, null, this);
    }
}
