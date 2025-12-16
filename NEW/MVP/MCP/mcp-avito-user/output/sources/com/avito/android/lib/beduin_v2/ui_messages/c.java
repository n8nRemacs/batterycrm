package com.avito.android.lib.beduin_v2.ui_messages;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinOneTimeEvent.ShowToastBar.a f177572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BeduinOneTimeEvent.ShowToastBar.a aVar) {
        super(0);
        this.f177572l = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.a<G0> aVar = this.f177572l.f176279b;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
