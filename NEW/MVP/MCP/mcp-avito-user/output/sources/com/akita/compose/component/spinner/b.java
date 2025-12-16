package com.akita.compose.component.spinner;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.animation.core.F;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Spinner.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "currentRotation", "", "rotation", "endAngle", "startAngle", "spinner_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final F f62792a = new F(0.4f, 0.0f, 0.2f, 1.0f);

    /* compiled from: Spinner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f62793l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f62794m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62795n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f62796o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, v vVar, int i12, int i13) {
            super(2);
            this.f62793l = hVar;
            this.f62794m = vVar;
            this.f62795n = i12;
            this.f62796o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f62795n | 1);
            v vVar = this.f62794m;
            int i12 = this.f62796o;
            b.a(this.f62793l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k h hVar, @l v vVar, @l A a12, int i12, int i13) {
        int i14;
        B bE2 = a12.E(-754048308);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(hVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = v.f42878y1;
            }
            b(C20588k2.o(vVar, hVar.f62822a), hVar.f62823b, hVar.f62824c, 0, null, bE2, 0, 24);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(hVar, vVar, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l androidx.compose.ui.v r17, @Y61.l com.akita.compose.foundation.p r18, float r19, int r20, @Y61.l androidx.compose.animation.core.F r21, @Y61.l androidx.compose.runtime.A r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.spinner.b.b(androidx.compose.ui.v, com.akita.compose.foundation.p, float, int, androidx.compose.animation.core.F, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(long r28, @Y61.l androidx.compose.ui.v r30, float r31, int r32, @Y61.l androidx.compose.animation.core.F r33, @Y61.l androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.spinner.b.c(long, androidx.compose.ui.v, float, int, androidx.compose.animation.core.F, androidx.compose.runtime.A, int, int):void");
    }
}
