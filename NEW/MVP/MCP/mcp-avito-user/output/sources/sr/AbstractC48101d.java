package sR;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequestState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LsR/d;", "", "<init>", "()V", "a", "b", "c", "LsR/d$a;", "LsR/d$b;", "LsR/d$c;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sR.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC48101d {

    /* compiled from: LegalRequestState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/d$a;", "LsR/d;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.d$a */
    public static final /* data */ class a extends AbstractC48101d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final D f437659a;

        public a(@k D d12) {
            super(null);
            this.f437659a = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f437659a, ((a) obj).f437659a);
        }

        public final int hashCode() {
            return this.f437659a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(rendererState=" + this.f437659a + ')';
        }
    }

    /* compiled from: LegalRequestState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/d$b;", "LsR/d;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.d$b */
    public static final /* data */ class b extends AbstractC48101d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f437660a;

        public b(@k Throwable th2) {
            super(null);
            this.f437660a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437660a, ((b) obj).f437660a);
        }

        public final int hashCode() {
            return this.f437660a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f437660a, ')');
        }
    }

    /* compiled from: LegalRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsR/d$c;", "LsR/d;", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.d$c */
    public static final class c extends AbstractC48101d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f437661a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC48101d(C42822w c42822w) {
        this();
    }

    public AbstractC48101d() {
    }
}
