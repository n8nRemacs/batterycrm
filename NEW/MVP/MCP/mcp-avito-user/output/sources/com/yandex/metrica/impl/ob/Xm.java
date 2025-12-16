package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Xm extends Um {

    /* renamed from: b, reason: collision with root package name */
    public final int f379942b;

    public Xm(int i12, int i13) {
        super(i13);
        this.f379942b = i12;
    }

    @Override // com.yandex.metrica.impl.ob.Um
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb2.append(this.f379942b);
        sb2.append(", bytesTruncated=");
        return androidx.appcompat.app.r.t(sb2, this.f379748a, '}');
    }
}
