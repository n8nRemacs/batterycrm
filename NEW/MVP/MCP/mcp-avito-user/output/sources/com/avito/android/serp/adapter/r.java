package com.avito.android.serp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertItemListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/F;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, F> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f270532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f270533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C34820s f270534n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.avito.android.server_time.h hVar, Locale locale, C34820s c34820s) {
        super(2);
        this.f270532l = hVar;
        this.f270533m = locale;
        this.f270534n = c34820s;
    }

    @Override // Y41.p
    public final F invoke(ViewGroup viewGroup, View view) {
        F f12 = new F(view, this.f270534n.f271466b, this.f270532l, this.f270533m, AsyncViewportTracker.ViewContext.f430418h);
        f12.B80();
        SimpleDraweeView simpleDraweeView = f12.f268499b.f271932g;
        ((RelativeLayout.LayoutParams) simpleDraweeView.getLayoutParams()).removeRule(8);
        ((RelativeLayout.LayoutParams) simpleDraweeView.getLayoutParams()).removeRule(10);
        ((RelativeLayout.LayoutParams) simpleDraweeView.getLayoutParams()).addRule(15);
        simpleDraweeView.setAspectRatio(1.0f);
        return f12;
    }
}
