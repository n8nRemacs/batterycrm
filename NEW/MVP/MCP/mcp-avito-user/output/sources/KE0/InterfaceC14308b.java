package Ke0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergedPretendPremoderationInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LKe0/b;", "", "a", "b", "c", "d", "e", "LKe0/b$a;", "LKe0/b$b;", "LKe0/b$c;", "LKe0/b$d;", "LKe0/b$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ke0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14308b {

    /* compiled from: MergedPretendPremoderationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/b$a;", "LKe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.b$a */
    public static final /* data */ class a implements InterfaceC14308b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9578a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f9579b;

        public a(@k DeepLink deepLink, @l Bundle bundle) {
            this.f9578a = deepLink;
            this.f9579b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f9578a, aVar.f9578a) && L.f(this.f9579b, aVar.f9579b);
        }

        public final int hashCode() {
            int iHashCode = this.f9578a.hashCode() * 31;
            Bundle bundle = this.f9579b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f9578a);
            sb2.append(", arguments=");
            return H.m(sb2, this.f9579b, ')');
        }
    }

    /* compiled from: MergedPretendPremoderationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/b$b;", "LKe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0587b implements InterfaceC14308b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertDuplicateResult f9580a;

        public C0587b(@k AdvertDuplicateResult advertDuplicateResult) {
            this.f9580a = advertDuplicateResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0587b) && L.f(this.f9580a, ((C0587b) obj).f9580a);
        }

        public final int hashCode() {
            return this.f9580a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDuplicate(body=" + this.f9580a + ')';
        }
    }

    /* compiled from: MergedPretendPremoderationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/b$c;", "LKe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.b$c */
    public static final /* data */ class c implements InterfaceC14308b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9581a;

        public c(@k String str) {
            this.f9581a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9581a, ((c) obj).f9581a);
        }

        public final int hashCode() {
            return this.f9581a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(message="), this.f9581a, ')');
        }
    }

    /* compiled from: MergedPretendPremoderationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKe0/b$d;", "LKe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.b$d */
    public static final /* data */ class d implements InterfaceC14308b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f9582a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 560225618;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: MergedPretendPremoderationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/b$e;", "LKe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.b$e */
    public static final /* data */ class e implements InterfaceC14308b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertProactiveModerationResult.WrongCategorySuggest f9583a;

        public e(@k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
            this.f9583a = wrongCategorySuggest;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f9583a, ((e) obj).f9583a);
        }

        public final int hashCode() {
            return this.f9583a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowWrongCategory(body=" + this.f9583a + ')';
        }
    }
}
