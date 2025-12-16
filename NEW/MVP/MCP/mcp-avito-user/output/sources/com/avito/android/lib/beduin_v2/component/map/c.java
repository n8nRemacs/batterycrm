package com.avito.android.lib.beduin_v2.component.map;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MapPinsLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader", f = "MapPinsLoader.kt", i = {0, 0}, l = {82}, m = "createMarkers", n = {"this", "pinViewsSet"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f175801q;

    /* renamed from: r, reason: collision with root package name */
    public Set f175802r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f175803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f175804t;

    /* renamed from: u, reason: collision with root package name */
    public int f175805u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f175804t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f175803s = obj;
        this.f175805u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f175804t.a(null, null, null, null, this);
    }
}
