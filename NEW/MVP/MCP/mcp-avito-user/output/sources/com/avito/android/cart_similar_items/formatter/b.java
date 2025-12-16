package com.avito.android.cart_similar_items.formatter;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PriceFormatter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/formatter/b;", "Ldagger/internal/h;", "Lcom/avito/android/cart_similar_items/formatter/a;", "a", "_avito_cart-similar-items_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements h<com.avito.android.cart_similar_items.formatter.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f115806b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f115807a;

    /* compiled from: PriceFormatter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/formatter/b$a;", "", "<init>", "()V", "_avito_cart-similar-items_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k u uVar) {
        this.f115807a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) this.f115807a.get();
        f115806b.getClass();
        return new com.avito.android.cart_similar_items.formatter.a(locale);
    }
}
