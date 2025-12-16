package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToastRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<TextView, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToastState f221258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ToastState toastState) {
        super(1);
        this.f221258l = toastState;
    }

    @Override // Y41.l
    public final G0 invoke(TextView textView) {
        TextView textView2 = textView;
        ToastState toastState = this.f221258l;
        textView2.setVisibility(toastState.c() ? 0 : 8);
        textView2.setOnClickListener(new h(toastState, 1));
        return G0.f406611a;
    }
}
