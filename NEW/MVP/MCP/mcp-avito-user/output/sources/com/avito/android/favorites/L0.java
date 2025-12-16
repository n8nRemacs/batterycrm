package com.avito.android.favorites;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C30684r0 c30684r0) {
        super(1);
        this.f156300l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        V2.f318762a.a("FavoritesListPresenter", "load next page favorites error", th2);
        C30684r0 c30684r0 = this.f156300l;
        c30684r0.J();
        x1 x1Var = c30684r0.f157454Y;
        if (x1Var != null) {
            x1Var.q("");
        }
        return kotlin.G0.f406611a;
    }
}
