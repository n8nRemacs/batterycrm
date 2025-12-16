package com.avito.beduin.v2.avito.component.image.state;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/q;", "Lcom/avito/beduin/v2/avito/component/image/state/k;", "a", "b", "c", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<b, c> f334432a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<b, c> f334433b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Scale f334434c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final s f334435d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final s f334436e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f334437f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f334438g;

    /* compiled from: Content.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/q$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f334439a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final c f334440b;

        public a(@Y61.k b bVar, @Y61.l c cVar) {
            this.f334439a = bVar;
            this.f334440b = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f334439a, aVar.f334439a) && L.f(this.f334440b, aVar.f334440b);
        }

        public final int hashCode() {
            int iHashCode = this.f334439a.hashCode() * 31;
            c cVar = this.f334440b;
            return iHashCode + (cVar == null ? 0 : cVar.f334444a.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ImgEntry(size=" + this.f334439a + ", uri=" + this.f334440b + ')';
        }
    }

    /* compiled from: Content.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/q$b;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f334441c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f334442a;

        /* renamed from: b, reason: collision with root package name */
        public final int f334443b;

        /* compiled from: Content.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/q$b$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            int i12 = 0;
            this(i12, i12, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f334442a == bVar.f334442a && this.f334443b == bVar.f334443b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f334443b) + (Integer.hashCode(this.f334442a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.f334442a);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f334443b, ')');
        }

        public b(int i12, int i13) {
            this.f334442a = i12;
            this.f334443b = i13;
        }

        public /* synthetic */ b(int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
        }
    }

    /* compiled from: Content.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/q$c;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334444a;

        public c(@Y61.k String str) {
            this.f334444a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f334444a, ((c) obj).f334444a);
        }

        public final int hashCode() {
            return this.f334444a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Uri(value="), this.f334444a, ')');
        }
    }

    /* compiled from: Content.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LET0/a;", "Lcom/avito/beduin/v2/avito/component/image/state/q$a;", "invoke", "()LET0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<ET0.a<a>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ET0.a<a> invoke() {
            Set<Map.Entry<b, c>> setEntrySet = q.this.f334433b.entrySet();
            ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new a((b) entry.getKey(), (c) entry.getValue()));
            }
            return new ET0.a<>(arrayList);
        }
    }

    /* compiled from: Content.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LET0/a;", "Lcom/avito/beduin/v2/avito/component/image/state/q$a;", "invoke", "()LET0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<ET0.a<a>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final ET0.a<a> invoke() {
            Set<Map.Entry<b, c>> setEntrySet = q.this.f334432a.entrySet();
            ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new a((b) entry.getKey(), (c) entry.getValue()));
            }
            return new ET0.a<>(arrayList);
        }
    }

    public q(@Y61.k Map<b, c> map, @Y61.k Map<b, c> map2, @Y61.k Scale scale, @Y61.l s sVar, @Y61.l s sVar2) {
        this.f334432a = map;
        this.f334433b = map2;
        this.f334434c = scale;
        this.f334435d = sVar;
        this.f334436e = sVar2;
        this.f334437f = C42727D.c(new e());
        this.f334438g = C42727D.c(new d());
    }

    @Override // com.avito.beduin.v2.avito.component.image.state.k
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Scale getF334434c() {
        return this.f334434c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f334432a, qVar.f334432a) && L.f(this.f334433b, qVar.f334433b) && this.f334434c == qVar.f334434c && L.f(this.f334435d, qVar.f334435d) && L.f(this.f334436e, qVar.f334436e);
    }

    public final int hashCode() {
        int iHashCode = (this.f334434c.hashCode() + AK.c.c(this.f334432a.hashCode() * 31, 31, this.f334433b)) * 31;
        s sVar = this.f334435d;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        s sVar2 = this.f334436e;
        return iHashCode2 + (sVar2 != null ? sVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ContentRemoteImage(img=" + this.f334432a + ", imgDark=" + this.f334433b + ", scale=" + this.f334434c + ", error=" + this.f334435d + ", placeholder=" + this.f334436e + ')';
    }

    public /* synthetic */ q(Map map, Map map2, Scale scale, s sVar, s sVar2, int i12, C42822w c42822w) {
        this(map, map2, (i12 & 4) != 0 ? Scale.f334400e : scale, (i12 & 8) != 0 ? null : sVar, (i12 & 16) != 0 ? null : sVar2);
    }
}
