package com.yandex.div.core.view2.divs;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div2.C38267b5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.y1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38019y1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C38267b5 f369045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f369046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f369047n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38019y1(C38267b5 c38267b5, com.yandex.div.json.expressions.e eVar, com.yandex.div.core.view2.divs.widgets.p pVar) {
        super(1);
        this.f369045l = c38267b5;
        this.f369046m = eVar;
        this.f369047n = pVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        int i12;
        C38267b5 c38267b5 = this.f369045l;
        com.yandex.div.json.expressions.b<Long> bVar = c38267b5.f374465l;
        com.yandex.div.json.expressions.e eVar = this.f369046m;
        long jLongValue = bVar.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            i12 = (int) jLongValue;
        } else {
            int i13 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        int iOrdinal = c38267b5.f374466m.a(eVar).ordinal();
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
        com.yandex.div.core.view2.divs.widgets.p pVar = this.f369047n;
        pVar.setTextSize(i14, f12);
        pVar.setLetterSpacing(((float) c38267b5.f374472s.a(eVar).doubleValue()) / f12);
        return kotlin.G0.f406611a;
    }
}
