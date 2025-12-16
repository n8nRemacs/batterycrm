package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextMessageContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f192610l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar) {
        super(1);
        this.f192610l = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        aVar2.setTag(this.f192610l);
        aVar2.setTextIsSelectable(true);
        com.avito.android.messenger.conversation.adapter.platform.a.f189262a.getClass();
        aVar2.setMovementMethod((com.avito.android.messenger.conversation.adapter.platform.a) com.avito.android.messenger.conversation.adapter.platform.a.f189264c.getValue());
        return G0.f406611a;
    }
}
