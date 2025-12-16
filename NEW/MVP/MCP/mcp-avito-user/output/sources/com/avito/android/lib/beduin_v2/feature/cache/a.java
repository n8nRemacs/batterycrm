package com.avito.android.lib.beduin_v2.feature.cache;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BeduinRequestWithPatternCache.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.cache.BeduinRequestWithPatternCache", f = "BeduinRequestWithPatternCache.kt", i = {0, 0, 0, 1, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 32}, m = "fetchContent", n = {"this", TooltipAttribute.PARAM_DEEP_LINK, "sourceId", "this", "sourceId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes14.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f175992q;

    /* renamed from: r, reason: collision with root package name */
    public Object f175993r;

    /* renamed from: s, reason: collision with root package name */
    public String f175994s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f175995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f175996u;

    /* renamed from: v, reason: collision with root package name */
    public int f175997v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f175996u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f175995t = obj;
        this.f175997v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f175996u.a(null, null, this);
    }
}
