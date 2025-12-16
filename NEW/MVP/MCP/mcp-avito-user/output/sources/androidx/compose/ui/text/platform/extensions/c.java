package androidx.compose.ui.text.platform.extensions;

import Y41.q;
import Y41.r;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import x0.o;

/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/e0;", "spanStyle", "", "start", "end", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/e0;II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class c extends N implements q<e0, Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Spannable f42552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r<E, androidx.compose.ui.text.font.e0, Z, C22605a0, Typeface> f42553m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Spannable spannable, r<? super E, ? super androidx.compose.ui.text.font.e0, ? super Z, ? super C22605a0, ? extends Typeface> rVar) {
        super(3);
        this.f42552l = spannable;
        this.f42553m = rVar;
    }

    @Override // Y41.q
    public final G0 invoke(e0 e0Var, Integer num, Integer num2) {
        int i12;
        int i13;
        e0 e0Var2 = e0Var;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        E e12 = e0Var2.fontFamily;
        androidx.compose.ui.text.font.e0 e0Var3 = e0Var2.fontWeight;
        if (e0Var3 == null) {
            androidx.compose.ui.text.font.e0.f42240c.getClass();
            e0Var3 = androidx.compose.ui.text.font.e0.f42247j;
        }
        Z z12 = e0Var2.fontStyle;
        if (z12 != null) {
            i12 = z12.f42219a;
        } else {
            Z.f42217b.getClass();
            i12 = 0;
        }
        Z zA2 = Z.a(i12);
        C22605a0 c22605a0 = e0Var2.fontSynthesis;
        if (c22605a0 != null) {
            i13 = c22605a0.f42227a;
        } else {
            C22605a0.f42223b.getClass();
            i13 = C22605a0.f42226e;
        }
        this.f42552l.setSpan(new o(this.f42553m.invoke(e12, e0Var3, zA2, C22605a0.a(i13))), iIntValue, iIntValue2, 33);
        return G0.f406611a;
    }
}
