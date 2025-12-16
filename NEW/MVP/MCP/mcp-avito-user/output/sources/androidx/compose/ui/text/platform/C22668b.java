package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.font.C22617k;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.font.y0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AndroidDefaultTypeface.android.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/b;", "Landroidx/compose/ui/text/platform/o;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.text.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22668b implements o {
    public C22668b() {
        E.f42170b.getClass();
        E.a aVar = E.f42170b;
    }

    @Override // androidx.compose.ui.text.platform.o
    @Y61.k
    public final Typeface a(int i12, int i13, @Y61.k e0 e0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.defaultFromStyle(C22617k.a(e0Var, i12));
        }
        y0 y0Var = y0.f42326a;
        Typeface typeface = Typeface.DEFAULT;
        int i14 = e0Var.f42253b;
        Z.f42217b.getClass();
        boolean zB2 = Z.b(i12, Z.f42218c);
        y0Var.getClass();
        return Typeface.create(typeface, i14, zB2);
    }
}
