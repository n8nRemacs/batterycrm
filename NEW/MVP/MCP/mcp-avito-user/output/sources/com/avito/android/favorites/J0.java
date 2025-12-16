package com.avito.android.favorites;

import com.avito.android.favorites.InterfaceC30665h1;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class J0 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P2.a f156286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C30684r0 c30684r0, P2.a aVar) {
        super(1);
        this.f156285l = c30684r0;
        this.f156286m = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        String str2 = str;
        C30684r0 c30684r0 = this.f156285l;
        x1 x1Var = c30684r0.f157454Y;
        if (x1Var != null) {
            x1Var.q(str2);
        }
        x1 x1Var2 = c30684r0.f157454Y;
        if (x1Var2 != null) {
            InterfaceC30665h1.a.a(x1Var2, com.avito.android.printable_text.b.f(str2), null, this.f156286m.f318719a, 2);
        }
        return kotlin.G0.f406611a;
    }
}
