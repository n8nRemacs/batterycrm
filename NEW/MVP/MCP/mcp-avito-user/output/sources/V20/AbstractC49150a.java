package v20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationAction.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lv20/a;", "", "<init>", "()V", "a", "b", "c", "Lv20/a$a;", "Lv20/a$b;", "Lv20/a$c;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC49150a {

    /* compiled from: MotivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv20/a$a;", "Lv20/a;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v20.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12742a extends AbstractC49150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440400a;

        public C12742a(@k DeepLink deepLink) {
            super(null);
            this.f440400a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12742a) && L.f(this.f440400a, ((C12742a) obj).f440400a);
        }

        public final int hashCode() {
            return this.f440400a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ButtonClick(deeplink="), this.f440400a, ')');
        }
    }

    /* compiled from: MotivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv20/a$b;", "Lv20/a;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v20.a$b */
    public static final /* data */ class b extends AbstractC49150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440401a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1199433162;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: MotivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv20/a$c;", "Lv20/a;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v20.a$c */
    public static final /* data */ class c extends AbstractC49150a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f440402a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1185784090;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    public /* synthetic */ AbstractC49150a(C42822w c42822w) {
        this();
    }

    public AbstractC49150a() {
    }
}
