package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35792f5;
import dn.C39758a;
import dn.C39761d;
import dn.C39763f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingOneTimeEventProducer_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/l;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f115413c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C39763f f115414a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C39761d f115415b;

    /* compiled from: CartSheetAfterAddingOneTimeEventProducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/m$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k C39763f c39763f, @Y61.k C39761d c39761d) {
        this.f115414a = c39763f;
        this.f115415b = c39761d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35792f5 c35792f5 = (C35792f5) this.f115414a.get();
        C39758a c39758a = (C39758a) this.f115415b.get();
        f115413c.getClass();
        return new l(c35792f5, c39758a);
    }
}
