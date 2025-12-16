package Z60;

import Y61.k;
import Y61.l;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZ60/c;", "", "a", "b", "c", "d", "e", "LZ60/c$a;", "LZ60/c$b;", "LZ60/c$c;", "LZ60/c$d;", "LZ60/c$e;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: BannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ60/c$a;", "LZ60/c;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Close(bannerItemId=null)";
        }
    }

    /* compiled from: BannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ60/c$b;", "LZ60/c;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BannerContext f19921a;

        public b(@k BannerContext bannerContext) {
            this.f19921a = bannerContext;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f19921a, ((b) obj).f19921a);
        }

        public final int hashCode() {
            return this.f19921a.hashCode();
        }

        @k
        public final String toString() {
            return "ContextChange(context=" + this.f19921a + ')';
        }
    }

    /* compiled from: BannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ60/c$c;", "LZ60/c;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Z60.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1421c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y60.b f19922a;

        public C1421c(@k Y60.b bVar) {
            this.f19922a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1421c) && L.f(this.f19922a, ((C1421c) obj).f19922a);
        }

        public final int hashCode() {
            return this.f19922a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingResult(response=" + this.f19922a + ')';
        }
    }

    /* compiled from: BannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ60/c$d;", "LZ60/c;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f19923a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1052700766;
        }

        @k
        public final String toString() {
            return "LoadingStart";
        }
    }

    /* compiled from: BannerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ60/c$e;", "LZ60/c;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f19924a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1158102185;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }
}
