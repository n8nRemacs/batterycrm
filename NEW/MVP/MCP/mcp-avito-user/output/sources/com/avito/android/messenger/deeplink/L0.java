package com.avito.android.messenger.deeplink;

import android.content.Intent;
import androidx.view.C23060r0;
import com.avito.android.deep_linking.links.SendMessageByItemLink;
import com.avito.android.messenger.conversation.create.phone_verification.MessengerPhoneVerificationActivity;
import com.avito.android.remote.model.SearchParamsConverterKt;
import k91.AbstractC42548f;
import kotlin.Metadata;
import sv.C48421d;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O0 f195363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SendMessageByItemLink f195364m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(O0 o02, SendMessageByItemLink sendMessageByItemLink) {
        super(1);
        this.f195363l = o02;
        this.f195364m = sendMessageByItemLink;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        AbstractC42548f.f406138a.getClass();
        Integer f406146b = AbstractC42548f.b.a(th2).getF406146b();
        O0 o02 = this.f195363l;
        if (f406146b != null && f406146b.intValue() == -32060) {
            C23060r0 c23060r0 = o02.f395446d;
            if (c23060r0 == null) {
                c23060r0 = null;
            }
            SendMessageByItemLink sendMessageByItemLink = this.f195364m;
            c23060r0.e(sendMessageByItemLink.f133650b, "itemId");
            c23060r0.e(sendMessageByItemLink.f133651c, "message");
            c23060r0.e(sendMessageByItemLink.f133652d, SearchParamsConverterKt.SOURCE);
            o02.f195389h.J(new Intent(o02.f195387f, (Class<?>) MessengerPhoneVerificationActivity.class), C48421d.a(o02), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            o02.j(SendMessageByItemLink.b.a.f133653b);
        }
        return kotlin.G0.f406611a;
    }
}
