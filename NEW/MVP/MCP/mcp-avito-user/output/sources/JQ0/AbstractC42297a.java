package jQ0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancyAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LjQ0/a;", "", "<init>", "()V", "a", "b", "c", "LjQ0/a$a;", "LjQ0/a$b;", "LjQ0/a$c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42297a {

    /* compiled from: AppliesToVacancyAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjQ0/a$a;", "LjQ0/a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jQ0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11564a extends AbstractC42297a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f405604a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f405605b;

        /* JADX WARN: Illegal instructions before constructor call */
        public C11564a(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            C42822w c42822w2 = null;
            bundle = (i12 & 2) != 0 ? null : bundle;
            super(c42822w2);
            this.f405604a = deepLink;
            this.f405605b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11564a)) {
                return false;
            }
            C11564a c11564a = (C11564a) obj;
            return L.f(this.f405604a, c11564a.f405604a) && L.f(this.f405605b, c11564a.f405605b);
        }

        public final int hashCode() {
            int iHashCode = this.f405604a.hashCode() * 31;
            Bundle bundle = this.f405605b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowDeeplink(deepLink=");
            sb2.append(this.f405604a);
            sb2.append(", args=");
            return H.m(sb2, this.f405605b, ')');
        }
    }

    /* compiled from: AppliesToVacancyAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjQ0/a$b;", "LjQ0/a;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jQ0.a$b */
    public static final class b extends AbstractC42297a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405606a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: AppliesToVacancyAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjQ0/a$c;", "LjQ0/a;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jQ0.a$c */
    public static final class c extends AbstractC42297a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f405607a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC42297a(C42822w c42822w) {
        this();
    }

    public AbstractC42297a() {
    }
}
