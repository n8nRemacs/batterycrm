package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import java.util.Map;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: MeasureScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/x;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC22373m0
/* renamed from: androidx.compose.ui.layout.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22369k0 extends InterfaceC22393x {

    /* compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.k0$a */
    public static final class a {
    }

    @Y61.k
    default InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            C47949a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C22371l0(i12, i13, map, this, lVar);
    }

    @Y61.k
    default InterfaceC22367j0 L0(int i12, int i13, @Y61.k Map<AbstractC22348a, Integer> map, @Y61.k Y41.l<? super K0.a, kotlin.G0> lVar) {
        return A1(i12, i13, map, lVar);
    }
}
