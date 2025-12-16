package hm;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleAlert.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lhm/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lhm/a$a;", "Lhm/a$b;", "Lhm/a$c;", "Lhm/a$d;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC40959a {

    /* compiled from: CampaignsSaleAlert.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhm/a$a;", "Lhm/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11276a extends AbstractC40959a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f397403a;

        public C11276a(@k String str) {
            super(null);
            this.f397403a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11276a) && L.f(this.f397403a, ((C11276a) obj).f397403a);
        }

        public final int hashCode() {
            return this.f397403a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteBlockAlert(uuid="), this.f397403a, ')');
        }
    }

    /* compiled from: CampaignsSaleAlert.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhm/a$b;", "Lhm/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm.a$b */
    public static final /* data */ class b extends AbstractC40959a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f397404a;

        public b(@k String str) {
            super(null);
            this.f397404a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f397404a, ((b) obj).f397404a);
        }

        public final int hashCode() {
            return this.f397404a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteSingleBlockAlert(uuid="), this.f397404a, ')');
        }
    }

    /* compiled from: CampaignsSaleAlert.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhm/a$c;", "Lhm/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm.a$c */
    public static final class c extends AbstractC40959a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f397405a = new c();

        public c() {
            super(null);
        }
    }

    /* compiled from: CampaignsSaleAlert.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhm/a$d;", "Lhm/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm.a$d */
    public static final class d extends AbstractC40959a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f397406a = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC40959a(C42822w c42822w) {
        this();
    }

    public AbstractC40959a() {
    }
}
