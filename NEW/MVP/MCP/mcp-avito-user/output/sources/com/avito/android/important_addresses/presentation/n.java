package com.avito.android.important_addresses.presentation;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.important_addresses.presentation.ImportantAddressesState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ClickType;", "clickType", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/important_addresses/presentation/ClickType;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$attachView$1", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class n extends SuspendLambda implements Y41.p<ClickType, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f169672q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f169673r;

    /* compiled from: ImportantAddressesPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ClickType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClickType clickType = ClickType.f169582b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f169673r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f169673r, continuation);
        nVar.f169672q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(ClickType clickType, Continuation<? super G0> continuation) {
        return ((n) create(clickType, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        int iOrdinal = ((ClickType) this.f169672q).ordinal();
        m mVar = this.f169673r;
        if (iOrdinal == 0) {
            mVar.f169649d.g();
            ImportantAddressesState importantAddressesState = mVar.f169654i;
            DeepLink deepLink = importantAddressesState instanceof ImportantAddressesState.ContentWithoutAddresses ? ((ImportantAddressesState.ContentWithoutAddresses) importantAddressesState).f169608h.f169581d : importantAddressesState instanceof ImportantAddressesState.ContentWithAddresses ? ((ImportantAddressesState.ContentWithAddresses) importantAddressesState).f169600g.f169581d : null;
            if (deepLink != null) {
                b.a.a(mVar.f169647b, deepLink, "key.important_addresses_request_key", null, 4);
            }
        } else if (iOrdinal == 1) {
            mVar.f169652g.c();
            ImportantAddressesState importantAddressesState2 = mVar.f169654i;
            DeepLink deepLink2 = importantAddressesState2 instanceof ImportantAddressesState.ContentWithoutAddresses ? ((ImportantAddressesState.ContentWithoutAddresses) importantAddressesState2).f169605e : importantAddressesState2 instanceof ImportantAddressesState.ContentWithAddresses ? ((ImportantAddressesState.ContentWithAddresses) importantAddressesState2).f169598e : null;
            if (deepLink2 != null) {
                b.a.a(mVar.f169647b, deepLink2, null, null, 6);
            }
        }
        return G0.f406611a;
    }
}
