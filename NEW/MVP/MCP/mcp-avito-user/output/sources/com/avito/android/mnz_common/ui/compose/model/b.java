package com.avito.android.mnz_common.ui.compose.model;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import com.akita.compose.component.button.t;
import com.akita.compose.theme.re23.style.M;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import wZ.C49578b;

/* compiled from: MnzButtonCompose.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* compiled from: MnzButtonCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/button/t;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/button/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, t> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C49578b f198006l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C49578b c49578b) {
            super(2);
            this.f198006l = c49578b;
        }

        @Override // Y41.p
        public final t invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1304474427);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            M mC2 = com.akita.compose.theme.re23.b.c(a13);
            String str = this.f198006l.f441548c;
            t tVarM = (!L.f(str, "primary") && L.f(str, "secondary")) ? mC2.M() : mC2.f2();
            a13.h();
            return tVarM;
        }
    }

    @k
    public static final com.avito.android.mnz_common.ui.compose.model.a a(@k C49578b c49578b) {
        return new com.avito.android.mnz_common.ui.compose.model.a(c49578b.f441546a, c49578b.f441547b, new a(c49578b), c49578b.f441549d);
    }
}
