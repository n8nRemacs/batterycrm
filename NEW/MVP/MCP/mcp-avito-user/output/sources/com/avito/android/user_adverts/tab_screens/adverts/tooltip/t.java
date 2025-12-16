package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {0, 0, 0, 1, 1, 1}, l = {92, 346}, m = "playMultiActionTooltip", n = {"this", "$this$playMultiActionTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "this", "$this$playMultiActionTooltip", TooltipAttribute.ATTRIBUTE_TYPE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35695e f315687q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.l f315688r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC35693c.b f315689s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f315690t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C35695e f315691u;

    /* renamed from: v, reason: collision with root package name */
    public int f315692v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315691u = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315690t = obj;
        this.f315692v |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35695e.f315633d;
        return this.f315691u.g(null, null, this);
    }
}
