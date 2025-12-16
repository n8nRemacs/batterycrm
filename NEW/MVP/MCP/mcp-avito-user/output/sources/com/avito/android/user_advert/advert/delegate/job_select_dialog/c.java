package com.avito.android.user_advert.advert.delegate.job_select_dialog;

import Np0.InterfaceC14601a;
import Ut.InterfaceC15565a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.error.z;
import com.avito.android.select_bottom_sheet_dialog.deeplink.JobSelectBottomSheetDialogLink;
import com.avito.android.user_advert.advert.delegate.job_select_dialog.b;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import kv.C43501a;
import l41.r;

/* compiled from: JobSelectBottomSheetDialogDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.job_select_dialog.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f308630d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15565a f308631e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC14601a f308632f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f308633g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public MyAdvertDetailsItem f308634h;

    /* compiled from: JobSelectBottomSheetDialogDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.job_select_dialog.JobSelectBottomSheetDialogDelegateImpl$1", f = "JobSelectBottomSheetDialogDelegate.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308635q;

        /* compiled from: JobSelectBottomSheetDialogDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_advert.advert.delegate.job_select_dialog.c$a$a, reason: collision with other inner class name */
        public static final class C9469a<T> implements r {

            /* renamed from: b, reason: collision with root package name */
            public static final C9469a<T> f308637b = new C9469a<>();

            @Override // l41.r
            public final boolean test(Object obj) {
                return ((C43501a) obj).f413261b instanceof JobSelectBottomSheetDialogLink.b.c;
            }
        }

        /* compiled from: JobSelectBottomSheetDialogDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f308638b;

            public b(c cVar) {
                this.f308638b = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                String str;
                String str2;
                JobSelectBottomSheetDialogLink.b.c cVar = (JobSelectBottomSheetDialogLink.b.c) ((C43501a) obj).f413261b;
                c cVar2 = this.f308638b;
                cVar2.getClass();
                int iOrdinal = cVar.f266865b.ordinal();
                JobSelectBottomSheetDialogLink.Option option = cVar.f266866c;
                C43238h c43238h = cVar2.f308633g;
                com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar3 = cVar2.f395801b;
                if (iOrdinal == 0) {
                    try {
                        MyAdvertDetailsItem myAdvertDetailsItem = cVar2.f308634h;
                        C43259k.d(c43238h, null, null, new e(cVar2, ((myAdvertDetailsItem == null || (str = myAdvertDetailsItem.f309129b) == null) ? null : Long.valueOf(Long.parseLong(str))).longValue(), option.getId(), null), 3);
                    } catch (Exception e12) {
                        V2 v22 = V2.f318762a;
                        StringBuilder sb2 = new StringBuilder("Error while changing job search status. Wrong cv id: ");
                        MyAdvertDetailsItem myAdvertDetailsItem2 = cVar2.f308634h;
                        sb2.append(myAdvertDetailsItem2 != null ? myAdvertDetailsItem2.f309129b : null);
                        v22.a("DEFAULT_TAG", sb2.toString(), e12);
                        cVar3.accept(new b.C9468b(z.n(e12)));
                    }
                } else if (iOrdinal == 1) {
                    try {
                        MyAdvertDetailsItem myAdvertDetailsItem3 = cVar2.f308634h;
                        C43259k.d(c43238h, null, null, new d(cVar2, ((myAdvertDetailsItem3 == null || (str2 = myAdvertDetailsItem3.f309129b) == null) ? null : Long.valueOf(Long.parseLong(str2))).longValue(), option.getId(), null), 3);
                    } catch (Exception e13) {
                        V2 v23 = V2.f318762a;
                        StringBuilder sb3 = new StringBuilder("Error while changing cv visibility. Wrong cv id: ");
                        MyAdvertDetailsItem myAdvertDetailsItem4 = cVar2.f308634h;
                        sb3.append(myAdvertDetailsItem4 != null ? myAdvertDetailsItem4.f309129b : null);
                        v23.a("DEFAULT_TAG", sb3.toString(), e13);
                        cVar3.accept(new b.C9468b(z.n(e13)));
                    }
                } else if (iOrdinal == 2) {
                    V2.f318762a.e("Unknown job select dialog result", null);
                }
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308635q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                InterfaceC43160i interfaceC43160iA = y.a(cVar.f308630d.d9().N(C9469a.f308637b));
                b bVar = new b(cVar);
                this.f308635q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobSelectBottomSheetDialogDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[JobSelectBottomSheetDialogLink.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<JobSelectBottomSheetDialogLink.Type> creator = JobSelectBottomSheetDialogLink.Type.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<JobSelectBottomSheetDialogLink.Type> creator2 = JobSelectBottomSheetDialogLink.Type.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC15565a interfaceC15565a, @k InterfaceC14601a interfaceC14601a, @k R0 r02) {
        this.f308630d = aVar;
        this.f308631e = interfaceC15565a;
        this.f308632f = interfaceC14601a;
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f308633g = c43238hA;
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    @Override // com.avito.android.user_advert.advert.delegate.job_select_dialog.a
    public final void a(@k MyAdvertDetailsItem myAdvertDetailsItem) {
        this.f308634h = myAdvertDetailsItem;
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        U.b(this.f308633g, null);
    }
}
