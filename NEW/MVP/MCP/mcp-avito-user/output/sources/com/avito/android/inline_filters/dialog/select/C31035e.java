package com.avito.android.inline_filters.dialog.select;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.select.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31035e extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f172146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31039i f172147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172148n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C31043m f172149o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31035e(boolean z12, C31039i c31039i, ArrayList arrayList, C31043m c31043m) {
        super(0);
        this.f172146l = z12;
        this.f172147m = c31039i;
        this.f172148n = arrayList;
        this.f172149o = c31043m;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ArrayList arrayList = this.f172148n;
        boolean z12 = this.f172146l;
        C31039i c31039i = this.f172147m;
        if (z12) {
            c31039i.getClass();
            c31039i.f172166j = C31039i.e(arrayList);
        }
        c31039i.f172165i.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.avito.android.inline_filters.dialog.select.adapter.i) it.next()).f172094e = false;
        }
        ArrayList arrayList2 = c31039i.f172166j;
        C31043m c31043m = this.f172149o;
        c31043m.k(arrayList, arrayList2);
        c31039i.g(c31043m);
        return G0.f406611a;
    }
}
