package yC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LyC0/b;", "", "a", "b", "c", "LyC0/b$a;", "LyC0/b$b;", "LyC0/b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50100b {

    /* compiled from: CptInfoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/b$a;", "LyC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.b$a */
    public static final /* data */ class a implements InterfaceC50100b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442975a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 82006289;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CptInfoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/b$b;", "LyC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12893b implements InterfaceC50100b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442976a;

        public C12893b(@k DeepLink deepLink) {
            this.f442976a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12893b) && L.f(this.f442976a, ((C12893b) obj).f442976a);
        }

        public final int hashCode() {
            return this.f442976a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f442976a, ')');
        }
    }

    /* compiled from: CptInfoV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/b$c;", "LyC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.b$c */
    public static final /* data */ class c implements InterfaceC50100b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f442977a;

        public c(@k Throwable th2) {
            this.f442977a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f442977a, ((c) obj).f442977a);
        }

        public final int hashCode() {
            return this.f442977a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f442977a, ')');
        }
    }
}
