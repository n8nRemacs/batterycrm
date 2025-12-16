package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: AvatarGroupPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isWithBadge", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27402i {

    /* compiled from: AvatarGroupPreview.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65700l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65700l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65700l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AvatarGroupPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.i$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.avatar.group.k> f65701l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65702m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.Q<String, com.akita.compose.component.avatar.group.k> q12, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f65701l = q12;
            this.f65702m = interfaceC22204y1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.avatar.group.e.a(this.f65701l.f406620c, null, this.f65702m.getF42167b().booleanValue() ? "5+" : null, C27407j.f65712l, a13, 3072);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AvatarGroupPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.i$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.avatar.group.k> f65703l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65704m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65703l = q12;
            this.f65704m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65704m | 1);
            C27402i.a(this.f65703l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.avatar.group.k> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-990465184);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(829205619);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.TRUE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            String str = q12.f406619b;
            boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
            bE2.C(829214982);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new a(interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            C27452s0.a(str, null, null, 0.0f, Collections.singleton(new AbstractC27462u0.d("isWithBadge", zBooleanValue, (Y41.l) objT2)), androidx.compose.runtime.internal.r.c(739086794, new b(q12, interfaceC22204y1), bE2), bE2, 196608, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
