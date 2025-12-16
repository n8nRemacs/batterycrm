package com.avito.android.photo_list_view_groups.image_with_group_error;

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

/* compiled from: ImageWithGroupErrorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/a;", "", "a", "b", "c", "d", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f218580a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f218581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f218582c;

    /* compiled from: ImageWithGroupErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/a$a;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view_groups.image_with_group_error.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6562a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f218583a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final N f218584b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6562a(@k String str, @k Y41.a<G0> aVar) {
            this.f218583a = str;
            this.f218584b = (N) aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6562a)) {
                return false;
            }
            C6562a c6562a = (C6562a) obj;
            return this.f218583a.equals(c6562a.f218583a) && this.f218584b.equals(c6562a.f218584b);
        }

        public final int hashCode() {
            return this.f218584b.hashCode() + (this.f218583a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(iconName=");
            sb2.append(this.f218583a);
            sb2.append(", listener=");
            return C22026a.d(sb2, this.f218584b, ')');
        }
    }

    /* compiled from: ImageWithGroupErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/a$b;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6562a> f218585a;

        public b(@k List<C6562a> list) {
            this.f218585a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218585a, ((b) obj).f218585a);
        }

        public final int hashCode() {
            return this.f218585a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218585a, ')');
        }
    }

    /* compiled from: ImageWithGroupErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/a$c;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218586a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218587b;

        public c(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218586a = uri;
            this.f218587b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f218586a, cVar.f218586a) && L.f(this.f218587b, cVar.f218587b);
        }

        public final int hashCode() {
            Uri uri = this.f218586a;
            return this.f218587b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218586a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218587b, ')');
        }
    }

    /* compiled from: ImageWithGroupErrorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/a$d;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218588a;

        public d(@k Y41.a<G0> aVar) {
            this.f218588a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f218588a, ((d) obj).f218588a);
        }

        public final int hashCode() {
            return this.f218588a.hashCode();
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("LabelState(listener="), this.f218588a, ')');
        }
    }

    public a(@k c cVar, @k d dVar, @k b bVar) {
        this.f218580a = cVar;
        this.f218581b = dVar;
        this.f218582c = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218580a, aVar.f218580a) && L.f(this.f218581b, aVar.f218581b) && L.f(this.f218582c, aVar.f218582c);
    }

    public final int hashCode() {
        return this.f218582c.f218585a.hashCode() + r.h(this.f218580a.hashCode() * 31, 31, this.f218581b.f218588a);
    }

    @k
    public final String toString() {
        return "ImageWithGroupErrorState(imageState=" + this.f218580a + ", labelState=" + this.f218581b + ", actionsState=" + this.f218582c + ')';
    }
}
