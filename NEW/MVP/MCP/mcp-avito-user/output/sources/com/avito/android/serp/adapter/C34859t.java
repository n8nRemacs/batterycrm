package com.avito.android.serp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertItemListBlueprintWithDescription.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/D0;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/D0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34859t extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, D0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f272434l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f272435m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C34861u f272436n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34859t(com.avito.android.server_time.h hVar, Locale locale, C34861u c34861u) {
        super(2);
        this.f272434l = hVar;
        this.f272435m = locale;
        this.f272436n = c34861u;
    }

    @Override // Y41.p
    public final D0 invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        D0 d02 = new D0(view2, new F(view2, this.f272436n.f272508b, this.f272434l, this.f272435m, AsyncViewportTracker.ViewContext.f430418h));
        d02.f268494b.B80();
        SimpleDraweeView simpleDraweeView = d02.f268496d;
        simpleDraweeView.setAspectRatio(1.0f);
        ((RelativeLayout.LayoutParams) simpleDraweeView.getLayoutParams()).removeRule(15);
        ((RelativeLayout.LayoutParams) simpleDraweeView.getLayoutParams()).addRule(10);
        return d02;
    }
}
