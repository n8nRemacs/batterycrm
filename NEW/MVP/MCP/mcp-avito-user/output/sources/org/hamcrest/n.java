package org.hamcrest;

import java.io.IOException;

/* compiled from: StringDescription.java */
/* loaded from: classes7.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f420416a = new StringBuilder();

    @Override // org.hamcrest.a
    public final void c(char c12) {
        try {
            this.f420416a.append(c12);
        } catch (IOException e12) {
            throw new RuntimeException("Could not write description", e12);
        }
    }

    @Override // org.hamcrest.a
    public final void d(String str) {
        try {
            this.f420416a.append((CharSequence) str);
        } catch (IOException e12) {
            throw new RuntimeException("Could not write description", e12);
        }
    }

    public final String toString() {
        return this.f420416a.toString();
    }
}
