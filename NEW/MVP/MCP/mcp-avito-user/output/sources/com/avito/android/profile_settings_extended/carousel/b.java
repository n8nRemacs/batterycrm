package com.avito.android.profile_settings_extended.carousel;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsCarouselInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.carousel.ExtendedProfileSettingsCarouselInteractorImpl$updateCarousel$1", f = "ExtendedProfileSettingsCarouselInteractor.kt", i = {0, 1, 3, 3, 5, 5}, l = {48, 68, 72, 81, 91, UpdateStatusCode.DialogButton.CONFIRM, 108}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f230003q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230004r;

    /* renamed from: s, reason: collision with root package name */
    public int f230005s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f230006t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f230007u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f230008v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f230009w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f230010x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f230011y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ArrayList f230012z;

    /* compiled from: ExtendedProfileSettingsCarouselInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues$FieldError;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<ModificationResult.IncorrectValues.FieldError, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f230013l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(ModificationResult.IncorrectValues.FieldError fieldError) {
            return fieldError.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z12, c cVar, String str2, int i12, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f230007u = str;
        this.f230008v = z12;
        this.f230009w = cVar;
        this.f230010x = str2;
        this.f230011y = i12;
        this.f230012z = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        ArrayList arrayList = this.f230012z;
        b bVar = new b(this.f230007u, this.f230008v, this.f230009w, this.f230010x, this.f230011y, arrayList, continuation);
        bVar.f230006t = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.carousel.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
