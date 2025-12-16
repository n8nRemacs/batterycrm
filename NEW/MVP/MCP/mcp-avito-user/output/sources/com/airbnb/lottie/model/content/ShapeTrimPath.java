package com.airbnb.lottie.model.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.animation.content.v;

/* loaded from: classes10.dex */
public class ShapeTrimPath implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Type f59707a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59708b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59709c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59710d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59711e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f59712b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f59713c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f59714d;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            f59712b = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            f59713c = type2;
            f59714d = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f59714d.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z12) {
        this.f59707a = type;
        this.f59708b = bVar;
        this.f59709c = bVar2;
        this.f59710d = bVar3;
        this.f59711e = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new v(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f59708b + ", end: " + this.f59709c + ", offset: " + this.f59710d + "}";
    }
}
