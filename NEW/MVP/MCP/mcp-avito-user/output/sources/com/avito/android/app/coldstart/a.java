package com.avito.android.app.coldstart;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.RunnableC22211b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActivityFirstDrawListening.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f91344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a<G0> aVar) {
        super(0);
        this.f91344l = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC22211b(6, this.f91344l));
        return G0.f406611a;
    }
}
