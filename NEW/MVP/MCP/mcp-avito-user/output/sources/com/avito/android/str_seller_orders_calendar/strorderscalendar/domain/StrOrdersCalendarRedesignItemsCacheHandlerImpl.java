package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import Sz0.C15273b;
import Sz0.C15274c;
import Sz0.InterfaceC15272a;
import Tz0.C15430d;
import Tz0.C15432f;
import Tz0.C15433g;
import Uz0.C15589a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.models.api.DateRange;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/StrOrdersCalendarRedesignItemsCacheHandlerImpl;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/a;", "Companion", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersCalendarRedesignItemsCacheHandlerImpl implements com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Companion f290670b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f290671a;

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/StrOrdersCalendarRedesignItemsCacheHandlerImpl$Companion;", "", "<init>", "()V", "IntersectionType", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/StrOrdersCalendarRedesignItemsCacheHandlerImpl$Companion$IntersectionType;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IntersectionType {

            /* renamed from: b, reason: collision with root package name */
            public static final IntersectionType f290672b;

            /* renamed from: c, reason: collision with root package name */
            public static final IntersectionType f290673c;

            /* renamed from: d, reason: collision with root package name */
            public static final IntersectionType f290674d;

            /* renamed from: e, reason: collision with root package name */
            public static final IntersectionType f290675e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ IntersectionType[] f290676f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f290677g;

            static {
                IntersectionType intersectionType = new IntersectionType("START", 0);
                f290672b = intersectionType;
                IntersectionType intersectionType2 = new IntersectionType("MIDDLE", 1);
                f290673c = intersectionType2;
                IntersectionType intersectionType3 = new IntersectionType("END", 2);
                f290674d = intersectionType3;
                IntersectionType intersectionType4 = new IntersectionType("NONE", 3);
                f290675e = intersectionType4;
                IntersectionType[] intersectionTypeArr = {intersectionType, intersectionType2, intersectionType3, intersectionType4};
                f290676f = intersectionTypeArr;
                f290677g = kotlin.enums.c.a(intersectionTypeArr);
            }

            public IntersectionType() {
                throw null;
            }

            public static IntersectionType valueOf(String str) {
                return (IntersectionType) Enum.valueOf(IntersectionType.class, str);
            }

            public static IntersectionType[] values() {
                return (IntersectionType[]) f290676f.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public static IntersectionType a(@l DateRange dateRange, @l String str) {
            Date dateI;
            Date dateI2;
            String start = dateRange.getStart();
            if (start != null) {
                com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
                Date dateI3 = com.avito.android.str_seller_orders_calendar.utils.a.i(start);
                if (dateI3 != null) {
                    long time = dateI3.getTime();
                    String end = dateRange.getEnd();
                    if (end == null || (dateI = com.avito.android.str_seller_orders_calendar.utils.a.i(end)) == null) {
                        return IntersectionType.f290675e;
                    }
                    long time2 = dateI.getTime();
                    if (str == null || (dateI2 = com.avito.android.str_seller_orders_calendar.utils.a.i(str)) == null) {
                        return IntersectionType.f290675e;
                    }
                    long time3 = dateI2.getTime();
                    return time3 == time ? IntersectionType.f290672b : (time + 1 > time3 || time3 >= time2) ? time3 == time2 ? IntersectionType.f290674d : IntersectionType.f290675e : IntersectionType.f290673c;
                }
            }
            return IntersectionType.f290675e;
        }

        public Companion() {
        }
    }

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Companion.IntersectionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Companion.IntersectionType intersectionType = Companion.IntersectionType.f290672b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Companion.IntersectionType intersectionType2 = Companion.IntersectionType.f290672b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Companion.IntersectionType intersectionType3 = Companion.IntersectionType.f290672b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$dropCalendarCacheFromLeft$2", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<? extends C15273b>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290678q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f290679r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, List<C15273b>> f290680s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290681t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f290682u;

        /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$dropCalendarCacheFromLeft$2$1$1", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends List<? extends C15273b>>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f290683q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ List<C15273b> f290684r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Date f290685s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, List<C15273b> list, Date date, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290683q = str;
                this.f290684r = list;
                this.f290685s = date;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f290683q, this.f290684r, this.f290685s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Q<? extends String, ? extends List<? extends C15273b>>> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                List<C15273b> list = this.f290684r;
                ArrayList arrayList = new ArrayList();
                boolean z12 = false;
                for (Object obj2 : list) {
                    if (z12) {
                        arrayList.add(obj2);
                    } else {
                        Date date = ((C15273b) obj2).f15246j;
                        if (!(date != null ? date.before(this.f290685s) : true)) {
                            arrayList.add(obj2);
                            z12 = true;
                        }
                    }
                }
                return new Q(this.f290683q, arrayList);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<String, ? extends List<C15273b>> map, StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, Date date, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f290680s = map;
            this.f290681t = strOrdersCalendarRedesignItemsCacheHandlerImpl;
            this.f290682u = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f290680s, this.f290681t, this.f290682u, continuation);
            bVar.f290679r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<? extends C15273b>>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290678q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f290679r;
                Map<String, List<C15273b>> map = this.f290680s;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, List<C15273b>> entry : map.entrySet()) {
                    arrayList.add(C43259k.b(t12, this.f290681t.f290671a.c(), new a(entry.getKey(), entry.getValue(), this.f290682u, null), 2));
                }
                this.f290678q = 1;
                obj = C43225h.a(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return P0.p((Iterable) obj);
        }
    }

    /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$dropCalendarCacheFromRight$2", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<? extends C15273b>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290686q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f290687r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, List<C15273b>> f290688s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StrOrdersCalendarRedesignItemsCacheHandlerImpl f290689t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f290690u;

        /* compiled from: StrOrdersCalendarRedesignItemsCacheHandler.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "", "", "LSz0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl$dropCalendarCacheFromRight$2$1$1", f = "StrOrdersCalendarRedesignItemsCacheHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super Q<? extends String, ? extends List<? extends C15273b>>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f290691q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ List<C15273b> f290692r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Date f290693s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, List<C15273b> list, Date date, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290691q = str;
                this.f290692r = list;
                this.f290693s = date;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f290691q, this.f290692r, this.f290693s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Q<? extends String, ? extends List<? extends C15273b>>> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object objE0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                List<C15273b> list = this.f290692r;
                if (list.isEmpty()) {
                    objE0 = C42784z0.f406748b;
                } else {
                    ListIterator<C15273b> listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        Date date = listIterator.previous().f15246j;
                        if (!(date != null ? date.after(this.f290693s) : true)) {
                            objE0 = C42745f0.E0(list, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    objE0 = C42784z0.f406748b;
                }
                return new Q(this.f290691q, objE0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Map<String, ? extends List<C15273b>> map, StrOrdersCalendarRedesignItemsCacheHandlerImpl strOrdersCalendarRedesignItemsCacheHandlerImpl, Date date, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f290688s = map;
            this.f290689t = strOrdersCalendarRedesignItemsCacheHandlerImpl;
            this.f290690u = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f290688s, this.f290689t, this.f290690u, continuation);
            cVar.f290687r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<? extends C15273b>>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290686q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f290687r;
                Map<String, List<C15273b>> map = this.f290688s;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, List<C15273b>> entry : map.entrySet()) {
                    arrayList.add(C43259k.b(t12, this.f290689t.f290671a.c(), new a(entry.getKey(), entry.getValue(), this.f290690u, null), 2));
                }
                this.f290686q = 1;
                obj = C43225h.a(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return P0.p((Iterable) obj);
        }
    }

    @Inject
    public StrOrdersCalendarRedesignItemsCacheHandlerImpl(@k R0 r02) {
        this.f290671a = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r9v7, types: [Sz0.d$b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [Sz0.d$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList g(com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl r29, java.lang.String r30, java.util.List r31, java.util.List r32, java.util.List r33, Uz0.C15589a r34) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl.g(com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.StrOrdersCalendarRedesignItemsCacheHandlerImpl, java.lang.String, java.util.List, java.util.List, java.util.List, Uz0.a):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC15272a h(String str, List list) {
        List<C15430d> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C15430d c15430d : list2) {
            DateRange dateRange = c15430d.f16044a;
            f290670b.getClass();
            arrayList.add(new Q(Companion.a(dateRange, str), c15430d));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Q) next).f406619b != Companion.IntersectionType.f290675e) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return InterfaceC15272a.C1042a.f15235a;
        }
        InterfaceC15272a bVar = InterfaceC15272a.C1042a.f15235a;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Q q12 = (Q) it2.next();
            Companion.IntersectionType intersectionType = (Companion.IntersectionType) q12.f406619b;
            C15430d c15430d2 = (C15430d) q12.f406620c;
            int iOrdinal = intersectionType.ordinal();
            if (iOrdinal == 0) {
                String str2 = c15430d2.f16045b;
                bVar = new InterfaceC15272a.b(str2.length() > 0 ? com.avito.android.printable_text.b.f(str2) : com.avito.android.printable_text.b.c(R.string.str_orders_calendar_unavailable_title, new Serializable[0]));
            } else {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return new InterfaceC15272a.b(null);
                }
                if (iOrdinal == 3) {
                    bVar = InterfaceC15272a.C1042a.f15235a;
                }
            }
        }
        return bVar;
    }

    public static ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C15433g c15433g = (C15433g) obj;
            if (c15433g.f16054a.length() == 0 || c15433g.f16055b.f16053d.length() == 0 || !c15433g.f16056c.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @k
    public final LinkedHashMap a(@k ArrayList arrayList) {
        ArrayList arrayListI = i(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            C15433g c15433g = (C15433g) it.next();
            String str = c15433g.f16054a;
            C15432f c15432f = c15433g.f16055b;
            String str2 = c15432f.f16053d;
            C15274c c15274c = (str.length() == 0 || str2.length() == 0) ? null : new C15274c(str, str2, c15432f.f16050a, c15432f.f16051b, c15432f.f16052c);
            if (c15274c != null) {
                arrayList2.add(c15274c);
            }
        }
        int iF2 = P0.f(C42745f0.q(arrayList2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((C15274c) next).f15249a, next);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @l
    public final Object b(@k Map<String, ? extends List<C15273b>> map, @k Date date, @k Continuation<? super Map<String, ? extends List<C15273b>>> continuation) {
        return U.c(new b(map, this, date, null), continuation);
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @l
    public final Object c(@k ArrayList arrayList, @k Continuation continuation) {
        return U.c(new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.c(this, arrayList, null), continuation);
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @l
    public final Object d(@k Map map, @k ArrayList arrayList, @l C15589a c15589a, @k Continuation continuation) {
        return U.c(new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.b(this, arrayList, map, c15589a, null), continuation);
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @l
    public final Object e(@k Map<String, ? extends List<C15273b>> map, @k Date date, @k Continuation<? super Map<String, ? extends List<C15273b>>> continuation) {
        return U.c(new c(map, this, date, null), continuation);
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a
    @l
    public final Object f(@k Map map, @k ArrayList arrayList, @k Continuation continuation) {
        return U.c(new e(this, arrayList, map, null), continuation);
    }
}
