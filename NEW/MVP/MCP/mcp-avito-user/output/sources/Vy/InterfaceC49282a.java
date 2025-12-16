package vY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MasterPlanAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LvY/a;", "", "a", "b", "c", "d", "e", "LvY/a$a;", "LvY/a$b;", "LvY/a$c;", "LvY/a$d;", "LvY/a$e;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49282a {

    /* compiled from: MasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvY/a$a;", "LvY/a;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.a$a, reason: collision with other inner class name */
    public static final class C12779a implements InterfaceC49282a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12779a f440825a = new C12779a();
    }

    /* compiled from: MasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvY/a$b;", "LvY/a;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.a$b */
    public static final class b implements InterfaceC49282a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440826a = new b();
    }

    /* compiled from: MasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvY/a$c;", "LvY/a;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.a$c */
    public static final /* data */ class c implements InterfaceC49282a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440827a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f440828b;

        public c(@k DeepLink deepLink, @k String str) {
            this.f440827a = deepLink;
            this.f440828b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f440827a, cVar.f440827a) && L.f(this.f440828b, cVar.f440828b);
        }

        public final int hashCode() {
            return this.f440828b.hashCode() + (this.f440827a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoItemClicked(deepLink=");
            sb2.append(this.f440827a);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f440828b, ')');
        }
    }

    /* compiled from: MasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvY/a$d;", "LvY/a;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.a$d */
    public static final class d implements InterfaceC49282a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440829a = new d();
    }

    /* compiled from: MasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvY/a$e;", "LvY/a;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vY.a$e */
    public static final /* data */ class e implements InterfaceC49282a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MasterPlanPin f440830a;

        /* renamed from: b, reason: collision with root package name */
        public final float f440831b;

        public e(@k MasterPlanPin masterPlanPin, float f12) {
            this.f440830a = masterPlanPin;
            this.f440831b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f440830a, eVar.f440830a) && Float.compare(this.f440831b, eVar.f440831b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f440831b) + (this.f440830a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PinClicked(pin=");
            sb2.append(this.f440830a);
            sb2.append(", scroll=");
            return r.k(')', this.f440831b, sb2);
        }
    }
}
