package com.avito.android.campaigns_sale.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gm.C40705b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor", f = "CampaignsSaleActor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {317, 325, 332, 334}, m = "deleteBlock", n = {"this", "$this$deleteBlock", "previousState", "removedBlock", "newBlocks", "index", "this", "$this$deleteBlock", "previousState", "removedBlock", "newBlocks", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* renamed from: com.avito.android.campaigns_sale.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29301a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public w f114116q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f114117r;

    /* renamed from: s, reason: collision with root package name */
    public CampaignsSaleState f114118s;

    /* renamed from: t, reason: collision with root package name */
    public C40705b f114119t;

    /* renamed from: u, reason: collision with root package name */
    public List f114120u;

    /* renamed from: v, reason: collision with root package name */
    public int f114121v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114122w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f114123x;

    /* renamed from: y, reason: collision with root package name */
    public int f114124y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29301a(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f114123x = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f114122w = obj;
        this.f114124y |= BeduinInputModel.MIN_TEXT_VERSION;
        return w.c(this.f114123x, null, null, null, this);
    }
}
