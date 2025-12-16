package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {0, 1}, l = {59, 64}, m = "playTooltip", n = {"overlayView", "overlayView"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public View f315552q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35695e f315554s;

    /* renamed from: t, reason: collision with root package name */
    public int f315555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315554s = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315553r = obj;
        this.f315555t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f315554s.i(null, null, null, this);
    }
}
