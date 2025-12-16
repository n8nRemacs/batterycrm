package com.avito.android.inline_filters.dialog.select;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioSelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f172198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f172200d;

    public u(B b12, ArrayList arrayList, D d12) {
        this.f172198b = b12;
        this.f172199c = arrayList;
        this.f172200d = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.inline_filters.dialog.select.adapter.i iVar = (com.avito.android.inline_filters.dialog.select.adapter.i) obj;
        String str = iVar.f172092c;
        B b12 = this.f172198b;
        b12.f172005j = str;
        iVar.f172094e = true;
        ArrayList<com.avito.android.inline_filters.dialog.select.adapter.i> arrayList = this.f172199c;
        for (com.avito.android.inline_filters.dialog.select.adapter.i iVar2 : arrayList) {
            iVar2.f172094e = false;
            if (kotlin.jvm.internal.L.f(iVar2.f172092c, iVar.f172092c)) {
                iVar2.f172094e = true;
            }
        }
        D d12 = this.f172200d;
        d12.k(arrayList, null);
        b12.f(d12);
        b12.g();
    }
}
