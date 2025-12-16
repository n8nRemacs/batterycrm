package com.avito.android.photo_list_view_groups.image_with_group_loading;

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

/* compiled from: ImageWithGroupLoadingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a;", "", "a", "b", "c", "d", "e", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f218600a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f218601b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f218602c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f218603d;

    /* compiled from: ImageWithGroupLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$a;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view_groups.image_with_group_loading.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6563a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218604a;

        public C6563a(@k Y41.a aVar) {
            this.f218604a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6563a)) {
                return false;
            }
            C6563a c6563a = (C6563a) obj;
            c6563a.getClass();
            return this.f218604a.equals(c6563a.f218604a);
        }

        public final int hashCode() {
            return this.f218604a.hashCode() + 96359222;
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("Action(iconName=edit, listener="), this.f218604a, ')');
        }
    }

    /* compiled from: ImageWithGroupLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$b;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6563a> f218605a;

        public b(@k List<C6563a> list) {
            this.f218605a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218605a, ((b) obj).f218605a);
        }

        public final int hashCode() {
            return this.f218605a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218605a, ')');
        }
    }

    /* compiled from: ImageWithGroupLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$c;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* compiled from: ImageWithGroupLoadingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$d;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218606a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218607b;

        public d(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218606a = uri;
            this.f218607b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f218606a, dVar.f218606a) && L.f(this.f218607b, dVar.f218607b);
        }

        public final int hashCode() {
            Uri uri = this.f218606a;
            return this.f218607b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218606a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218607b, ')');
        }
    }

    /* compiled from: ImageWithGroupLoadingState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$a;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$b;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$c;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: ImageWithGroupLoadingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$a;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view_groups.image_with_group_loading.a$e$a, reason: collision with other inner class name */
        public static final /* data */ class C6564a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f218608a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218609b;

            public C6564a(@k String str, @k Y41.a<G0> aVar) {
                super(null);
                this.f218608a = str;
                this.f218609b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6564a)) {
                    return false;
                }
                C6564a c6564a = (C6564a) obj;
                return L.f(this.f218608a, c6564a.f218608a) && L.f(this.f218609b, c6564a.f218609b);
            }

            public final int hashCode() {
                return this.f218609b.hashCode() + (this.f218608a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(groupTitle=");
                sb2.append(this.f218608a);
                sb2.append(", listener=");
                return r.v(sb2, this.f218609b, ')');
            }
        }

        /* compiled from: ImageWithGroupLoadingState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$b;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e;", "<init>", "()V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f218610a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1247085342;
            }

            @k
            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: ImageWithGroupLoadingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e$c;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a$e;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218611a;

            public c(@k Y41.a<G0> aVar) {
                super(null);
                this.f218611a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f218611a, ((c) obj).f218611a);
            }

            public final int hashCode() {
                return this.f218611a.hashCode();
            }

            @k
            public final String toString() {
                return r.v(new StringBuilder("Initial(listener="), this.f218611a, ')');
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    public a(@k d dVar, @k c cVar, @k e eVar, @k b bVar) {
        this.f218600a = dVar;
        this.f218601b = cVar;
        this.f218602c = eVar;
        this.f218603d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218600a, aVar.f218600a) && L.f(this.f218601b, aVar.f218601b) && L.f(this.f218602c, aVar.f218602c) && L.f(this.f218603d, aVar.f218603d);
    }

    public final int hashCode() {
        return this.f218603d.f218605a.hashCode() + ((this.f218602c.hashCode() + r.d(0.5f, this.f218600a.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "ImageWithGroupLoadingState(imageState=" + this.f218600a + ", imageSkeletonState=" + this.f218601b + ", labelState=" + this.f218602c + ", actionsState=" + this.f218603d + ')';
    }
}
