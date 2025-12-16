package com.avito.android.beduin.v2.page.impl;

import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.avito.android.L;
import com.avito.android.O;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2PageIntentFactoryImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/x;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/page/impl/v;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x implements dagger.internal.h<v> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f105148d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f105149a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final O f105150b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.c f105151c;

    /* compiled from: BeduinV2PageIntentFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/x$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public x(@Y61.k O o12, @Y61.k com.avito.android.navigation.c cVar, @Y61.k dagger.internal.l lVar) {
        this.f105149a = lVar;
        this.f105150b = o12;
        this.f105151c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f105149a.f393949a;
        L l12 = (L) this.f105150b.get();
        com.avito.android.navigation.a aVar = (com.avito.android.navigation.a) this.f105151c.get();
        f105148d.getClass();
        return new v(application, l12, aVar);
    }
}
