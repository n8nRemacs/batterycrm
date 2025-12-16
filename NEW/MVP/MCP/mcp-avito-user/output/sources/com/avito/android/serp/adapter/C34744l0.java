package com.avito.android.serp.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.serp.AdvertItemLayout;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: RdsAdvertGridItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/u0;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/u0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34744l0 extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34862u0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f270231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f270232m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.connection_quality.connectivity.a f270233n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34744l0(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar) {
        super(2);
        this.f270231l = hVar;
        this.f270232m = locale;
        this.f270233n = aVar;
    }

    @Override // Y41.p
    public final C34862u0 invoke(ViewGroup viewGroup, View view) {
        C34862u0 c34862u0 = new C34862u0(view, this.f270233n, this.f270231l, this.f270232m, AsyncViewportTracker.ViewContext.f430416f);
        AdvertItemLayout advertItemLayout = c34862u0.f272510b.f271908T;
        advertItemLayout.setWidthRatio((int) (1.0f * 100));
        advertItemLayout.setHeightRatio(100);
        return c34862u0;
    }
}
