package com.avito.android.early_access.adapter.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EarlyAccessTitle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* compiled from: EarlyAccessTitle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[HeaderType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HeaderType headerType = HeaderType.f145253b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l String str, @k HeaderType headerType, @l v vVar, @l A a12, int i12) {
        r rVar;
        B b12;
        B bE2 = a12.E(247214113);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.B(headerType) ? 32 : 16);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            if (str == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new com.avito.android.early_access.adapter.title.a(str, headerType, vVar, i12);
                    return;
                }
                return;
            }
            int iOrdinal = headerType.ordinal();
            if (iOrdinal == 0) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                rVar = com.akita.compose.theme.re23.b.f63988f.f65232c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                com.akita.compose.theme.re23.b.f63983a.getClass();
                rVar = com.akita.compose.theme.re23.b.f63988f.f65236g;
            }
            b12 = bE2;
            p.b(str, rVar, vVar, false, 0L, null, 0, 0, false, null, bE2, i13 & 910, 1016);
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new b(str, headerType, vVar, i12);
        }
    }
}
