package com.avito.android.important_addresses_selection.deeplink;

import Y41.p;
import androidx.fragment.app.DialogFragment;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData;", "result", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses_selection.deeplink.ImportantAddressesSelectionDeeplinkHandler$handleScreenOpening$2", f = "ImportantAddressesSelectionDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<ImportantAddressesSelectionData, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f169728q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f169729r;

    /* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DialogFragment> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ImportantAddressesSelectionData f169730l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImportantAddressesSelectionData importantAddressesSelectionData) {
            super(0);
            this.f169730l = importantAddressesSelectionData;
        }

        @Override // Y41.a
        public final DialogFragment invoke() {
            ImportantAddressesSelectionDialogFragment.f169783p0.getClass();
            return ImportantAddressesSelectionDialogFragment.a.a(this.f169730l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f169729r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f169729r, continuation);
        dVar.f169728q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(ImportantAddressesSelectionData importantAddressesSelectionData, Continuation<? super G0> continuation) {
        return ((d) create(importantAddressesSelectionData, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ImportantAddressesSelectionData importantAddressesSelectionData = (ImportantAddressesSelectionData) this.f169728q;
        f fVar = this.f169729r;
        fVar.f169740k.g(fVar.d(), false);
        fVar.f169737h.D0("tag.important_addresses_selection", new a(importantAddressesSelectionData));
        return G0.f406611a;
    }
}
