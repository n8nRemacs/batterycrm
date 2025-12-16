package hb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.interactor.DeletePushTokenIfClientModeChangedInteractor", f = "DeletePushTokenIfClientModeChangedInteractor.kt", i = {0, 0}, l = {14, 16}, m = "invoke", n = {"this", "testModeEnabled"}, s = {"L$0", "Z$0"})
/* renamed from: hb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40909a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C40910b f397277q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f397278r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40910b f397279s;

    /* renamed from: t, reason: collision with root package name */
    public int f397280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40909a(C40910b c40910b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f397279s = c40910b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f397278r = obj;
        this.f397280t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f397279s.a(this);
    }
}
