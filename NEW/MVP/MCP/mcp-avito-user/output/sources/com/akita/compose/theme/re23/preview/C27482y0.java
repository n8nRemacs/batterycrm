package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AvatarGroupPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.y0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27482y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27482y0 f65916a = new C27482y0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f65917b = new C22096n(1054237979, a.f65918l, false);

    /* compiled from: AvatarGroupPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.y0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f65918l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.common_ic_logo_24, 0, a13);
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                C20806p1.a(eVarA, null, fillElement, null, null, 0.0f, null, a13, 440, 120);
            }
            return kotlin.G0.f406611a;
        }
    }
}
