package com.avito.android.serp.adapter.rich_snippets.realty;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: DevelopmentListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/realty/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/realty/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34756a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34762g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f270970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f270971m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C34757b f270972n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34756a(com.avito.android.server_time.h hVar, Locale locale, C34757b c34757b) {
        super(2);
        this.f270970l = hVar;
        this.f270971m = locale;
        this.f270972n = c34757b;
    }

    @Override // Y41.p
    public final C34762g invoke(ViewGroup viewGroup, View view) {
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
        return new C34762g(view, this.f270970l, this.f270971m, this.f270972n.f270974b);
    }
}
