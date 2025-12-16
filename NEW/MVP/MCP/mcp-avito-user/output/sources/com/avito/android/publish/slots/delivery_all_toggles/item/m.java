package com.avito.android.publish.slots.delivery_all_toggles.item;

import androidx.core.widget.NestedScrollView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f243504b;

    public m(o oVar) {
        this.f243504b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f243504b;
        NestedScrollView nestedScrollView = (NestedScrollView) oVar.f243508c;
        D6.B(new p(nestedScrollView, oVar), nestedScrollView);
    }
}
