package com.avito.android.photo_list_view.re23.image.content;

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

/* compiled from: PublishImageContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a;", "", "a", "b", "c", "d", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f218225a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f218226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f218227c;

    /* compiled from: PublishImageContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$a;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.re23.image.content.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6546a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218228a;

        public C6546a(@k Y41.a aVar) {
            this.f218228a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6546a)) {
                return false;
            }
            C6546a c6546a = (C6546a) obj;
            c6546a.getClass();
            return this.f218228a.equals(c6546a.f218228a);
        }

        public final int hashCode() {
            return this.f218228a.hashCode() + 96359222;
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("Action(iconName=edit, listener="), this.f218228a, ')');
        }
    }

    /* compiled from: PublishImageContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$b;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6546a> f218229a;

        public b(@k List<C6546a> list) {
            this.f218229a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218229a, ((b) obj).f218229a);
        }

        public final int hashCode() {
            return this.f218229a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218229a, ')');
        }
    }

    /* compiled from: PublishImageContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$c;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218230a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218231b;

        public c(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218230a = uri;
            this.f218231b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f218230a, cVar.f218230a) && L.f(this.f218231b, cVar.f218231b);
        }

        public final int hashCode() {
            Uri uri = this.f218230a;
            return this.f218231b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218230a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218231b, ')');
        }
    }

    /* compiled from: PublishImageContentState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$d;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_list_view/re23/image/content/a$d$a;", "Lcom/avito/android/photo_list_view/re23/image/content/a$d$b;", "Lcom/avito/android/photo_list_view/re23/image/content/a$d$c;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: PublishImageContentState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$d$a;", "Lcom/avito/android/photo_list_view/re23/image/content/a$d;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.re23.image.content.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C6547a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f218232a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218233b;

            public C6547a(@k String str, @k Y41.a<G0> aVar) {
                super(null);
                this.f218232a = str;
                this.f218233b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6547a)) {
                    return false;
                }
                C6547a c6547a = (C6547a) obj;
                return L.f(this.f218232a, c6547a.f218232a) && L.f(this.f218233b, c6547a.f218233b);
            }

            public final int hashCode() {
                return this.f218233b.hashCode() + (this.f218232a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(groupTitle=");
                sb2.append(this.f218232a);
                sb2.append(", listener=");
                return r.v(sb2, this.f218233b, ')');
            }
        }

        /* compiled from: PublishImageContentState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$d$b;", "Lcom/avito/android/photo_list_view/re23/image/content/a$d;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f218234a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2082649133;
            }

            @k
            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: PublishImageContentState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/a$d$c;", "Lcom/avito/android/photo_list_view/re23/image/content/a$d;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f218235a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -713557965;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    public a(@k c cVar, @k d dVar, @k b bVar) {
        this.f218225a = cVar;
        this.f218226b = dVar;
        this.f218227c = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218225a, aVar.f218225a) && L.f(this.f218226b, aVar.f218226b) && L.f(this.f218227c, aVar.f218227c);
    }

    public final int hashCode() {
        return this.f218227c.f218229a.hashCode() + ((this.f218226b.hashCode() + (this.f218225a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "PublishImageContentState(imageState=" + this.f218225a + ", labelState=" + this.f218226b + ", actionsState=" + this.f218227c + ')';
    }
}
