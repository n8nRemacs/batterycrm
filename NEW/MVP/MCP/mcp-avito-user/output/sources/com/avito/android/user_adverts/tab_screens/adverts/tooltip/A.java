package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7}, l = {145, 147, 349, 159, 162, 163, 353, 165}, m = "playMultiItemGroupTooltip", n = {"this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", "pos", "this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", "pos", "scrollDistance", "this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", "pos", "this", "$this$playMultiItemGroupTooltip", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", "pos", "this", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", TooltipAttribute.ATTRIBUTE_TYPE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes5.dex */
final class A extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f315543q;

    /* renamed from: r, reason: collision with root package name */
    public Object f315544r;

    /* renamed from: s, reason: collision with root package name */
    public Object f315545s;

    /* renamed from: t, reason: collision with root package name */
    public String f315546t;

    /* renamed from: u, reason: collision with root package name */
    public int f315547u;

    /* renamed from: v, reason: collision with root package name */
    public int f315548v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f315549w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C35695e f315550x;

    /* renamed from: y, reason: collision with root package name */
    public int f315551y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315550x = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315549w = obj;
        this.f315551y |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35695e.f315633d;
        return this.f315550x.h(null, null, this);
    }
}
