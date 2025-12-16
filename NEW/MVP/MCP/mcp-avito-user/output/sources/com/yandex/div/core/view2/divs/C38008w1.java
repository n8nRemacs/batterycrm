package com.yandex.div.core.view2.divs;

import com.yandex.div2.C38267b5;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.w1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38008w1 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f368857l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f368858m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C38267b5 f368859n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368860o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38008w1(com.yandex.div.core.view2.divs.widgets.p pVar, ArrayList arrayList, C38267b5 c38267b5, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368857l = pVar;
        this.f368858m = arrayList;
        this.f368859n = c38267b5;
        this.f368860o = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.f368858m.get(iIntValue);
        com.yandex.div.core.view2.divs.widgets.p pVar = this.f368857l;
        pVar.setText(charSequence);
        Y41.l<String, kotlin.G0> valueUpdater = pVar.getValueUpdater();
        if (valueUpdater != null) {
            valueUpdater.invoke(this.f368859n.f374475v.get(iIntValue).f374490b.a(this.f368860o));
        }
        return kotlin.G0.f406611a;
    }
}
