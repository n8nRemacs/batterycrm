package com.otaliastudios.opengl.texture;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.f;
import com.otaliastudios.opengl.core.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: GlFramebuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/texture/b;", "Lcom/otaliastudios/opengl/core/g;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements g {
    public b() {
        this(null, 1, null);
    }

    public b(Integer num, int i12, C42822w c42822w) {
        if (((i12 & 1) != 0 ? null : num) == null) {
            int i13 = new int[]{iArr[0]}[0];
            int i14 = s0.f410475c;
            int[] iArr = {i13};
            GLES20.glGenFramebuffers(1, iArr, 0);
            G0 g02 = G0.f406611a;
            f.b("glGenFramebuffers");
        }
    }
}
