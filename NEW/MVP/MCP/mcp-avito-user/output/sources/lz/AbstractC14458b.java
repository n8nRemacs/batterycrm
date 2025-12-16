package Lz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaSdkInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LLz/b;", "", "<init>", "()V", "a", "b", "c", "d", "LLz/b$a;", "LLz/b$b;", "LLz/b$c;", "LLz/b$d;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14458b {

    /* compiled from: EsiaSdkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLz/b$a;", "LLz/b;", "<init>", "()V", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.b$a */
    public static final /* data */ class a extends AbstractC14458b {
        static {
            new a();
        }

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 382660560;
        }

        @k
        public final String toString() {
            return "Content";
        }
    }

    /* compiled from: EsiaSdkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLz/b$b;", "LLz/b;", "<init>", "()V", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0653b extends AbstractC14458b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0653b f10321a = new C0653b();

        public C0653b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0653b);
        }

        public final int hashCode() {
            return 1102802401;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: EsiaSdkInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/b$c;", "LLz/b;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.b$c */
    public static final /* data */ class c extends AbstractC14458b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10322a;

        public c(@k String str) {
            super(null);
            this.f10322a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10322a, ((c) obj).f10322a);
        }

        public final int hashCode() {
            return this.f10322a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenSdk(authUrl="), this.f10322a, ')');
        }
    }

    /* compiled from: EsiaSdkInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/b$d;", "LLz/b;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.b$d */
    public static final /* data */ class d extends AbstractC14458b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10323a;

        public d(@k String str) {
            super(null);
            this.f10323a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f10323a, ((d) obj).f10323a);
        }

        public final int hashCode() {
            return this.f10323a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendSdkErrorAnalyticsEvent(errorResponse="), this.f10323a, ')');
        }
    }

    public /* synthetic */ AbstractC14458b(C42822w c42822w) {
        this();
    }

    public AbstractC14458b() {
    }
}
