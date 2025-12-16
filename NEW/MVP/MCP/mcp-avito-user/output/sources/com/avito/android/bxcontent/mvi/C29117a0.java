package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getTopSheet$1", f = "BxContentInteractor.kt", i = {1, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {514, 519, 533, 552, 599, 612, 619, 629}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "searchParams", "$this$flow", "searchParams", "inlineFilters", "item", "$this$flow", "searchParams", "inlineFilters"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.bxcontent.mvi.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29117a0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SearchParams f111736q;

    /* renamed from: r, reason: collision with root package name */
    public InlineFilters f111737r;

    /* renamed from: s, reason: collision with root package name */
    public F f111738s;

    /* renamed from: t, reason: collision with root package name */
    public InlineFilterNavigationItem f111739t;

    /* renamed from: u, reason: collision with root package name */
    public int f111740u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f111741v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C.c f111742w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ F f111743x;

    /* compiled from: BxContentInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.a0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111744a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f111744a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29117a0(C.c cVar, F f12, Continuation<? super C29117a0> continuation) {
        super(2, continuation);
        this.f111742w = cVar;
        this.f111743x = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29117a0 c29117a0 = new C29117a0(this.f111742w, this.f111743x, continuation);
        c29117a0.f111741v = obj;
        return c29117a0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29117a0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r73) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29117a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
