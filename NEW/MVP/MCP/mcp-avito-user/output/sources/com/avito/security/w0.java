package com.avito.security;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class w0 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f338629a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f338630b;

    /* renamed from: c, reason: collision with root package name */
    private int f338631c;

    /* renamed from: d, reason: collision with root package name */
    private final int f338632d;

    public w0(int i12, int i13, int i14) {
        this.f338632d = i14;
        this.f338629a = i13;
        boolean z12 = i14 <= 0 ? i12 >= i13 : i12 <= i13;
        this.f338630b = z12;
        this.f338631c = z12 ? i12 : i13;
    }

    @Override // com.avito.security.u0
    public int b() {
        int i12 = this.f338631c;
        if (i12 != this.f338629a) {
            this.f338631c = this.f338632d + i12;
        } else {
            if (!this.f338630b) {
                throw new NoSuchElementException();
            }
            this.f338630b = false;
        }
        return i12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338630b;
    }
}
