package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import hP0.C40863a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinCreationActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.components.WalletPinCreationActor", f = "WalletPinCreationActor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {223, JfifUtil.MARKER_APP1, 234, 243, 248, 253}, m = "handleBiometry", n = {"this", "$this$handleBiometry", "enteredPin", "biometryInfo", "events", "this", "$this$handleBiometry", "biometryInfo", "events"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328522q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f328523r;

    /* renamed from: s, reason: collision with root package name */
    public Object f328524s;

    /* renamed from: t, reason: collision with root package name */
    public Object f328525t;

    /* renamed from: u, reason: collision with root package name */
    public C40863a f328526u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f328527v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f328528w;

    /* renamed from: x, reason: collision with root package name */
    public int f328529x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328528w = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328527v = obj;
        this.f328529x |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = a.f328514h;
        return this.f328528w.f(null, null, null, null, this);
    }
}
