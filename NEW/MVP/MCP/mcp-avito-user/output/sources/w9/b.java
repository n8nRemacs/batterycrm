package W9;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsCampaignV2.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LW9/b;", "LSK0/c;", "a", "b", "c", "LW9/b$a;", "LW9/b$b;", "LW9/b$c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class b implements SK0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17809a;

    /* compiled from: AdvertDetailsCampaignV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW9/b$a;", "LW9/b;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f17810b = new a();

        public a() {
            super("product_card_call_ended", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -124282774;
        }

        @k
        public final String toString() {
            return "AfterCall";
        }
    }

    /* compiled from: AdvertDetailsCampaignV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW9/b$b;", "LW9/b;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W9.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1259b extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1259b f17811b = new C1259b();

        public C1259b() {
            super("product_card_closed", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1259b);
        }

        public final int hashCode() {
            return 2121291784;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: AdvertDetailsCampaignV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW9/b$c;", "LW9/b;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f17812b = new c();

        public c() {
            super("product_card_opened", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1177168442;
        }

        @k
        public final String toString() {
            return "Open";
        }
    }

    public b(String str, C42822w c42822w) {
        this.f17809a = str;
    }

    @Override // SK0.c
    @k
    /* renamed from: a, reason: from getter */
    public final String getF17809a() {
        return this.f17809a;
    }
}
