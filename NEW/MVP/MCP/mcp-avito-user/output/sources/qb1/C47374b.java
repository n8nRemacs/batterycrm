package qb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import nb1.C44374a;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage", f = "DataStorePushStorage.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "getPushToken-JT9GLNw", n = {}, s = {})
/* renamed from: qb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47374b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f429305q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f429306r;

    /* renamed from: s, reason: collision with root package name */
    public int f429307s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47374b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f429306r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f429305q = obj;
        this.f429307s |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f429306r.b(this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : new C44374a((String) objB);
    }
}
