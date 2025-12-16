package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y41.p;
import Y61.l;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import jB.InterfaceC42228b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UniversalWidgetEditInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$editSection$1", f = "UniversalWidgetEditInteractor.kt", i = {0, 1, 2, 2, 3}, l = {69, 72, 74, 79, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "sectionWithUploadedImagesRes", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC42228b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public UniversalWidgetSectionModel.ImageWithTextSection f153857q;

    /* renamed from: r, reason: collision with root package name */
    public int f153858r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f153859s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UniversalWidgetSectionModel.Section f153860t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f153861u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UniversalWidgetSectionModel.Section section, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f153860t = section;
        this.f153861u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f153860t, this.f153861u, continuation);
        bVar.f153859s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
