package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@InterfaceC43017s
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/a;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/v;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42838a implements GenericArrayType, v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f406958b;

    public C42838a(@Y61.k Type type) {
        this.f406958b = type;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof GenericArrayType) {
            if (L.f(this.f406958b, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    @Y61.k
    public final Type getGenericComponentType() {
        return this.f406958b;
    }

    @Override // java.lang.reflect.Type
    @Y61.k
    public final String getTypeName() {
        return y.a(this.f406958b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.f406958b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return getTypeName();
    }
}
