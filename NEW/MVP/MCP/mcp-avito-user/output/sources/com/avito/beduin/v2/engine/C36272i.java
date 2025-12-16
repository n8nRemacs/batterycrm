package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.EnableTypedPrimitives;
import com.avito.beduin.v2.engine.field.entity.v;
import kotlin.Metadata;

/* compiled from: DataFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/i;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36272i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final EnableTypedPrimitives f336893a;

    /* compiled from: DataFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.i$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f336894a;

        static {
            int[] iArr = new int[EnableTypedPrimitives.values().length];
            try {
                EnableTypedPrimitives.a aVar = EnableTypedPrimitives.f336458c;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnableTypedPrimitives.a aVar2 = EnableTypedPrimitives.f336458c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f336894a = iArr;
        }
    }

    public C36272i(@Y61.k H h12) {
        this.f336893a = h12.f336487n;
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v a(double d12) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        int i12 = enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()];
        return i12 != 1 ? i12 != 2 ? new v.l(String.valueOf(d12)) : new v.c(d12) : v.f.s(d12);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v b(float f12) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        int i12 = enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()];
        return i12 != 1 ? i12 != 2 ? new v.l(String.valueOf(f12)) : new v.d(f12) : v.g.s(f12);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v c(int i12) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        int i13 = enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()];
        return i13 != 1 ? i13 != 2 ? new v.l(String.valueOf(i12)) : new v.j(i12) : v.h.s(i12);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v d(long j12) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        int i12 = enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()];
        return i12 != 1 ? i12 != 2 ? new v.l(String.valueOf(j12)) : new v.j(j12) : v.h.s(j12);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v e(@Y61.k String str) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        return (enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()]) == 1 ? v.i.s(str) : new v.l(str);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.v f(boolean z12) {
        EnableTypedPrimitives enableTypedPrimitives = this.f336893a;
        int i12 = enableTypedPrimitives == null ? -1 : a.f336894a[enableTypedPrimitives.ordinal()];
        return i12 != 1 ? i12 != 2 ? new v.l(String.valueOf(z12)) : new v.a(z12) : v.e.s(z12);
    }
}
