package com.avito.android.ai_assistant.link;

import Ju.AbstractC14250d;
import com.avito.android.ai_assistant.AiAssistantOpenLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: AiAssistantOpenLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f89092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AiAssistantOpenLink f89093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AiAssistantOpenLink aiAssistantOpenLink) {
        super(0);
        this.f89092l = bVar;
        this.f89093m = aiAssistantOpenLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f89092l;
        bVar.f89095g.J(bVar.f89094f.a(bVar.f89096h.a(), this.f89093m.f88715b), C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
