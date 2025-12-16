package com.avito.android.extended_profile_image_edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA.InterfaceC49183a;
import vA.InterfaceC49185c;
import vA.d;

/* compiled from: BannerImageEditView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_image_edit.BannerImageEditViewImpl$2$1", f = "BannerImageEditView.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151017q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f151018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f151019s;

    /* compiled from: BannerImageEditView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.BannerImageEditViewImpl$2$1$1", f = "BannerImageEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f151020q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ q f151021r;

        /* compiled from: BannerImageEditView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.BannerImageEditViewImpl$2$1$1$1", f = "BannerImageEditView.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_image_edit.k$a$a, reason: collision with other inner class name */
        public static final class C4410a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151022q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ q f151023r;

            /* compiled from: BannerImageEditView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.extended_profile_image_edit.k$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4411a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f151024b;

                public C4411a(q qVar) {
                    this.f151024b = qVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    com.avito.android.lib.design.bottom_sheet.d dVar;
                    PhotoUpload photoUpload;
                    Uri uri;
                    vA.d dVar2 = (vA.d) obj;
                    final q qVar = this.f151024b;
                    Uri uri2 = qVar.f151130u;
                    ExtendedProfileImageEditConfig extendedProfileImageEditConfig = qVar.f151113d;
                    if (uri2 == null && (photoUpload = dVar2.f440507a) != null && (uri = photoUpload.f216308j) != null) {
                        qVar.f151130u = uri;
                        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(uri);
                        imageRequestBuilderB.f340805c = new UW0.d(4096.0f, (int) (extendedProfileImageEditConfig.f150988c * 1.5d), (int) (extendedProfileImageEditConfig.f150989d * 1.5d));
                        com.facebook.datasource.c cVarA = com.facebook.drawee.backends.pipeline.d.a().a(imageRequestBuilderB.a(), null);
                        qVar.f151127r = cVarA;
                        cVarA.d(new p(qVar), com.facebook.common.executors.i.a());
                    }
                    boolean z12 = dVar2.f440510d;
                    boolean z13 = extendedProfileImageEditConfig.f150990e;
                    Context context = qVar.f151114e;
                    ImageView imageView = qVar.f151120k;
                    View view = qVar.f151116g;
                    BadgeView badgeView = qVar.f151119j;
                    if (!z13) {
                        D6.w(badgeView);
                        D6.w(view);
                        D6.w(imageView);
                    } else if (z12) {
                        D6.H(imageView);
                        badgeView.setBackgroundColor(C35835l0.d(R.attr.red, context));
                        view.setBackgroundResource(R.drawable.banner_image_border_error_bg);
                    } else {
                        D6.w(imageView);
                        badgeView.setBackgroundColor(C35835l0.d(R.attr.blue600, context));
                        view.setBackgroundResource(R.drawable.banner_image_border_ok_bg);
                    }
                    boolean z14 = dVar2.f440508b;
                    Button button = qVar.f151121l;
                    button.setEnabled(!z14);
                    button.setLoading(z14);
                    d.b bVar = dVar2.f440509c;
                    if (bVar != null && ((dVar = qVar.f151129t) == null || !dVar.isShowing())) {
                        com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
                        dVar3.D(R.layout.ext_profile_banner_image_warning_dialog, true);
                        dVar3.S(C35835l0.g(dVar3.getContext()).y);
                        com.avito.android.lib.design.bottom_sheet.d.M(dVar3, null, false, true, 7);
                        I5.a((TextView) dVar3.findViewById(R.id.extended_settings_banner_warning_dialog_header), bVar.f440511a, false);
                        I5.a((TextView) dVar3.findViewById(R.id.extended_settings_banner_warning_dialog_body), bVar.f440512b, false);
                        dVar3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.extended_profile_image_edit.h
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                q qVar2 = qVar;
                                qVar2.f151111b.accept(InterfaceC49183a.d.f440492a);
                                qVar2.f151129t = null;
                            }
                        });
                        com.avito.android.lib.util.g.a(dVar3);
                        qVar.f151129t = dVar3;
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f151024b, q.class, "render", "render(Lcom/avito/android/extended_profile_image_edit/mvi/entity/BannerImageEditState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4410a(q qVar, Continuation<? super C4410a> continuation) {
                super(2, continuation);
                this.f151023r = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4410a(this.f151023r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4410a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f151022q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    q qVar = this.f151023r;
                    e eVar = qVar.f151111b;
                    C4411a c4411a = new C4411a(qVar);
                    this.f151022q = 1;
                    if (eVar.le(c4411a, this) == coroutine_suspended) {
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

        /* compiled from: BannerImageEditView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.BannerImageEditViewImpl$2$1$1$2", f = "BannerImageEditView.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151025q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ q f151026r;

            /* compiled from: BannerImageEditView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.extended_profile_image_edit.k$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C4412a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f151027b;

                public C4412a(q qVar) {
                    this.f151027b = qVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC49185c interfaceC49185c = (InterfaceC49185c) obj;
                    q qVar = this.f151027b;
                    qVar.getClass();
                    if (interfaceC49185c instanceof InterfaceC49185c.C12747c) {
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.profile_banner_save_error, new Serializable[0]);
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.b(cVar, qVar.f151122m, printableTextC, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                    } else {
                        boolean z12 = interfaceC49185c instanceof InterfaceC49185c.b;
                        BannerImageEditFragment bannerImageEditFragment = qVar.f151112c;
                        if (z12) {
                            String str = ((InterfaceC49185c.b) interfaceC49185c).f440503a;
                            Intent intent = new Intent();
                            intent.putExtra("image_id", str);
                            ActivityC22955m activityC22955mRequireActivity = bannerImageEditFragment.requireActivity();
                            activityC22955mRequireActivity.setResult(-1, intent);
                            activityC22955mRequireActivity.finish();
                        } else if (interfaceC49185c instanceof InterfaceC49185c.a) {
                            bannerImageEditFragment.E0();
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f151027b, q.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/extended_profile_image_edit/mvi/entity/BannerImageEditOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f151026r = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f151026r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f151025q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    q qVar = this.f151026r;
                    e eVar = qVar.f151111b;
                    C4412a c4412a = new C4412a(qVar);
                    this.f151025q = 1;
                    if (eVar.ke(c4412a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151021r = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f151021r, continuation);
            aVar.f151020q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f151020q;
            q qVar = this.f151021r;
            C43259k.d(t12, null, null, new C4410a(qVar, null), 3);
            C43259k.d(t12, null, null, new b(qVar, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC22983P interfaceC22983P, q qVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f151018r = interfaceC22983P;
        this.f151019s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f151018r, this.f151019s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151017q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f151019s, null);
            this.f151017q = 1;
            if (C23056p0.b(this.f151018r, state, aVar, this) == coroutine_suspended) {
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
