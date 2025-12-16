package com.avito.android.campaigns_sale.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleBlocksResolver.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl", f = "CampaignsSaleBlocksResolver.kt", i = {0, 0}, l = {276, 286, 286}, m = "loadImages", n = {"$this$loadImages", "listOfDeferred"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f114058q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f114059r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f114060s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f114061t;

    /* renamed from: u, reason: collision with root package name */
    public int f114062u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f114061t = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f114060s = obj;
        this.f114062u |= BeduinInputModel.MIN_TEXT_VERSION;
        return D.c(this.f114061t, null, null, this);
    }
}
