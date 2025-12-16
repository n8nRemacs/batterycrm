package bb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterMasterSelectionDataSource", f = "ArbiterMasterSelectionDataSource.kt", i = {}, l = {11}, m = "getMasterPackage-gIAlu-s", n = {}, s = {})
/* renamed from: bb1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C25626d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57217q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f57218r;

    /* renamed from: s, reason: collision with root package name */
    public int f57219s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25626d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f57218r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f57217q = obj;
        this.f57219s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objA = this.f57218r.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
    }
}
