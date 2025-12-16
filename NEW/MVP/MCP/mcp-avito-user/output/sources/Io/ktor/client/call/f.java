package io.ktor.client.call;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedCall.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {73}, m = "save", n = {"$this$save"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f398814q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f398815r;

    /* renamed from: s, reason: collision with root package name */
    public int f398816s;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f398815r = obj;
        this.f398816s |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.a(null, this);
    }
}
