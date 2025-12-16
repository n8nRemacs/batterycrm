package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(D)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class S extends kotlin.jvm.internal.N implements Y41.l<Double, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f368212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div2.H f368213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(View view, com.yandex.div.json.expressions.e eVar, com.yandex.div2.H h12) {
        super(1);
        this.f368212l = view;
        this.f368213m = h12;
        this.f368214n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Double d12) {
        d12.doubleValue();
        C37931a.l(this.f368212l, this.f368214n, this.f368213m);
        return kotlin.G0.f406611a;
    }
}
