package Md;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionDetailsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMd/a;", "", "a", "b", "c", "d", "LMd/a$a;", "LMd/a$b;", "LMd/a$c;", "LMd/a$d;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Md.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14470a {

    /* compiled from: AuctionDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/a$a;", "LMd/a;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.a$a, reason: collision with other inner class name */
    public static final class C0689a implements InterfaceC14470a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0689a f10911a = new C0689a();
    }

    /* compiled from: AuctionDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/a$b;", "LMd/a;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.a$b */
    public static final /* data */ class b implements InterfaceC14470a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10912a;

        public b(@k DeepLink deepLink) {
            this.f10912a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10912a, ((b) obj).f10912a);
        }

        public final int hashCode() {
            return this.f10912a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f10912a, ')');
        }
    }

    /* compiled from: AuctionDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMd/a$c;", "LMd/a;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.a$c */
    public static final class c implements InterfaceC14470a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f10913a = new c();
    }

    /* compiled from: AuctionDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMd/a$d;", "LMd/a;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Md.a$d */
    public static final /* data */ class d implements InterfaceC14470a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10914a;

        public d(@k String str) {
            this.f10914a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10914a, ((d) obj).f10914a);
        }

        public final int hashCode() {
            return this.f10914a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkClicked(url="), this.f10914a, ')');
        }
    }
}
