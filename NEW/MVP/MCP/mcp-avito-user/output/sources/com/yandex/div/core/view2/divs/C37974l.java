package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37974l extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f368544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f368545m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37974l(View.OnClickListener onClickListener, View view) {
        super(0);
        this.f368544l = onClickListener;
        this.f368545m = view;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f368544l.onClick(this.f368545m);
        return kotlin.G0.f406611a;
    }
}
