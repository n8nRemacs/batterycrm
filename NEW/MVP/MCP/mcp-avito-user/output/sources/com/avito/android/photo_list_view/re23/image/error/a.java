package com.avito.android.photo_list_view.re23.image.error;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PublishImageErrorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/error/a;", "", "a", "b", "c", "d", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f218245a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f218246b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f218247c;

    /* compiled from: PublishImageErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/error/a$a;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.re23.image.error.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6548a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f218248a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final N f218249b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6548a(@k String str, @k Y41.a<G0> aVar) {
            this.f218248a = str;
            this.f218249b = (N) aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6548a)) {
                return false;
            }
            C6548a c6548a = (C6548a) obj;
            return this.f218248a.equals(c6548a.f218248a) && this.f218249b.equals(c6548a.f218249b);
        }

        public final int hashCode() {
            return this.f218249b.hashCode() + (this.f218248a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(iconName=");
            sb2.append(this.f218248a);
            sb2.append(", listener=");
            return C22026a.d(sb2, this.f218249b, ')');
        }
    }

    /* compiled from: PublishImageErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/error/a$b;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6548a> f218250a;

        public b(@k List<C6548a> list) {
            this.f218250a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218250a, ((b) obj).f218250a);
        }

        public final int hashCode() {
            return this.f218250a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218250a, ')');
        }
    }

    /* compiled from: PublishImageErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/error/a$c;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218251a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218252b;

        public c(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218251a = uri;
            this.f218252b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f218251a, cVar.f218251a) && L.f(this.f218252b, cVar.f218252b);
        }

        public final int hashCode() {
            Uri uri = this.f218251a;
            return this.f218252b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218251a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218252b, ')');
        }
    }

    /* compiled from: PublishImageErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/error/a$d;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218253a;

        public d(@k Y41.a<G0> aVar) {
            this.f218253a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f218253a, ((d) obj).f218253a);
        }

        public final int hashCode() {
            return this.f218253a.hashCode();
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("LabelState(listener="), this.f218253a, ')');
        }
    }

    public a(@k c cVar, @k d dVar, @k b bVar) {
        this.f218245a = cVar;
        this.f218246b = dVar;
        this.f218247c = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218245a, aVar.f218245a) && L.f(this.f218246b, aVar.f218246b) && L.f(this.f218247c, aVar.f218247c);
    }

    public final int hashCode() {
        return this.f218247c.f218250a.hashCode() + r.h(this.f218245a.hashCode() * 31, 31, this.f218246b.f218253a);
    }

    @k
    public final String toString() {
        return "PublishImageErrorState(imageState=" + this.f218245a + ", labelState=" + this.f218246b + ", actionsState=" + this.f218247c + ')';
    }
}
