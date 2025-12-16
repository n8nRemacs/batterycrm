package com.avito.android.crm_candidates.features.add_note.logics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmAddNoteActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.features.add_note.logics.JobCrmAddNoteActor", f = "JobCrmAddNoteActor.kt", i = {0, 0, 0, 1}, l = {76, 77, 84, 92}, m = "updateNote", n = {"this", "$this$updateNote", "noteText", "$this$updateNote"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f129436q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f129437r;

    /* renamed from: s, reason: collision with root package name */
    public String f129438s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f129439t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f129440u;

    /* renamed from: v, reason: collision with root package name */
    public int f129441v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129440u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129439t = obj;
        this.f129441v |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.c(this.f129440u, null, null, this);
    }
}
