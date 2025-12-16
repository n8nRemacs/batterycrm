package qt0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SbDateItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lqt0/d;", "Lcom/avito/conveyor_item/a;", "Lqt0/a;", "a", "b", "c", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47440d implements com.avito.conveyor_item.a, InterfaceC47437a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429411b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f429412c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<a, c> f429413d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f429414e;

    /* compiled from: SbDateItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/d$a;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.d$a */
    public static final /* data */ class a implements com.avito.conveyor_item.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f429415b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f429416c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Date f429417d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f429418e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f429419f;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k Date date, boolean z12, boolean z13) {
            this.f429415b = str;
            this.f429416c = str2;
            this.f429417d = date;
            this.f429418e = z12;
            this.f429419f = z13;
        }

        public static a a(a aVar, boolean z12) {
            String str = aVar.f429415b;
            String str2 = aVar.f429416c;
            Date date = aVar.f429417d;
            boolean z13 = aVar.f429419f;
            aVar.getClass();
            return new a(str, str2, date, z12, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429415b, aVar.f429415b) && L.f(this.f429416c, aVar.f429416c) && L.f(this.f429417d, aVar.f429417d) && this.f429418e == aVar.f429418e && this.f429419f == aVar.f429419f;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return getF429395b().hashCode();
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429395b() {
            return this.f429415b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f429419f) + r.i(m.f(this.f429417d, H.d(this.f429415b.hashCode() * 31, 31, this.f429416c), 31), 31, this.f429418e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateTimeItem(stringId=");
            sb2.append(this.f429415b);
            sb2.append(", paramId=");
            sb2.append(this.f429416c);
            sb2.append(", date=");
            sb2.append(this.f429417d);
            sb2.append(", isSelected=");
            sb2.append(this.f429418e);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f429419f, ')');
        }
    }

    /* compiled from: SbDateItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/d$b;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.d$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f429420a;

        /* renamed from: b, reason: collision with root package name */
        public final int f429421b;

        public b(int i12, int i13) {
            this.f429420a = i12;
            this.f429421b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f429420a == bVar.f429420a && this.f429421b == bVar.f429421b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f429421b) + (Integer.hashCode(this.f429420a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollPosition(from=");
            sb2.append(this.f429420a);
            sb2.append(", to=");
            return r.t(sb2, this.f429421b, ')');
        }
    }

    /* compiled from: SbDateItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lqt0/d$c;", "", "b", "c", "d", "e", "Lqt0/d$c$b;", "Lqt0/d$c$c;", "Lqt0/d$c$d;", "Lqt0/d$c$e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.d$c */
    public interface c {

        /* compiled from: SbDateItem.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.d$c$a */
        public static final class a {
            @Y61.k
            public static c a(@Y61.k c cVar, @Y61.k Y41.l<? super a, a> lVar) {
                C12339c c12339c = cVar instanceof C12339c ? (C12339c) cVar : null;
                if (c12339c == null) {
                    return cVar;
                }
                List<a> list = c12339c.f429423a;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(lVar.invoke((a) it.next()));
                }
                return new C12339c(arrayList);
            }
        }

        /* compiled from: SbDateItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/d$c$b;", "Lqt0/d$c;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.d$c$b */
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Throwable f429422a;

            public b(@l Throwable th2) {
                this.f429422a = th2;
            }

            @Override // qt0.C47440d.c
            @Y61.k
            public final c a(@Y61.k Y41.l<? super a, a> lVar) {
                return a.a(this, lVar);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f429422a, ((b) obj).f429422a);
            }

            public final int hashCode() {
                Throwable th2 = this.f429422a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f429422a, ')');
            }
        }

        /* compiled from: SbDateItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/d$c$c;", "Lqt0/d$c;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.d$c$c, reason: collision with other inner class name */
        public static final /* data */ class C12339c implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<a> f429423a;

            public C12339c(@Y61.k List<a> list) {
                this.f429423a = list;
            }

            @Override // qt0.C47440d.c
            @Y61.k
            public final c a(@Y61.k Y41.l<? super a, a> lVar) {
                return a.a(this, lVar);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12339c) && L.f(this.f429423a, ((C12339c) obj).f429423a);
            }

            public final int hashCode() {
                return this.f429423a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("Loaded(slots="), this.f429423a, ')');
            }
        }

        /* compiled from: SbDateItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqt0/d$c$d;", "Lqt0/d$c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.d$c$d, reason: collision with other inner class name */
        public static final class C12340d implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12340d f429424a = new C12340d();

            @Override // qt0.C47440d.c
            @Y61.k
            public final c a(@Y61.k Y41.l<? super a, a> lVar) {
                return a.a(this, lVar);
            }
        }

        /* compiled from: SbDateItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqt0/d$c$e;", "Lqt0/d$c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.d$c$e */
        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f429425a = new e();

            @Override // qt0.C47440d.c
            @Y61.k
            public final c a(@Y61.k Y41.l<? super a, a> lVar) {
                return a.a(this, lVar);
            }
        }

        @Y61.k
        c a(@Y61.k Y41.l<? super a, a> lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47440d(@Y61.k String str, @l String str2, @Y61.k Map<a, ? extends c> map, @l b bVar) {
        this.f429411b = str;
        this.f429412c = str2;
        this.f429413d = map;
        this.f429414e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C47440d b(C47440d c47440d, LinkedHashMap linkedHashMap, b bVar, int i12) {
        String str = c47440d.f429411b;
        String str2 = c47440d.f429412c;
        Map map = linkedHashMap;
        if ((i12 & 4) != 0) {
            map = c47440d.f429413d;
        }
        if ((i12 & 8) != 0) {
            bVar = c47440d.f429414e;
        }
        c47440d.getClass();
        return new C47440d(str, str2, map, bVar);
    }

    @Override // qt0.InterfaceC47437a
    public final <T extends InterfaceC47437a> boolean a(@l List<? extends T> list) {
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC47437a interfaceC47437a = (InterfaceC47437a) next;
                if ((interfaceC47437a instanceof C47440d) && L.f(((C47440d) interfaceC47437a).f429411b, this.f429411b)) {
                    obj = next;
                    break;
                }
            }
            obj = (InterfaceC47437a) obj;
        }
        return !L.f(((C47440d) obj).f429413d, this.f429413d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47440d)) {
            return false;
        }
        C47440d c47440d = (C47440d) obj;
        return L.f(this.f429411b, c47440d.f429411b) && L.f(this.f429412c, c47440d.f429412c) && L.f(this.f429413d, c47440d.f429413d) && L.f(this.f429414e, c47440d.f429414e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF429395b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429395b() {
        return this.f429411b;
    }

    public final int hashCode() {
        int iHashCode = this.f429411b.hashCode() * 31;
        String str = this.f429412c;
        int iC2 = AK.c.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f429413d);
        b bVar = this.f429414e;
        return iC2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "SbDateItem(stringId=" + this.f429411b + ", title=" + this.f429412c + ", timeSlotsByDate=" + this.f429413d + ", scrollPosition=" + this.f429414e + ')';
    }
}
