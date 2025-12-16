package com.avito.android.user_adverts.tab_screens.advert_list.progress;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressOverlayItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC9732a f314750b;

    /* compiled from: ProgressOverlayItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.advert_list.progress.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC9732a {

        /* compiled from: ProgressOverlayItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.advert_list.progress.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9733a extends AbstractC9732a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C9733a f314751a = new C9733a();

            public C9733a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9733a);
            }

            public final int hashCode() {
                return -1482934380;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ProgressOverlayItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a$b;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/progress/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.advert_list.progress.a$a$b */
        public static final /* data */ class b extends AbstractC9732a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f314752a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f314753b;

            public b(@k ApiError apiError, @k String str) {
                super(null);
                this.f314752a = str;
                this.f314753b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f314752a, bVar.f314752a) && L.f(this.f314753b, bVar.f314753b);
            }

            public final int hashCode() {
                return this.f314753b.hashCode() + (this.f314752a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Problem(problemText=");
                sb2.append(this.f314752a);
                sb2.append(", apiError=");
                return AK.c.n(sb2, this.f314753b, ')');
            }
        }

        public /* synthetic */ AbstractC9732a(C42822w c42822w) {
            this();
        }

        public AbstractC9732a() {
        }
    }

    public a(@k AbstractC9732a abstractC9732a) {
        this.f314750b = abstractC9732a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f314750b, ((a) obj).f314750b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return getF224291b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF224291b() {
        return "progress_overlay_item";
    }

    public final int hashCode() {
        return this.f314750b.hashCode();
    }

    @k
    public final String toString() {
        return "ProgressOverlayItem(state=" + this.f314750b + ')';
    }
}
