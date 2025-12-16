package r51;

import Y61.l;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: AbstractReceiverValue.java */
/* renamed from: r51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47495a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final O f429612a;

    /* renamed from: b, reason: collision with root package name */
    public final h f429613b;

    public AbstractC47495a(@Y61.k O o12, @l h hVar) {
        if (o12 == null) {
            c(0);
            throw null;
        }
        this.f429612a = o12;
        this.f429613b = hVar == null ? this : hVar;
    }

    public static /* synthetic */ void c(int i12) {
        String str = (i12 == 1 || i12 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 1 || i12 == 2) ? 2 : 3];
        if (i12 == 1 || i12 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i12 == 1) {
            objArr[1] = "getType";
        } else if (i12 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i12 != 1 && i12 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // r51.h
    @Y61.k
    public final O getType() {
        O o12 = this.f429612a;
        if (o12 != null) {
            return o12;
        }
        c(1);
        throw null;
    }
}
