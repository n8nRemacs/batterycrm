package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.photo_picker.Q;
import com.avito.android.photo_picker.U;
import com.avito.android.photo_picker.X;
import com.avito.android.photo_picker.legacy.service.c;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import l41.o;
import l41.r;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/d;", "Lcom/avito/android/photo_picker/legacy/service/c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.photo_picker.legacy.service.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f219853a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U f219854b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q f219855c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final X f219856d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219857e;

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lcom/avito/android/remote/model/CloseableDataSource;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f219858b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Y.a((CloseableDataSource) obj);
        }
    }

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f219859b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return z.X((List) obj);
        }
    }

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "photo", "Lcom/avito/android/photo_cache/PhotoUpload;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f219860b;

        public c(boolean z12) {
            this.f219860b = z12;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            String str;
            PhotoUpload photoUpload = (PhotoUpload) obj;
            if (photoUpload.f216305g != null && ((str = photoUpload.f216304f) == null || C43066x.K(str))) {
                if (!this.f219860b) {
                    if (!L.f(photoUpload.f216307i, ErrorType.NonRestorableError.INSTANCE)) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_cache/PhotoUpload;", "photo", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/photo_picker/legacy/service/c$a;", "apply", "(Lcom/avito/android/photo_cache/PhotoUpload;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.legacy.service.d$d, reason: collision with other inner class name */
    public static final class C6609d<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f219862c;

        public C6609d(String str) {
            this.f219862c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            PhotoUpload photoUpload = (PhotoUpload) obj;
            d dVar = d.this;
            dVar.getClass();
            PhotoUpload photoUploadA = PhotoUpload.a(photoUpload, null, null, ErrorType.NoError.INSTANCE, null, null, null, 3967);
            String str = this.f219862c;
            dVar.f219853a.h(str, photoUploadA);
            X x12 = dVar.f219856d;
            String str2 = photoUpload.f216301c;
            n80.b bVarA = x12.a(str2);
            O oK2 = dVar.f219855c.a(str2).a(photoUpload.f216305g).T(new com.avito.android.photo_picker.legacy.service.e(photoUpload, dVar, str), Integer.MAX_VALUE).I(new f(photoUpload, dVar, str)).K(new g(photoUpload, dVar, str));
            InterfaceC35745a5 interfaceC35745a5 = dVar.f219857e;
            return oK2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new h(bVarA, photoUpload)).I(new i(bVarA, photoUpload, dVar)).d0(j.f219878b).g(c.a.class).m0(k.f219879b);
        }
    }

    /* compiled from: ImageUploadServiceDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u00020\u00012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001 \u0004*\r\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\b\u00030\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/photo_picker/legacy/service/c$a;", "", "Lj41/e;", "kotlin.jvm.PlatformType", "eventList", "apply", "(Ljava/util/List;)Lcom/avito/android/photo_picker/legacy/service/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f219863b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ArrayList arrayList = new ArrayList();
            for (T t12 : (List) obj) {
                if (((c.a) t12) instanceof c.a.C6608a) {
                    arrayList.add(t12);
                }
            }
            if (arrayList.isEmpty()) {
                return new c.a.b();
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c.a aVar = (c.a) it.next();
                Collection<Throwable> collection = null;
                c.a.C6608a c6608a = aVar instanceof c.a.C6608a ? (c.a.C6608a) aVar : null;
                if (c6608a != null) {
                    collection = c6608a.f219852a;
                }
                arrayList2.add(collection);
            }
            return new c.a.C6608a(C42745f0.H(C42745f0.C(arrayList2)));
        }
    }

    public d(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k U u12, @Y61.k Q q12, @Y61.k X x12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f219853a = bVar;
        this.f219854b = u12;
        this.f219855c = q12;
        this.f219856d = x12;
        this.f219857e = interfaceC35745a5;
    }

    @Override // com.avito.android.photo_picker.legacy.service.c
    @Y61.k
    public final z<c.a> a(@Y61.k String str, @Y61.l String str2, boolean z12) {
        Long lValueOf = null;
        if (str2 != null) {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str2));
            } catch (NumberFormatException unused) {
            }
        }
        com.avito.android.photo_cache.b bVar = this.f219853a;
        return (lValueOf != null ? bVar.g(lValueOf.longValue(), str) : bVar.a(str)).S().r(a.f219858b).p(b.f219859b).N(new c(z12)).T(new C6609d(str), Integer.MAX_VALUE).H0().r(e.f219863b).F();
    }
}
