package com.avito.android.image.enhancement;

import Fc1.E0;
import android.net.Uri;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.Y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.internal.operators.single.g0;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/j;", "Lcom/avito/android/image/enhancement/i;", "a", "b", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.image.enhancement.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30979j implements InterfaceC30978i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f169378a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f169379b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30973d f169380c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f169381d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f169382e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169383f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169384g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public C30977h f169385h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ImagesEnhancementSlotConfig f169386i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f169387j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<C30977h> f169388k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<String> f169389l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<b> f169390m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<a> f169391n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<PrintableText> f169392o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f169393p;

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/image/enhancement/j$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/image/enhancement/j$a$a;", "Lcom/avito/android/image/enhancement/j$a$b;", "Lcom/avito/android/image/enhancement/j$a$c;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.j$a */
    public static abstract class a {

        /* compiled from: ImageEnhanceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/j$a$a;", "Lcom/avito/android/image/enhancement/j$a;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image.enhancement.j$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5009a extends a {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5009a)) {
                    return false;
                }
                ((C5009a) obj).getClass();
                return kotlin.jvm.internal.L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "Error(errorText=null)";
            }
        }

        /* compiled from: ImageEnhanceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/j$a$b;", "Lcom/avito/android/image/enhancement/j$a;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image.enhancement.j$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f169394a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f169395b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Y41.a<G0> f169396c;

            public b(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2) {
                super(null);
                this.f169394a = str;
                this.f169395b = str2;
                this.f169396c = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f169394a, bVar.f169394a) && kotlin.jvm.internal.L.f(this.f169395b, bVar.f169395b) && kotlin.jvm.internal.L.f(this.f169396c, bVar.f169396c);
            }

            public final int hashCode() {
                return this.f169396c.hashCode() + androidx.compose.foundation.H.d(this.f169394a.hashCode() * 31, 31, this.f169395b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loading(title=");
                sb2.append(this.f169394a);
                sb2.append(", cancelText=");
                sb2.append(this.f169395b);
                sb2.append(", onCancel=");
                return androidx.appcompat.app.r.v(sb2, this.f169396c, ')');
            }
        }

        /* compiled from: ImageEnhanceViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/j$a$c;", "Lcom/avito/android/image/enhancement/j$a;", "<init>", "()V", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image.enhancement.j$a$c */
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f169397a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 796102663;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/image/enhancement/j$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/image/enhancement/j$b$a;", "Lcom/avito/android/image/enhancement/j$b$b;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.j$b */
    public static abstract class b {

        /* compiled from: ImageEnhanceViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/j$b$a;", "Lcom/avito/android/image/enhancement/j$b;", "<init>", "()V", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image.enhancement.j$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f169398a = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -953237345;
            }

            @Y61.k
            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: ImageEnhanceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image/enhancement/j$b$b;", "Lcom/avito/android/image/enhancement/j$b;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image.enhancement.j$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5010b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f169399a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f169400b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Y41.a<G0> f169401c;

            public C5010b(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2) {
                super(null);
                this.f169399a = str;
                this.f169400b = str2;
                this.f169401c = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5010b)) {
                    return false;
                }
                C5010b c5010b = (C5010b) obj;
                return kotlin.jvm.internal.L.f(this.f169399a, c5010b.f169399a) && kotlin.jvm.internal.L.f(this.f169400b, c5010b.f169400b) && kotlin.jvm.internal.L.f(this.f169401c, c5010b.f169401c);
            }

            public final int hashCode() {
                return this.f169401c.hashCode() + androidx.compose.foundation.H.d(this.f169399a.hashCode() * 31, 31, this.f169400b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Visible(text=");
                sb2.append(this.f169399a);
                sb2.append(", buttonText=");
                sb2.append(this.f169400b);
                sb2.append(", onShow=");
                return androidx.appcompat.app.r.v(sb2, this.f169401c, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lcom/avito/android/remote/model/CloseableDataSource;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.j$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f169402b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Y.a((CloseableDataSource) obj);
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<List<? extends PhotoUpload>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C30979j f169403l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C30977h f169404m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C30977h c30977h, C30979j c30979j) {
            super(1);
            this.f169403l = c30979j;
            this.f169404m = c30977h;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends PhotoUpload> list) {
            Iterator<? extends PhotoUpload> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C30979j c30979j = this.f169403l;
                if (!zHasNext) {
                    c30979j.f169380c.f(c30979j.f169379b, new C(this.f169404m));
                    return G0.f406611a;
                }
                PhotoUpload next = it.next();
                if (next.f216311m == EnhanceState.f216288d) {
                    String str = next.f216309k;
                    String str2 = next.f216304f;
                    if (str != null && str2 != null) {
                        c30979j.f169380c.b(str, str2);
                    }
                    Uri uri = next.f216310l;
                    if (uri == null) {
                        uri = next.f216305g;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                    c30979j.f169381d.h(c30979j.f169379b, PhotoUpload.a(next, str2, uri, null, null, null, EnhanceState.f216287c, 1999));
                }
            }
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lcom/avito/android/remote/model/CloseableDataSource;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.j$e */
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f169405b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Y.a((CloseableDataSource) obj);
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00040\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lio/reactivex/rxjava3/core/I;", "Lj41/e;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$f */
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x000d A[SYNTHETIC] */
        @Override // l41.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object apply(java.lang.Object r7) {
            /*
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            Ld:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L47
                java.lang.Object r1 = r7.next()
                com.avito.android.photo_cache.PhotoUpload r1 = (com.avito.android.photo_cache.PhotoUpload) r1
                com.avito.android.photo_cache.EnhanceState r2 = r1.f216311m
                boolean r2 = r2.f216292b
                if (r2 == 0) goto L24
                io.reactivex.rxjava3.internal.operators.single.M r1 = io.reactivex.rxjava3.core.I.q(r1)
                goto L40
            L24:
                r2 = 0
                java.lang.String r3 = r1.f216304f
                if (r3 != 0) goto L2a
                goto L41
            L2a:
                android.net.Uri r4 = r1.f216305g
                if (r4 != 0) goto L2f
                goto L41
            L2f:
                com.avito.android.image.enhancement.j r2 = com.avito.android.image.enhancement.C30979j.this
                com.avito.android.image.enhancement.d r5 = r2.f169380c
                io.reactivex.rxjava3.core.I r4 = r5.d(r4, r3)
                com.avito.android.image.enhancement.D r5 = new com.avito.android.image.enhancement.D
                r5.<init>(r3, r2, r1)
                io.reactivex.rxjava3.internal.operators.single.O r1 = r4.r(r5)
            L40:
                r2 = r1
            L41:
                if (r2 == 0) goto Ld
                r0.add(r2)
                goto Ld
            L47:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.image.enhancement.C30979j.f.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00000\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/photo_cache/PhotoUpload;", "Lj41/e;", "requests", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f169407b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return io.reactivex.rxjava3.core.I.H((List) obj, E.f169335b);
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on enhance images", th2);
            C30979j.this.c();
            return G0.f406611a;
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "updatedPhotos", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<List<? extends PhotoUpload>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C30979j f169409l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C30977h f169410m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C30977h c30977h, C30979j c30979j) {
            super(1);
            this.f169409l = c30979j;
            this.f169410m = c30977h;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends PhotoUpload> list) {
            C30979j c30979j;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c30979j = this.f169409l;
                if (!zHasNext) {
                    break;
                }
                c30979j.f169381d.h(c30979j.f169379b, (PhotoUpload) it.next());
            }
            c30979j.f169380c.f(c30979j.f169379b, new F(this.f169410m));
            c30979j.c();
            Y41.a<G0> aVar = c30979j.f169382e;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/h;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/image/enhancement/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$j, reason: collision with other inner class name */
    public static final class C5011j<T> implements l41.g {
        public C5011j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C30977h c30977h = (C30977h) obj;
            C30979j c30979j = C30979j.this;
            c30979j.f169385h = c30977h;
            c30979j.f169388k.onNext(c30977h);
            c30979j.f169383f.b(A1.g(c30979j.f169381d.a(c30979j.f169379b).x0(c30979j.f169378a.a()).d0(O.f169348b).S(), null, new P(c30979j), 1));
            c30979j.e();
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$k */
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f169412b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error on observe image-enhance state", (Throwable) obj);
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C30979j c30979j = C30979j.this;
            c30979j.f169384g.e();
            c30979j.f169393p.set(0);
            c30979j.f169391n.onNext(a.c.f169397a);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/CloseableDataSource;", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/CloseableDataSource;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$m */
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Uri uri;
            ImagesEnhancementSlotConfig.Onboarding onboarding;
            String onceShowId;
            CloseableDataSource closeableDataSource = (CloseableDataSource) obj;
            C30979j c30979j = C30979j.this;
            InterfaceC30973d interfaceC30973d = c30979j.f169380c;
            String str = c30979j.f169379b;
            C30977h c30977hG = interfaceC30973d.g(str);
            if (c30977hG == null && (c30977hG = c30979j.f169385h) == null) {
                return;
            }
            ArrayList arrayListA = Y.a(closeableDataSource);
            if (arrayListA.isEmpty()) {
                interfaceC30973d.f(str, new C30982m(c30977hG, c30979j));
            }
            if (!arrayListA.isEmpty()) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    if (((PhotoUpload) it.next()).f216304f == null) {
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = arrayListA.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                PhotoUpload photoUpload = (PhotoUpload) next;
                if (photoUpload.f216304f != null && (photoUpload.f216308j != null || photoUpload.f216305g != null)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (c30977hG.f169373a) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((PhotoUpload) it3.next()).f216311m == EnhanceState.f216287c) {
                        }
                    }
                }
                interfaceC30973d.f(str, new C30984o(c30977hG));
                return;
            }
            interfaceC30973d.f(str, new C30983n(c30977hG, c30979j));
            ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = c30979j.f169386i;
            if (imagesEnhancementSlotConfig != null && (onboarding = imagesEnhancementSlotConfig.getOnboarding()) != null && (onceShowId = onboarding.getOnceShowId()) != null) {
                io.reactivex.rxjava3.subjects.b<b> bVar = c30979j.f169390m;
                if (!(bVar.P0() instanceof b.C5010b) && !interfaceC30973d.c(onceShowId)) {
                    String description = onboarding.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    String buttonTitle = onboarding.getButtonTitle();
                    bVar.onNext(new b.C5010b(new N(c30979j, onceShowId), description, buttonTitle != null ? buttonTitle : ""));
                }
            }
            if (c30977hG.f169374b) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (((PhotoUpload) next2).f216311m != EnhanceState.f216289e) {
                        arrayList2.add(next2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (((PhotoUpload) next3).f216310l == null) {
                        arrayList3.add(next3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = arrayList3.iterator();
                while (true) {
                    io.reactivex.rxjava3.internal.operators.single.O oR2 = null;
                    if (!it6.hasNext()) {
                        break;
                    }
                    PhotoUpload photoUpload2 = (PhotoUpload) it6.next();
                    String str2 = photoUpload2.f216304f;
                    if (str2 != null && (uri = photoUpload2.f216305g) != null) {
                        oR2 = interfaceC30973d.d(uri, str2).r(new r(str2, c30979j, photoUpload2));
                    }
                    if (oR2 != null) {
                        arrayList4.add(oR2);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                g0 g0VarH = io.reactivex.rxjava3.core.I.H(arrayList4, C30985p.f169425b);
                InterfaceC35745a5 interfaceC35745a5 = c30979j.f169378a;
                c30979j.f169384g.b(A1.g(new C42017o(g0VarH.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new C30986q(c30979j)), new E0(c30979j, 27)), null, new C30981l(c30977hG, c30979j), 1));
            }
        }
    }

    /* compiled from: ImageEnhanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.image.enhancement.j$n */
    public static final class n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final n<T> f169415b = new n<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.e("Failed on observe images list", null);
        }
    }

    public C30979j(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k String str, @Y61.k InterfaceC30973d interfaceC30973d, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.l Y41.a<G0> aVar) {
        this.f169378a = interfaceC35745a5;
        this.f169379b = str;
        this.f169380c = interfaceC30973d;
        this.f169381d = bVar;
        this.f169382e = aVar;
        this.f169383f = new io.reactivex.rxjava3.disposables.c();
        this.f169384g = new io.reactivex.rxjava3.disposables.c();
        this.f169388k = io.reactivex.rxjava3.subjects.b.O0(new C30977h(false, false, false, null, null, 24, null));
        this.f169389l = io.reactivex.rxjava3.subjects.b.N0();
        this.f169390m = io.reactivex.rxjava3.subjects.b.N0();
        this.f169391n = io.reactivex.rxjava3.subjects.b.O0(a.c.f169397a);
        this.f169392o = new io.reactivex.rxjava3.subjects.e<>();
        this.f169393p = new AtomicInteger();
    }

    public static final void a(C30979j c30979j) {
        ImagesEnhancementSlotConfig.LoadingOverlay loadingOverlay;
        String errorTitle;
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = c30979j.f169386i;
        if (imagesEnhancementSlotConfig == null) {
            C30977h c30977h = c30979j.f169385h;
            imagesEnhancementSlotConfig = c30977h != null ? c30977h.f169376d : null;
            if (imagesEnhancementSlotConfig == null) {
                C30977h c30977hG = c30979j.f169380c.g(c30979j.f169379b);
                imagesEnhancementSlotConfig = c30977hG != null ? c30977hG.f169376d : null;
            }
        }
        if (imagesEnhancementSlotConfig == null || (loadingOverlay = imagesEnhancementSlotConfig.getLoadingOverlay()) == null || (errorTitle = loadingOverlay.getErrorTitle()) == null) {
            return;
        }
        c30979j.f169392o.onNext(com.avito.android.printable_text.b.f(errorTitle));
    }

    public static final void b(ArrayList arrayList, C30979j c30979j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c30979j.f169381d.h(c30979j.f169379b, PhotoUpload.a((PhotoUpload) it.next(), null, null, null, null, null, null, 3583));
        }
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final I0 B0() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.subjects.b<a> bVar = this.f169391n;
        bVar.getClass();
        return bVar.y(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f169378a.e());
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final U C0(@Y61.k HashMap map) {
        return this.f169381d.a(this.f169379b).x0(this.f169378a.a()).S().r(v.f169434b).n(new y(map, this)).k(new A(this)).r(B.f169330b).u(new com.avito.android.analytics.clickstream.I(5));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final void D0(@Y61.k LinkedHashSet linkedHashSet) {
        this.f169383f.b(A1.e(this.f169381d.a(this.f169379b).x0(this.f169378a.a()).S().r(s.f169430b), t.f169431l, new u(linkedHashSet, this)));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final void E0() {
        this.f169383f.b(this.f169380c.e(this.f169379b).j0(this.f169378a.e()).v0(new C5011j(), k.f169412b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final void F0(@Y61.k ArrayList arrayList) {
        C30977h c30977h = this.f169385h;
        if (c30977h == null) {
            return;
        }
        this.f169380c.f(this.f169379b, new G(c30977h, arrayList));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final I0 G0() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.rxjava3.subjects.b<b> bVar = this.f169390m;
        bVar.getClass();
        return bVar.z(1L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f169378a.e());
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final boolean H0(boolean z12) {
        C30977h c30977h = this.f169385h;
        if (c30977h == null) {
            return false;
        }
        String str = this.f169379b;
        com.avito.android.photo_cache.b bVar = this.f169381d;
        io.reactivex.rxjava3.disposables.c cVar = this.f169383f;
        if (z12) {
            d();
            cVar.b(A1.e(bVar.a(str).x0(this.f169378a.a()).S().r(e.f169405b).r(new f()).n(g.f169407b), new h(), new i(c30977h, this)));
        } else {
            cVar.b(A1.g(bVar.a(str).S().r(c.f169402b), null, new d(c30977h, this), 1));
        }
        return true;
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final void I0(@Y61.k ImagesEnhancementSlotConfig imagesEnhancementSlotConfig) {
        if (this.f169385h == null && this.f169386i == null) {
            this.f169386i = imagesEnhancementSlotConfig;
            this.f169385h = new C30977h(false, imagesEnhancementSlotConfig.getMainToggle().getEnabled(), true, imagesEnhancementSlotConfig, null, 16, null);
            e();
        }
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final C42026y J0(@Y61.k String str, boolean z12) {
        return this.f169381d.a(this.f169379b).x0(this.f169378a.a()).S().r(H.f169339b).r(new I(str)).n(new M(z12, this));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final void K() {
        this.f169387j = false;
        this.f169383f.e();
        this.f169384g.e();
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    public final boolean K0(@Y61.k List<Long> list) {
        ArrayList arrayListA = Y.a((CloseableDataSource) this.f169381d.a(this.f169379b).S().e());
        if (arrayListA.size() != list.size()) {
            b(arrayListA, this);
            return true;
        }
        Iterator it = arrayListA.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (!kotlin.jvm.internal.L.f(((PhotoUpload) next).f216309k, String.valueOf(list.get(i12).longValue()))) {
                b(arrayListA, this);
                return true;
            }
            i12 = i13;
        }
        return false;
    }

    public final void c() {
        if (this.f169393p.decrementAndGet() == 0) {
            this.f169391n.onNext(a.c.f169397a);
        }
    }

    public final void d() {
        ImagesEnhancementSlotConfig.LoadingOverlay loadingOverlay;
        this.f169393p.incrementAndGet();
        io.reactivex.rxjava3.subjects.b<a> bVar = this.f169391n;
        if (bVar.P0() instanceof a.b) {
            return;
        }
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = this.f169386i;
        a.b bVar2 = (imagesEnhancementSlotConfig == null || (loadingOverlay = imagesEnhancementSlotConfig.getLoadingOverlay()) == null) ? null : new a.b(new l(), loadingOverlay.getProcessTitle(), loadingOverlay.getCancelButtonTitle());
        if (bVar2 != null) {
            bVar.onNext(bVar2);
        }
    }

    public final void e() {
        if (this.f169387j || this.f169386i == null) {
            return;
        }
        this.f169387j = true;
        io.reactivex.rxjava3.core.z<CloseableDataSource<? extends PhotoUpload>> zVarA = this.f169381d.a(this.f169379b);
        InterfaceC35745a5 interfaceC35745a5 = this.f169378a;
        this.f169383f.b(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new m(), n.f169415b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final I0 getError() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.subjects.e<PrintableText> eVar = this.f169392o;
        eVar.getClass();
        return eVar.y(500L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f169378a.e());
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final I0 getState() {
        return this.f169388k.j0(this.f169378a.e());
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30978i
    @Y61.k
    public final I0 w() {
        return this.f169389l.j0(this.f169378a.e());
    }

    public /* synthetic */ C30979j(InterfaceC35745a5 interfaceC35745a5, String str, InterfaceC30973d interfaceC30973d, com.avito.android.photo_cache.b bVar, Y41.a aVar, int i12, C42822w c42822w) {
        this(interfaceC35745a5, str, interfaceC30973d, bVar, (i12 & 16) != 0 ? null : aVar);
    }
}
