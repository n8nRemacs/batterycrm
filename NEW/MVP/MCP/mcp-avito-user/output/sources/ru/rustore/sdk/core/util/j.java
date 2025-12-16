package ru.rustore.sdk.core.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.Executor;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;

/* compiled from: TaskCoroutineExtensions.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt", f = "TaskCoroutineExtensions.kt", i = {0, 0}, l = {36}, m = "toSuspendResult", n = {"$this$toSuspendResult", "executor"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class j<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Executor f436811q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f436812r;

    /* renamed from: s, reason: collision with root package name */
    public int f436813s;

    public j() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f436812r = obj;
        this.f436813s = (this.f436813s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f436813s;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            Object obj2 = ((Z) obj).f406625b;
            return obj2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj2 : Z.a(obj2);
        }
        C42729a0.b(obj);
        M m12 = (M) getF411447c().get(M.f410711b);
        Executor executorA = m12 != null ? A0.a(m12) : null;
        this.f436811q = executorA;
        this.f436813s = 1;
        new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this)).p();
        executorA.getClass();
        throw null;
    }
}
