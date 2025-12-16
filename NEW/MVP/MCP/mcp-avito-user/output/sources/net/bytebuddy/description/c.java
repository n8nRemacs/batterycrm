package net.bytebuddy.description;

import net.bytebuddy.description.modifier.Visibility;
import okhttp3.internal.http2.Http2;

/* compiled from: ModifierReviewable.java */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: ModifierReviewable.java */
    public static abstract class a implements e, b, InterfaceC11968c, d {
        @Override // net.bytebuddy.description.c.e
        public final boolean E() {
            return x0(512);
        }

        @Override // net.bytebuddy.description.c.h
        public final boolean I() {
            return x0(Http2.INITIAL_MAX_FRAME_SIZE);
        }

        @Override // net.bytebuddy.description.c.g
        public final boolean O() {
            return x0(2);
        }

        public String R() {
            return toString();
        }

        @Override // net.bytebuddy.description.c.e
        public boolean X() {
            return x0(8192);
        }

        @Override // net.bytebuddy.description.c.g
        public final boolean b() {
            return x0(8);
        }

        @Override // net.bytebuddy.description.c.g
        public final boolean e0() {
            return x0(1);
        }

        public String getTypeName() {
            return toString();
        }

        @Override // net.bytebuddy.description.c.g
        public final Visibility getVisibility() {
            int modifiers = getModifiers();
            int i12 = modifiers & 7;
            if (i12 == 0) {
                return Visibility.PACKAGE_PRIVATE;
            }
            if (i12 == 1) {
                return Visibility.PUBLIC;
            }
            if (i12 == 2) {
                return Visibility.PRIVATE;
            }
            if (i12 == 4) {
                return Visibility.PROTECTED;
            }
            throw new IllegalStateException(AK.c.g(modifiers, "Unexpected modifiers: "));
        }

        @Override // net.bytebuddy.description.c.f
        public final boolean isAbstract() {
            return x0(1024);
        }

        @Override // net.bytebuddy.description.c
        public final boolean isFinal() {
            return x0(16);
        }

        @Override // net.bytebuddy.description.c
        public boolean isSynthetic() {
            return x0(4096);
        }

        @Override // net.bytebuddy.description.c.g
        public final boolean k0() {
            return x0(4);
        }

        @Override // net.bytebuddy.description.c.InterfaceC11968c
        public final boolean m0() {
            return x0(256);
        }

        @Override // net.bytebuddy.description.c.g
        public final boolean p0() {
            return (x0(1) || x0(4) || x0(2)) ? false : true;
        }

        public final boolean x0(int i12) {
            return (getModifiers() & i12) == i12;
        }

        @Override // net.bytebuddy.description.c.InterfaceC11968c
        public boolean y() {
            return x0(64);
        }
    }

    /* compiled from: ModifierReviewable.java */
    public interface b extends h {
    }

    /* compiled from: ModifierReviewable.java */
    /* renamed from: net.bytebuddy.description.c$c, reason: collision with other inner class name */
    public interface InterfaceC11968c extends f {
        boolean m0();

        boolean y();
    }

    /* compiled from: ModifierReviewable.java */
    public interface d extends c {
    }

    /* compiled from: ModifierReviewable.java */
    public interface e extends f, h {
        boolean E();

        boolean X();
    }

    /* compiled from: ModifierReviewable.java */
    public interface f extends g {
        boolean isAbstract();
    }

    /* compiled from: ModifierReviewable.java */
    public interface g extends c {
        boolean O();

        boolean b();

        boolean e0();

        Visibility getVisibility();

        boolean k0();

        boolean p0();
    }

    /* compiled from: ModifierReviewable.java */
    public interface h extends g {
        boolean I();
    }

    int getModifiers();

    boolean isFinal();

    boolean isSynthetic();
}
