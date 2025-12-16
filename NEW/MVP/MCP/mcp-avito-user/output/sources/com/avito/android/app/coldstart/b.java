package com.avito.android.app.coldstart;

import android.app.Activity;
import android.view.View;
import com.avito.android.app.coldstart.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActivityFirstDrawListening.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f91345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f91346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, Y41.a<G0> aVar) {
        super(0);
        this.f91345l = activity;
        this.f91346m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h.a aVar = h.f91364f;
        View decorView = this.f91345l.getWindow().getDecorView();
        a aVar2 = new a(this.f91346m);
        aVar.getClass();
        if (decorView.getViewTreeObserver().isAlive() && decorView.isAttachedToWindow()) {
            decorView.getViewTreeObserver().addOnDrawListener(new h(aVar2, decorView));
        } else {
            decorView.addOnAttachStateChangeListener(new g(aVar2, decorView));
        }
        return G0.f406611a;
    }
}
