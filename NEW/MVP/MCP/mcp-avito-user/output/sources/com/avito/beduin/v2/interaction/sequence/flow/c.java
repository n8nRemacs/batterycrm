package com.avito.beduin.v2.interaction.sequence.flow;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SequenceInteractionHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.beduin.v2.interaction.sequence.flow.SequenceInteractionHandler", f = "SequenceInteractionHandler.kt", i = {0}, l = {36}, m = "emitAll", n = {"$this$emitAll"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f337846q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f337847r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f337848s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f337849t;

    /* renamed from: u, reason: collision with root package name */
    public int f337850u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f337849t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f337848s = obj;
        this.f337850u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f337849t.q(null, null, this);
    }
}
