package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38567u1;
import com.yandex.div2.DivInput;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "color", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f368237l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368238m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DivInput f368239n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C38029k f368240o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368241p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Drawable f368242q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(T0 t02, com.yandex.div.core.view2.divs.widgets.j jVar, DivInput divInput, C38029k c38029k, com.yandex.div.json.expressions.e eVar, Drawable drawable) {
        super(1);
        this.f368237l = t02;
        this.f368238m = jVar;
        this.f368239n = divInput;
        this.f368240o = c38029k;
        this.f368241p = eVar;
        this.f368242q = drawable;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        T0 t02 = this.f368237l;
        t02.getClass();
        Drawable drawable = this.f368242q;
        drawable.setTint(iIntValue);
        C38006w c38006w = t02.f368227a;
        c38006w.getClass();
        DivInput divInput = this.f368239n;
        List<com.yandex.div2.F> listE = divInput.e();
        C38567u1 f374463j = divInput.getF374830q();
        List<com.yandex.div2.F> list = f374463j == null ? null : f374463j.f376625a;
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368238m;
        F21.b bVarA = com.yandex.div.core.util.e.a(jVar);
        C38029k c38029k = this.f368240o;
        com.yandex.div.json.expressions.e eVar = this.f368241p;
        c38006w.g(jVar, c38029k, listE, list, eVar, bVarA, drawable);
        C37931a.k(jVar, divInput.getF374836w(), eVar);
        return kotlin.G0.f406611a;
    }
}
