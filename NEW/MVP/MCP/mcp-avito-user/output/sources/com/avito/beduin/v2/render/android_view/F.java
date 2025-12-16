package com.avito.beduin.v2.render.android_view;

import com.avito.beduin.v2.theme.r;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ThemeColors.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"android-view_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F {
    @Y61.l
    @InterfaceC42156l
    public static final Integer a(@Y61.k com.avito.beduin.v2.theme.f fVar, @Y61.l com.avito.beduin.v2.theme.k kVar, boolean z12) {
        r.b bVar = (r.b) fVar.a();
        if (bVar == null) {
            return null;
        }
        String strA = bVar.f338371c.a();
        String strB = strA != null ? com.avito.beduin.v2.theme.y.b(strA) : null;
        Integer num = (strB == null || kVar == null) ? null : (Integer) kVar.f338363a.a(strB);
        if (num != null) {
            return num;
        }
        String strA2 = bVar.a(z12).a();
        if (strA2 == null) {
            return null;
        }
        ET0.f.f4020a.getClass();
        return ET0.f.a(strA2);
    }

    public static int b(com.avito.beduin.v2.theme.r rVar, com.avito.beduin.v2.theme.k kVar, boolean z12) {
        String str = rVar.f338368c;
        Integer numA = null;
        String strB = str != null ? com.avito.beduin.v2.theme.y.b(str) : null;
        if (strB != null && kVar != null) {
            numA = (Integer) kVar.f338363a.a(strB);
        }
        if (numA == null) {
            String strA = rVar.a(z12);
            ET0.f.f4020a.getClass();
            numA = ET0.f.a(strA);
        }
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }
}
