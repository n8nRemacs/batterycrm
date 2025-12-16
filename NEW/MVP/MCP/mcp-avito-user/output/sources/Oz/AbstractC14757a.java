package Oz;

import Y61.k;
import Y61.l;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaWebViewAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LOz/a;", "", "<init>", "()V", "a", "b", "LOz/a$a;", "LOz/a$b;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14757a {

    /* compiled from: EsiaWebViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOz/a$a;", "LOz/a;", "<init>", "()V", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oz.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0823a extends AbstractC14757a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0823a f12743a = new C0823a();

        public C0823a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0823a);
        }

        public final int hashCode() {
            return -1124376956;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: EsiaWebViewAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOz/a$b;", "LOz/a;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oz.a$b */
    public static final /* data */ class b extends AbstractC14757a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f12744a;

        public b(@k Uri uri) {
            super(null);
            this.f12744a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f12744a, ((b) obj).f12744a);
        }

        public final int hashCode() {
            return this.f12744a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("Finish(resultDeeplink="), this.f12744a, ')');
        }
    }

    public /* synthetic */ AbstractC14757a(C42822w c42822w) {
        this();
    }

    public AbstractC14757a() {
    }
}
