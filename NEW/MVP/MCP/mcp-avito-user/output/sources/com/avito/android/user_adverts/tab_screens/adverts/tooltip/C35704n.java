package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer", f = "UserAdvertsTooltipsPlayer.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {180, 346}, m = "newParanja", n = {"this", "$this$newParanja", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle", "this", "$this$newParanja", TooltipAttribute.ATTRIBUTE_TYPE, "buttonTitle"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35704n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35695e f315658q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.user_adverts_views_pub.c f315659r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC35693c.C9780c f315660s;

    /* renamed from: t, reason: collision with root package name */
    public String f315661t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f315662u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35695e f315663v;

    /* renamed from: w, reason: collision with root package name */
    public int f315664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35704n(C35695e c35695e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f315663v = c35695e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f315662u = obj;
        this.f315664w |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35695e.f315633d;
        return this.f315663v.e(null, null, null, this);
    }
}
