package com.avito.android.photo_list_view.re23.image.loading;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishImageLoadingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a;", "", "a", "b", "c", "d", "e", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f218265a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f218266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f218267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f218268d;

    /* compiled from: PublishImageLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$a;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.re23.image.loading.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6549a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218269a;

        public C6549a(@k Y41.a aVar) {
            this.f218269a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6549a)) {
                return false;
            }
            C6549a c6549a = (C6549a) obj;
            c6549a.getClass();
            return this.f218269a.equals(c6549a.f218269a);
        }

        public final int hashCode() {
            return this.f218269a.hashCode() + 96359222;
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("Action(iconName=edit, listener="), this.f218269a, ')');
        }
    }

    /* compiled from: PublishImageLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$b;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6549a> f218270a;

        public b(@k List<C6549a> list) {
            this.f218270a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218270a, ((b) obj).f218270a);
        }

        public final int hashCode() {
            return this.f218270a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218270a, ')');
        }
    }

    /* compiled from: PublishImageLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$c;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return Float.compare(0.5f, 0.5f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(0.5f);
        }

        @k
        public final String toString() {
            return "ImageSkeletonState(alpha=0.5)";
        }
    }

    /* compiled from: PublishImageLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$d;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218271a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218272b;

        public d(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218271a = uri;
            this.f218272b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f218271a, dVar.f218271a) && L.f(this.f218272b, dVar.f218272b);
        }

        public final int hashCode() {
            Uri uri = this.f218271a;
            return this.f218272b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218271a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218272b, ')');
        }
    }

    /* compiled from: PublishImageLoadingState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e$a;", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e$b;", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e$c;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: PublishImageLoadingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$e$a;", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.re23.image.loading.a$e$a, reason: collision with other inner class name */
        public static final /* data */ class C6550a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f218273a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218274b;

            public C6550a(@k String str, @k Y41.a<G0> aVar) {
                super(null);
                this.f218273a = str;
                this.f218274b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6550a)) {
                    return false;
                }
                C6550a c6550a = (C6550a) obj;
                return L.f(this.f218273a, c6550a.f218273a) && L.f(this.f218274b, c6550a.f218274b);
            }

            public final int hashCode() {
                return this.f218274b.hashCode() + (this.f218273a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(groupTitle=");
                sb2.append(this.f218273a);
                sb2.append(", listener=");
                return r.v(sb2, this.f218274b, ')');
            }
        }

        /* compiled from: PublishImageLoadingState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$e$b;", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f218275a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 762907405;
            }

            @k
            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: PublishImageLoadingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/loading/a$e$c;", "Lcom/avito/android/photo_list_view/re23/image/loading/a$e;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218276a;

            public c(@k Y41.a<G0> aVar) {
                super(null);
                this.f218276a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f218276a, ((c) obj).f218276a);
            }

            public final int hashCode() {
                return this.f218276a.hashCode();
            }

            @k
            public final String toString() {
                return r.v(new StringBuilder("Initial(listener="), this.f218276a, ')');
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    public a(@k d dVar, @k c cVar, @k e eVar, @k b bVar) {
        this.f218265a = dVar;
        this.f218266b = cVar;
        this.f218267c = eVar;
        this.f218268d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218265a, aVar.f218265a) && L.f(this.f218266b, aVar.f218266b) && L.f(this.f218267c, aVar.f218267c) && L.f(this.f218268d, aVar.f218268d);
    }

    public final int hashCode() {
        return this.f218268d.f218270a.hashCode() + ((this.f218267c.hashCode() + r.d(0.5f, this.f218265a.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "PublishImageLoadingState(imageState=" + this.f218265a + ", imageSkeletonState=" + this.f218266b + ", labelState=" + this.f218267c + ", actionsState=" + this.f218268d + ')';
    }
}
