package Fc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "feedback.shared.sdk.api.validators.ConditionValidator", f = "ConditionValidator.kt", i = {0}, l = {70}, m = "pauseCampaignDelay", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class T extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public U f5182q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5183r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f5184s;

    /* renamed from: t, reason: collision with root package name */
    public int f5185t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5184s = u12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f5183r = obj;
        this.f5185t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f5184s.a(this);
    }
}
