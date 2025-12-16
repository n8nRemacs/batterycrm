package com.avito.android.html_editor;

import com.avito.android.html_editor.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import hJ.C40836a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OperationTreeDisassembler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "Lcom/avito/android/html_formatter/span/a;", "span", "nodeFrom", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/android/html_editor/k$a;", "invoke", "(ILcom/avito/android/html_formatter/span/a;II)Lcom/avito/android/html_editor/k$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements Y41.r<Integer, com.avito.android.html_formatter.span.a, Integer, Integer, k.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f164150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40836a f164151m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, C40836a c40836a) {
        super(4);
        this.f164150l = nVar;
        this.f164151m = c40836a;
    }

    @Override // Y41.r
    public final k.a invoke(Integer num, com.avito.android.html_formatter.span.a aVar, Integer num2, Integer num3) {
        num.intValue();
        com.avito.android.html_formatter.span.a aVar2 = aVar;
        int iIntValue = num2.intValue();
        int iIntValue2 = num3.intValue();
        C40836a c40836a = this.f164151m;
        int i12 = c40836a.f397151a;
        this.f164150l.getClass();
        int i13 = i12 - iIntValue;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = c40836a.f397152b;
        return new k.a(aVar2.f164255a, new C40836a(i13, iIntValue2 > i14 ? i14 - iIntValue : iIntValue2 - iIntValue));
    }
}
