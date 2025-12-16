package com.avito.beduin.v2.avito.component.common;

import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/h;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f334126a;

    /* renamed from: b, reason: collision with root package name */
    public final float f334127b;

    /* renamed from: c, reason: collision with root package name */
    public final float f334128c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r f334129d;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334130l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334131l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f334132l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    public h() {
        this(0.0f, 0.0f, 0.0f, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f334126a, hVar.f334126a) == 0 && Float.compare(this.f334127b, hVar.f334127b) == 0 && Float.compare(this.f334128c, hVar.f334128c) == 0 && L.f(this.f334129d, hVar.f334129d);
    }

    public final int hashCode() {
        return this.f334129d.hashCode() + androidx.appcompat.app.r.d(this.f334128c, androidx.appcompat.app.r.d(this.f334127b, Float.hashCode(this.f334126a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "Shadow(dx=" + this.f334126a + ", dy=" + this.f334127b + ", radius=" + this.f334128c + ", color=" + this.f334129d + ')';
    }

    public h(float f12, float f13, float f14, @Y61.k r rVar) {
        this.f334126a = f12;
        this.f334127b = f13;
        this.f334128c = f14;
        this.f334129d = rVar;
    }

    public h(@Y61.k i iVar) {
        this(iVar.f334133a.c(a.f334130l).floatValue(), iVar.f334134b.c(b.f334131l).floatValue(), iVar.f334135c.c(c.f334132l).floatValue(), t.f338374a.b(iVar.f334136d));
    }

    public h(float f12, float f13, float f14, r rVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? 0.0f : f13, (i12 & 4) != 0 ? 0.0f : f14, (i12 & 8) != 0 ? t.f338374a : rVar);
    }
}
