package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC37186w extends BinderC37177t {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E f358516p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC37186w(E e12, C37028k c37028k) {
        super(e12, c37028k);
        this.f358516p = e12;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void d2(ArrayList arrayList) {
        super.d2(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            E e12 = this.f358516p;
            AssetPackState assetPackState = (AssetPackState) ((Y) AbstractC37119f.a(bundle, e12.f358109b, e12.f358110c, O.f358193a)).f358271b.values().iterator().next();
            if (assetPackState == null) {
                E.f358106g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int iG2 = assetPackState.g();
            if (iG2 == 1 || iG2 == 7 || iG2 == 2 || iG2 == 3) {
                arrayList2.add(assetPackState.f());
            }
        }
        this.f358499a.d(arrayList2);
    }
}
