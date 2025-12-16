package com.akita.compose.component.toggle;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: SwitcherToggle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"toggle_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* compiled from: SwitcherToggle.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<T> f63403l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f63404m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f63405n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I3<T> f63406o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, long j12, I3 i32, I3 i33) {
            super(1);
            this.f63403l = i32;
            this.f63404m = j12;
            this.f63405n = f12;
            this.f63406o = i33;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            androidx.compose.ui.graphics.drawscope.g.d1(gVar2, this.f63403l.getF42167b().f39331a, 0L, 0L, this.f63404m, androidx.compose.ui.graphics.drawscope.n.f39497a, 0.0f, 230);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = this.f63405n;
            if (Float.compare(f12, 0) > 0) {
                androidx.compose.ui.graphics.drawscope.g.d1(gVar2, this.f63406o.getF42167b().f39331a, 0L, 0L, this.f63404m, new androidx.compose.ui.graphics.drawscope.o(gVar2.M0(f12), 0.0f, 0, 0, null, 30, null), 0.0f, 230);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SwitcherToggle.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/d;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<Float> f63407l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I3<Float> i32) {
            super(1);
            this.f63407l = i32;
        }

        @Override // Y41.l
        public final androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.a((kotlin.math.b.b(this.f63407l.getF42167b().floatValue()) << 32) | (0 & 4294967295L));
        }
    }

    /* compiled from: SwitcherToggle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<T> f63408l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I3<T> i32) {
            super(1);
            this.f63408l = i32;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g.U(gVar, this.f63408l.getF42167b().f39331a, 0.0f, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
            return G0.f406611a;
        }
    }

    /* compiled from: SwitcherToggle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f63409l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f63410m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f63411n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ToggleState f63412o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f63413p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f63414q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ float f63415r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f63416s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ float f63417t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ float f63418u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s f63419v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f63420w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f63421x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ int f63422y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ int f63423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, Y41.a<G0> aVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, float f12, float f13, float f14, float f15, float f16, s sVar, boolean z13, int i12, int i13, int i14) {
            super(2);
            this.f63409l = z12;
            this.f63410m = aVar;
            this.f63411n = vVar;
            this.f63412o = toggleState;
            this.f63413p = mVar;
            this.f63414q = f12;
            this.f63415r = f13;
            this.f63416s = f14;
            this.f63417t = f15;
            this.f63418u = f16;
            this.f63419v = sVar;
            this.f63420w = z13;
            this.f63421x = i12;
            this.f63422y = i13;
            this.f63423z = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63421x | 1);
            int iA3 = C22066f2.a(this.f63422y);
            float f12 = this.f63418u;
            int i12 = this.f63423z;
            r.b(this.f63409l, this.f63410m, this.f63411n, this.f63412o, this.f63413p, this.f63414q, this.f63415r, this.f63416s, this.f63417t, f12, this.f63419v, this.f63420w, a12, iA2, iA3, i12);
            return G0.f406611a;
        }
    }

    /* compiled from: SwitcherToggle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f63424l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f63425m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44967a f63426n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a<G0> aVar, boolean z12, InterfaceC44967a interfaceC44967a) {
            super(0);
            this.f63424l = aVar;
            this.f63425m = z12;
            this.f63426n = interfaceC44967a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f63424l.invoke();
            if (this.f63425m) {
                p0.b.f422385b.getClass();
                b.a.a();
                this.f63426n.a(0);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, @Y61.l Y41.a r27, @Y61.k com.akita.compose.component.toggle.u r28, @Y61.l androidx.compose.ui.v r29, @Y61.l com.akita.compose.component.toggle.ToggleState r30, @Y61.l androidx.compose.foundation.interaction.m r31, @Y61.l androidx.compose.runtime.A r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toggle.r.a(boolean, Y41.a, com.akita.compose.component.toggle.u, androidx.compose.ui.v, com.akita.compose.component.toggle.ToggleState, androidx.compose.foundation.interaction.m, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r38, @Y61.l Y41.a<kotlin.G0> r39, @Y61.l androidx.compose.ui.v r40, @Y61.l com.akita.compose.component.toggle.ToggleState r41, @Y61.l androidx.compose.foundation.interaction.m r42, float r43, float r44, float r45, float r46, float r47, @Y61.l com.akita.compose.component.toggle.s r48, boolean r49, @Y61.l androidx.compose.runtime.A r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toggle.r.b(boolean, Y41.a, androidx.compose.ui.v, com.akita.compose.component.toggle.ToggleState, androidx.compose.foundation.interaction.m, float, float, float, float, float, com.akita.compose.component.toggle.s, boolean, androidx.compose.runtime.A, int, int, int):void");
    }
}
