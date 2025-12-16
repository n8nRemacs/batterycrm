package com.avito.android.campaigns_sale_search.network;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleSearchInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl", f = "CampaignsSaleSearchInteractor.kt", i = {0, 0, 0, 1, 1, 1}, l = {189, 190, 191}, m = "dismissBottomsheetEvents", n = {"$this$dismissBottomsheetEvents", "toastText", "toastType", "$this$dismissBottomsheetEvents", "toastText", "toastType"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes12.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f114828q;

    /* renamed from: r, reason: collision with root package name */
    public PrintableText f114829r;

    /* renamed from: s, reason: collision with root package name */
    public com.avito.android.component.toast.f f114830s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f114831t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f114832u;

    /* renamed from: v, reason: collision with root package name */
    public int f114833v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f114832u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f114831t = obj;
        this.f114833v |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.e(this.f114832u, null, null, null, this);
    }
}
