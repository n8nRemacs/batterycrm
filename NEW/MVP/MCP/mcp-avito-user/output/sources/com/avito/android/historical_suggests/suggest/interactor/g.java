package com.avito.android.historical_suggests.suggest.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.printable_text.PrintableText;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;
import okhttp3.internal.ws.WebSocketProtocol;
import sI.C48054c;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {107, 120, WebSocketProtocol.PAYLOAD_SHORT}, m = "getV3Suggests", n = {"this", "useNewSuggestDesign", "this", "useNewSuggestDesign", "destination$iv$iv", "block", "destination$iv$iv", "index$iv$iv", "this", "useNewSuggestDesign", "destination$iv$iv", "block"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "L$6", "I$0", "L$0", "L$1", "L$2", "L$4"})
/* loaded from: classes13.dex */
final class g extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f162042A;

    /* renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f162043B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ m f162044C;

    /* renamed from: D, reason: collision with root package name */
    public int f162045D;

    /* renamed from: q, reason: collision with root package name */
    public m f162046q;

    /* renamed from: r, reason: collision with root package name */
    public l0.a f162047r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f162048s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f162049t;

    /* renamed from: u, reason: collision with root package name */
    public C48054c f162050u;

    /* renamed from: v, reason: collision with root package name */
    public PrintableText f162051v;

    /* renamed from: w, reason: collision with root package name */
    public Collection f162052w;

    /* renamed from: x, reason: collision with root package name */
    public Iterator f162053x;

    /* renamed from: y, reason: collision with root package name */
    public Collection f162054y;

    /* renamed from: z, reason: collision with root package name */
    public Collection f162055z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162044C = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162043B = obj;
        this.f162045D |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.d(this.f162044C, null, null, this);
    }
}
