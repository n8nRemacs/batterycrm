package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.text.LinkAttribute;
import kotlin.InterfaceC43072x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class L implements com.avito.android.deep_linking.links.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f193258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f193259d;

    public /* synthetic */ L(Y41.l lVar, T1.d dVar, int i12) {
        this.f193257b = i12;
        this.f193258c = lVar;
        this.f193259d = dVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.r, kotlin.jvm.internal.N] */
    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(String str) {
        InterfaceC43072x interfaceC43072x = this.f193258c;
        Object obj = this.f193259d;
        switch (this.f193257b) {
            case 0:
                P p12 = P.f193271a;
                T1.d dVar = (T1.d) obj;
                ((Y41.l) interfaceC43072x).invoke(new h0.k(dVar.f189168c, dVar.f189180o, str));
                break;
            case 1:
                T t12 = T.f193282a;
                T1.d dVar2 = (T1.d) obj;
                ((Y41.l) interfaceC43072x).invoke(new h0.k(dVar2.f189168c, dVar2.f189180o, str));
                break;
            default:
                ((kotlin.jvm.internal.N) interfaceC43072x).invoke(kotlin.c.d(((LinkAttribute) obj).getUrl()), null, null, null);
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ L(Y41.r rVar, LinkAttribute linkAttribute) {
        this.f193257b = 2;
        this.f193258c = (kotlin.jvm.internal.N) rVar;
        this.f193259d = linkAttribute;
    }
}
