package androidx.view;

import X41.n;
import Y61.k;
import Y61.l;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.Z0;
import androidx.core.os.C22777e;
import androidx.view.C23485c;
import j.K;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: SavedStateHandle.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/r0;", "", "<init>", "()V", "a", "b", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23060r0 {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f46874f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Class<? extends Object>[] f46875g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f46876a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f46877b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f46878c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f46879d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C23485c.InterfaceC1922c f46880e;

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/lifecycle/r0$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.r0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        @RestrictTo
        public static C23060r0 a(@l Bundle bundle, @l Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C23060r0();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    map.put(str, bundle2.get(str));
                }
                return new C23060r0(map);
            }
            bundle.setClassLoader(C23060r0.class.getClassLoader());
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                linkedHashMap.put((String) parcelableArrayList.get(i12), parcelableArrayList2.get(i12));
            }
            return new C23060r0(linkedHashMap);
        }

        public a() {
        }
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/r0$b;", "T", "Landroidx/lifecycle/g0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.r0$b */
    public static final class b<T> extends C23038g0<T> {
    }

    public C23060r0(@k HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f46876a = linkedHashMap;
        this.f46877b = new LinkedHashMap();
        this.f46878c = new LinkedHashMap();
        this.f46879d = new LinkedHashMap();
        this.f46880e = new Z0(this, 3);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(C23060r0 c23060r0) {
        for (Map.Entry entry : P0.q(c23060r0.f46877b).entrySet()) {
            c23060r0.e(((C23485c.InterfaceC1922c) entry.getValue()).H(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = c23060r0.f46876a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return C22777e.b(new Q("keys", arrayList), new Q("values", arrayList2));
    }

    @l
    @K
    public final <T> T b(@k String str) {
        try {
            return (T) this.f46876a.get(str);
        } catch (ClassCastException unused) {
            d(str);
            return null;
        }
    }

    @K
    @k
    public final n2 c(@k String str, Serializable serializable) {
        LinkedHashMap linkedHashMap = this.f46879d;
        Object objA = linkedHashMap.get(str);
        if (objA == null) {
            LinkedHashMap linkedHashMap2 = this.f46876a;
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, serializable);
            }
            objA = p2.a(linkedHashMap2.get(str));
            linkedHashMap.put(str, objA);
            linkedHashMap.put(str, objA);
        }
        return C43175k.b((Z1) objA);
    }

    @l
    @K
    public final <T> T d(@k String str) {
        T t12 = (T) this.f46876a.remove(str);
        this.f46879d.remove(str);
        return t12;
    }

    @K
    public final void e(@l Object obj, @k String str) {
        f46874f.getClass();
        if (obj != null) {
            for (Class<? extends Object> cls : f46875g) {
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f46878c.get(str);
        C23038g0 c23038g0 = obj2 instanceof C23038g0 ? (C23038g0) obj2 : null;
        if (c23038g0 != null) {
            c23038g0.setValue(obj);
        } else {
            this.f46876a.put(str, obj);
        }
        Z1 z12 = (Z1) this.f46879d.get(str);
        if (z12 == null) {
            return;
        }
        z12.setValue(obj);
    }

    public C23060r0() {
        this.f46876a = new LinkedHashMap();
        this.f46877b = new LinkedHashMap();
        this.f46878c = new LinkedHashMap();
        this.f46879d = new LinkedHashMap();
        this.f46880e = new Z0(this, 3);
    }
}
