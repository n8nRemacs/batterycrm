package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5}, l = {75, 77, 81, 82, 349, 84}, m = "playMultiAction", n = {"this", "$this$playMultiAction", TooltipAttribute.ATTRIBUTE_TYPE, "this", "$this$playMultiAction", TooltipAttribute.ATTRIBUTE_TYPE, "this", "$this$playMultiAction", TooltipAttribute.ATTRIBUTE_TYPE, "pos", "this", "$this$playMultiAction", TooltipAttribute.ATTRIBUTE_TYPE, "pos", "this", TooltipAttribute.ATTRIBUTE_TYPE, TooltipAttribute.ATTRIBUTE_TYPE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$0"})
/* loaded from: classes5.dex */
final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f315680q;

    /* renamed from: r, reason: collision with root package name */
    public Object f315681r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC35693c.b f315682s;

    /* renamed from: t, reason: collision with root package name */
    public int f315683t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f315684u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35695e f315685v;

    /* renamed from: w, reason: collision with root package name */
    public int f315686w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315685v = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315684u = obj;
        this.f315686w |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35695e.f315633d;
        return this.f315685v.f(null, null, this);
    }
}
