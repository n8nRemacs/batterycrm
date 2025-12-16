package com.avito.android.image.enhancement;

import android.net.Uri;
import com.avito.android.util.InterfaceC35745a5;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.ResponseBody;

/* compiled from: ImageEnhanceInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/e;", "Lcom/avito/android/image/enhancement/d;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.image.enhancement.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30974e implements InterfaceC30973d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f169352a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30970a f169353b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image.enhancement.files.e f169354c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image.enhancement.files.a f169355d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30975f f169356e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image.enhancement.files.c f169357f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, io.reactivex.rxjava3.subjects.b<C30977h>> f169358g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, String> f169359h = new ConcurrentHashMap<>();

    /* compiled from: ImageEnhanceInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "it", "Lio/reactivex/rxjava3/core/O;", "Lokhttp3/ResponseBody;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.e$a */
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C30974e.this.f169353b.a(com.avito.http.b.a((File) obj, 3));
        }
    }

    /* compiled from: ImageEnhanceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/io/File;", "it", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.e$b */
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C30974e.this.f169355d.d(((ResponseBody) obj).byteStream());
        }
    }

    /* compiled from: ImageEnhanceInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "it", "Lkotlin/G0;", "accept", "(Ljava/io/File;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.e$c */
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f169363c;

        public c(String str) {
            this.f169363c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C30974e.this.f169354c.a((File) obj, this.f169363c);
        }
    }

    /* compiled from: ImageEnhanceInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "it", "Lkotlin/Q;", "Landroid/net/Uri;", "", "apply", "(Ljava/io/File;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.e$d */
    public static final class d<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f169365c;

        public d(String str) {
            this.f169365c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new kotlin.Q(Uri.fromFile((File) obj), C30974e.this.f169359h.get(this.f169365c));
        }
    }

    public C30974e(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC30970a interfaceC30970a, @Y61.k com.avito.android.image.enhancement.files.e eVar, @Y61.k com.avito.android.image.enhancement.files.a aVar, @Y61.k InterfaceC30975f interfaceC30975f, @Y61.k com.avito.android.image.enhancement.files.c cVar) {
        this.f169352a = interfaceC35745a5;
        this.f169353b = interfaceC30970a;
        this.f169354c = eVar;
        this.f169355d = aVar;
        this.f169356e = interfaceC30975f;
        this.f169357f = cVar;
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    public final void a(@Y61.k String str) {
        this.f169356e.b(str);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    public final void b(@Y61.k String str, @Y61.k String str2) {
        this.f169359h.put(str, str2);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    public final boolean c(@Y61.k String str) {
        return this.f169356e.a(str);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    @Y61.k
    public final io.reactivex.rxjava3.core.I d(@Y61.k Uri uri, @Y61.k String str) {
        io.reactivex.rxjava3.core.I iB2;
        File file = this.f169354c.getFile(str);
        if (file != null) {
            return io.reactivex.rxjava3.core.I.q(new kotlin.Q(Uri.fromFile(file), this.f169359h.get(str)));
        }
        String scheme = uri.getScheme();
        InterfaceC35745a5 interfaceC35745a5 = this.f169352a;
        com.avito.android.image.enhancement.files.a aVar = this.f169355d;
        if (scheme == null || !C43066x.h0(scheme, "http", false)) {
            iB2 = aVar.b(uri);
        } else {
            File fileC = aVar.c(uri);
            if (fileC != null) {
                iB2 = io.reactivex.rxjava3.core.I.q(fileC);
            } else {
                iB2 = this.f169357f.a(uri, aVar.a()).s(interfaceC35745a5.a());
            }
        }
        return iB2.s(interfaceC35745a5.a()).n(new a()).r(new b()).k(new c(str)).r(new d(str)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(1, uri, str));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b e(@Y61.k String str) {
        return h(str);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    public final synchronized void f(@Y61.k String str, @Y61.k Y41.l<? super C30977h, C30977h> lVar) {
        io.reactivex.rxjava3.subjects.b<C30977h> bVarH = h(str);
        C30977h c30977hP0 = bVarH.P0();
        try {
            c30977hP0 = lVar.invoke(bVarH.P0());
        } catch (Exception unused) {
        }
        bVarH.onNext(c30977hP0);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30973d
    @Y61.l
    public final C30977h g(@Y61.k String str) {
        return h(str).P0();
    }

    public final synchronized io.reactivex.rxjava3.subjects.b<C30977h> h(String str) {
        io.reactivex.rxjava3.subjects.b<C30977h> bVarN0;
        bVarN0 = this.f169358g.get(str);
        if (bVarN0 == null) {
            bVarN0 = io.reactivex.rxjava3.subjects.b.N0();
            this.f169358g.put(str, bVarN0);
        }
        return bVarN0;
    }
}
