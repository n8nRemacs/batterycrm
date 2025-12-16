package com.avito.beduin.v2.avito.component.common;

import kotlin.Metadata;

/* compiled from: Shape.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/Corner;", "", "Type", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Corner {

    /* renamed from: a, reason: collision with root package name */
    public final float f334110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f334111b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Shape.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/Corner$Type;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f334112b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f334113c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334114d;

        static {
            Type type = new Type("Rounded", 0);
            f334112b = type;
            Type[] typeArr = {type};
            f334113c = typeArr;
            f334114d = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f334113c.clone();
        }
    }

    public Corner(float f12, @Y61.k Type type) {
        this.f334110a = f12;
        this.f334111b = type;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Corner)) {
            return false;
        }
        Corner corner = (Corner) obj;
        return Float.compare(this.f334110a, corner.f334110a) == 0 && this.f334111b == corner.f334111b;
    }

    public final int hashCode() {
        return this.f334111b.hashCode() + (Float.hashCode(this.f334110a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Corner(radius=" + this.f334110a + ", type=" + this.f334111b + ')';
    }
}
