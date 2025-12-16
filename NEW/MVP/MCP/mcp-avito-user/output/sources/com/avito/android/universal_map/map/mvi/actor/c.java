package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapViewActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor", f = "MapViewActor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {205, 206, 214, JfifUtil.MARKER_RST7, JfifUtil.MARKER_SOI}, m = "handleSelectedPin", n = {"this", "$this$handleSelectedPin", "clickedMarker", "previousState", "this", "$this$handleSelectedPin", "clickedMarker", "previousState", "this", "$this$handleSelectedPin", "clickedMarker", "previousState", "this", "$this$handleSelectedPin", "clickedMarker", "previousState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes4.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f305276q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f305277r;

    /* renamed from: s, reason: collision with root package name */
    public Marker.Pin f305278s;

    /* renamed from: t, reason: collision with root package name */
    public com.avito.android.universal_map.map.mvi.entity.e f305279t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f305280u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f305281v;

    /* renamed from: w, reason: collision with root package name */
    public int f305282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f305281v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f305280u = obj;
        this.f305282w |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f305281v, null, null, null, this);
    }
}
