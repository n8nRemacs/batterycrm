package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CloseButtonPreview.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27373c0 {

    /* compiled from: CloseButtonPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.c0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.close_button.c> f65629l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, com.akita.compose.component.close_button.c> q12) {
            super(3);
            this.f65629l = q12;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.close_button.b.a(C27368b0.f65612l, this.f65629l.f406620c, null, false, null, null, a13, 6, 60);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CloseButtonPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.c0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.close_button.c> f65630l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65631m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65630l = q12;
            this.f65631m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65631m | 1);
            C27373c0.a(this.f65630l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.close_button.c> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.foundation.p pVar;
        androidx.compose.runtime.B bE2 = a12.E(1811240672);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            String str = q12.f406619b;
            String str2 = str;
            String str3 = str;
            if (C43066x.q(str3, "inverseConstant", false)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63862L0;
            } else if (C43066x.q(str3, "inverse", false)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63938l;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            }
            C27452s0.a(str2, null, pVar, 0.0f, null, androidx.compose.runtime.internal.r.c(-754174646, new a(q12), bE2), bE2, 196608, 26);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
