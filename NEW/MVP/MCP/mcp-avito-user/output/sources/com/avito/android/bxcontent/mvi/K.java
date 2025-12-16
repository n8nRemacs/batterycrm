package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.suggest_address.AddAddressSuggestItem;
import com.avito.android.util.V2;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lr0.InterfaceC43821a;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getData$1", f = "BxContentInteractor.kt", i = {1, 2, 4, 5, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {648, 660, 675, 676, 753, 768, 783, 818, 819, 824, 834, 859, 867, 882, 1018, 805}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "itemsResult", "result", "displayType", "business360Toast", "$this$flow", "itemsResult", "result", "displayType", "business360Toast", "$this$flow", "itemsResult", "result", "displayType", "$this$flow", "itemsResult", "result", "displayType", "$this$flow", "itemsResult", "result", "displayType", "$this$flow", "itemsResult", "result", "displayType", "$this$flow", "itemsResult", "result", "displayType", "itemsResult", "result", "displayType", "items", "headerToolbarItem", "searchBarPromoItemConverted", "heroBannerItemConverted", "toolbarConfig", "udfToolbarColors"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes12.dex */
final class K extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f111376A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C.b f111377B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ F f111378C;

    /* renamed from: q, reason: collision with root package name */
    public Object f111379q;

    /* renamed from: r, reason: collision with root package name */
    public Object f111380r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f111381s;

    /* renamed from: t, reason: collision with root package name */
    public Object f111382t;

    /* renamed from: u, reason: collision with root package name */
    public Object f111383u;

    /* renamed from: v, reason: collision with root package name */
    public HeroBannerWidgetItem f111384v;

    /* renamed from: w, reason: collision with root package name */
    public ToolbarConfig f111385w;

    /* renamed from: x, reason: collision with root package name */
    public UdfToolbarColors f111386x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC43172j f111387y;

    /* renamed from: z, reason: collision with root package name */
    public int f111388z;

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "it", "", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<l1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f111389l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(l1 l1Var) {
            return Boolean.valueOf(l1Var instanceof FloatingPromoWidgetItem);
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "item", "", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f111390l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(l1 l1Var) {
            l1 l1Var2 = l1Var;
            return Boolean.valueOf((l1Var2 instanceof InterfaceC43821a) && ((InterfaceC43821a) l1Var2).v1());
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "it", "", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<l1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f111391l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(l1 l1Var) {
            return Boolean.valueOf(l1Var instanceof AddAddressSuggestItem);
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "item", "", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<l1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ F f111392l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(F f12) {
            super(1);
            this.f111392l = f12;
        }

        @Override // Y41.l
        public final Boolean invoke(l1 l1Var) {
            l1 l1Var2 = l1Var;
            return Boolean.valueOf((l1Var2 instanceof ActionPromoBannerItem) && this.f111392l.f111269F.get().c(((ActionPromoBannerItem) l1Var2).f268597b));
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111393a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111393a = iArr;
        }
    }

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/BxContentResult;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getData$1$itemsResult$1", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<TypedResult<BxContentResult>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f111394q;

        public f() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(2, continuation);
            fVar.f111394q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(TypedResult<BxContentResult> typedResult, Continuation<? super kotlin.G0> continuation) {
            return ((f) create(typedResult, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e(((TypedResult) this.f111394q).toString(), null);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C.b bVar, F f12, Continuation<? super K> continuation) {
        super(2, continuation);
        this.f111377B = bVar;
        this.f111378C = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        K k12 = new K(this.f111377B, this.f111378C, continuation);
        k12.f111376A = obj;
        return k12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((K) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0524 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0886 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x096c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0989 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0e73  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ee2  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0efc  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0eff  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0f0f  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0fa6  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0fe4  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x1013  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1020  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x102e  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x1035  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x104a  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x1058  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x105f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x106d  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x10b3  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x10c8  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x1115  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x1122  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x1141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x114f  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x118b  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x11d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0e87 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b1  */
    /* JADX WARN: Type inference failed for: r13v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v132, types: [com.avito.android.hero_banner.widget.HeroBannerWidgetItem, com.avito.android.remote.model.ToolbarConfig, com.avito.android.search_bar.utils.UdfToolbarColors, java.io.Serializable, java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3, types: [com.avito.android.remote.model.Location] */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r3v132, types: [com.avito.android.hero_banner.widget.HeroBannerWidgetItem] */
    /* JADX WARN: Type inference failed for: r4v235 */
    /* JADX WARN: Type inference failed for: r4v236 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v60, types: [com.avito.android.deep_linking.links.DeepLink] */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2, types: [com.avito.android.remote.model.BxContentBusiness360$ReplaceMain] */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r53v0 */
    /* JADX WARN: Type inference failed for: r53v1, types: [com.avito.android.remote.model.BxContentBusiness360$ReplaceMain] */
    /* JADX WARN: Type inference failed for: r53v2 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.avito.android.remote.model.additional_buttons.UniversalButton] */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r61v1 */
    /* JADX WARN: Type inference failed for: r61v2, types: [com.avito.android.remote.model.additional_buttons.SelectDatesAdditionalButton] */
    /* JADX WARN: Type inference failed for: r61v3 */
    /* JADX WARN: Type inference failed for: r63v0 */
    /* JADX WARN: Type inference failed for: r63v1, types: [com.avito.android.remote.model.additional_buttons.UniversalButton] */
    /* JADX WARN: Type inference failed for: r63v2 */
    /* JADX WARN: Type inference failed for: r64v0 */
    /* JADX WARN: Type inference failed for: r64v1, types: [com.avito.android.remote.model.additional_buttons.SelectDatesAdditionalButton] */
    /* JADX WARN: Type inference failed for: r64v2 */
    /* JADX WARN: Type inference failed for: r65v1 */
    /* JADX WARN: Type inference failed for: r65v2, types: [com.avito.android.bxcontent.mvi.entity.u] */
    /* JADX WARN: Type inference failed for: r65v3 */
    /* JADX WARN: Type inference failed for: r68v0 */
    /* JADX WARN: Type inference failed for: r68v1, types: [com.avito.android.bxcontent.mvi.entity.u] */
    /* JADX WARN: Type inference failed for: r68v2 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r78) {
        /*
            Method dump skipped, instructions count: 4614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
