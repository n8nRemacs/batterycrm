package com.akita.compose.component.input.transformation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.j0;
import androidx.compose.ui.text.input.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneTransformation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/input/transformation/g;", "Landroidx/compose/ui/text/input/k0;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements k0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61798c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f61799d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f61800e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final b f61801f;

    /* compiled from: PhoneTransformation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/input/transformation/g$a", "Landroidx/compose/ui/text/input/L;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements L {
        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            if (i12 <= 3) {
                return i12;
            }
            if (i12 <= 7) {
                return i12 - 1;
            }
            if (i12 <= 10) {
                return i12 - 2;
            }
            if (i12 <= 13) {
                return i12 - 3;
            }
            return 10;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            if (i12 <= 3) {
                return i12;
            }
            if (i12 <= 6) {
                return i12 + 1;
            }
            if (i12 <= 8) {
                return i12 + 2;
            }
            if (i12 <= 10) {
                return i12 + 3;
            }
            return 13;
        }
    }

    /* compiled from: PhoneTransformation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/input/transformation/g$b", "Landroidx/compose/ui/text/input/L;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements L {
        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            if (i12 <= 3) {
                return 0;
            }
            if (i12 <= 6) {
                return i12 - 3;
            }
            if (i12 <= 10) {
                return i12 - 4;
            }
            if (i12 <= 13) {
                return i12 - 5;
            }
            if (i12 <= 16) {
                return i12 - 6;
            }
            return 10;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            if (i12 <= 3) {
                return i12 + 3;
            }
            if (i12 <= 6) {
                return i12 + 4;
            }
            if (i12 <= 8) {
                return i12 + 5;
            }
            if (i12 <= 10) {
                return i12 + 6;
            }
            return 16;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final j0 c(@Y61.k C22602e c22602e) {
        String strA = f.a(c22602e.f42127c, this.f61799d);
        C22602e.b bVar = new C22602e.b(0, 1, null);
        boolean z12 = this.f61798c;
        if (z12) {
            bVar.f("+7 ");
        }
        int length = strA.length();
        for (int i12 = 0; i12 < length; i12++) {
            bVar.c(strA.charAt(i12));
            if ((i12 == 2 || i12 == 5 || i12 == 7) && i12 != strA.length() - 1) {
                bVar.c(' ');
            }
        }
        return new j0(bVar.m(), z12 ? this.f61801f : this.f61800e);
    }

    public g(boolean z12, @Y61.k String str) {
        this.f61798c = z12;
        this.f61799d = str;
        this.f61800e = new a();
        this.f61801f = new b();
    }

    public /* synthetic */ g(boolean z12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? "" : str);
    }
}
