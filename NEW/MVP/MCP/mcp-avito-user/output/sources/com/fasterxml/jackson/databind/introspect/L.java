package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.L;
import java.io.Serializable;

/* compiled from: VisibilityChecker.java */
/* loaded from: classes4.dex */
public interface L<T extends L<T>> {

    /* compiled from: VisibilityChecker.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341996a;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f341996a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341996a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341996a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341996a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f341996a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f341996a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: VisibilityChecker.java */
    public static class b implements L<b>, Serializable {

        /* renamed from: g, reason: collision with root package name */
        public static final b f341997g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f341998h;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final JsonAutoDetect.Visibility f341999b;

        /* renamed from: c, reason: collision with root package name */
        public final JsonAutoDetect.Visibility f342000c;

        /* renamed from: d, reason: collision with root package name */
        public final JsonAutoDetect.Visibility f342001d;

        /* renamed from: e, reason: collision with root package name */
        public final JsonAutoDetect.Visibility f342002e;

        /* renamed from: f, reason: collision with root package name */
        public final JsonAutoDetect.Visibility f342003f;

        static {
            JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.f340909c;
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.f340908b;
            f341997g = new b(visibility, visibility, visibility2, visibility2, visibility);
            f341998h = new b(visibility, visibility, visibility, visibility, visibility);
        }

        public b(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this.f341999b = visibility;
            this.f342000c = visibility2;
            this.f342001d = visibility3;
            this.f342002e = visibility4;
            this.f342003f = visibility5;
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final boolean a(C36472k c36472k) {
            return this.f341999b.a(c36472k.f342054e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final boolean b(C36469h c36469h) {
            return this.f342003f.a(c36469h.f342042d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final boolean c(C36472k c36472k) {
            return this.f342001d.a(c36472k.f342054e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final boolean d(C36472k c36472k) {
            return this.f342000c.a(c36472k.f342054e);
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final boolean e(o oVar) {
            return this.f342002e.a(oVar.k());
        }

        @Override // com.fasterxml.jackson.databind.introspect.L
        public final b f(JsonAutoDetect jsonAutoDetect) {
            JsonAutoDetect.Visibility visibility = jsonAutoDetect.getterVisibility();
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.f340911e;
            if (visibility == visibility2) {
                visibility = this.f341999b;
            }
            JsonAutoDetect.Visibility visibility3 = visibility;
            JsonAutoDetect.Visibility visibilityIsGetterVisibility = jsonAutoDetect.isGetterVisibility();
            if (visibilityIsGetterVisibility == visibility2) {
                visibilityIsGetterVisibility = this.f342000c;
            }
            JsonAutoDetect.Visibility visibility4 = visibilityIsGetterVisibility;
            JsonAutoDetect.Visibility visibility5 = jsonAutoDetect.setterVisibility();
            if (visibility5 == visibility2) {
                visibility5 = this.f342001d;
            }
            JsonAutoDetect.Visibility visibility6 = visibility5;
            JsonAutoDetect.Visibility visibilityCreatorVisibility = jsonAutoDetect.creatorVisibility();
            if (visibilityCreatorVisibility == visibility2) {
                visibilityCreatorVisibility = this.f342002e;
            }
            JsonAutoDetect.Visibility visibility7 = visibilityCreatorVisibility;
            JsonAutoDetect.Visibility visibilityFieldVisibility = jsonAutoDetect.fieldVisibility();
            if (visibilityFieldVisibility == visibility2) {
                visibilityFieldVisibility = this.f342003f;
            }
            JsonAutoDetect.Visibility visibility8 = visibilityFieldVisibility;
            return (visibility3 == this.f341999b && visibility4 == this.f342000c && visibility6 == this.f342001d && visibility7 == this.f342002e && visibility8 == this.f342003f) ? this : new b(visibility3, visibility4, visibility6, visibility7, visibility8);
        }

        public final String toString() {
            return "[Visibility: getter=" + this.f341999b + ",isGetter=" + this.f342000c + ",setter=" + this.f342001d + ",creator=" + this.f342002e + ",field=" + this.f342003f + "]";
        }
    }

    boolean a(C36472k c36472k);

    boolean b(C36469h c36469h);

    boolean c(C36472k c36472k);

    boolean d(C36472k c36472k);

    boolean e(o oVar);

    b f(JsonAutoDetect jsonAutoDetect);
}
