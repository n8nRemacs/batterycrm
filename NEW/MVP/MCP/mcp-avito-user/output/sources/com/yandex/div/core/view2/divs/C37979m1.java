package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivInput;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.m1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37979m1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DivInput f368565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368566n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37979m1(com.yandex.div.core.view2.divs.widgets.j jVar, DivInput divInput, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368564l = jVar;
        this.f368565m = divInput;
        this.f368566n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        this.f368564l.setTextColor(this.f368565m.f371699E.a(this.f368566n).intValue());
        return kotlin.G0.f406611a;
    }
}
