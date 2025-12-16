package com.avito.android.service_order_widget.item.delegate;

import Y41.l;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/b;", "IV", "Lcom/avito/android/service_order_widget/item/delegate/a;", "I", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d<b<Object>, a> f278873l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d<b<Object>, a> dVar) {
        super(1);
        this.f278873l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        d<b<Object>, a> dVar = this.f278873l;
        ServiceOrderWidget.AnalyticsParams analyticsParams = dVar.f278869h;
        Integer num = dVar.f278868g;
        dVar.f278866e.getClass();
        dVar.f278864c.b(analyticsParams, str, num, null);
        return G0.f406611a;
    }
}
