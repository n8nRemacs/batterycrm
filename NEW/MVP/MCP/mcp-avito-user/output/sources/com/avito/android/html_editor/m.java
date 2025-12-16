package com.avito.android.html_editor;

import com.avito.android.html_editor.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OperationTreeDisassembler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "Lcom/avito/android/html_formatter/span/a;", "span", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/android/html_editor/k$a;", "invoke", "(ILcom/avito/android/html_formatter/span/a;II)Lcom/avito/android/html_editor/k$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.r<Integer, com.avito.android.html_formatter.span.a, Integer, Integer, k.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f164152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hJ.d f164153m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, hJ.d dVar) {
        super(4);
        this.f164152l = nVar;
        this.f164153m = dVar;
    }

    @Override // Y41.r
    public final k.a invoke(Integer num, com.avito.android.html_formatter.span.a aVar, Integer num2, Integer num3) {
        num.intValue();
        com.avito.android.html_formatter.span.a aVar2 = aVar;
        int iIntValue = num2.intValue();
        int iIntValue2 = num3.intValue();
        hJ.d dVar = this.f164153m;
        this.f164152l.getClass();
        int i12 = dVar.f397153a - iIntValue;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = dVar.f397154b;
        return new k.a(aVar2.f164255a, new hJ.d(i12, iIntValue2 > i13 ? i13 - iIntValue : iIntValue2 - iIntValue, dVar.f397155c));
    }
}
