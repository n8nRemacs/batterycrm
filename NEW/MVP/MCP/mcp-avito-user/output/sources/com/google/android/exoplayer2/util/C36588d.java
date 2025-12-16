package com.google.android.exoplayer2.util;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import java.util.ArrayList;

/* compiled from: BundleableUtil.java */
/* renamed from: com.google.android.exoplayer2.util.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36588d {
    public static AbstractC37401r1 a(InterfaceC36525h.a aVar, ArrayList arrayList) {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar2 = new AbstractC37401r1.a();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            Bundle bundle = (Bundle) arrayList.get(i12);
            bundle.getClass();
            aVar2.g(aVar.fromBundle(bundle));
        }
        return aVar2.i();
    }
}
