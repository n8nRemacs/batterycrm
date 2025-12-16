package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;
import okhttp3.internal.http2.Http2;

/* loaded from: classes8.dex */
public enum EnumerationState implements a.d, a.InterfaceC11985a {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    ENUMERATION(Http2.INITIAL_MAX_FRAME_SIZE);


    /* renamed from: b, reason: collision with root package name */
    public final int f416266b;

    EnumerationState(int i12) {
        this.f416266b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416266b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return Http2.INITIAL_MAX_FRAME_SIZE;
    }
}
