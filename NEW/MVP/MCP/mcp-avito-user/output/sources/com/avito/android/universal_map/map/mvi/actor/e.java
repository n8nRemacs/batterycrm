package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapViewActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.MapViewActor", f = "MapViewActor.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {234, 240, 249}, m = "showUserLocation", n = {"$this$showUserLocation", "previousState", "avitoMapPoint", "isPermissionDenied", "moveCamera", "$this$showUserLocation", "isPermissionDenied"}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "Z$0"})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f305337q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.universal_map.map.mvi.entity.e f305338r;

    /* renamed from: s, reason: collision with root package name */
    public AvitoMapPoint f305339s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f305340t;

    /* renamed from: u, reason: collision with root package name */
    public int f305341u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f305342v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f305343w;

    /* renamed from: x, reason: collision with root package name */
    public int f305344x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f305343w = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f305342v = obj;
        this.f305344x |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.d(this.f305343w, null, null, null, false, this);
    }
}
