package com.yandex.div.core.widget;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.yandex.div.internal.widget.d;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "child", "", "i", "Lkotlin/G0;", "invoke", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class q extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f369313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f369314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f369315n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f369316o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.f f369317p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i12, n nVar, int i13, int i14, l0.f fVar) {
        super(2);
        this.f369313l = i12;
        this.f369314m = nVar;
        this.f369315n = i13;
        this.f369316o = i14;
        this.f369317p = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        int iF2;
        View view2 = view;
        int iIntValue = num.intValue();
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        d.a aVar = com.yandex.div.internal.widget.d.f370251b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        int i12 = cVar.f370243a;
        if (i12 < 0) {
            i12 = this.f369313l;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        n nVar = this.f369314m;
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, nVar.getLayoutDirection()) & 7;
        if (absoluteGravity == 1) {
            iF2 = androidx.appcompat.app.r.f((this.f369315n - measuredWidth) + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 2, nVar.getPaddingLeft());
        } else if (absoluteGravity == 3 || absoluteGravity != 5) {
            int paddingLeft = nVar.getPaddingLeft();
            int i13 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
            iF2 = paddingLeft + i13;
        } else {
            iF2 = (this.f369316o - measuredWidth) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        }
        kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
        boolean zM2 = nVar.m(iIntValue);
        l0.f fVar = this.f369317p;
        if (zM2) {
            fVar.f406840b += nVar.f369298l;
        }
        int i14 = fVar.f406840b + ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        fVar.f406840b = i14;
        view2.layout(iF2, i14, measuredWidth + iF2, i14 + measuredHeight);
        fVar.f406840b = measuredHeight + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + fVar.f406840b;
        return G0.f406611a;
    }
}
