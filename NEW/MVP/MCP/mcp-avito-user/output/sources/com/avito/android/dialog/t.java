package com.avito.android.dialog;

import com.avito.android.remote.model.DeepLinksDialogInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogWithDeeplinkActions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogWithDeeplinkActions f144798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLinksDialogInfo.Action f144799m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DialogWithDeeplinkActions dialogWithDeeplinkActions, DeepLinksDialogInfo.Action action) {
        super(0);
        this.f144798l = dialogWithDeeplinkActions;
        this.f144799m = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLinksDialogInfo.Action action = this.f144799m;
        DialogWithDeeplinkActions.f5(this.f144798l, action.getUriLink(), action.getTitle());
        return G0.f406611a;
    }
}
