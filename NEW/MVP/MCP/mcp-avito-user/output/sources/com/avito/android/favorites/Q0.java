package com.avito.android.favorites;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class Q0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryChipable f156326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156327m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f156328n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(CategoryChipable categoryChipable, C30684r0 c30684r0, String str) {
        super(0);
        this.f156326l = categoryChipable;
        this.f156327m = c30684r0;
        this.f156328n = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        DeepLink onShow = this.f156326l.f156205g.getOnShow();
        C30684r0 c30684r0 = this.f156327m;
        if (onShow != null) {
            b.a.a(c30684r0.f157489r, onShow, null, null, 6);
        }
        c30684r0.f157445P.a(this.f156328n);
        return kotlin.G0.f406611a;
    }
}
