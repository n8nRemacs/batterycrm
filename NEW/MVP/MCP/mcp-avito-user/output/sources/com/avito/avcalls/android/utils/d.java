package com.avito.avcalls.android.utils;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: ByteBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/d;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f332465a;

    public d(int i12) {
        this.f332465a = ByteBuffer.allocate(i12);
    }

    public final void a(short s5) {
        this.f332465a.putShort(s5);
    }
}
