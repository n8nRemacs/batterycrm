package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import com.avito.android.R;
import xyz.n.a.ub;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.j5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13647j5 {

    /* renamed from: Fc1.j5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ub f5601l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5602m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f5603n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5604o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, ub ubVar, Y41.a aVar, Y41.a aVar2) {
            super(3);
            this.f5601l = ubVar;
            this.f5602m = aVar;
            this.f5603n = i12;
            this.f5604o = aVar2;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            int i12;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                ub ubVar = this.f5601l;
                int iOrdinal = ubVar.ordinal();
                if (iOrdinal == 0) {
                    a13.I(652887792);
                    C13601e4.a(u0.i.c(a13, R.string.feedback_screenshots_delete_title), a13, 0);
                    i12 = R.string.feedback_screenshots_delete_message;
                } else if (iOrdinal == 1) {
                    a13.I(652888075);
                    C13601e4.a(u0.i.c(a13, R.string.feedback_screenshots_delete_title), a13, 0);
                    i12 = R.string.feedback_screenshots_delete_from_gallery_message;
                } else if (iOrdinal != 2) {
                    a13.I(652888660);
                    a13.O();
                    Y41.a<kotlin.G0> aVar = this.f5604o;
                    C13770x3.a(androidx.compose.runtime.internal.r.b(a13, -1134005105, new T4(this.f5603n, ubVar, this.f5602m, aVar)), a13, 6);
                } else {
                    a13.I(652888373);
                    C13601e4.a(u0.i.c(a13, R.string.feedback_screenshots_max_screenshot_number_title), a13, 0);
                    i12 = R.string.feedback_screenshots_max_screenshot_number_message;
                }
                P3.a(u0.i.c(a13, i12), a13, 0);
                a13.O();
                Y41.a<kotlin.G0> aVar2 = this.f5604o;
                C13770x3.a(androidx.compose.runtime.internal.r.b(a13, -1134005105, new T4(this.f5603n, ubVar, this.f5602m, aVar2)), a13, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.j5$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ub f5605l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5606m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f5607n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, ub ubVar, Y41.a aVar, Y41.a aVar2) {
            super(2);
            this.f5605l = ubVar;
            this.f5606m = aVar;
            this.f5607n = aVar2;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(433);
            Y41.a<kotlin.G0> aVar = this.f5606m;
            Y41.a<kotlin.G0> aVar2 = this.f5607n;
            C13647j5.a(this.f5605l, aVar, aVar2, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k ub ubVar, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(180979027);
        int i13 = (bE2.B(ubVar) ? 4 : 2) | i12;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            G2.a(androidx.compose.runtime.internal.r.b(bE2, 1405433794, new a(i13, ubVar, aVar, aVar2)), bE2, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(i12, ubVar, aVar, aVar2);
    }
}
