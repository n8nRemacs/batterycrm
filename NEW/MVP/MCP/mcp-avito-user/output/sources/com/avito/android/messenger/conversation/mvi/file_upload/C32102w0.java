package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.publish.restriction.l;
import com.avito.android.push.impl_module.token.sending.short_task.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.PublishDraftResponse;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.remote.model.TypedResultKt;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResult;
import com.avito.android.remote_device_id.domain.g;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.suggest_locations.W;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fg0.f;
import kotlin.collections.C42784z0;
import org.funktionale.option.a;
import tF.AbstractC48544a;
import uF.d;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.w0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32102w0 implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f191252b;

    public /* synthetic */ C32102w0(int i12) {
        this.f191252b = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        int i12 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Throwable th2 = (Throwable) obj;
        switch (this.f191252b) {
            case 0:
                int i13 = C32104x0.f191321p;
                return new InterfaceC32098u0.a.C5650a(th2);
            case 1:
                return new IacCanCallResult.CanNot(str, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
            case 2:
                return kotlin.G0.f406611a;
            case 3:
                return "";
            case 4:
                org.funktionale.option.a.f420400a.getClass();
                return a.b.f420401b;
            case 5:
                String message = th2.getMessage();
                if (message != null) {
                    V2.f318762a.e(message, null);
                }
                return Boolean.FALSE;
            case 6:
                String message2 = th2.getMessage();
                if (message2 != null) {
                    V2.f318762a.e(message2, null);
                }
                return C42784z0.f406748b;
            case 7:
                return C42784z0.f406748b;
            case 8:
                return C42784z0.f406748b;
            case 9:
                ApiError apiErrorM = com.avito.android.error.z.m(th2);
                if (apiErrorM == null) {
                    apiErrorM = new ApiError.InternalError("internal");
                }
                return TypedResultKt.toTyped(apiErrorM);
            case 10:
                return PublishDraftRepository.DraftSyncResult.f235333c;
            case 11:
                return new P2.a(com.avito.android.error.z.n(th2));
            case 12:
                return RealtyAddressSubmissionResult.NetworkError.INSTANCE;
            case 13:
                return new l.b(th2);
            case 14:
                return new P2.b(kotlin.G0.f406611a);
            case 15:
                return new P2.b(kotlin.G0.f406611a);
            case 16:
                return new P2.b(kotlin.G0.f406611a);
            case 17:
                int i14 = com.avito.android.publish.slots.delivery_summary_edit.f.f243756q;
                return new P2.b(kotlin.G0.f406611a);
            case 18:
                V2.f318762a.a("DEFAULT_TAG", "Failed to getMarketPrice", th2);
                return TypedResultKt.toTyped((ApiError) com.avito.android.remote.error.j.d(3, null));
            case 19:
                V2.f318762a.a("DEFAULT_TAG", "Failed to getBeduinData", th2);
                return TypedResultKt.toTyped((ApiError) com.avito.android.remote.error.j.d(3, null));
            case 20:
                int i15 = com.avito.android.publish.start_publish.u.f245435g;
                return PublishDraftResponse.NotFound.INSTANCE;
            case 21:
                int i16 = com.avito.android.publish.start_publish.u.f245435g;
                return PublishStartInfo.Publish.INSTANCE;
            case 22:
                return new f.a("hms_undefined");
            case 23:
                a.C7377a c7377a = com.avito.android.push.impl_module.token.sending.short_task.a.f246078c;
                return ShortTask.Status.f274032d;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return g.a.f254424a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new d.b(null, 1, null);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return W.d.f292209a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new AbstractC48544a.b(null, 1, null);
            default:
                return new W.b(new ApiError.NetworkIOError("interactor stub"));
        }
    }
}
