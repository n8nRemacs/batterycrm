package com.yandex.div.core.view2.divs;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.h1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37961h1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<Long> f368462m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368463n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37961h1(com.yandex.div.core.view2.divs.widgets.j jVar, com.yandex.div.json.expressions.b<Long> bVar, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368461l = jVar;
        this.f368462m = bVar;
        this.f368463n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        int i12;
        long jLongValue = this.f368462m.a(this.f368463n).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            i12 = (int) jLongValue;
        } else {
            int i13 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        this.f368461l.setMaxLines(i12);
        return kotlin.G0.f406611a;
    }
}
