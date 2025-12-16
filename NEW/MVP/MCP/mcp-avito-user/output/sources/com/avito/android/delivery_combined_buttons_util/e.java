package com.avito.android.delivery_combined_buttons_util;

import com.avito.android.delivery_combined_buttons_util.c;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryCombinedButtonsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Button f134988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c.b f134989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c.a f134990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f134991o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Button button, c.b bVar, c.a aVar, Y41.a<G0> aVar2) {
        super(0);
        this.f134988l = button;
        this.f134989m = bVar;
        this.f134990n = aVar;
        this.f134991o = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Button button = this.f134988l;
        button.removeOnLayoutChangeListener(this.f134989m);
        button.removeOnAttachStateChangeListener(this.f134990n);
        this.f134991o.invoke();
        return G0.f406611a;
    }
}
