package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers;

import com.avito.android.messenger.MessageDeliveryStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OutgoingMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E extends N implements Y41.l<androidx.compose.ui.semantics.F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MessageDeliveryStatus f192278l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(MessageDeliveryStatus messageDeliveryStatus) {
        super(1);
        this.f192278l = messageDeliveryStatus;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.semantics.F f12) {
        kotlin.reflect.n<Object> nVar = v.f192445a[0];
        androidx.compose.ui.semantics.E<MessageDeliveryStatus> e12 = v.f192450f;
        e12.getClass();
        f12.a(e12, this.f192278l);
        return G0.f406611a;
    }
}
