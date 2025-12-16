package com.facebook.imagepipeline.decoder;

import YW0.g;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.List;

/* compiled from: SimpleProgressiveJpegConfig.java */
@Nullsafe
/* loaded from: classes12.dex */
public class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f340407a = new b();

    /* compiled from: SimpleProgressiveJpegConfig.java */
    public static class b implements c {
        public b() {
        }
    }

    /* compiled from: SimpleProgressiveJpegConfig.java */
    public interface c {
    }

    @Override // com.facebook.imagepipeline.decoder.d
    public final int a(int i12) {
        ((b) this.f340407a).getClass();
        List list = Collections.EMPTY_LIST;
        if (list == null || list.isEmpty()) {
            return i12 + 1;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (((Integer) list.get(i13)).intValue() > i12) {
                return ((Integer) list.get(i13)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.facebook.imagepipeline.decoder.d
    public final g b(int i12) {
        this.f340407a.getClass();
        boolean z12 = i12 >= 0;
        g gVar = new g();
        gVar.f19508a = i12;
        gVar.f19509b = z12;
        gVar.f19510c = false;
        return gVar;
    }
}
