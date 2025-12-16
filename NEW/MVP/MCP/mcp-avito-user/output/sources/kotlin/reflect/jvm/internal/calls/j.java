package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.types.C0;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.text.C43066x;

/* compiled from: ValueClassAwareCaller.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u000b\fB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/e;Z)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j<M extends Member> implements e<M> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f407135a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e<M> f407136b;

    /* renamed from: c, reason: collision with root package name */
    public final M f407137c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f407138d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.l[] f407139e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f407140f;

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$a;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.ranges.l f407141a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<Method>[] f407142b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Method f407143c;

        public a(@Y61.k kotlin.ranges.l lVar, @Y61.k List<Method>[] listArr, @Y61.l Method method) {
            this.f407141a = lVar;
            this.f407142b = listArr;
            this.f407143c = method;
        }
    }

    /* compiled from: ValueClassAwareCaller.kt */
    @s0
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$b;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/Q;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Method f407144a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Method f407145b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f407146c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f407147d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ArrayList f407148e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
        public b(@Y61.k InterfaceC42905x interfaceC42905x, @Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k List<? extends Q> list) {
            ?? SingletonList;
            this.f407144a = kDeclarationContainerImpl.i("constructor-impl", str);
            this.f407145b = kDeclarationContainerImpl.i("box-impl", C43066x.X("V", str) + C42892d.b(kDeclarationContainerImpl.f()));
            List<? extends Q> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                List listSingletonList = null;
                if (!it.hasNext()) {
                    break;
                }
                Y yA2 = C0.a(((Q) it.next()).getType());
                ArrayList arrayListE = l.e(yA2);
                if (arrayListE == null) {
                    Class<?> clsH = l.h(yA2);
                    if (clsH != null) {
                        listSingletonList = Collections.singletonList(l.d(clsH, interfaceC42905x));
                    }
                } else {
                    listSingletonList = arrayListE;
                }
                arrayList.add(listSingletonList);
            }
            this.f407146c = arrayList;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                InterfaceC42851d interfaceC42851d = (InterfaceC42851d) ((Q) obj).getType().H0().b();
                List list3 = (List) this.f407146c.get(i12);
                if (list3 != null) {
                    List list4 = list3;
                    SingletonList = new ArrayList(C42745f0.q(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        SingletonList.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    SingletonList = Collections.singletonList(i0.i(interfaceC42851d));
                }
                arrayList2.add(SingletonList);
                i12 = i13;
            }
            this.f407147d = arrayList2;
            this.f407148e = C42745f0.H(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.k
        public final List<Type> a() {
            return this.f407148e;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        public final /* bridge */ /* synthetic */ Member b() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ?? SingletonList;
            ArrayList arrayList = this.f407146c;
            int length = objArr.length;
            ArrayList arrayList2 = new ArrayList(Math.min(C42745f0.q(arrayList, 10), length));
            int i12 = 0;
            for (Object obj : arrayList) {
                if (i12 >= length) {
                    break;
                }
                arrayList2.add(new kotlin.Q(objArr[i12], obj));
                i12++;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                kotlin.Q q12 = (kotlin.Q) it.next();
                Object obj2 = q12.f406619b;
                List list = (List) q12.f406620c;
                if (list != null) {
                    List list2 = list;
                    SingletonList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        SingletonList.add(((Method) it2.next()).invoke(obj2, new Object[0]));
                    }
                } else {
                    SingletonList = Collections.singletonList(obj2);
                }
                C42745f0.h((Iterable) SingletonList, arrayList3);
            }
            Object[] array = arrayList3.toArray(new Object[0]);
            this.f407144a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f407145b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.k
        /* renamed from: getReturnType */
        public final Type getF407118b() {
            return this.f407145b.getReturnType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(@Y61.k kotlin.reflect.jvm.internal.calls.e r11, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r12, boolean r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.j.<init>(kotlin.reflect.jvm.internal.calls.e, kotlin.reflect.jvm.internal.impl.descriptors.x, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final List<Type> a() {
        return this.f407136b.a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public final M b() {
        return this.f407137c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.l
    public final Object call(@Y61.k Object[] objArr) {
        Method method;
        Object objInvoke;
        Object objInvoke2;
        a aVar = this.f407138d;
        kotlin.ranges.l lVar = aVar.f407141a;
        List<Method>[] listArr = aVar.f407142b;
        if (!lVar.isEmpty()) {
            boolean z12 = this.f407140f;
            int i12 = lVar.f406906c;
            int i13 = lVar.f406905b;
            if (z12) {
                kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(objArr.length);
                for (int i14 = 0; i14 < i13; i14++) {
                    bVar.add(objArr[i14]);
                }
                if (i13 <= i12) {
                    while (true) {
                        List<Method> list = listArr[i13];
                        Object obj = objArr[i13];
                        if (list != null) {
                            for (Method method2 : list) {
                                bVar.add(obj != null ? method2.invoke(obj, new Object[0]) : i0.e(method2.getReturnType()));
                            }
                        } else {
                            bVar.add(obj);
                        }
                        if (i13 == i12) {
                            break;
                        }
                        i13++;
                    }
                }
                int i15 = i12 + 1;
                int length = objArr.length - 1;
                if (i15 <= length) {
                    while (true) {
                        bVar.add(objArr[i15]);
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                    }
                }
                objArr = C42745f0.p(bVar).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    if (i16 > i12 || i13 > i16) {
                        objInvoke2 = objArr[i16];
                    } else {
                        List<Method> list2 = listArr[i16];
                        Method method3 = list2 != null ? (Method) C42745f0.u0(list2) : null;
                        objInvoke2 = objArr[i16];
                        if (method3 != null) {
                            objInvoke2 = objInvoke2 != null ? method3.invoke(objInvoke2, new Object[0]) : i0.e(method3.getReturnType());
                        }
                    }
                    objArr2[i16] = objInvoke2;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.f407136b.call(objArr);
        return (objCall == IntrinsicsKt.getCOROUTINE_SUSPENDED() || (method = aVar.f407143c) == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    /* renamed from: getReturnType */
    public final Type getF407118b() {
        return this.f407136b.getF407118b();
    }
}
