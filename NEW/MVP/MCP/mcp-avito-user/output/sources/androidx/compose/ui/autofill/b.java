package androidx.compose.ui.autofill;

import android.graphics.Rect;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidAutofillManager.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "l", "t", "r", "b", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b extends N implements Y41.r<Integer, Integer, Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f38870l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i12) {
        super(4);
        this.f38870l = eVar;
        this.f38871m = i12;
    }

    @Override // Y41.r
    public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        e eVar = this.f38870l;
        y yVar = eVar.f38876a;
        Rect rect = new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        yVar.a(eVar.f38878c, this.f38871m, rect);
        return G0.f406611a;
    }
}
