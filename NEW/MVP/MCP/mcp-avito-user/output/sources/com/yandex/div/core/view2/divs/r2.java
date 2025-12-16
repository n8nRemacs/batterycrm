package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class r2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368695l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f368696m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f368697n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.yandex.div.core.view2.divs.widgets.k kVar, l0.h hVar, l0.f fVar) {
        super(0);
        this.f368695l = kVar;
        this.f368696m = hVar;
        this.f368697n = fVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        int[][] iArr = {new int[]{R.attr.state_focused}, new int[0]};
        Integer num = this.f368696m.f406842b;
        l0.f fVar = this.f368697n;
        this.f368695l.setTextColor(new ColorStateList(iArr, new int[]{num == null ? fVar.f406840b : num.intValue(), fVar.f406840b}));
        return kotlin.G0.f406611a;
    }
}
