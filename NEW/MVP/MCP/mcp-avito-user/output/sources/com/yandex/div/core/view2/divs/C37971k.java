package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37971k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C37955g f368526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C38029k f368527m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f368528n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<DivAction> f368529o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37971k(C37955g c37955g, C38029k c38029k, View view, List<? extends DivAction> list) {
        super(0);
        this.f368526l = c37955g;
        this.f368527m = c38029k;
        this.f368528n = view;
        this.f368529o = list;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C37955g c37955g = this.f368526l;
        List<DivAction> list = this.f368529o;
        C38029k c38029k = this.f368527m;
        c38029k.m(new C37977m(list, "double_click", c37955g, c38029k, this.f368528n));
        return kotlin.G0.f406611a;
    }
}
