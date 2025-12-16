package com.avito.android.mortgage.sign.motions;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DragModifier.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage.sign.motions.DragModifierKt", f = "DragModifier.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {19, 23, 31}, m = "awaitDragMotionEvent", n = {"$this$awaitDragMotionEvent", "onDragStart", "onDrag", "onDragEnd", "$this$awaitDragMotionEvent", "onDrag", "onDragEnd", "down", "onDragEnd", "drag"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f203742q;

    /* renamed from: r, reason: collision with root package name */
    public Object f203743r;

    /* renamed from: s, reason: collision with root package name */
    public l f203744s;

    /* renamed from: t, reason: collision with root package name */
    public Object f203745t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f203746u;

    /* renamed from: v, reason: collision with root package name */
    public int f203747v;

    public a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f203746u = obj;
        this.f203747v |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.a(null, null, null, null, this);
    }
}
