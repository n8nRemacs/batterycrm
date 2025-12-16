package com.avito.android.messenger.conversation.chat_header;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChatHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f189443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(1);
        this.f189443l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        oVar.b(this.f189443l.f189412c.getString(R.string.messenger_channel_title_arrow_onboarding_text));
        return G0.f406611a;
    }
}
