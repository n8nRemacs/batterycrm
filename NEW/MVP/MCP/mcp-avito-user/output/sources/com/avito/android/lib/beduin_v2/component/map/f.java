package com.avito.android.lib.beduin_v2.component.map;

import android.content.Context;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MapPinsLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.component.map.MapPinsLoader", f = "MapPinsLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {51, 162, 64}, m = "loadPins", n = {"this", "context", "styleProvider", "pins", "this", "context", "styleProvider", "pins", "newRemoteImagesCache", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f175825q;

    /* renamed from: r, reason: collision with root package name */
    public Context f175826r;

    /* renamed from: s, reason: collision with root package name */
    public com.avito.beduin.v2.theme.k f175827s;

    /* renamed from: t, reason: collision with root package name */
    public List f175828t;

    /* renamed from: u, reason: collision with root package name */
    public Map f175829u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f175830v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f175831w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f175832x;

    /* renamed from: y, reason: collision with root package name */
    public int f175833y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f175832x = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f175831w = obj;
        this.f175833y |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f175832x.b(null, null, null, this);
    }
}
