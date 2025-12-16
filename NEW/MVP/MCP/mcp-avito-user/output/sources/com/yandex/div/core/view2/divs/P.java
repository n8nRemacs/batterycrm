package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f368185l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.S f368186m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(View view, com.yandex.div.core.view2.S s5) {
        super(1);
        this.f368185l = view;
        this.f368186m = s5;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        this.f368185l.setNextFocusLeftId(this.f368186m.a(str));
        return kotlin.G0.f406611a;
    }
}
