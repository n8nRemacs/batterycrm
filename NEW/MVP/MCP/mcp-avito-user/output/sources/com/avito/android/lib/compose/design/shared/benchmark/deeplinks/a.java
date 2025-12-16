package com.avito.android.lib.compose.design.shared.benchmark.deeplinks;

import Y41.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.lib.compose.design.shared.benchmark.BenchmarkComposeActivity;
import com.avito.android.lib.compose.design.shared.benchmark.BenchmarkComposeDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BenchmarkComposeDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f177631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BenchmarkComposeDeepLink f177632m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, BenchmarkComposeDeepLink benchmarkComposeDeepLink) {
        super(1);
        this.f177631l = bVar;
        this.f177632m = benchmarkComposeDeepLink;
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        b bVar = this.f177631l;
        BenchmarkComposeActivity.f177609p.getClass();
        bVar.f177633d.R(new Intent(context, (Class<?>) BenchmarkComposeActivity.class).putExtra("component_name", this.f177632m.f177621b), com.avito.android.deeplink_handler.view.b.f134588l);
        return G0.f406611a;
    }
}
