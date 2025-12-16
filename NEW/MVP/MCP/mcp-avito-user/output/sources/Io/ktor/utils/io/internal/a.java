package io.ktor.utils.io.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AwaitingSlot.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "sleep", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f401014q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f401016s;

    /* renamed from: t, reason: collision with root package name */
    public int f401017t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401016s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401015r = obj;
        this.f401017t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401016s.b(null, this);
    }
}
