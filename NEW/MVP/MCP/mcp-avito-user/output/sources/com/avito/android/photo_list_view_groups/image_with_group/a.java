package com.avito.android.photo_list_view_groups.image_with_group;

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

/* compiled from: ImageWithGroupContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a;", "", "a", "b", "c", "d", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f218560a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f218561b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f218562c;

    /* compiled from: ImageWithGroupContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$a;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view_groups.image_with_group.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6560a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218563a;

        public C6560a(@k Y41.a aVar) {
            this.f218563a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6560a)) {
                return false;
            }
            C6560a c6560a = (C6560a) obj;
            c6560a.getClass();
            return this.f218563a.equals(c6560a.f218563a);
        }

        public final int hashCode() {
            return this.f218563a.hashCode() + 96359222;
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("Action(iconName=edit, listener="), this.f218563a, ')');
        }
    }

    /* compiled from: ImageWithGroupContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$b;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C6560a> f218564a;

        public b(@k List<C6560a> list) {
            this.f218564a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f218564a, ((b) obj).f218564a);
        }

        public final int hashCode() {
            return this.f218564a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ActionsState(actions="), this.f218564a, ')');
        }
    }

    /* compiled from: ImageWithGroupContentState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$c;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Uri f218565a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Y41.a<G0> f218566b;

        public c(@l Uri uri, @k Y41.a<G0> aVar) {
            this.f218565a = uri;
            this.f218566b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f218565a, cVar.f218565a) && L.f(this.f218566b, cVar.f218566b);
        }

        public final int hashCode() {
            Uri uri = this.f218565a;
            return this.f218566b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageState(uri=");
            sb2.append(this.f218565a);
            sb2.append(", listener=");
            return r.v(sb2, this.f218566b, ')');
        }
    }

    /* compiled from: ImageWithGroupContentState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$d;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$a;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$b;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$c;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: ImageWithGroupContentState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$a;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view_groups.image_with_group.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C6561a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f218567a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Y41.a<G0> f218568b;

            public C6561a(@k String str, @k Y41.a<G0> aVar) {
                super(null);
                this.f218567a = str;
                this.f218568b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6561a)) {
                    return false;
                }
                C6561a c6561a = (C6561a) obj;
                return L.f(this.f218567a, c6561a.f218567a) && L.f(this.f218568b, c6561a.f218568b);
            }

            public final int hashCode() {
                return this.f218568b.hashCode() + (this.f218567a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(groupTitle=");
                sb2.append(this.f218567a);
                sb2.append(", listener=");
                return r.v(sb2, this.f218568b, ')');
            }
        }

        /* compiled from: ImageWithGroupContentState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$b;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d;", "<init>", "()V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f218569a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 414116126;
            }

            @k
            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: ImageWithGroupContentState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/a$d$c;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a$d;", "<init>", "()V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f218570a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -623246264;
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
        this.f218560a = cVar;
        this.f218561b = dVar;
        this.f218562c = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f218560a, aVar.f218560a) && L.f(this.f218561b, aVar.f218561b) && L.f(this.f218562c, aVar.f218562c);
    }

    public final int hashCode() {
        return this.f218562c.f218564a.hashCode() + ((this.f218561b.hashCode() + (this.f218560a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ImageWithGroupContentState(imageState=" + this.f218560a + ", labelState=" + this.f218561b + ", actionsState=" + this.f218562c + ')';
    }
}
