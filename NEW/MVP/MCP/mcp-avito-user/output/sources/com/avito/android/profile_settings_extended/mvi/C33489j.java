package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_settings_extended.adapter.banner.ExtendedSettingsBannerItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vc0.C49302a;
import yc0.InterfaceC50219c;
import yc0.r;

/* compiled from: ExtendedProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processBannerItemAction$1", f = "ExtendedProfileSettingsActor.kt", i = {0}, l = {500, 515, 531}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.profile_settings_extended.mvi.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33489j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230700q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230701r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50219c f230702s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33480a f230703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33489j(InterfaceC50219c interfaceC50219c, C33480a c33480a, Continuation<? super C33489j> continuation) {
        super(2, continuation);
        this.f230702s = interfaceC50219c;
        this.f230703t = c33480a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33489j c33489j = new C33489j(this.f230702s, this.f230703t, continuation);
        c33489j.f230701r = obj;
        return c33489j;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33489j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230700q;
        InterfaceC50219c interfaceC50219c = this.f230702s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f230701r;
            ExtendedSettingsBannerItem extendedSettingsBannerItem = ((InterfaceC50219c.a) interfaceC50219c).f443227a;
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.UpdateImagePickerMode updateImagePickerMode = new ExtendedProfileSettingsInternalAction.ImagesInternalAction.UpdateImagePickerMode(new r.b(extendedSettingsBannerItem.f229165c, UploadImage.Type.f226691c, extendedSettingsBannerItem.f229171i, extendedSettingsBannerItem.f229172j, extendedSettingsBannerItem.f229174l, extendedSettingsBannerItem.f229175m));
            this.f230701r = interfaceC43172j;
            this.f230700q = 1;
            if (interfaceC43172j.emit(updateImagePickerMode, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f230701r;
            C42729a0.b(obj);
        }
        InterfaceC50219c.a aVar = (InterfaceC50219c.a) interfaceC50219c;
        Iterator<T> it = aVar.f443227a.f229170h.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UploadImage) next).getF226677c() instanceof UploadImageState.ModerationPending) {
                break;
            }
        }
        if (next != null) {
            ExtendedSettingsBannerItem extendedSettingsBannerItem2 = aVar.f443227a;
            ExtendedSettingsBannerItem.ChangeDialog changeDialog = extendedSettingsBannerItem2.f229173k;
            ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowDialogEvent showDialogEvent = new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowDialogEvent(changeDialog.f229178b, changeDialog.f229179c, changeDialog.f229180d, changeDialog.f229181e, new InterfaceC50219c.C12909c(extendedSettingsBannerItem2.f229165c));
            this.f230701r = null;
            this.f230700q = 2;
            if (interfaceC43172j.emit(showDialogEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            C33480a c33480a = this.f230703t;
            String strA = c33480a.f230510k.a();
            if (strA != null) {
                c33480a.f230512m.c(new C49302a(strA, aVar.f443227a.f229165c));
            }
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages pickImages = new ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages(aVar.f443227a.f229165c, 1);
            this.f230701r = null;
            this.f230700q = 3;
            if (interfaceC43172j.emit(pickImages, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
