package Iz;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LIz/a;", "", "<init>", "()V", "a", "b", "c", "d", "LIz/a$a;", "LIz/a$b;", "LIz/a$c;", "LIz/a$d;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14176a {

    /* compiled from: EsiaRedirectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/a$a;", "LIz/a;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0497a extends AbstractC14176a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0497a f8666a = new C0497a();

        public C0497a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0497a);
        }

        public final int hashCode() {
            return 2032434137;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EsiaRedirectAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIz/a$b;", "LIz/a;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.a$b */
    public static final /* data */ class b extends AbstractC14176a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8667a;

        public b(@k DeepLink deepLink) {
            super(null);
            this.f8667a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f8667a, ((b) obj).f8667a);
        }

        public final int hashCode() {
            return this.f8667a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnButtonClick(deeplink="), this.f8667a, ')');
        }
    }

    /* compiled from: EsiaRedirectAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIz/a$c;", "LIz/a;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.a$c */
    public static final /* data */ class c extends AbstractC14176a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8668a;

        public c(@k DeepLink deepLink) {
            super(null);
            this.f8668a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f8668a, ((c) obj).f8668a);
        }

        public final int hashCode() {
            return this.f8668a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnSupportButtonClick(deeplink="), this.f8668a, ')');
        }
    }

    /* compiled from: EsiaRedirectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/a$d;", "LIz/a;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.a$d */
    public static final /* data */ class d extends AbstractC14176a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f8669a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -822002564;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    public /* synthetic */ AbstractC14176a(C42822w c42822w) {
        this();
    }

    public AbstractC14176a() {
    }
}
