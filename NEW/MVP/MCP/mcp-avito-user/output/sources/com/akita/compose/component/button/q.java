package com.akita.compose.component.button;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ButtonState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.button.ButtonState", f = "ButtonState.kt", i = {0, 0}, l = {34}, m = "shake", n = {"this", "animData"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public r f60821q;

    /* renamed from: r, reason: collision with root package name */
    public a f60822r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f60823s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f60824t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f60825u;

    /* renamed from: v, reason: collision with root package name */
    public int f60826v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f60825u = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f60824t = obj;
        this.f60826v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f60825u.a(this);
    }
}
