package com.otaliastudios.transcoder.internal.audio;

import Y61.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: shorts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/audio/f;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f366034a = new LinkedHashMap();

    @k
    public final ShortBuffer a(int i12, @k String str) {
        LinkedHashMap linkedHashMap = this.f366034a;
        Object objAsShortBuffer = linkedHashMap.get(str);
        if (objAsShortBuffer == null || ((ShortBuffer) objAsShortBuffer).capacity() < i12) {
            objAsShortBuffer = ByteBuffer.allocateDirect(i12 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        ShortBuffer shortBuffer = (ShortBuffer) objAsShortBuffer;
        shortBuffer.clear();
        shortBuffer.limit(i12);
        linkedHashMap.put(str, objAsShortBuffer);
        return shortBuffer;
    }
}
