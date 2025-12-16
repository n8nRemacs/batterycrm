package com.avito.android.update_source;

import AK0.i;
import Y61.k;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UpdateSourcePreferences_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update_source/d;", "Ldagger/internal/h;", "Lcom/avito/android/update_source/c;", "a", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f306707c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f306708a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<i> f306709b;

    /* compiled from: UpdateSourcePreferences_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update_source/d$a;", "", "<init>", "()V", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k C30102l3 c30102l3, @k Provider provider) {
        this.f306708a = c30102l3;
        this.f306709b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f306708a.get();
        i iVar = this.f306709b.get();
        f306707c.getClass();
        return new c(context, iVar);
    }
}
