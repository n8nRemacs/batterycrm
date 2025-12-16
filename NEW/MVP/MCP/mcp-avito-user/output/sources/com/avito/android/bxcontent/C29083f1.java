package com.avito.android.bxcontent;

import com.avito.android.saved_searches.analytics.SavedSearchEntryPointType;
import com.avito.android.serp_list.Mode;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp_list/Mode;", "mode", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/serp_list/Mode;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentViewImpl$11", f = "BxContentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.f1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29083f1 extends SuspendLambda implements Y41.p<Mode, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111069q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f111070r;

    /* compiled from: BxContentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.f1$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.f273992b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29083f1(C29240o1 c29240o1, Continuation<? super C29083f1> continuation) {
        super(2, continuation);
        this.f111070r = c29240o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29083f1 c29083f1 = new C29083f1(this.f111070r, continuation);
        c29083f1.f111069q = obj;
        return c29083f1;
    }

    @Override // Y41.p
    public final Object invoke(Mode mode, Continuation<? super kotlin.G0> continuation) {
        return ((C29083f1) create(mode, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        SavedSearchEntryPointType savedSearchEntryPointType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Mode mode = (Mode) this.f111069q;
        com.avito.android.saved_searches.analytics.c cVar = this.f111070r.f112728i;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            savedSearchEntryPointType = SavedSearchEntryPointType.f258244d;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            savedSearchEntryPointType = SavedSearchEntryPointType.f258245e;
        }
        cVar.a(savedSearchEntryPointType, true);
        return kotlin.G0.f406611a;
    }
}
