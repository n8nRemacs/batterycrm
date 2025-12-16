package yq0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortAdvicesEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyq0/b;", "", "a", "b", "Lyq0/b$a;", "Lyq0/b$b;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50282b {

    /* compiled from: ShortAdvicesEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/b$a;", "Lyq0/b;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.b$a */
    public static final /* data */ class a implements InterfaceC50282b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443511a;

        public a(@k DeepLink deepLink) {
            this.f443511a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443511a, ((a) obj).f443511a);
        }

        public final int hashCode() {
            return this.f443511a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f443511a, ')');
        }
    }

    /* compiled from: ShortAdvicesEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/b$b;", "Lyq0/b;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12920b implements InterfaceC50282b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443512a;

        public C12920b(@k String str) {
            this.f443512a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12920b) {
                return L.f(this.f443512a, ((C12920b) obj).f443512a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f443512a.hashCode() * 31) + 316091513;
        }

        @k
        public final String toString() {
            return AK.c.s(new StringBuilder("OpenHintDetails(hintId="), this.f443512a, ", openPlace=from_widget)");
        }
    }
}
