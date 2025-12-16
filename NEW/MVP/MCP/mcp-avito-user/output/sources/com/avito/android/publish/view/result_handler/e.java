package com.avito.android.publish.view.result_handler;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.view.result_handler.d;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PublishResultMediator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/result_handler/e;", "Lcom/avito/android/publish/view/result_handler/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N f245681a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Q<String, d.a> f245682b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k Y41.a<? extends ParametersTree> aVar) {
        this.f245681a = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.android.publish.view.result_handler.d
    public final void a(@l String str, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar) {
        Q<String, d.a> q12 = this.f245682b;
        if (q12 == null || this.f245681a.invoke() == null || !L.f(q12.f406619b, str)) {
            return;
        }
        this.f245682b = null;
        d.a aVar = q12.f406620c;
        qVar.invoke(Integer.valueOf(aVar.f245678a), Integer.valueOf(aVar.f245679b), aVar.f245680c);
    }

    @Override // com.avito.android.publish.view.result_handler.d
    public final void b(@l String str, int i12, int i13, @l Intent intent) {
        this.f245682b = new Q<>(str, new d.a(i12, i13, intent));
    }
}
