package com.yandex.div.core.view2.divs;

import android.graphics.ColorFilter;
import com.avito.android.R;
import com.yandex.div2.DivBlendMode;
import kotlin.Metadata;

/* compiled from: DivImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class O0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K0 f368177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368178n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<Integer> f368179o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivBlendMode> f368180p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368176l = iVar;
        this.f368177m = k02;
        this.f368178n = eVar;
        this.f368179o = bVar;
        this.f368180p = bVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.core.view2.divs.widgets.i iVar = this.f368176l;
        boolean zL2 = iVar.l();
        K0 k02 = this.f368177m;
        if (zL2 || kotlin.jvm.internal.L.f(iVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
            com.yandex.div.json.expressions.e eVar = this.f368178n;
            k02.getClass();
            K0.c(iVar, eVar, this.f368179o, this.f368180p);
        } else {
            k02.getClass();
            iVar.setColorFilter((ColorFilter) null);
        }
        return kotlin.G0.f406611a;
    }
}
