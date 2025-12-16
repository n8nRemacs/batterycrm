package Jv;

import Y61.k;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryTarifikatorIntentFactoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LJv/d;", "Ldagger/internal/h;", "LJv/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<C14253b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9177b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f9178a;

    /* compiled from: DeliveryTarifikatorIntentFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJv/d$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k C30102l3 c30102l3) {
        this.f9178a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f9178a.get();
        f9177b.getClass();
        return new C14253b(context);
    }
}
