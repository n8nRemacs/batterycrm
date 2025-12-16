package com.avito.android.adaptive.image;

import com.avito.android.adaptive.image.a;
import com.avito.android.analytics.H;
import com.avito.android.analytics.NetworkType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdaptiveAlgorithm.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/adaptive/image/b;", "Lcom/avito/android/adaptive/image/a;", "a", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.adaptive.image.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R3.a f68495a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R3.e f68496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f68497c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R3.c f68498d;

    /* compiled from: AdaptiveAlgorithm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/adaptive/image/b$a;", "", "<init>", "()V", "", "MAX_SCALE_OFFSET", "D", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@Y61.k R3.a aVar, @Y61.k R3.e eVar, @Y61.k H h12, @Y61.k R3.c cVar) {
        this.f68495a = aVar;
        this.f68496b = eVar;
        this.f68497c = h12;
        this.f68498d = cVar;
    }

    @Override // com.avito.android.adaptive.image.a
    @Y61.k
    public final a.C2141a getInfo() {
        boolean f14085a = this.f68495a.getF14085a();
        boolean f14095a = this.f68496b.getF14095a();
        NetworkType f89659d = this.f68497c.getF89659d();
        R3.c cVar = this.f68498d;
        Long f14090a = cVar.getF14090a();
        return new a.C2141a(f14085a, f14095a, f89659d, f14090a != null ? f14090a.longValue() : -1L, cVar.getF14091b());
    }
}
