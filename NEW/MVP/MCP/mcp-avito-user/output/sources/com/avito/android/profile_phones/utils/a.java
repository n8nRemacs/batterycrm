package com.avito.android.profile_phones.utils;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J3;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35829k2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.text.C43066x;

/* compiled from: AsyncUniversalImageOrSpacer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: AsyncUniversalImageOrSpacer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.utils.a$a, reason: collision with other inner class name */
    public static final class C6943a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UniversalImage f228337l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f228338m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f228339n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f228340o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f228341p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f228342q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f228343r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6943a(UniversalImage universalImage, float f12, float f13, v vVar, InterfaceC22374n interfaceC22374n, int i12, int i13) {
            super(2);
            this.f228337l = universalImage;
            this.f228338m = f12;
            this.f228339n = f13;
            this.f228340o = vVar;
            this.f228341p = interfaceC22374n;
            this.f228342q = i12;
            this.f228343r = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f228342q | 1);
            float f12 = this.f228339n;
            a.a(this.f228337l, this.f228338m, f12, this.f228340o, this.f228341p, a12, iA2, this.f228343r);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k UniversalImage universalImage, float f12, float f13, @l v vVar, @l InterfaceC22374n interfaceC22374n, @l A a12, int i12, int i13) {
        InterfaceC22374n interfaceC22374n2;
        B bE2 = a12.E(1763217071);
        if ((i13 & 16) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n2 = InterfaceC22374n.a.f40493b;
        } else {
            interfaceC22374n2 = interfaceC22374n;
        }
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, !O0.a(bE2));
        J3 j32 = Q0.f41199h;
        Uri uriD = C35829k2.b(imageDependsOnTheme, b.b(((d) bE2.o(j32)).M0(f12)), b.b(((d) bE2.o(j32)).M0(f13)), 0.0f, 2, 44).d();
        String string = uriD != null ? uriD.toString() : null;
        if (string != null) {
            bE2.C(712137220);
            coil.compose.v.b(string, null, C20588k2.q(vVar, f12, f13), null, interfaceC22374n2, null, bE2, ((i12 << 6) & 3670016) | 48, 4024);
            bE2.X(false);
        } else {
            bE2.C(712347679);
            bE2.C(1824097483);
            v vVarQ = C20588k2.q(vVar, f12, f13);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            bE2.C(1824100255);
            if (zBooleanValue) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                vVarQ = androidx.compose.foundation.A.b(vVarQ, com.akita.compose.theme.re23.b.f63984b.f63945n0.c(bE2), Y0.f39346a);
            }
            bE2.X(false);
            bE2.X(false);
            C20608p2.a(bE2, vVarQ);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C6943a(universalImage, f12, f13, vVar, interfaceC22374n2, i12, i13);
        }
    }

    @l
    public static final Image b(@k Map<String, String> map) {
        Integer numY0;
        C42770s0 c42770s0B = P0.b(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c42770s0B.f406743a.iterator();
        while (true) {
            Size size = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List listF0 = C43066x.f0((String) entry.getKey(), new String[]{"x"}, 0, 4);
            if (listF0.size() == 2 && (numY0 = C43066x.y0((String) listF0.get(0))) != null) {
                int iIntValue = numY0.intValue();
                Integer numY02 = C43066x.y0((String) listF0.get(1));
                if (numY02 != null) {
                    size = new Size(iIntValue, numY02.intValue());
                }
            }
            linkedHashMap.put(size, Uri.parse((String) entry.getValue()));
        }
        LinkedHashMap linkedHashMapB = C35755b0.b(linkedHashMap);
        if (linkedHashMapB.isEmpty()) {
            return null;
        }
        return new Image(linkedHashMapB);
    }
}
