package com.akita.compose.component.input.transformation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.j0;
import androidx.compose.ui.text.input.k0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RoublesTransformation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/akita/compose/component/input/transformation/j;", "Landroidx/compose/ui/text/input/k0;", "<init>", "()V", "a", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements k0 {

    /* compiled from: RoublesTransformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/input/transformation/j$a;", "Landroidx/compose/ui/text/input/L;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements L {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f61812b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f61813c;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f61812b = str;
            this.f61813c = str2;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            String str = this.f61813c;
            if (i12 > str.length()) {
                return this.f61812b.length();
            }
            if (i12 == 0) {
                return 0;
            }
            return C43066x.a0(str.substring(0, i12), " ", "", false).length();
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            String str = this.f61812b;
            if (i12 > str.length()) {
                return this.f61813c.length();
            }
            if (i12 == 0) {
                return 0;
            }
            int length = str.length() % 3;
            int i13 = (1 > length || length >= i12) ? 0 : 1;
            int i14 = (i12 - length) - 1;
            return i12 + i13 + ((i14 >= 0 ? i14 : 0) / 3);
        }
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final j0 c(@Y61.k C22602e c22602e) {
        String str = c22602e.f42127c;
        if (str.length() == 0) {
            C22602e c22602e2 = new C22602e(str, null, 2, null);
            L.f42358a.getClass();
            return new j0(c22602e2, L.a.f42360b);
        }
        String string = new StringBuilder((CharSequence) C42745f0.O(C43066x.o(3, new StringBuilder((CharSequence) str).reverse().toString()), " ", null, null, null, 62)).reverse().toString();
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f(string);
        if (string.length() > 0) {
            bVar.f(" ₽");
        }
        return new j0(bVar.m(), new a(str, string));
    }
}
