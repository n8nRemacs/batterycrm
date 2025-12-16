package jb1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.DeletePushTokenIfExistsUseCase", f = "DeletePushTokenIfExistsUseCase.kt", i = {0, 0, 1}, l = {16, 19, 23}, m = "invoke", n = {"this", "deleteRemote", "this"}, s = {"L$0", "Z$0", "L$0"})
/* renamed from: jb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42351b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f405672q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f405673r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f405674s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f405675t;

    /* renamed from: u, reason: collision with root package name */
    public int f405676u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42351b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f405675t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f405674s = obj;
        this.f405676u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f405675t.a(false, this);
    }
}
