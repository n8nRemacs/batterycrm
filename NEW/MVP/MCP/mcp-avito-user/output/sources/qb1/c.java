package qb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage", f = "DataStorePushStorage.kt", i = {}, l = {36}, m = "isPushTokenDeliveredToClientApp", n = {}, s = {})
/* loaded from: classes9.dex */
public final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f429308q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f429309r;

    /* renamed from: s, reason: collision with root package name */
    public int f429310s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f429309r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f429308q = obj;
        this.f429310s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f429309r.c(this);
    }
}
