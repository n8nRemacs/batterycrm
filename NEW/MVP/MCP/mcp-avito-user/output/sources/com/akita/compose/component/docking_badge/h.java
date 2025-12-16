package com.akita.compose.component.docking_badge;

import Y41.r;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DockingBadgeScope.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/docking_badge/h;", "Lcom/akita/compose/component/docking_badge/g;", "<init>", "()V", "docking-badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f61539a = new ArrayList();

    /* compiled from: DockingBadgeScope.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/akita/compose/component/docking_badge/m;", "leftEdge", "rightEdge", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/docking_badge/m;Lcom/akita/compose/component/docking_badge/m;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements r<m, m, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f61540l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i f61541m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, i iVar) {
            super(4);
            this.f61540l = str;
            this.f61541m = iVar;
        }

        @Override // Y41.r
        public final G0 invoke(m mVar, m mVar2, A a12, Integer num) {
            int i12;
            m mVar3 = mVar;
            m mVar4 = mVar2;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(mVar3) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i12 |= a13.B(mVar4) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && a13.c()) {
                a13.f();
            } else {
                b.b(this.f61540l, mVar4, this.f61541m, null, mVar3, a13, (i12 & 112) | ((i12 << 12) & 57344), 8);
            }
            return G0.f406611a;
        }
    }

    @Override // com.akita.compose.component.docking_badge.g
    public final void a(@Y61.k i iVar, @Y61.k m mVar, @Y61.l m mVar2, @Y61.k String str) {
        this.f61539a.add(new com.akita.compose.component.docking_badge.a(mVar2, mVar, new C22096n(2137071478, new a(str, iVar), true)));
    }
}
