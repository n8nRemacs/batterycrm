package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20864f0 {

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "innerTextField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f30707l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar, androidx.compose.runtime.A a12, Integer num) {
            Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar2 = pVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= a13.u(pVar2) ? 4 : 2;
            }
            if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
                pVar2.invoke(a13, Integer.valueOf(iIntValue & 14));
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new C20864f0();
        new C22096n(-813639903, a.f30707l, false);
    }
}
