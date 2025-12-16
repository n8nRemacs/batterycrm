package com.akita.compose.component.input.transformation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.j0;
import androidx.compose.ui.text.input.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportTransformation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/input/transformation/d;", "Landroidx/compose/ui/text/input/k0;", "<init>", "()V", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements k0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f61796c = new a();

    /* compiled from: PassportTransformation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/input/transformation/d$a", "Landroidx/compose/ui/text/input/L;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements L {
        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            if (i12 <= 2) {
                return i12;
            }
            if (i12 <= 5) {
                return i12 - 1;
            }
            if (i12 <= 12) {
                return i12 - 2;
            }
            return 10;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            if (i12 <= 2) {
                return i12;
            }
            if (i12 <= 4) {
                return i12 + 1;
            }
            if (i12 <= 10) {
                return i12 + 2;
            }
            return 12;
        }
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final j0 c(@Y61.k C22602e c22602e) {
        String strA = c.a(c22602e.f42127c);
        C22602e.b bVar = new C22602e.b(0, 1, null);
        int length = strA.length();
        for (int i12 = 0; i12 < length; i12++) {
            bVar.c(strA.charAt(i12));
            if ((i12 == 1 || i12 == 3) && i12 != strA.length() - 1) {
                bVar.c(' ');
            }
        }
        return new j0(bVar.m(), this.f61796c);
    }
}
