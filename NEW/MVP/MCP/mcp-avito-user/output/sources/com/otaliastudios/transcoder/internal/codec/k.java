package com.otaliastudios.transcoder.internal.codec;

import android.view.Surface;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: Encoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/k;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface k extends com.otaliastudios.transcoder.internal.pipeline.b {
    @Y61.l
    Q<ByteBuffer, Integer> a();

    @Y61.l
    Surface getSurface();
}
