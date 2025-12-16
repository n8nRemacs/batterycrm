package ru.vk.store.provider.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.vk.store.provider.analytics.b;

/* compiled from: AnalyticsProvider.java */
/* loaded from: classes9.dex */
public interface a extends IInterface {

    /* compiled from: AnalyticsProvider.java */
    /* renamed from: ru.vk.store.provider.analytics.a$a, reason: collision with other inner class name */
    public static class C12595a implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // ru.vk.store.provider.analytics.a
        public final void p1() {
            throw null;
        }
    }

    /* compiled from: AnalyticsProvider.java */
    public static class c {
    }

    void p1();

    /* compiled from: AnalyticsProvider.java */
    public static abstract class b extends Binder implements a {

        /* compiled from: AnalyticsProvider.java */
        /* renamed from: ru.vk.store.provider.analytics.a$b$a, reason: collision with other inner class name */
        public static class C12596a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f437153a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f437153a;
            }

            @Override // ru.vk.store.provider.analytics.a
            public final void p1() {
                throw null;
            }
        }

        public b() {
            attachInterface(this, "ru.vk.store.provider.analytics.AnalyticsProvider");
        }

        public static void e4(IBinder iBinder) {
            if (iBinder == null) {
                return;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProvider");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) {
                new C12596a().f437153a = iBinder;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.analytics.AnalyticsProvider");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.analytics.AnalyticsProvider");
                return true;
            }
            if (i12 != 1) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel.readString();
            parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ru.vk.store.provider.analytics.b)) {
                    new b.AbstractBinderC12597b.a().f437154a = strongBinder;
                }
            }
            p1();
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
