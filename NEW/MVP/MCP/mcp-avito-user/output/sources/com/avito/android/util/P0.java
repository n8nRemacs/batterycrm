package com.avito.android.util;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.avito.android.C29640d;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: DiffBlocksUtil.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/P0;", "Lcom/avito/android/util/O0;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P0 implements O0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f318706i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f318707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C29640d f318708b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public List<? extends com.avito.conveyor_item.a> f318709c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ArrayList f318710d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f318711e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f318712f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f318713g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f318714h;

    /* compiled from: DiffBlocksUtil.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/util/P0$a;", "", "<init>", "()V", "", "BEDUIN_BLOCKS", "Ljava/lang/String;", "", "DELAY_BEFORE_HANDLE_MS", "J", "DIFF_BEDUIN_NATIVE_BLOCKS_NAMES", "DIFF_BEDUIN_NATIVE_BLOCKS_OBJECTS", "DIFF_NATIVE_BEDUIN_BLOCKS_NAMES", "DIFF_NATIVE_BEDUIN_BLOCKS_OBJECTS", "KEY_DIFF_BLOCKS_UTIL_STATE", "KEY_METRIC_ALREADY_BEEN_SENT", "NATIVE_BLOCKS", "TAG", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DiffBlocksUtil.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.util.DiffBlocksUtilImpl$restartDiffJob$1", f = "DiffBlocksUtil.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f318715q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<com.avito.conveyor_item.a> f318717s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ArrayList f318718t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f318717s = list;
            this.f318718t = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return P0.this.new b(this.f318717s, this.f318718t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f318715q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f318715q = 1;
                if (C43131e0.b(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            P0 p02 = P0.this;
            List<com.avito.conveyor_item.a> list = this.f318717s;
            ArrayList arrayList = this.f318718t;
            int i13 = P0.f318706i;
            p02.getClass();
            ArrayList arrayListF = P0.f(list);
            ArrayList arrayListF2 = P0.f(arrayList);
            ArrayList arrayListG = P0.g(arrayListF);
            ArrayList arrayListG2 = P0.g(arrayListF2);
            List<String> listI = P0.i(arrayListG, arrayListG2);
            List<String> listI2 = P0.i(arrayListG2, arrayListG);
            C29640d c29640d = p02.f318708b;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[38];
            if (((Boolean) c29640d.f132187L.a().invoke()).booleanValue()) {
                List listD0 = C42745f0.d0(arrayListF, arrayListF2);
                List listD02 = C42745f0.d0(arrayListF2, arrayListF);
                P0.h("Нативные блоки:", arrayListF);
                P0.h("Бедуин блоки:", arrayListF2);
                P0.h("Разница между нативными и бедуин блоками (Сравнение всего объект):", listD0);
                P0.h("Разница между бедуин и нативными блоками (Сравнение всего объекта):", listD02);
                P0.h("Разница между нативными и бедуин блоками(Сравнение названий блоков)", listI);
                P0.h("Разница между бедуин и нативными блоками(Сравнение названий блоков):", listI2);
            }
            String str = p02.f318713g;
            if (str != null) {
                p02.f318707a.h3(str, listI, listI2);
            }
            p02.f318714h = true;
            return kotlin.G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public P0(@Y61.k R0 r02, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k C29640d c29640d) {
        this.f318707a = aVar;
        this.f318708b = c29640d;
        this.f318712f = kotlinx.coroutines.U.a(r02.c());
    }

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((com.avito.conveyor_item.a) obj) instanceof AdvertDetailsGapItem)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.avito.conveyor_item.a) it.next()).getClass().getSimpleName());
        }
        return arrayList2;
    }

    public static void h(String str, List list) {
        V2.f318762a.c("DiffBlocksUtilImpl", str, null);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            V2.f318762a.c("DiffBlocksUtilImpl", i12 + ": " + obj, null);
            i12 = i13;
        }
    }

    public static List i(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.remove(it.next());
        }
        return arrayList3;
    }

    @Override // com.avito.android.util.O0
    public final void a(@Y61.k ArrayList arrayList) {
        this.f318710d = arrayList;
        j();
    }

    @Override // com.avito.android.util.O0
    public final void b(@Y61.k String str, @Y61.k List list) {
        this.f318709c = list;
        this.f318713g = str;
        j();
    }

    @Override // com.avito.android.util.O0
    public final void c(@Y61.k Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("metric_already_been_sent", this.f318714h);
        bundle.putBundle("diff_blocks_util_state", bundle2);
    }

    @Override // com.avito.android.util.O0
    public final void d(@Y61.k Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("diff_blocks_util_state");
        if (bundle2 != null) {
            this.f318714h = bundle2.getBoolean("metric_already_been_sent", false);
        }
    }

    @Override // com.avito.android.util.O0
    public final void e() {
        kotlinx.coroutines.U.b(this.f318712f, null);
    }

    public final void j() {
        ArrayList arrayList;
        if (this.f318714h) {
            return;
        }
        kotlinx.coroutines.N0 n02 = this.f318711e;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        List<? extends com.avito.conveyor_item.a> list = this.f318709c;
        if (list == null || (arrayList = this.f318710d) == null) {
            return;
        }
        this.f318711e = C43259k.d(this.f318712f, null, null, new b(list, arrayList, null), 3);
    }
}
