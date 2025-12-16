package com.yandex.div.core.view2.divs;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div2.DivInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class V0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T0 f368249l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DivInput f368251n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368252o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(T0 t02, com.yandex.div.core.view2.divs.widgets.j jVar, com.yandex.div.json.expressions.e eVar, DivInput divInput) {
        super(1);
        this.f368249l = t02;
        this.f368250m = jVar;
        this.f368251n = divInput;
        this.f368252o = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        int i12;
        this.f368249l.getClass();
        DivInput divInput = this.f368251n;
        com.yandex.div.json.expressions.b<Long> bVar = divInput.f371723l;
        com.yandex.div.json.expressions.e eVar = this.f368252o;
        long jLongValue = bVar.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            i12 = (int) jLongValue;
        } else {
            int i13 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        int iOrdinal = divInput.f371724m.a(eVar).ordinal();
        int i14 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i14 = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = 0;
            }
        }
        float f12 = i12;
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368250m;
        jVar.setTextSize(i14, f12);
        jVar.setLetterSpacing(((float) divInput.f371732u.a(eVar).doubleValue()) / f12);
        return kotlin.G0.f406611a;
    }
}
