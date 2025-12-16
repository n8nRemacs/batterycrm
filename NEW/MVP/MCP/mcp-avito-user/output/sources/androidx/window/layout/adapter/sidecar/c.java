package androidx.window.layout.adapter.sidecar;

import Y41.l;
import Y61.k;
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SidecarAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements l<SidecarDisplayFeature, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f55290l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@k SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z12 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
