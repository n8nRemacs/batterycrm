package com.avito.android.deep_linking.action_select_link;

import Y41.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionSelectLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f132882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f132883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f132884n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, Bundle bundle) {
        super(1);
        this.f132882l = cVar;
        this.f132883m = str;
        this.f132884n = bundle;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        c cVar = this.f132882l;
        String str = this.f132883m;
        Bundle bundle = this.f132884n;
        cVar.f132890e.r6(bundle, deepLink, str);
        return G0.f406611a;
    }
}
