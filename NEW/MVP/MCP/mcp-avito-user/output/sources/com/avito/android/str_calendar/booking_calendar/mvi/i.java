package com.avito.android.str_calendar.booking_calendar.mvi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import oy0.C44956a;
import oy0.C44958c;
import vy0.C49398a;
import wy0.C49704a;

/* compiled from: StrBookingCalendarDataBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Loy0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Loy0/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarDataBuilderImpl$buildCalendarData$2", f = "StrBookingCalendarDataBuilder.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super C44956a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286471q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f286472r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<C49398a> f286473s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f286474t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Date f286475u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Date f286476v;

    /* compiled from: StrBookingCalendarDataBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Loy0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Loy0/c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarDataBuilderImpl$buildCalendarData$2$2$1", f = "StrBookingCalendarDataBuilder.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super C44958c>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286477q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ k f286478r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C49398a> f286479s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Date f286480t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f286481u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Date date, Date date2, List list, Continuation continuation) {
            super(2, continuation);
            this.f286478r = kVar;
            this.f286479s = list;
            this.f286480t = date;
            this.f286481u = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f286478r, this.f286480t, this.f286481u, this.f286479s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C44958c> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286477q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f286477q = 1;
                k kVar = this.f286478r;
                obj = C43259k.g(kVar.f286486a.c(), new j(kVar, this.f286480t, this.f286481u, this.f286479s, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Date date, Date date2, List list, Continuation continuation) {
        super(2, continuation);
        this.f286473s = list;
        this.f286474t = kVar;
        this.f286475u = date;
        this.f286476v = date2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f286474t, this.f286475u, this.f286476v, this.f286473s, continuation);
        iVar.f286472r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C44956a> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286471q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f286472r;
            List<C49398a> list = this.f286473s;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                C49398a c49398a = (C49398a) obj2;
                StringBuilder sb2 = new StringBuilder();
                Date date = c49398a.f441057a;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                sb2.append(calendar.get(2));
                sb2.append('-');
                sb2.append(C49704a.g(c49398a.f441057a).get(1));
                String string = sb2.toString();
                Object objR = linkedHashMap.get(string);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, string);
                }
                ((List) objR).add(obj2);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(C43259k.b(t12, null, new a(this.f286474t, this.f286475u, this.f286476v, (List) ((Map.Entry) it.next()).getValue(), null), 3));
            }
            this.f286471q = 1;
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
        ArrayList arrayListC = C42745f0.C((Iterable) obj);
        if (arrayListC.isEmpty()) {
            arrayListC = null;
        }
        if (arrayListC != null) {
            return new C44956a(arrayListC);
        }
        return null;
    }
}
