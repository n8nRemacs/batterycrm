package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DialogActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.step.dialog.mvi.DialogActor", f = "DialogActor.kt", i = {0, 0}, l = {70, 72}, m = "handleUpdateState", n = {"this", "newStates"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f249413q;

    /* renamed from: r, reason: collision with root package name */
    public List f249414r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f249415s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f249416t;

    /* renamed from: u, reason: collision with root package name */
    public int f249417u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249416t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f249415s = obj;
        this.f249417u |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f249416t, null, null, this);
    }
}
