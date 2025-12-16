package com.avito.beduin.v2.interaction.launch.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LaunchInteractionHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.beduin.v2.interaction.launch.flow.LaunchInteractionHandler", f = "LaunchInteractionHandler.kt", i = {0, 0, 0, 0}, l = {76, 72}, m = "launchForResult", n = {"this", "$this$launchForResult", "interaction", "factory"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes5.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f337457q;

    /* renamed from: r, reason: collision with root package name */
    public c f337458r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f337459s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f337460t;

    /* renamed from: u, reason: collision with root package name */
    public int f337461u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f337460t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f337459s = obj;
        this.f337461u |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.q(this.f337460t, null, null, null, this);
    }
}
