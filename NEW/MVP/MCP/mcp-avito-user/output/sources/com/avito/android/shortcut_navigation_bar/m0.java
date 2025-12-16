package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/m0;", "", "<init>", "()V", "a", "b", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m0 f283432a = new m0();

    /* compiled from: ShortcutUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/m0$b;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f283438a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f283439b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f283440c;

        public b(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
            this.f283438a = str;
            this.f283439b = str2;
            this.f283440c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f283438a, bVar.f283438a) && kotlin.jvm.internal.L.f(this.f283439b, bVar.f283439b) && kotlin.jvm.internal.L.f(this.f283440c, bVar.f283440c);
        }

        public final int hashCode() {
            String str = this.f283438a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f283439b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f283440c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Onboarding(title=");
            sb2.append(this.f283438a);
            sb2.append(", subtitle=");
            sb2.append(this.f283439b);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f283440c, ')');
        }
    }

    /* compiled from: ShortcutUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<G0> {
        static {
            new c();
        }

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: ShortcutUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283441l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f283441l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f283441l.invoke();
            return G0.f406611a;
        }
    }

    public static void a(m0 m0Var, View view, b bVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, float f12, r.d dVar, f.a aVar4, int i12) {
        boolean z12 = (i12 & 64) != 0;
        boolean z13 = (i12 & 128) != 0;
        com.avito.android.lib.design.tooltip.q aVar5 = (i12 & 256) != 0 ? new r.a(null, 1, null) : dVar;
        f.a aVar6 = (i12 & 512) != 0 ? new f.a(0, 1, null) : aVar4;
        m0Var.getClass();
        com.avito.android.paranja.h hVar = new com.avito.android.paranja.h(view);
        q0 q0Var = new q0(hVar, aVar2);
        hVar.setStyle(new com.avito.android.paranja.f(aVar6, hVar.getContext().getColor(R.color.overlayBackground), f12, null, 8, null));
        hVar.setState(new ParanjaState(ParanjaState.State.f210855b, new p0(aVar3, q0Var, view), new com.avito.android.paranja.g(aVar5, z13, bVar.f283438a, bVar.f283439b, bVar.f283440c, null, null, null, z12, 224, null)));
        aVar.invoke();
    }

    public static void c(m0 m0Var, View view, EntryPoint.Onboarding onboarding, Y41.a aVar, Y41.a aVar2) {
        m0Var.getClass();
        b bVar = new b(onboarding.getTitle(), onboarding.getText(), onboarding.getButtonTitle());
        int iB2 = y6.b(8);
        a(m0Var, view, bVar, aVar2, w0.f283584l, aVar, y6.b(18), null, new f.a(iB2, iB2, iB2, iB2), 448);
    }

    public final void b(@Y61.k View view, @Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, boolean z12) {
        a(this, view, new b(onboarding.getTitle(), onboarding.getText(), onboarding.getButtonTitle()), aVar2, aVar3, new d(aVar), y6.b(10), null, z12 ? new f.a(y6.b(11), y6.b(11), y6.b(8), 0, 8, null) : new f.a(0, 1, null), 320);
    }

    /* compiled from: ShortcutUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/m0$a;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f283433a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f283434b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f283435c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f283436d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f283437e;

        public a(int i12, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4) {
            this.f283433a = i12;
            this.f283434b = num;
            this.f283435c = num2;
            this.f283436d = num3;
            this.f283437e = num4;
        }

        public /* synthetic */ a(int i12, Integer num, Integer num2, Integer num3, Integer num4, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3, (i13 & 16) != 0 ? null : num4);
        }
    }
}
