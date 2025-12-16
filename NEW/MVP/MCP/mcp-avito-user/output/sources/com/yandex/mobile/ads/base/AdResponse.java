package com.yandex.mobile.ads.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.xl;
import com.yandex.mobile.ads.impl.y6;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public class AdResponse<T> implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private final boolean f382543A;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f382544B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f382545C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f382546D;

    /* renamed from: E, reason: collision with root package name */
    private final int f382547E;

    /* renamed from: F, reason: collision with root package name */
    private final int f382548F;

    /* renamed from: G, reason: collision with root package name */
    private final int f382549G;

    /* renamed from: H, reason: collision with root package name */
    private final int f382550H;

    /* renamed from: I, reason: collision with root package name */
    private final int f382551I;

    /* renamed from: J, reason: collision with root package name */
    private final int f382552J;

    /* renamed from: K, reason: collision with root package name */
    private final boolean f382553K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private FalseClick f382554L;

    /* renamed from: a, reason: collision with root package name */
    @P
    private final y6 f382555a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f382556b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f382557c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final String f382558d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final SizeInfo f382559e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private final List<String> f382560f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final List<String> f382561g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final List<String> f382562h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final Long f382563i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private final String f382564j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private final Locale f382565k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private final List<String> f382566l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private final AdImpressionData f382567m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private final List<Long> f382568n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private final List<Integer> f382569o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private final String f382570p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private final String f382571q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private final String f382572r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private final xl f382573s;

    /* renamed from: t, reason: collision with root package name */
    @P
    private final String f382574t;

    /* renamed from: u, reason: collision with root package name */
    @P
    private final String f382575u;

    /* renamed from: v, reason: collision with root package name */
    @P
    private final MediationData f382576v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private final RewardData f382577w;

    /* renamed from: x, reason: collision with root package name */
    @P
    private final Long f382578x;

    /* renamed from: y, reason: collision with root package name */
    @P
    private final T f382579y;

    /* renamed from: z, reason: collision with root package name */
    @P
    private final Map<String, Object> f382580z;

    /* renamed from: M, reason: collision with root package name */
    public static final Integer f382541M = 100;
    public static final Parcelable.Creator<AdResponse> CREATOR = new a();

    /* renamed from: N, reason: collision with root package name */
    private static final Integer f382542N = 1000;

    public class a implements Parcelable.Creator<AdResponse> {
        @Override // android.os.Parcelable.Creator
        public final AdResponse createFromParcel(Parcel parcel) {
            return new AdResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdResponse[] newArray(int i12) {
            return new AdResponse[i12];
        }
    }

    public static class b<T> {

        /* renamed from: A, reason: collision with root package name */
        @P
        private Map<String, Object> f382581A;

        /* renamed from: B, reason: collision with root package name */
        private int f382582B;

        /* renamed from: C, reason: collision with root package name */
        private int f382583C;

        /* renamed from: D, reason: collision with root package name */
        private int f382584D;

        /* renamed from: E, reason: collision with root package name */
        private int f382585E;

        /* renamed from: F, reason: collision with root package name */
        private int f382586F;

        /* renamed from: G, reason: collision with root package name */
        private int f382587G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f382588H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f382589I;

        /* renamed from: J, reason: collision with root package name */
        private boolean f382590J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f382591K;

        /* renamed from: L, reason: collision with root package name */
        private boolean f382592L;

        /* renamed from: a, reason: collision with root package name */
        @P
        private y6 f382593a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private String f382594b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private String f382595c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private String f382596d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private xl f382597e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private int f382598f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private List<String> f382599g;

        /* renamed from: h, reason: collision with root package name */
        @P
        private List<String> f382600h;

        /* renamed from: i, reason: collision with root package name */
        @P
        private List<String> f382601i;

        /* renamed from: j, reason: collision with root package name */
        @P
        private Long f382602j;

        /* renamed from: k, reason: collision with root package name */
        @P
        private String f382603k;

        /* renamed from: l, reason: collision with root package name */
        @P
        private Locale f382604l;

        /* renamed from: m, reason: collision with root package name */
        @P
        private List<String> f382605m;

        /* renamed from: n, reason: collision with root package name */
        @P
        private FalseClick f382606n;

        /* renamed from: o, reason: collision with root package name */
        @P
        private AdImpressionData f382607o;

        /* renamed from: p, reason: collision with root package name */
        @P
        private List<Long> f382608p;

        /* renamed from: q, reason: collision with root package name */
        @P
        private List<Integer> f382609q;

        /* renamed from: r, reason: collision with root package name */
        @P
        private String f382610r;

        /* renamed from: s, reason: collision with root package name */
        @P
        private MediationData f382611s;

        /* renamed from: t, reason: collision with root package name */
        @P
        private RewardData f382612t;

        /* renamed from: u, reason: collision with root package name */
        @P
        private Long f382613u;

        /* renamed from: v, reason: collision with root package name */
        @P
        private T f382614v;

        /* renamed from: w, reason: collision with root package name */
        @P
        private String f382615w;

        /* renamed from: x, reason: collision with root package name */
        @P
        private String f382616x;

        /* renamed from: y, reason: collision with root package name */
        @P
        private String f382617y;

        /* renamed from: z, reason: collision with root package name */
        @P
        private String f382618z;

        @N
        public final void a(@N y6 y6Var) {
            this.f382593a = y6Var;
        }

        @N
        public final void b(int i12) {
            this.f382583C = i12;
        }

        @N
        public final void c(@N ArrayList arrayList) {
            this.f382599g = arrayList;
        }

        @N
        public final void d(@N String str) {
            this.f382594b = str;
        }

        @N
        public final void e(@P String str) {
            this.f382596d = str;
        }

        @N
        public final void f(@N ArrayList arrayList) {
            this.f382600h = arrayList;
        }

        @N
        public final void g(@P int i12) {
            this.f382598f = i12;
        }

        @N
        public final void h(@N String str) {
            this.f382595c = str;
        }

        @N
        public final void i(@P String str) {
            this.f382617y = str;
        }

        @N
        public final void a(@N Long l12) {
            this.f382602j = l12;
        }

        @N
        public final void b(@N ArrayList arrayList) {
            this.f382605m = arrayList;
        }

        @N
        public final void c(int i12) {
            this.f382585E = i12;
        }

        @N
        public final void d(@N ArrayList arrayList) {
            this.f382609q = arrayList;
        }

        @N
        public final void e(int i12) {
            this.f382582B = i12;
        }

        @N
        public final void f(@N String str) {
            this.f382603k = str;
        }

        @N
        public final void g(String str) {
            this.f382618z = str;
        }

        @N
        public final void a(@N Locale locale) {
            this.f382604l = locale;
        }

        @N
        public final void b(@P String str) {
            this.f382610r = str;
        }

        @N
        public final void c(boolean z12) {
            this.f382591K = z12;
        }

        @N
        public final void d(int i12) {
            this.f382586F = i12;
        }

        @N
        public final void e(@N ArrayList arrayList) {
            this.f382601i = arrayList;
        }

        @N
        public final void f(int i12) {
            this.f382584D = i12;
        }

        @N
        public final void a(@P FalseClick falseClick) {
            this.f382606n = falseClick;
        }

        @N
        public final void b(@P Long l12) {
            this.f382613u = l12;
        }

        @N
        public final void c(@P String str) {
            this.f382615w = str;
        }

        @N
        public final void d(boolean z12) {
            this.f382588H = z12;
        }

        @N
        public final void e(boolean z12) {
            this.f382590J = z12;
        }

        @N
        public final void a(@P AdImpressionData adImpressionData) {
            this.f382607o = adImpressionData;
        }

        @N
        public final void b(boolean z12) {
            this.f382589I = z12;
        }

        @N
        public final void a(@N ArrayList arrayList) {
            this.f382608p = arrayList;
        }

        @N
        public final void a(int i12) {
            this.f382587G = i12;
        }

        @N
        public final void a(@P MediationData mediationData) {
            this.f382611s = mediationData;
        }

        @N
        public final b<T> a(@P T t12) {
            this.f382614v = t12;
            return this;
        }

        @N
        public final void a(@N RewardData rewardData) {
            this.f382612t = rewardData;
        }

        @N
        public final void a(@P String str) {
            this.f382616x = str;
        }

        @N
        public final void a(@P xl xlVar) {
            this.f382597e = xlVar;
        }

        @N
        public final void a(@N HashMap map) {
            this.f382581A = map;
        }

        public final void a(boolean z12) {
            this.f382592L = z12;
        }

        @N
        public final AdResponse<T> a() {
            return new AdResponse<>(this, 0);
        }
    }

    public /* synthetic */ AdResponse(b bVar, int i12) {
        this(bVar);
    }

    @P
    public final String A() {
        return this.f382557c;
    }

    @P
    public final T B() {
        return this.f382579y;
    }

    @P
    public final RewardData C() {
        return this.f382577w;
    }

    @P
    public final Long D() {
        return this.f382578x;
    }

    @P
    public final String E() {
        return this.f382574t;
    }

    @N
    public final SizeInfo F() {
        return this.f382559e;
    }

    public final boolean G() {
        return this.f382553K;
    }

    public final boolean H() {
        return this.f382544B;
    }

    public final boolean I() {
        return this.f382546D;
    }

    public final boolean J() {
        return this.f382543A;
    }

    public final boolean K() {
        return this.f382545C;
    }

    public final boolean L() {
        return this.f382548F > 0;
    }

    public final boolean M() {
        return this.f382552J == 0;
    }

    @P
    public final List<String> c() {
        return this.f382561g;
    }

    public final int d() {
        return this.f382552J;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @P
    public final String e() {
        return this.f382572r;
    }

    @P
    public final List<Long> f() {
        return this.f382568n;
    }

    public final int g() {
        return f382542N.intValue() * this.f382548F;
    }

    public final int h() {
        return f382542N.intValue() * this.f382549G;
    }

    @P
    public final List<String> i() {
        return this.f382566l;
    }

    @P
    public final String j() {
        return this.f382571q;
    }

    @P
    public final List<String> k() {
        return this.f382560f;
    }

    @P
    public final String l() {
        return this.f382570p;
    }

    @P
    public final y6 m() {
        return this.f382555a;
    }

    @P
    public final String n() {
        return this.f382556b;
    }

    @P
    public final String o() {
        return this.f382558d;
    }

    @P
    public final List<Integer> p() {
        return this.f382569o;
    }

    public final int q() {
        return this.f382551I;
    }

    @P
    public final Map<String, Object> r() {
        return this.f382580z;
    }

    @P
    public final List<String> s() {
        return this.f382562h;
    }

    @P
    public final Long t() {
        return this.f382563i;
    }

    @P
    public final xl u() {
        return this.f382573s;
    }

    @P
    public final String v() {
        return this.f382564j;
    }

    @P
    public final String w() {
        return this.f382575u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        y6 y6Var = this.f382555a;
        parcel.writeInt(y6Var == null ? -1 : y6Var.ordinal());
        parcel.writeString(this.f382556b);
        parcel.writeString(this.f382557c);
        parcel.writeString(this.f382558d);
        parcel.writeParcelable(this.f382559e, i12);
        parcel.writeStringList(this.f382560f);
        parcel.writeStringList(this.f382562h);
        parcel.writeValue(this.f382563i);
        parcel.writeString(this.f382564j);
        parcel.writeSerializable(this.f382565k);
        parcel.writeStringList(this.f382566l);
        parcel.writeParcelable(this.f382554L, i12);
        parcel.writeParcelable(this.f382567m, i12);
        parcel.writeList(this.f382568n);
        parcel.writeList(this.f382569o);
        parcel.writeString(this.f382570p);
        parcel.writeString(this.f382571q);
        parcel.writeString(this.f382572r);
        xl xlVar = this.f382573s;
        parcel.writeInt(xlVar != null ? xlVar.ordinal() : -1);
        parcel.writeString(this.f382574t);
        parcel.writeString(this.f382575u);
        parcel.writeParcelable(this.f382576v, i12);
        parcel.writeParcelable(this.f382577w, i12);
        parcel.writeValue(this.f382578x);
        parcel.writeSerializable(this.f382579y.getClass());
        parcel.writeValue(this.f382579y);
        parcel.writeByte(this.f382543A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382544B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382545C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f382546D ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f382547E);
        parcel.writeInt(this.f382548F);
        parcel.writeInt(this.f382549G);
        parcel.writeInt(this.f382550H);
        parcel.writeInt(this.f382551I);
        parcel.writeInt(this.f382552J);
        parcel.writeMap(this.f382580z);
        parcel.writeBoolean(this.f382553K);
    }

    @P
    public final FalseClick x() {
        return this.f382554L;
    }

    @P
    public final AdImpressionData y() {
        return this.f382567m;
    }

    @P
    public final MediationData z() {
        return this.f382576v;
    }

    private AdResponse(@N b<T> bVar) {
        this.f382555a = ((b) bVar).f382593a;
        this.f382558d = ((b) bVar).f382596d;
        this.f382556b = ((b) bVar).f382594b;
        this.f382557c = ((b) bVar).f382595c;
        int i12 = ((b) bVar).f382582B;
        this.f382551I = i12;
        int i13 = ((b) bVar).f382583C;
        this.f382552J = i13;
        this.f382559e = new SizeInfo(i12, i13, ((b) bVar).f382598f != 0 ? ((b) bVar).f382598f : 1);
        this.f382560f = ((b) bVar).f382599g;
        this.f382561g = ((b) bVar).f382600h;
        this.f382562h = ((b) bVar).f382601i;
        this.f382563i = ((b) bVar).f382602j;
        this.f382564j = ((b) bVar).f382603k;
        this.f382565k = ((b) bVar).f382604l;
        this.f382566l = ((b) bVar).f382605m;
        this.f382568n = ((b) bVar).f382608p;
        this.f382569o = ((b) bVar).f382609q;
        this.f382554L = ((b) bVar).f382606n;
        this.f382567m = ((b) bVar).f382607o;
        this.f382547E = ((b) bVar).f382584D;
        this.f382548F = ((b) bVar).f382585E;
        this.f382549G = ((b) bVar).f382586F;
        this.f382550H = ((b) bVar).f382587G;
        this.f382570p = ((b) bVar).f382615w;
        this.f382571q = ((b) bVar).f382610r;
        this.f382572r = ((b) bVar).f382616x;
        this.f382573s = ((b) bVar).f382597e;
        this.f382574t = ((b) bVar).f382617y;
        this.f382579y = (T) ((b) bVar).f382614v;
        this.f382576v = ((b) bVar).f382611s;
        this.f382577w = ((b) bVar).f382612t;
        this.f382578x = ((b) bVar).f382613u;
        this.f382543A = ((b) bVar).f382588H;
        this.f382544B = ((b) bVar).f382589I;
        this.f382545C = ((b) bVar).f382590J;
        this.f382546D = ((b) bVar).f382591K;
        this.f382580z = ((b) bVar).f382581A;
        this.f382553K = ((b) bVar).f382592L;
        this.f382575u = ((b) bVar).f382618z;
    }

    public AdResponse(Parcel parcel) {
        int i12 = parcel.readInt();
        T t12 = null;
        this.f382555a = i12 == -1 ? null : y6.values()[i12];
        this.f382556b = parcel.readString();
        this.f382557c = parcel.readString();
        this.f382558d = parcel.readString();
        this.f382559e = (SizeInfo) parcel.readParcelable(SizeInfo.class.getClassLoader());
        this.f382560f = parcel.createStringArrayList();
        this.f382561g = parcel.createStringArrayList();
        this.f382562h = parcel.createStringArrayList();
        this.f382563i = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f382564j = parcel.readString();
        this.f382565k = (Locale) parcel.readSerializable();
        this.f382566l = parcel.createStringArrayList();
        this.f382554L = (FalseClick) parcel.readParcelable(FalseClick.class.getClassLoader());
        this.f382567m = (AdImpressionData) parcel.readParcelable(AdImpressionData.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f382568n = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f382569o = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        this.f382570p = parcel.readString();
        this.f382571q = parcel.readString();
        this.f382572r = parcel.readString();
        int i13 = parcel.readInt();
        this.f382573s = i13 == -1 ? null : xl.values()[i13];
        this.f382574t = parcel.readString();
        this.f382575u = parcel.readString();
        this.f382576v = (MediationData) parcel.readParcelable(MediationData.class.getClassLoader());
        this.f382577w = (RewardData) parcel.readParcelable(RewardData.class.getClassLoader());
        this.f382578x = (Long) parcel.readValue(Long.class.getClassLoader());
        Class cls = (Class) parcel.readSerializable();
        this.f382579y = cls != null ? (T) parcel.readValue(cls.getClassLoader()) : t12;
        this.f382543A = parcel.readByte() != 0;
        this.f382544B = parcel.readByte() != 0;
        this.f382545C = parcel.readByte() != 0;
        this.f382546D = parcel.readByte() != 0;
        this.f382547E = parcel.readInt();
        this.f382548F = parcel.readInt();
        this.f382549G = parcel.readInt();
        this.f382550H = parcel.readInt();
        this.f382551I = parcel.readInt();
        this.f382552J = parcel.readInt();
        HashMap map = new HashMap();
        this.f382580z = map;
        parcel.readMap(map, Object.class.getClassLoader());
        this.f382553K = parcel.readBoolean();
    }
}
