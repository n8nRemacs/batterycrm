package kb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", i = {0, 1, 1}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "checkForUndeliveredPushToken", n = {"this", "this", "current"}, s = {"L$0", "L$0", "L$1"})
/* renamed from: kb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42664a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f406410q;

    /* renamed from: r, reason: collision with root package name */
    public String f406411r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f406412s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f406413t;

    /* renamed from: u, reason: collision with root package name */
    public int f406414u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42664a(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f406413t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f406412s = obj;
        this.f406414u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f406413t.d(this);
    }
}
