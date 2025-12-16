package com.avito.android.rubricator;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: RubricatorItem.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/rubricator/b;", "Lcom/avito/android/serp/adapter/l1;", "Lis0/h;", "Lqs0/a;", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/rubricator/b$a;", "Lcom/avito/android/rubricator/b$c;", "Lcom/avito/android/rubricator/b$d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class b implements l1, is0.h, InterfaceC47435a {

    /* compiled from: RubricatorItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/b$a;", "Lcom/avito/android/rubricator/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255703b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SerpViewType f255704c;

        /* renamed from: d, reason: collision with root package name */
        public final int f255705d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f255706e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<RubricatorRefinedItem> f255707f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Settings f255708g;

        /* renamed from: h, reason: collision with root package name */
        public final long f255709h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final h.b f255710i;

        public a() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, SerpViewType serpViewType, int i12, String str2, List list, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
            SerpViewType serpViewType2 = (i13 & 2) != 0 ? SerpViewType.f268585e : serpViewType;
            int i14 = (i13 & 4) != 0 ? 6 : i12;
            C42822w c42822w2 = null;
            String str3 = (i13 & 8) != 0 ? null : str2;
            super(c42822w2);
            this.f255703b = str;
            this.f255704c = serpViewType2;
            this.f255705d = i14;
            this.f255706e = str3;
            this.f255707f = list;
            this.f255708g = settings;
            this.f255709h = getF250882b().hashCode();
            this.f255710i = new h.b("rubricatorWidget", "Категории и сервисы", null, null, null, analytics, 28, null);
        }

        @Override // qs0.InterfaceC47435a
        @l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF269269z() {
            return this.f255708g;
        }

        @Override // com.avito.android.serp.adapter.i1
        /* renamed from: getSpanCount, reason: from getter */
        public final int getF269246c() {
            return this.f255705d;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250882b() {
            return this.f255703b;
        }

        @Override // com.avito.android.rubricator.b
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF255725e() {
            return this.f255706e;
        }

        @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
        /* renamed from: getTrackId, reason: from getter */
        public final long getF73007f() {
            return this.f255709h;
        }

        @Override // com.avito.android.serp.adapter.l1
        @k
        /* renamed from: getViewType, reason: from getter */
        public final SerpViewType getF269244A() {
            return this.f255704c;
        }

        @Override // is0.h
        @k
        /* renamed from: q1, reason: from getter */
        public final h.b getF105219h() {
            return this.f255710i;
        }
    }

    /* compiled from: RubricatorItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rubricator/b$b;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "WIDGET_TARGET_PAGE", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rubricator.b$b, reason: collision with other inner class name */
    public static final class C7655b {
        public /* synthetic */ C7655b(C42822w c42822w) {
            this();
        }

        public C7655b() {
        }
    }

    /* compiled from: RubricatorItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/b$c;", "Lcom/avito/android/rubricator/b;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255711b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SerpViewType f255712c;

        /* renamed from: d, reason: collision with root package name */
        public final int f255713d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a f255714e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f255715f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<RubricatorRefinedItem> f255716g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Settings f255717h;

        /* renamed from: i, reason: collision with root package name */
        public final long f255718i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final h.b f255719j;

        /* compiled from: RubricatorItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/b$c$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Integer f255720a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f255721b;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f255720a, aVar.f255720a) && L.f(this.f255721b, aVar.f255721b);
            }

            public final int hashCode() {
                Integer num = this.f255720a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f255721b;
                return iHashCode + (num2 != null ? num2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ServiceItemSettings(columnCount=");
                sb2.append(this.f255720a);
                sb2.append(", tabletColumnCount=");
                return s.j(sb2, this.f255721b, ')');
            }

            public a(@l Integer num, @l Integer num2) {
                this.f255720a = num;
                this.f255721b = num2;
            }

            public /* synthetic */ a(Integer num, Integer num2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
            }
        }

        public c() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(String str, SerpViewType serpViewType, int i12, a aVar, String str2, List list, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
            SerpViewType serpViewType2 = (i13 & 2) != 0 ? SerpViewType.f268585e : serpViewType;
            int i14 = (i13 & 4) != 0 ? 6 : i12;
            C42822w c42822w2 = null;
            a aVar2 = (i13 & 8) != 0 ? null : aVar;
            String str3 = (i13 & 16) != 0 ? null : str2;
            super(c42822w2);
            this.f255711b = str;
            this.f255712c = serpViewType2;
            this.f255713d = i14;
            this.f255714e = aVar2;
            this.f255715f = str3;
            this.f255716g = list;
            this.f255717h = settings;
            this.f255718i = getF250882b().hashCode();
            this.f255719j = new h.b("rubricatorWidget", "Категории и сервисы", null, null, null, analytics, 28, null);
        }

        @Override // qs0.InterfaceC47435a
        @l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF269269z() {
            return this.f255717h;
        }

        @Override // com.avito.android.serp.adapter.i1
        /* renamed from: getSpanCount, reason: from getter */
        public final int getF269246c() {
            return this.f255713d;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250882b() {
            return this.f255711b;
        }

        @Override // com.avito.android.rubricator.b
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF255725e() {
            return this.f255715f;
        }

        @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
        /* renamed from: getTrackId, reason: from getter */
        public final long getF73007f() {
            return this.f255718i;
        }

        @Override // com.avito.android.serp.adapter.l1
        @k
        /* renamed from: getViewType, reason: from getter */
        public final SerpViewType getF269244A() {
            return this.f255712c;
        }

        @Override // is0.h
        @k
        /* renamed from: q1, reason: from getter */
        public final h.b getF105219h() {
            return this.f255719j;
        }
    }

    /* compiled from: RubricatorItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/b$d;", "Lcom/avito/android/rubricator/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f255722b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SerpViewType f255723c;

        /* renamed from: d, reason: collision with root package name */
        public final int f255724d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f255725e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<RubricatorRefinedItem> f255726f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final RubricatorRefinedItem.SerpRubricatorLinearServiceItem f255727g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Settings f255728h;

        /* renamed from: i, reason: collision with root package name */
        public final long f255729i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final h.b f255730j;

        public d() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(String str, SerpViewType serpViewType, int i12, String str2, List list, RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
            SerpViewType serpViewType2 = (i13 & 2) != 0 ? SerpViewType.f268585e : serpViewType;
            int i14 = (i13 & 4) != 0 ? 6 : i12;
            C42822w c42822w2 = null;
            String str3 = (i13 & 8) != 0 ? null : str2;
            RubricatorRefinedItem.SerpRubricatorLinearServiceItem serpRubricatorLinearServiceItem2 = (i13 & 32) != 0 ? null : serpRubricatorLinearServiceItem;
            super(c42822w2);
            this.f255722b = str;
            this.f255723c = serpViewType2;
            this.f255724d = i14;
            this.f255725e = str3;
            this.f255726f = list;
            this.f255727g = serpRubricatorLinearServiceItem2;
            this.f255728h = settings;
            this.f255729i = getF250882b().hashCode();
            this.f255730j = new h.b("rubricatorWidget", "Категории и сервисы", null, null, null, analytics, 28, null);
        }

        @Override // qs0.InterfaceC47435a
        @l
        /* renamed from: getSettings, reason: from getter */
        public final Settings getF269269z() {
            return this.f255728h;
        }

        @Override // com.avito.android.serp.adapter.i1
        /* renamed from: getSpanCount, reason: from getter */
        public final int getF269246c() {
            return this.f255724d;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250882b() {
            return this.f255722b;
        }

        @Override // com.avito.android.rubricator.b
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF255725e() {
            return this.f255725e;
        }

        @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
        /* renamed from: getTrackId, reason: from getter */
        public final long getF73007f() {
            return this.f255729i;
        }

        @Override // com.avito.android.serp.adapter.l1
        @k
        /* renamed from: getViewType, reason: from getter */
        public final SerpViewType getF269244A() {
            return this.f255723c;
        }

        @Override // is0.h
        @k
        /* renamed from: q1, reason: from getter */
        public final h.b getF105219h() {
            return this.f255730j;
        }
    }

    static {
        new C7655b(null);
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @l
    /* renamed from: getTitle */
    public abstract String getF255725e();

    public b() {
    }
}
