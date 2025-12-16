package com.avito.android.das_date_picker.mvi;

import bu.C25712a;
import bu.C25713b;
import bu.C25715d;
import com.avito.android.util.R0;
import du.C39803a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
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

/* compiled from: DasCalendarDataBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/h;", "Lcom/avito/android/das_date_picker/mvi/g;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f132403a;

    /* compiled from: DasCalendarDataBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lbu/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lbu/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarDataBuilderImpl$buildCalendarData$2", f = "DasCalendarDataBuilder.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super C25713b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f132404q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f132405r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C25712a> f132406s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h f132407t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f132408u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Date f132409v;

        /* compiled from: DasCalendarDataBuilder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lbu/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lbu/d;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarDataBuilderImpl$buildCalendarData$2$2$1", f = "DasCalendarDataBuilder.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.das_date_picker.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C3961a extends SuspendLambda implements Y41.p<T, Continuation<? super C25715d>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f132410q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f132411r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ List<C25712a> f132412s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Date f132413t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Date f132414u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3961a(h hVar, Date date, Date date2, List list, Continuation continuation) {
                super(2, continuation);
                this.f132411r = hVar;
                this.f132412s = list;
                this.f132413t = date;
                this.f132414u = date2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3961a(this.f132411r, this.f132413t, this.f132414u, this.f132412s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super C25715d> continuation) {
                return ((C3961a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f132410q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f132410q = 1;
                    h hVar = this.f132411r;
                    obj = C43259k.g(hVar.f132403a.c(), new i(hVar, this.f132413t, this.f132414u, this.f132412s, null), this);
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
        public a(h hVar, Date date, Date date2, List list, Continuation continuation) {
            super(2, continuation);
            this.f132406s = list;
            this.f132407t = hVar;
            this.f132408u = date;
            this.f132409v = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f132407t, this.f132408u, this.f132409v, this.f132406s, continuation);
            aVar.f132405r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C25713b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f132404q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f132405r;
                List<C25712a> list = this.f132406s;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    C25712a c25712a = (C25712a) obj2;
                    StringBuilder sb2 = new StringBuilder();
                    Date date = c25712a.f57529a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    sb2.append(calendar.get(2));
                    sb2.append('-');
                    sb2.append(C39803a.d(c25712a.f57529a).get(1));
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
                    List list2 = (List) ((Map.Entry) it.next()).getValue();
                    arrayList.add(C43259k.b(t12, null, new C3961a(this.f132407t, this.f132408u, this.f132409v, list2, null), 3));
                }
                this.f132404q = 1;
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
            return new C25713b(C42745f0.C((Iterable) obj));
        }
    }

    @Inject
    public h(@Y61.k R0 r02) {
        this.f132403a = r02;
    }

    @Override // com.avito.android.das_date_picker.mvi.g
    @Y61.l
    public final Object a(@Y61.k List<C25712a> list, @Y61.k Date date, @Y61.k Date date2, @Y61.k Continuation<? super C25713b> continuation) {
        return C43259k.g(this.f132403a.c(), new a(this, date, date2, list, null), continuation);
    }
}
