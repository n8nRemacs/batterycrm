package com.avito.android.serp.adapter.rich_snippets.realty;

import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: DevelopmentXlListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/realty/F;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/realty/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, F> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f271018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f271019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f271020n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.avito.android.server_time.h hVar, Locale locale, z zVar) {
        super(2);
        this.f271018l = hVar;
        this.f271019m = locale;
        this.f271020n = zVar;
    }

    @Override // Y41.p
    public final F invoke(ViewGroup viewGroup, View view) {
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
        return new F(view, this.f271018l, this.f271019m, this.f271020n.f271022b);
    }
}
