package ru.cyberity.input.infoproviders;

import Y61.k;
import android.hardware.Camera;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: CameraInfoProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/f;", "Lru/cyberity/fingerprint/infoproviders/e;", "", "Lru/cyberity/fingerprint/infoproviders/d;", "a", "", "type", "", "getCameraInfo", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f implements e {

    /* compiled from: CameraInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lru/cyberity/fingerprint/infoproviders/d;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<List<? extends d>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d> invoke() {
            return f.this.a();
        }
    }

    @Override // ru.cyberity.input.infoproviders.e
    @k
    public List<d> getCameraInfo() {
        Object objA = c.a(0L, new a(), 1, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = c42784z0;
        }
        return (List) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<d> a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        for (int i12 = 0; i12 < numberOfCameras; i12++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i12, cameraInfo);
            linkedList.add(new d(String.valueOf(i12), a(cameraInfo.facing), String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }

    private final String a(int type) {
        if (type == 0) {
            return "back";
        }
        if (type != 1) {
            return "";
        }
        return "front";
    }
}
