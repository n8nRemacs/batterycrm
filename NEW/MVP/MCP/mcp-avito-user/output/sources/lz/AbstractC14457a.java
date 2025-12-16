package Lz;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaSdkAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LLz/a;", "", "<init>", "()V", "a", "b", "c", "LLz/a$a;", "LLz/a$b;", "LLz/a$c;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14457a {

    /* compiled from: EsiaSdkAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/a$a;", "LLz/a;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0652a extends AbstractC14457a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f10318a;

        public C0652a(@k Uri uri) {
            super(null);
            this.f10318a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0652a) && L.f(this.f10318a, ((C0652a) obj).f10318a);
        }

        public final int hashCode() {
            return this.f10318a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("Finish(resultDeeplink="), this.f10318a, ')');
        }
    }

    /* compiled from: EsiaSdkAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/a$b;", "LLz/a;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.a$b */
    public static final /* data */ class b extends AbstractC14457a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10319a;

        public b(@k String str) {
            super(null);
            this.f10319a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10319a, ((b) obj).f10319a);
        }

        public final int hashCode() {
            return this.f10319a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenSdk(authUrl="), this.f10319a, ')');
        }
    }

    /* compiled from: EsiaSdkAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLz/a$c;", "LLz/a;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lz.a$c */
    public static final /* data */ class c extends AbstractC14457a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10320a;

        public c(@k String str) {
            super(null);
            this.f10320a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10320a, ((c) obj).f10320a);
        }

        public final int hashCode() {
            return this.f10320a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendSdkErrorAnalyticsEvent(errorResponse="), this.f10320a, ')');
        }
    }

    public /* synthetic */ AbstractC14457a(C42822w c42822w) {
        this();
    }

    public AbstractC14457a() {
    }
}
