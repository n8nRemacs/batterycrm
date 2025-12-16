package com.avito.android.large_transaction;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.runtime.C22026a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;

/* compiled from: BundlePrinter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/large_transaction/a;", "", "a", "b", "c", "d", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ClassLoader f175027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175028b;

    /* compiled from: BundlePrinter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/large_transaction/a$a;", "", "<init>", "()V", "Lcom/avito/android/large_transaction/a$b;", "Lcom/avito/android/large_transaction/a$c;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.large_transaction.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5159a {
        public /* synthetic */ AbstractC5159a(C42822w c42822w) {
            this();
        }

        /* renamed from: a */
        public abstract int getF175033c();

        public AbstractC5159a() {
        }
    }

    /* compiled from: BundlePrinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/a$b;", "Lcom/avito/android/large_transaction/a$a;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends AbstractC5159a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Exception f175029a;

        /* renamed from: b, reason: collision with root package name */
        public final int f175030b;

        public b(@k Exception exc) {
            super(null);
            this.f175029a = exc;
            this.f175030b = 8192;
        }

        @Override // com.avito.android.large_transaction.a.AbstractC5159a
        /* renamed from: a, reason: from getter */
        public final int getF175033c() {
            return this.f175030b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f175029a, ((b) obj).f175029a);
        }

        public final int hashCode() {
            return this.f175029a.hashCode();
        }

        @k
        public final String toString() {
            return "FieldError(e=" + this.f175029a + ')';
        }
    }

    /* compiled from: BundlePrinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/a$c;", "Lcom/avito/android/large_transaction/a$a;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends AbstractC5159a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Object f175031a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f175032b;

        /* renamed from: c, reason: collision with root package name */
        public final int f175033c;

        public c(@l Object obj, @k String str) {
            super(null);
            this.f175031a = obj;
            this.f175032b = str;
            this.f175033c = f.b(obj);
        }

        @Override // com.avito.android.large_transaction.a.AbstractC5159a
        /* renamed from: a, reason: from getter */
        public final int getF175033c() {
            return this.f175033c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f175031a, cVar.f175031a) && L.f(this.f175032b, cVar.f175032b);
        }

        public final int hashCode() {
            Object obj = this.f175031a;
            return this.f175032b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FieldValue(value=");
            sb2.append(this.f175031a);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f175032b, ')');
        }
    }

    /* compiled from: BundlePrinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/a$d;", "", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
    }

    /* compiled from: BundlePrinter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/large_transaction/a$e", "Lcom/avito/android/large_transaction/a$d;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.f f175035b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f175036c;

        public e(l0.f fVar, StringBuilder sb2) {
            this.f175035b = fVar;
            this.f175036c = sb2;
        }
    }

    public a(ClassLoader classLoader, int i12, int i13, C42822w c42822w) {
        i12 = (i13 & 2) != 0 ? 8192 : i12;
        this.f175027a = classLoader;
        this.f175028b = i12;
    }

    public static void a(int i12, int i13, StringBuilder sb2) {
        int iAbs = Math.abs(i12 - i13);
        if (i12 >= i13) {
            if (i12 > i13) {
                if (C43066x.B(sb2, "},")) {
                    sb2.append('{');
                    return;
                } else {
                    sb2.setCharAt(sb2.length() - 1, '{');
                    return;
                }
            }
            return;
        }
        if (C43066x.A(sb2, ',')) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        for (int i14 = 0; i14 < iAbs; i14++) {
            sb2.append('}');
        }
        if (i12 != -1) {
            sb2.append(',');
        }
    }

    @SuppressLint({"ObfuscationSensitiveReflection"})
    public static List b(Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if ((field.getModifiers() & 8) == 0) {
                    arrayList.add(field);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field declaredField = obj.getClass().getDeclaredField(((Field) next).getName());
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj);
                if (obj3 != null) {
                    obj2 = obj3;
                }
                if (obj2 != null) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Field field2 = (Field) it2.next();
                Field declaredField2 = obj.getClass().getDeclaredField(field2.getName());
                declaredField2.setAccessible(true);
                Object obj4 = declaredField2.get(obj);
                if (obj4 == null) {
                    obj4 = null;
                }
                arrayList3.add(new c(obj4, field2.getName()));
            }
            return arrayList3;
        } catch (Exception e12) {
            return Collections.singletonList(new b(e12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v19, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v32, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v39, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v45, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @k
    public final String c(@k Bundle bundle, @k String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i12;
        ?? B12;
        StringBuilder sb2 = new StringBuilder();
        l0.f fVar = new l0.f();
        c cVar = new c(bundle, str);
        e eVar = new e(fVar, sb2);
        LinkedList linkedList = new LinkedList();
        int i13 = 0;
        linkedList.push(new Q(cVar, 0));
        while (!linkedList.isEmpty()) {
            Q q12 = (Q) linkedList.pop();
            AbstractC5159a abstractC5159a = (AbstractC5159a) q12.f406619b;
            int iIntValue = ((Number) q12.f406620c).intValue();
            l0.f fVar2 = eVar.f175035b;
            int i14 = fVar2.f406840b;
            StringBuilder sb3 = eVar.f175036c;
            a aVar = a.this;
            aVar.getClass();
            a(iIntValue, i14, sb3);
            fVar2.f406840b = iIntValue;
            if (abstractC5159a instanceof c) {
                c cVar2 = (c) abstractC5159a;
                int i15 = ((c) abstractC5159a).f175033c;
                if (i15 >= aVar.f175028b) {
                    Object obj = cVar2.f175031a;
                    String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
                    if (simpleName == null) {
                        simpleName = "null";
                    }
                    sb3.append(cVar2.f175032b + ':' + simpleName + ':' + f.a(i15) + ',');
                    i12 = 1;
                }
                if (i12 == 0 && (abstractC5159a instanceof c)) {
                    Object obj2 = ((c) abstractC5159a).f175031a;
                    if (obj2 == null || (obj2 instanceof String) || (obj2 instanceof Boolean) || (obj2 instanceof Number)) {
                        B12 = C42784z0.f406748b;
                    } else if (obj2 instanceof Iterable) {
                        Iterable iterable = (Iterable) obj2;
                        Object objF = C42745f0.F(iterable);
                        if (objF instanceof Parcelable ? true : objF instanceof Serializable) {
                            B12 = new ArrayList(C42745f0.q(iterable, 10));
                            int i16 = i13;
                            for (Object obj3 : iterable) {
                                int i17 = i16 + 1;
                                if (i16 < 0) {
                                    C42745f0.H0();
                                    throw null;
                                }
                                u0 u0Var = u0.f406856a;
                                B12.add(new c(obj3, String.format("%s", Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1))));
                                i16 = i17;
                            }
                        } else {
                            B12 = C42784z0.f406748b;
                        }
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        objValueAt = objArr.length != 0 ? objArr[i13] : null;
                        if (objValueAt instanceof Parcelable ? true : objValueAt instanceof Serializable) {
                            B12 = new ArrayList(objArr.length);
                            int length = objArr.length;
                            int i18 = i13;
                            int i19 = i18;
                            while (i18 < length) {
                                Object obj4 = objArr[i18];
                                u0 u0Var2 = u0.f406856a;
                                B12.add(new c(obj4, String.format("%s", Arrays.copyOf(new Object[]{Integer.valueOf(i19)}, 1))));
                                i18++;
                                i19++;
                                i13 = 0;
                            }
                        } else {
                            B12 = C42784z0.f406748b;
                            i13 = 0;
                        }
                    } else if (obj2 instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj2;
                        if (sparseArray.size() > 0) {
                            i13 = 0;
                            objValueAt = sparseArray.valueAt(0);
                        } else {
                            i13 = 0;
                        }
                        if (objValueAt instanceof Parcelable ? true : objValueAt instanceof Serializable) {
                            B12 = new ArrayList(sparseArray.size());
                            int size = sparseArray.size();
                            for (int i22 = i13; i22 < size; i22++) {
                                Object objValueAt = sparseArray.valueAt(i22);
                                u0 u0Var3 = u0.f406856a;
                                B12.add(new c(objValueAt, String.format("%s", Arrays.copyOf(new Object[]{Integer.valueOf(i22)}, 1))));
                            }
                        } else {
                            B12 = C42784z0.f406748b;
                        }
                    } else {
                        i13 = 0;
                        if (obj2 instanceof Bundle) {
                            Bundle bundle2 = (Bundle) obj2;
                            try {
                                bundle2.setClassLoader(this.f175027a);
                                Set<String> setKeySet = bundle2.keySet();
                                ArrayList arrayList = new ArrayList(C42745f0.q(setKeySet, 10));
                                for (String str2 : setKeySet) {
                                    arrayList.add(new c(bundle2.get(str2), str2));
                                }
                                B12 = arrayList;
                            } catch (Exception e12) {
                                B12 = Collections.singletonList(new b(e12));
                            }
                        } else {
                            B12 = ((obj2 instanceof Serializable) || (obj2 instanceof Parcelable)) ? b(obj2) : C42784z0.f406748b;
                        }
                    }
                    Iterator it = C42745f0.B0(C42745f0.q0((Iterable) B12), new com.avito.android.large_transaction.b()).iterator();
                    while (it.hasNext()) {
                        linkedList.push(new Q((AbstractC5159a) it.next(), Integer.valueOf(iIntValue + 1)));
                    }
                }
            } else {
                if (!(abstractC5159a instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sb4 = new StringBuilder("ERROR:");
                Exception exc = ((b) abstractC5159a).f175029a;
                sb4.append(exc.getClass().getSimpleName());
                sb4.append('(');
                sb4.append(exc.getMessage());
                sb4.append("),");
                sb3.append(sb4.toString());
            }
            i12 = i13;
            if (i12 == 0) {
            }
        }
        a(-1, fVar.f406840b, sb2);
        return sb2.toString();
    }
}
