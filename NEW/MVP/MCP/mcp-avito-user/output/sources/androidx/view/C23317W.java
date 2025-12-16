package androidx.view;

import G1.a;
import X41.j;
import X41.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.collection.q1;
import androidx.collection.s1;
import androidx.collection.t1;
import androidx.compose.foundation.H;
import androidx.view.C23302N;
import androidx.view.C23303N0;
import androidx.view.C23315U;
import j.D;
import j.InterfaceC42153i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;

/* compiled from: NavDestination.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/W;", "", "a", "b", "c", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23317W {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final b f52878k = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f52879b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C23324b0 f52880c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f52881d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public CharSequence f52882e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f52883f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final q1<C23379m> f52884g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashMap f52885h;

    /* renamed from: i, reason: collision with root package name */
    public int f52886i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f52887j;

    /* compiled from: NavDestination.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/W$a;", "", "Lkotlin/reflect/d;", "value", "<init>", "(Lkotlin/reflect/d;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @P41.d
    @Retention(RetentionPolicy.CLASS)
    @P41.c
    /* renamed from: androidx.navigation.W$a */
    public @interface a {
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/navigation/W$b;", "", "<init>", "()V", "", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.W$b */
    public static final class b {

        /* compiled from: NavDestination.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/W;", "it", "invoke", "(Landroidx/navigation/W;)Landroidx/navigation/W;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.navigation.W$b$a */
        public static final class a extends N implements Y41.l<C23317W, C23317W> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f52888l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final C23317W invoke(C23317W c23317w) {
                return c23317w.f52880c;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @k
        @RestrictTo
        public static String a(@l String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        @n
        @k
        @RestrictTo
        public static String b(int i12, @k Context context) {
            if (i12 <= 16777215) {
                return String.valueOf(i12);
            }
            try {
                return context.getResources().getResourceName(i12);
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i12);
            }
        }

        @k
        public static InterfaceC43030m c(@k C23317W c23317w) {
            return C43033p.u(a.f52888l, c23317w);
        }

        public b() {
        }
    }

    /* compiled from: NavDestination.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/W$c;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    /* renamed from: androidx.navigation.W$c */
    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C23317W f52889b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f52890c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f52891d;

        /* renamed from: e, reason: collision with root package name */
        public final int f52892e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f52893f;

        /* renamed from: g, reason: collision with root package name */
        public final int f52894g;

        public c(@k C23317W c23317w, @l Bundle bundle, boolean z12, int i12, boolean z13, int i13) {
            this.f52889b = c23317w;
            this.f52890c = bundle;
            this.f52891d = z12;
            this.f52892e = i12;
            this.f52893f = z13;
            this.f52894g = i13;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@k c cVar) {
            boolean z12 = cVar.f52891d;
            boolean z13 = this.f52891d;
            if (z13 && !z12) {
                return 1;
            }
            if (!z13 && z12) {
                return -1;
            }
            int i12 = this.f52892e - cVar.f52892e;
            if (i12 > 0) {
                return 1;
            }
            if (i12 < 0) {
                return -1;
            }
            Bundle bundle = cVar.f52890c;
            Bundle bundle2 = this.f52890c;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size() - bundle.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z14 = cVar.f52893f;
            boolean z15 = this.f52893f;
            if (z15 && !z14) {
                return 1;
            }
            if (z15 || !z14) {
                return this.f52894g - cVar.f52894g;
            }
            return -1;
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "key", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.W$d */
    public static final class d extends N implements Y41.l<String, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23302N f52895l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C23302N c23302n) {
            super(1);
            this.f52895l = c23302n;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final Boolean invoke(String str) {
            String str2 = str;
            C23302N c23302n = this.f52895l;
            ArrayList arrayList = c23302n.f52818d;
            Collection collectionValues = ((Map) c23302n.f52822h.getValue()).values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                C42745f0.h(((C23302N.d) it.next()).f52837b, arrayList2);
            }
            return Boolean.valueOf(!C42745f0.h0((List) c23302n.f52825k.getValue(), C42745f0.h0(arrayList2, arrayList)).contains(str2));
        }
    }

    static {
        new LinkedHashMap();
    }

    public C23317W(@k String str) {
        this.f52879b = str;
        this.f52883f = new ArrayList();
        this.f52884g = new q1<>();
        this.f52885h = new LinkedHashMap();
    }

    public final void a(@k C23302N c23302n) {
        ArrayList arrayListA = C23393t.a(this.f52885h, new d(c23302n));
        if (arrayListA.isEmpty()) {
            this.f52883f.add(c23302n);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + c23302n.f52815a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListA).toString());
    }

    @l
    @RestrictTo
    public final Bundle b(@l Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f52885h;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C23389r c23389r = (C23389r) entry.getValue();
            if (c23389r.f53173c) {
                c23389r.f53171a.e(str, bundle2, c23389r.f53174d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C23389r c23389r2 = (C23389r) entry2.getValue();
                boolean z12 = c23389r2.f53172b;
                AbstractC23292H0<Object> abstractC23292H0 = c23389r2.f53171a;
                if (z12 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        abstractC23292H0.a(bundle2, str2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbA = r.A("Wrong argument type for '", str2, "' in argument bundle. ");
                sbA.append(abstractC23292H0.b());
                sbA.append(" expected.");
                throw new IllegalArgumentException(sbA.toString().toString());
            }
        }
        return bundle2;
    }

    @j
    @k
    @RestrictTo
    public final int[] d(@l C23317W c23317w) {
        C42754k c42754k = new C42754k();
        C23317W c23317w2 = this;
        while (true) {
            C23324b0 c23324b0 = c23317w2.f52880c;
            if ((c23317w != null ? c23317w.f52880c : null) != null && c23317w.f52880c.y(c23317w2.f52886i, true) == c23317w2) {
                c42754k.addFirst(c23317w2);
                break;
            }
            if (c23324b0 == null || c23324b0.f52905m != c23317w2.f52886i) {
                c42754k.addFirst(c23317w2);
            }
            if (L.f(c23324b0, c23317w) || c23324b0 == null) {
                break;
            }
            c23317w2 = c23324b0;
        }
        List listM0 = C42745f0.M0(c42754k);
        ArrayList arrayList = new ArrayList(C42745f0.q(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C23317W) it.next()).f52886i));
        }
        return C42745f0.L0(arrayList);
    }

    @l
    public final C23379m e(@D int i12) {
        q1<C23379m> q1Var = this.f52884g;
        C23379m c23379mF = q1Var.j() == 0 ? null : q1Var.f(i12);
        if (c23379mF != null) {
            return c23379mF;
        }
        C23324b0 c23324b0 = this.f52880c;
        if (c23324b0 != null) {
            return c23324b0.e(i12);
        }
        return null;
    }

    public boolean equals(@l Object obj) {
        boolean z12;
        boolean z13;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23317W)) {
            return false;
        }
        C23317W c23317w = (C23317W) obj;
        boolean zF2 = L.f(this.f52883f, c23317w.f52883f);
        q1<C23379m> q1Var = this.f52884g;
        int iJ2 = q1Var.j();
        q1<C23379m> q1Var2 = c23317w.f52884g;
        if (iJ2 != q1Var2.j()) {
            z12 = false;
            break;
        }
        Iterator it = C43033p.b(new s1(q1Var)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!L.f(q1Var.f(iIntValue), q1Var2.f(iIntValue))) {
                z12 = false;
                break;
            }
        }
        z12 = true;
        LinkedHashMap linkedHashMap = this.f52885h;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = c23317w.f52885h;
        if (size != linkedHashMap2.size()) {
            z13 = false;
            break;
        }
        for (Map.Entry entry : P0.b(linkedHashMap).f406743a) {
            if (!linkedHashMap2.containsKey(entry.getKey()) || !L.f(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                z13 = false;
                break;
            }
        }
        z13 = true;
        return this.f52886i == c23317w.f52886i && L.f(this.f52887j, c23317w.f52887j) && zF2 && z12 && z13;
    }

    @RestrictTo
    public final boolean g(@l Bundle bundle, @k String str) {
        if (L.f(this.f52887j, str)) {
            return true;
        }
        c cVarJ = j(str);
        if (!equals(cVarJ != null ? cVarJ.f52889b : null)) {
            return false;
        }
        if (bundle != null) {
            Bundle bundle2 = cVarJ.f52890c;
            if (bundle2 != null) {
                for (String str2 : bundle2.keySet()) {
                    if (bundle.containsKey(str2)) {
                        C23389r c23389r = (C23389r) cVarJ.f52889b.f52885h.get(str2);
                        AbstractC23292H0<Object> abstractC23292H0 = c23389r != null ? c23389r.f53171a : null;
                        if (!L.f(abstractC23292H0 != null ? abstractC23292H0.a(bundle2, str2) : null, abstractC23292H0 != null ? abstractC23292H0.a(bundle, str2) : null)) {
                        }
                    }
                }
                return true;
            }
        } else {
            cVarJ.getClass();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.C] */
    @Y61.l
    @androidx.annotation.RestrictTo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.view.C23317W.c h(@Y61.k androidx.view.C23315U r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23317W.h(androidx.navigation.U):androidx.navigation.W$c");
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i12 = this.f52886i * 31;
        String str = this.f52887j;
        int iHashCode = i12 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f52883f.iterator();
        while (it.hasNext()) {
            C23302N c23302n = (C23302N) it.next();
            int i13 = iHashCode * 31;
            String str2 = c23302n.f52815a;
            int iHashCode2 = (i13 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c23302n.f52816b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c23302n.f52817c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        t1 t1Var = new t1(this.f52884g);
        while (t1Var.hasNext()) {
            C23379m c23379m = (C23379m) t1Var.next();
            int i14 = ((iHashCode * 31) + c23379m.f53168a) * 31;
            C23280B0 c23280b0 = c23379m.f53169b;
            iHashCode = i14 + (c23280b0 != null ? c23280b0.hashCode() : 0);
            Bundle bundle = c23379m.f53170c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Iterator<T> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    int i15 = iHashCode * 31;
                    Object obj = c23379m.f53170c.get((String) it2.next());
                    iHashCode = i15 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f52885h;
        for (String str5 : linkedHashMap.keySet()) {
            int iD2 = H.d(iHashCode * 31, 31, str5);
            Object obj2 = linkedHashMap.get(str5);
            iHashCode = iD2 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    @l
    @RestrictTo
    public final c j(@k String str) {
        C23315U.a.C1868a c1868a = C23315U.a.f52877a;
        f52878k.getClass();
        Uri uri = Uri.parse(b.a(str));
        c1868a.getClass();
        new C23315U.a(null);
        C23315U c23315u = new C23315U(uri, null, null);
        return this instanceof C23324b0 ? ((C23324b0) this).E(c23315u) : h(c23315u);
    }

    @InterfaceC42153i
    public void l(@k Context context, @k AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, a.b.f6175e);
        t(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            s(typedArrayObtainAttributes.getResourceId(1, 0));
            int i12 = this.f52886i;
            f52878k.getClass();
            this.f52881d = b.b(i12, context);
        }
        this.f52882e = typedArrayObtainAttributes.getText(0);
        G0 g02 = G0.f406611a;
        typedArrayObtainAttributes.recycle();
    }

    public final void r(@D int i12, @k C23379m c23379m) {
        if (v()) {
            if (i12 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f52884g.i(i12, c23379m);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i12 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void s(@D int i12) {
        this.f52886i = i12;
        this.f52881d = null;
    }

    public final void t(@l String str) {
        Object next;
        b bVar = f52878k;
        if (str == null) {
            s(0);
        } else {
            if (C43066x.K(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            bVar.getClass();
            String strA = b.a(str);
            s(strA.hashCode());
            C23302N.a aVar = new C23302N.a();
            aVar.f52831a = strA;
            a(new C23302N(aVar.f52831a, aVar.f52832b, aVar.f52833c));
        }
        ArrayList arrayList = this.f52883f;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = ((C23302N) next).f52815a;
            String str3 = this.f52887j;
            bVar.getClass();
            if (L.f(str2, b.a(str3))) {
                break;
            }
        }
        v0.a(arrayList).remove(next);
        this.f52887j = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f52881d;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f52886i));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f52887j;
        if (str2 != null && !C43066x.K(str2)) {
            sb2.append(" route=");
            sb2.append(this.f52887j);
        }
        if (this.f52882e != null) {
            sb2.append(" label=");
            sb2.append(this.f52882e);
        }
        return sb2.toString();
    }

    @RestrictTo
    public boolean v() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23317W(@k AbstractC23301M0<? extends C23317W> abstractC23301M0) {
        C23303N0.a aVar = C23303N0.f52846b;
        Class<?> cls = abstractC23301M0.getClass();
        aVar.getClass();
        this(C23303N0.a.a(cls));
    }
}
