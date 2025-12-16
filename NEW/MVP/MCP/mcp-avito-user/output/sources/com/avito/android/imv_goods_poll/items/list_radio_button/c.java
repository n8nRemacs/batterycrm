package com.avito.android.imv_goods_poll.items.list_radio_button;

import Y61.k;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RadioButtonItemBlueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/list_radio_button/c;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/items/list_radio_button/b;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f170658b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f170659a;

    /* compiled from: RadioButtonItemBlueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/list_radio_button/c$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k u uVar) {
        this.f170659a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f170659a.get();
        f170658b.getClass();
        return new b(dVar);
    }
}
