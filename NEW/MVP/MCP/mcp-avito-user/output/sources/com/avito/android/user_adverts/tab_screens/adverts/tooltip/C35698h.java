package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {}, l = {284}, m = "awaitItemPositionExist", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35698h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f315641q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35695e f315642r;

    /* renamed from: s, reason: collision with root package name */
    public int f315643s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35698h(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315642r = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315641q = obj;
        this.f315643s |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35695e.f315633d;
        return this.f315642r.b(null, 0L, this);
    }
}
