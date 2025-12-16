package jW0;

import com.bumptech.glide.load.h;
import com.bumptech.glide.util.m;
import j.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* renamed from: jW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42313a implements h {

    /* renamed from: b, reason: collision with root package name */
    public final int f405620b;

    /* renamed from: c, reason: collision with root package name */
    public final h f405621c;

    public C42313a(int i12, h hVar) {
        this.f405620b = i12;
        this.f405621c = hVar;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        this.f405621c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f405620b).array());
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof C42313a)) {
            return false;
        }
        C42313a c42313a = (C42313a) obj;
        return this.f405620b == c42313a.f405620b && this.f405621c.equals(c42313a.f405621c);
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return m.g(this.f405620b, this.f405621c);
    }
}
