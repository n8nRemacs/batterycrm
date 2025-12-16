package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21027n0 {

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.n0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Direction direction = Direction.f31836b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Direction direction2 = Direction.f31836b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ResolvedTextDirection a(androidx.compose.ui.text.o0 o0Var, int i12) {
        if (o0Var.f42526a.f42506a.f42127c.length() != 0) {
            androidx.compose.ui.text.G g12 = o0Var.f42527b;
            int iD2 = g12.d(i12);
            if ((i12 != 0 && iD2 == g12.d(i12 - 1)) || (i12 != o0Var.f42526a.f42506a.f42127c.length() && iD2 == g12.d(i12 + 1))) {
                return o0Var.a(i12);
            }
        }
        return o0Var.j(i12);
    }

    @Y61.k
    public static final Direction b(@Y61.k Direction direction, @Y61.k Direction direction2) {
        int iOrdinal = direction2.ordinal();
        if (iOrdinal == 0) {
            return Direction.f31836b;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Direction.f31838d;
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal2 = direction.ordinal();
        if (iOrdinal2 == 0) {
            return Direction.f31836b;
        }
        if (iOrdinal2 == 1) {
            return Direction.f31837c;
        }
        if (iOrdinal2 == 2) {
            return Direction.f31838d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
