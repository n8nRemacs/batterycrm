package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: JdkPattern.java */
@XY0.c
@InterfaceC37268l
@XY0.d
/* renamed from: com.google.common.base.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37280y extends AbstractC37264h implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f359067b;

    /* compiled from: JdkPattern.java */
    /* renamed from: com.google.common.base.y$a */
    public static final class a extends AbstractC37263g {

        /* renamed from: a, reason: collision with root package name */
        public final Matcher f359068a;

        public a(Matcher matcher) {
            matcher.getClass();
            this.f359068a = matcher;
        }

        @Override // com.google.common.base.AbstractC37263g
        public final int a() {
            return this.f359068a.end();
        }

        @Override // com.google.common.base.AbstractC37263g
        public final boolean b(int i12) {
            return this.f359068a.find(i12);
        }

        @Override // com.google.common.base.AbstractC37263g
        public final int c() {
            return this.f359068a.start();
        }
    }

    public C37280y(Pattern pattern) {
        pattern.getClass();
        this.f359067b = pattern;
    }

    public final a a(CharSequence charSequence) {
        return new a(this.f359067b.matcher(charSequence));
    }

    public final String toString() {
        return this.f359067b.toString();
    }
}
