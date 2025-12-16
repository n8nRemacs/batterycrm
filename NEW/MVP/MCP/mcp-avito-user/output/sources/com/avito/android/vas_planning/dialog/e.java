package com.avito.android.vas_planning.dialog;

import Y41.p;
import android.widget.TextView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.k;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "firstWheelValue", "secondWheelValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<k<?>, k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f322311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(2);
        this.f322311l = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(k<?> kVar, k<?> kVar2) {
        k<?> kVar3 = kVar;
        k<?> kVar4 = kVar2;
        g gVar = this.f322311l;
        TextView textView = gVar.f322322N;
        if (textView == null) {
            textView = null;
        }
        D6.g(textView);
        if (kVar3 != null && kVar4 != null) {
            T t12 = kVar3.f180046a;
            Integer num = t12 instanceof Integer ? (Integer) t12 : null;
            gVar.f322318J = num != null ? num.intValue() : 0;
            T t13 = kVar4.f180046a;
            Integer num2 = t13 instanceof Integer ? (Integer) t13 : null;
            gVar.f322319K = num2 != null ? num2.intValue() : 0;
            Button button = gVar.f322320L;
            (button != null ? button : null).setEnabled(true);
        }
        return G0.f406611a;
    }
}
