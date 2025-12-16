package com.avito.android.edit_basic_info.mvi;

import Y41.p;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EditSellerTypeLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import com.avito.android.profile_settings_basic.InterfaceC33465j;
import com.avito.android.profile_settings_basic.InterfaceC33466k;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import ky.InterfaceC43512a;
import vy.C49395b;

/* compiled from: EditBasicInfoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lky/a;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lky/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC43512a, EditBasicInfoInternalAction, ky.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_basic_info.interactor.a f146104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditBasicInfoArguments f146105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f146106c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33460e f146107d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f146108e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f146109f;

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$10", f = "EditBasicInfoActor.kt", i = {}, l = {114, 116}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditBasicInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146110q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146111r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ky.c f146112s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ky.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f146112s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f146112s, continuation);
            aVar.f146111r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146110q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f146111r;
                ky.c cVar = this.f146112s;
                if (cVar.f413323e == null) {
                    if (cVar.f413321c) {
                        EditBasicInfoInternalAction.OpenAvatarMenu openAvatarMenu = EditBasicInfoInternalAction.OpenAvatarMenu.f146156b;
                        this.f146110q = 1;
                        if (interfaceC43172j.emit(openAvatarMenu, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        EditBasicInfoInternalAction.OpenAvatarPicker openAvatarPicker = EditBasicInfoInternalAction.OpenAvatarPicker.f146157b;
                        this.f146110q = 2;
                        if (interfaceC43172j.emit(openAvatarPicker, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/k;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<anonymous>", "(Lcom/avito/android/profile_settings_basic/k;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$11", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.edit_basic_info.mvi.b$b, reason: collision with other inner class name */
    public static final class C4250b extends SuspendLambda implements p<InterfaceC33466k, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f146113q;

        public C4250b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C4250b c4250b = new C4250b(2, continuation);
            c4250b.f146113q = obj;
            return c4250b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC33466k interfaceC33466k, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>> continuation) {
            return ((C4250b) create(interfaceC33466k, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC33466k interfaceC33466k = (InterfaceC33466k) this.f146113q;
            if (interfaceC33466k instanceof InterfaceC33466k.a) {
                return new C43210w(new EditBasicInfoInternalAction.AvatarDeletionFailure(((InterfaceC33466k.a) interfaceC33466k).f228856a));
            }
            if (interfaceC33466k instanceof InterfaceC33466k.b) {
                return new C43210w(EditBasicInfoInternalAction.AvatarDeletionStarted.f146132b);
            }
            if (interfaceC33466k instanceof InterfaceC33466k.c) {
                return new C43210w(new EditBasicInfoInternalAction.AvatarDeletionSuccess(((InterfaceC33466k.c) interfaceC33466k).f228858a));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/j;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "<anonymous>", "(Lcom/avito/android/profile_settings_basic/j;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$12", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC33465j, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f146114q;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f146114q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC33465j interfaceC33465j, Continuation<? super InterfaceC43160i<? extends EditBasicInfoInternalAction>> continuation) {
            return ((c) create(interfaceC33465j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC33465j interfaceC33465j = (InterfaceC33465j) this.f146114q;
            if (interfaceC33465j instanceof InterfaceC33465j.a) {
                return new C43210w(new EditBasicInfoInternalAction.AvatarUploadCancel(((InterfaceC33465j.a) interfaceC33465j).f228849a));
            }
            if (interfaceC33465j instanceof InterfaceC33465j.b) {
                InterfaceC33465j.b bVar = (InterfaceC33465j.b) interfaceC33465j;
                return new C43210w(new EditBasicInfoInternalAction.AvatarUploadFailure(bVar.f228851b, bVar.f228850a));
            }
            if (interfaceC33465j instanceof InterfaceC33465j.c) {
                return new C43210w(new EditBasicInfoInternalAction.AvatarUploadStarted(((InterfaceC33465j.c) interfaceC33465j).f228852a));
            }
            if (!(interfaceC33465j instanceof InterfaceC33465j.d)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC33465j.d dVar = (InterfaceC33465j.d) interfaceC33465j;
            return new C43210w(new EditBasicInfoInternalAction.AvatarUploadSuccess(dVar.f228853a, dVar.f228854b, dVar.f228855c));
        }
    }

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$13", f = "EditBasicInfoActor.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super EditBasicInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146115q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f146116r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ky.c f146118t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ky.c cVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f146118t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f146118t, continuation);
            dVar.f146116r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            DeepLink deeplink;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146115q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f146116r;
                b bVar = b.this;
                BasicInfoV2Widget.ServicesSellerTypeConfig sellerType = bVar.f146105b.f146101b.f229219o.getSellerType();
                if (sellerType != null && (deeplink = sellerType.getDeeplink()) != null) {
                    if (deeplink instanceof EditSellerTypeLink) {
                        ky.c cVar = this.f146118t;
                        ky.d dVar = cVar.f413335q;
                        if ((dVar != null ? Boxing.boxInt(dVar.f413340b) : null) != null) {
                            BasicInfoV2Widget.ServicesSellerTypeConfig sellerType2 = bVar.f146105b.f146101b.f229219o.getSellerType();
                            bVar.f146108e.c(new C49395b(sellerType2 != null ? sellerType2.getValue() : null));
                            EditBasicInfoInternalAction.OpenSellerTypeEditor openSellerTypeEditor = new EditBasicInfoInternalAction.OpenSellerTypeEditor(cVar.f413335q);
                            this.f146115q = 1;
                            if (interfaceC43172j.emit(openSellerTypeEditor, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        b.a.a(bVar.f146106c, deeplink, null, null, 6);
                    }
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

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$2", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super EditBasicInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ky.c f146120r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ky.c cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f146120r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new e(this.f146120r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            DeepLink deeplink;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            BasicInfoV2Widget.EditorVerticalConfig vertical = bVar.f146105b.f146101b.f229219o.getVertical();
            if (vertical != null && (deeplink = vertical.getDeeplink()) != null) {
                Bundle bundle = new Bundle();
                ky.c cVar = this.f146120r;
                Integer num = cVar.f413329k;
                if (num != null) {
                    bundle.putInt("SelectedVerticalArgTag", num.intValue());
                }
                Integer num2 = cVar.f413331m;
                if (num2 != null) {
                    bundle.putInt("SelectedSpecificArgTag", num2.intValue());
                }
                G0 g02 = G0.f406611a;
                b.a.a(bVar.f146106c, deeplink, null, bundle, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EditBasicInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_basic_info.mvi.EditBasicInfoActor$process$3", f = "EditBasicInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super EditBasicInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ky.c f146122r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ky.c cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f146122r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new f(this.f146122r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EditBasicInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            DeepLink deeplink;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            BasicInfoV2Widget.EditorSpecificConfig specific = bVar.f146105b.f146101b.f229219o.getSpecific();
            if (specific != null && (deeplink = specific.getDeeplink()) != null) {
                Bundle bundle = new Bundle();
                ky.c cVar = this.f146122r;
                Integer num = cVar.f413329k;
                if (num != null) {
                    bundle.putInt("SelectedVerticalArgTag", num.intValue());
                }
                Integer num2 = cVar.f413331m;
                if (num2 != null) {
                    bundle.putInt("SelectedSpecificArgTag", num2.intValue());
                }
                G0 g02 = G0.f406611a;
                b.a.a(bVar.f146106c, deeplink, null, bundle, 2);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k com.avito.android.edit_basic_info.interactor.a aVar, @Y61.k EditBasicInfoArguments editBasicInfoArguments, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC33460e interfaceC33460e, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f146104a = aVar;
        this.f146105b = editBasicInfoArguments;
        this.f146106c = aVar2;
        this.f146107d = interfaceC33460e;
        this.f146108e = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.B(new com.avito.android.edit_basic_info.mvi.a(2, null), y.a(this.f146106c.d9())), C43175k.C(new com.avito.android.edit_basic_info.mvi.c(this, aVar, null), c43197r1));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction> b(@Y61.k ky.InterfaceC43512a r14, @Y61.k ky.c r15) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_basic_info.mvi.b.b(ky.a, ky.c):kotlinx.coroutines.flow.i");
    }
}
