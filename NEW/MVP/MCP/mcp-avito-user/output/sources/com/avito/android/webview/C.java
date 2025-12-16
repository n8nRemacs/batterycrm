package com.avito.android.webview;

import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class C extends N implements Y41.r<Integer, Integer, Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f329508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f329509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D f329510n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(ViewGroup viewGroup, ViewGroup viewGroup2, D d12) {
        super(4);
        this.f329508l = viewGroup;
        this.f329509m = viewGroup2;
        this.f329510n = d12;
    }

    @Override // Y41.r
    public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        ViewGroup viewGroup = this.f329508l;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), iIntValue2, viewGroup.getPaddingRight(), iIntValue4);
        ViewGroup viewGroup2 = this.f329509m;
        viewGroup2.setPadding(iIntValue, viewGroup2.getPaddingTop(), iIntValue3, viewGroup2.getPaddingBottom());
        Toolbar toolbar = this.f329510n.f329514d;
        if (toolbar != null) {
            toolbar.setPadding(iIntValue, toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        return G0.f406611a;
    }
}
