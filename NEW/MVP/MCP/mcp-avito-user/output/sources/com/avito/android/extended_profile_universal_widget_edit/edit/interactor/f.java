package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y41.p;
import Y61.l;
import android.net.Uri;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.util.ApiException;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: UniversalWidgetEditInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextSection;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$ImageWithTextSection;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$uploadImages$2", f = "UniversalWidgetEditInteractor.kt", i = {0, 0}, l = {159, 169}, m = "invokeSuspend", n = {"$this$coroutineScope", "destination$iv$iv"}, s = {"L$0", "L$3"})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super UniversalWidgetSectionModel.ImageWithTextSection>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public d f153893q;

    /* renamed from: r, reason: collision with root package name */
    public UniversalWidgetSectionModel.ImageWithTextSection f153894r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f153895s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f153896t;

    /* renamed from: u, reason: collision with root package name */
    public Uri f153897u;

    /* renamed from: v, reason: collision with root package name */
    public Collection f153898v;

    /* renamed from: w, reason: collision with root package name */
    public int f153899w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f153900x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ UniversalWidgetSectionModel.ImageWithTextSection f153901y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f153902z;

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/Q;", "Landroid/net/Uri;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$uploadImages$2$uploadIds$1$1", f = "UniversalWidgetEditInteractor.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Q<? extends Uri, ? extends Long>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Uri f153903q;

        /* renamed from: r, reason: collision with root package name */
        public int f153904r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Uri f153905s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f153906t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f153907u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, d dVar, Uri uri2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f153905s = uri;
            this.f153906t = dVar;
            this.f153907u = uri2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f153905s, this.f153906t, this.f153907u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Q<? extends Uri, ? extends Long>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
            Uri uri;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153904r;
            if (i12 == 0) {
                C42729a0.b(obj);
                Uri uri2 = this.f153905s;
                this.f153903q = uri2;
                this.f153904r = 1;
                Object objF = d.f(this.f153906t, this.f153907u, this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uri = uri2;
                obj = objF;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri = this.f153903q;
                C42729a0.b(obj);
            }
            return new Q(uri, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection, d dVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f153901y = imageWithTextSection;
        this.f153902z = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f153901y, this.f153902z, continuation);
        fVar.f153900x = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super UniversalWidgetSectionModel.ImageWithTextSection> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00cb -> B:33:0x00cc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
