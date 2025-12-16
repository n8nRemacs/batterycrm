package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import kotlin.Metadata;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f368007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f368008m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368009n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.b<DivAlignmentVertical> f368010o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(View view, com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, com.yandex.div.json.expressions.e eVar, com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2) {
        super(1);
        this.f368007l = view;
        this.f368008m = bVar;
        this.f368009n = eVar;
        this.f368010o = bVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.yandex.div.json.expressions.e eVar = this.f368009n;
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = this.f368008m;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar == null ? null : bVar.a(eVar);
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2 = this.f368010o;
        C37931a.a(this.f368007l, divAlignmentHorizontalA, bVar2 != null ? bVar2.a(eVar) : null);
        return kotlin.G0.f406611a;
    }
}
