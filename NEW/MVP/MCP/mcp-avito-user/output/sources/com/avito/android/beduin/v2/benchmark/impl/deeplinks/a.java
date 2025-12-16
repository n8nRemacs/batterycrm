package com.avito.android.beduin.v2.benchmark.impl.deeplinks;

import Y41.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.beduin.v2.benchmark.BeduinV2BenchmarkPageDeepLink;
import com.avito.android.beduin.v2.benchmark.impl.BeduinV2BenchmarkPageActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2BenchmarkPageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f104620l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinV2BenchmarkPageDeepLink f104621m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, BeduinV2BenchmarkPageDeepLink beduinV2BenchmarkPageDeepLink) {
        super(1);
        this.f104620l = bVar;
        this.f104621m = beduinV2BenchmarkPageDeepLink;
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        b bVar = this.f104620l;
        BeduinV2BenchmarkPageActivity.f104581m.getClass();
        Intent intent = new Intent(context, (Class<?>) BeduinV2BenchmarkPageActivity.class);
        BeduinV2BenchmarkPageDeepLink beduinV2BenchmarkPageDeepLink = this.f104621m;
        bVar.f104622d.R(intent.putExtra("extraSampleId", beduinV2BenchmarkPageDeepLink.f104579b).putExtra("screenName", beduinV2BenchmarkPageDeepLink.f104580c), com.avito.android.deeplink_handler.view.b.f134588l);
        return G0.f406611a;
    }
}
