package com.akita.compose.component.input.transformation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.input.j0;
import androidx.compose.ui.text.input.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrefixPostfixTransformation.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/input/transformation/h;", "Landroidx/compose/ui/text/input/k0;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements k0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f61802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f61803d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k0 f61804e;

    /* compiled from: PrefixPostfixTransformation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/input/transformation/h$a", "Landroidx/compose/ui/text/input/L;", "input_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f61805b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f61806c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C22602e f61807d;

        public a(j0 j0Var, int i12, C22602e c22602e) {
            this.f61805b = j0Var;
            this.f61806c = i12;
            this.f61807d = c22602e;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            j0 j0Var = this.f61805b;
            L l12 = j0Var.f42450b;
            int i13 = this.f61806c;
            int iA2 = l12.a(i12 - i13);
            if (i12 < i13) {
                return 0;
            }
            return i12 >= j0Var.f42449a.f42127c.length() + i13 ? this.f61807d.f42127c.length() : iA2;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            return this.f61805b.f42450b.b(i12) + this.f61806c;
        }
    }

    public h(@Y61.k String str, @Y61.k String str2, @Y61.k k0 k0Var) {
        this.f61802c = str;
        this.f61803d = str2;
        this.f61804e = k0Var;
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final j0 c(@Y61.k C22602e c22602e) {
        String string;
        int length;
        j0 j0VarC = this.f61804e.c(c22602e);
        C22602e c22602e2 = j0VarC.f42449a;
        if (c22602e2.f42127c.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f61802c;
            sb2.append(str);
            sb2.append((CharSequence) c22602e2);
            sb2.append(this.f61803d);
            string = sb2.toString();
            length = str.length();
        } else {
            string = "";
            length = 0;
        }
        return new j0(new C22602e(string, null, 2, null), new a(j0VarC, length, c22602e));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, String str2, k0 k0Var, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            k0.f42451b.getClass();
            k0Var = k0.a.f42453b;
        }
        this(str, str2, k0Var);
    }
}
