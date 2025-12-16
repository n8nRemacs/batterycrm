package com.otaliastudios.opengl.buffer;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.f;
import com.otaliastudios.opengl.core.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: GlBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/buffer/a;", "Lcom/otaliastudios/opengl/core/g;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class a implements g {
    public a(int i12, Integer num, int i13, C42822w c42822w) {
        if (((i13 & 2) != 0 ? null : num) == null) {
            int i14 = new int[]{iArr[0]}[0];
            int i15 = s0.f410475c;
            int[] iArr = {i14};
            GLES20.glGenBuffers(1, iArr, 0);
            G0 g02 = G0.f406611a;
            f.b("glGenBuffers");
        }
    }
}
