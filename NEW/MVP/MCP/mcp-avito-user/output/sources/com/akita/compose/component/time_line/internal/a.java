package com.akita.compose.component.time_line.internal;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.time_line.f;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.ui.e;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimeLineScopeImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/time_line/internal/a;", "Lcom/akita/compose/component/time_line/f;", "<init>", "()V", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f63146a = new ArrayList();

    /* compiled from: TimeLineScopeImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/foundation/p;", "nodeColor", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/foundation/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.time_line.internal.a$a, reason: collision with other inner class name */
    public static final class C2102a extends N implements q<p, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f63147l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2102a(int i12) {
            super(3);
            this.f63147l = i12;
        }

        @Override // Y41.q
        public final G0 invoke(p pVar, A a12, Integer num) {
            p pVar2 = pVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(pVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                e.a(u0.e.a(this.f63147l, 0, a13), null, null, pVar2, a13, ((iIntValue << 9) & 7168) | 56, 4);
            }
            return G0.f406611a;
        }
    }

    @Override // com.akita.compose.component.time_line.f
    @InterfaceC22137p
    public final void a(@k String str, @l C22096n c22096n) {
        this.f63146a.add(new C22096n(-878221513, new b(str, c22096n), true));
    }

    @Override // com.akita.compose.component.time_line.f
    public final void b(int i12, @k String str) {
        a(str, new C22096n(246910775, new C2102a(i12), true));
    }
}
