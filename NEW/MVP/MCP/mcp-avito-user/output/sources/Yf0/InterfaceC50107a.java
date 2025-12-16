package yF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSellerBannersInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LyF0/a;", "", "a", "b", "c", "LyF0/a$a;", "LyF0/a$b;", "LyF0/a$c;", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50107a {

    /* compiled from: TravelSellerBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyF0/a$a;", "LyF0/a;", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12895a implements InterfaceC50107a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f443002a;

        public C12895a(@l ApiError apiError) {
            this.f443002a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12895a) && L.f(this.f443002a, ((C12895a) obj).f443002a);
        }

        public final int hashCode() {
            ApiError apiError = this.f443002a;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(apiError="), this.f443002a, ')');
        }
    }

    /* compiled from: TravelSellerBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyF0/a$b;", "LyF0/a;", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yF0.a$b */
    public static final /* data */ class b implements InterfaceC50107a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final BF0.a f443003a;

        public b(@l BF0.a aVar) {
            this.f443003a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443003a, ((b) obj).f443003a);
        }

        public final int hashCode() {
            BF0.a aVar = this.f443003a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(banner=" + this.f443003a + ')';
        }
    }

    /* compiled from: TravelSellerBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyF0/a$c;", "LyF0/a;", "<init>", "()V", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yF0.a$c */
    public static final /* data */ class c implements InterfaceC50107a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443004a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1459996838;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
