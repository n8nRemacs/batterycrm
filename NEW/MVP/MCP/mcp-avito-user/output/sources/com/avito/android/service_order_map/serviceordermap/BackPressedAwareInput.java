package com.avito.android.service_order_map.serviceordermap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: BackPressedAwareInput.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/BackPressedAwareInput;", "Lcom/avito/android/lib/design/input/Input;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "Lkotlin/G0;", "onBackPressed", "setOnBackPressed", "(LY41/a;)V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackPressedAwareInput extends Input {

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public Y41.a<G0> f278593e0;

    /* compiled from: BackPressedAwareInput.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278594l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ BackPressedAwareInput(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i12, @Y61.l KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f278593e0.invoke();
        }
        return false;
    }

    public final void setOnBackPressed(@Y61.k Y41.a<G0> onBackPressed) {
        this.f278593e0 = onBackPressed;
    }

    @X41.j
    public BackPressedAwareInput(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        this.f278593e0 = a.f278594l;
    }
}
