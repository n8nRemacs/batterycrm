package com.avito.android.deeplink_handler.handler.bundle;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import androidx.view.C23060r0;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42148d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkBundleSaver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/bundle/DeeplinkBundleSaver;", "", "a", "SavedData", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkBundleSaver {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C23060r0 f134508a;

    /* compiled from: DeeplinkBundleSaver.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/bundle/DeeplinkBundleSaver$SavedData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedData implements Parcelable {

        @k
        public static final Parcelable.Creator<SavedData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f134509b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f134510c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f134511d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Bundle f134512e;

        /* compiled from: DeeplinkBundleSaver.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedData> {
            @Override // android.os.Parcelable.Creator
            public final SavedData createFromParcel(Parcel parcel) {
                return new SavedData(parcel.readString(), (DeepLink) parcel.readParcelable(SavedData.class.getClassLoader()), parcel.readString(), parcel.readBundle(SavedData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedData[] newArray(int i12) {
                return new SavedData[i12];
            }
        }

        public SavedData(@k String str, @k DeepLink deepLink, @l String str2, @l Bundle bundle) {
            this.f134509b = str;
            this.f134510c = deepLink;
            this.f134511d = str2;
            this.f134512e = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f134509b);
            parcel.writeParcelable(this.f134510c, i12);
            parcel.writeString(this.f134511d);
            parcel.writeBundle(this.f134512e);
        }
    }

    /* compiled from: DeeplinkBundleSaver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/bundle/DeeplinkBundleSaver$a;", "", "<init>", "()V", "", "SAVED_STATE_PREFIX", "Ljava/lang/String;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeeplinkBundleSaver.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f134514m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f134515n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f134514m = str;
            this.f134515n = str2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeeplinkBundleSaver deeplinkBundleSaver = DeeplinkBundleSaver.this;
            C23060r0 c23060r0 = deeplinkBundleSaver.f134508a;
            String str = this.f134514m;
            Iterable iterable = (List) c23060r0.b(str);
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!L.f(((SavedData) obj).f134509b, this.f134515n)) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            C23060r0 c23060r02 = deeplinkBundleSaver.f134508a;
            if (zIsEmpty) {
                c23060r02.d(str);
            } else {
                c23060r02.e(arrayList, str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeeplinkBundleSaver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f134517m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f134518n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.bundle.a f134519o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, com.avito.android.deeplink_handler.handler.bundle.a aVar) {
            super(0);
            this.f134517m = str;
            this.f134518n = str2;
            this.f134519o = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeeplinkBundleSaver deeplinkBundleSaver = DeeplinkBundleSaver.this;
            C23060r0 c23060r0 = deeplinkBundleSaver.f134508a;
            String str = this.f134517m;
            Collection collection = (List) c23060r0.b(str);
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            com.avito.android.deeplink_handler.handler.bundle.a aVar = this.f134519o;
            deeplinkBundleSaver.f134508a.e(C42745f0.i0(new SavedData(this.f134518n, aVar.f134520a, aVar.f134521b, aVar.f134522c), collection), str);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public DeeplinkBundleSaver(@k C23060r0 c23060r0) {
        this.f134508a = c23060r0;
    }

    @InterfaceC42148d
    public final void a(@k String str, @k String str2) {
        com.avito.android.util.concurrent.b.a(new b(G.f("dl_store_ss_", str), str2));
    }

    @InterfaceC42148d
    public final void b(@k String str, @k com.avito.android.deeplink_handler.handler.bundle.a aVar, @k String str2) {
        com.avito.android.util.concurrent.b.a(new c(G.f("dl_store_ss_", str), str2, aVar));
    }
}
