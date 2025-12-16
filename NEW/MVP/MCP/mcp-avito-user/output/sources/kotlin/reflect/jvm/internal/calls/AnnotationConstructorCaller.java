package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;

/* compiled from: AnnotationConstructorCaller.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnnotationConstructorCaller implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class<?> f407092a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f407093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CallMode f407094c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Method> f407095d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f407096e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f407097f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f407098g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallMode {

        /* renamed from: b, reason: collision with root package name */
        public static final CallMode f407099b;

        /* renamed from: c, reason: collision with root package name */
        public static final CallMode f407100c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CallMode[] f407101d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407102e;

        static {
            CallMode callMode = new CallMode("CALL_BY_NAME", 0);
            f407099b = callMode;
            CallMode callMode2 = new CallMode("POSITIONAL_CALL", 1);
            f407100c = callMode2;
            CallMode[] callModeArr = {callMode, callMode2};
            f407101d = callModeArr;
            f407102e = kotlin.enums.c.a(callModeArr);
        }

        public CallMode() {
            throw null;
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) f407101d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Origin {

        /* renamed from: b, reason: collision with root package name */
        public static final Origin f407103b;

        /* renamed from: c, reason: collision with root package name */
        public static final Origin f407104c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Origin[] f407105d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407106e;

        static {
            Origin origin = new Origin("JAVA", 0);
            f407103b = origin;
            Origin origin2 = new Origin("KOTLIN", 1);
            f407104c = origin2;
            Origin[] originArr = {origin, origin2};
            f407105d = originArr;
            f407106e = kotlin.enums.c.a(originArr);
        }

        public Origin() {
            throw null;
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) f407105d.clone();
        }
    }

    public AnnotationConstructorCaller(@Y61.k Class<?> cls, @Y61.k List<String> list, @Y61.k CallMode callMode, @Y61.k Origin origin, @Y61.k List<Method> list2) {
        this.f407092a = cls;
        this.f407093b = list;
        this.f407094c = callMode;
        this.f407095d = list2;
        List<Method> list3 = list2;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f407096e = arrayList;
        List<Method> list4 = this.f407095d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Class<? extends Object> cls2 = C42892d.f407851c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList2.add(returnType);
        }
        this.f407097f = arrayList2;
        List<Method> list5 = this.f407095d;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f407098g = arrayList3;
        if (this.f407094c == CallMode.f407100c && origin == Origin.f407103b && !C42745f0.c0(this.f407093b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final List<Type> a() {
        return this.f407096e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(@Y61.k java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    /* renamed from: getReturnType */
    public final Type getF407118b() {
        return this.f407092a;
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i12, C42822w c42822w) {
        List list3;
        if ((i12 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, callMode, origin, list3);
    }
}
