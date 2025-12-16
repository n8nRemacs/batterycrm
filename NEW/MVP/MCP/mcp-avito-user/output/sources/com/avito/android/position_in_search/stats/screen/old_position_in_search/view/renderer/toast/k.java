package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import android.widget.TextView;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.l<TextView, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f221259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ToastState f221260m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, ToastState toastState) {
        super(1);
        this.f221259l = aVar;
        this.f221260m = toastState;
    }

    @Override // Y41.l
    public final G0 invoke(TextView textView) {
        TextView textView2 = textView;
        ToastState.f message = this.f221260m.getMessage();
        int i12 = a.f221235i;
        textView2.setText(this.f221259l.d(message).Y4(textView2.getContext()));
        return G0.f406611a;
    }
}
