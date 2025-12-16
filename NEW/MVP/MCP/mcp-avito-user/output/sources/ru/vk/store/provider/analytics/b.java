package ru.vk.store.provider.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.analytics.d;
import ru.rustore.sdk.core.exception.RuStoreException;

/* compiled from: AnalyticsProviderCallback.java */
/* loaded from: classes9.dex */
public interface b extends IInterface {

    /* compiled from: AnalyticsProviderCallback.java */
    public static class a implements b {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: AnalyticsProviderCallback.java */
    /* renamed from: ru.vk.store.provider.analytics.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC12597b extends Binder implements b {

        /* compiled from: AnalyticsProviderCallback.java */
        /* renamed from: ru.vk.store.provider.analytics.b$b$a */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f437154a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f437154a;
            }
        }

        public AbstractBinderC12597b() {
            attachInterface(this, "ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
            if (i12 >= 1 && i12 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
            }
            if (i12 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
                return true;
            }
            if (i12 == 1) {
                d.this.getClass();
                throw null;
            }
            if (i12 != 2) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            parcel.readInt();
            String string = parcel.readString();
            d.this.getClass();
            if (string == null) {
                string = "";
            }
            new RuStoreException(string);
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
