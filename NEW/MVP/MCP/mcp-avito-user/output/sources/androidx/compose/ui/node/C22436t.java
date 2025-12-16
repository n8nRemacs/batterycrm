package androidx.compose.ui.node;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import s0.C47949a;

/* compiled from: TouchBoundsExpansion.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/t;", "", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22436t {

    /* renamed from: a, reason: collision with root package name */
    public final float f40869a;

    /* renamed from: b, reason: collision with root package name */
    public final float f40870b;

    /* renamed from: c, reason: collision with root package name */
    public final float f40871c;

    /* renamed from: d, reason: collision with root package name */
    public final float f40872d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40873e;

    /* compiled from: TouchBoundsExpansion.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/t$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.t$a */
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

    public C22436t(float f12, float f13, float f14, float f15, boolean z12, C42822w c42822w) {
        this.f40869a = f12;
        this.f40870b = f13;
        this.f40871c = f14;
        this.f40872d = f15;
        this.f40873e = z12;
        if (f12 < 0.0f) {
            C47949a.a("Left must be non-negative");
        }
        if (f13 < 0.0f) {
            C47949a.a("Top must be non-negative");
        }
        if (f14 < 0.0f) {
            C47949a.a("Right must be non-negative");
        }
        if (f15 >= 0.0f) {
            return;
        }
        C47949a.a("Bottom must be non-negative");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22436t)) {
            return false;
        }
        C22436t c22436t = (C22436t) obj;
        return androidx.compose.ui.unit.h.b(this.f40869a, c22436t.f40869a) && androidx.compose.ui.unit.h.b(this.f40870b, c22436t.f40870b) && androidx.compose.ui.unit.h.b(this.f40871c, c22436t.f40871c) && androidx.compose.ui.unit.h.b(this.f40872d, c22436t.f40872d) && this.f40873e == c22436t.f40873e;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Boolean.hashCode(this.f40873e) + androidx.appcompat.app.r.d(this.f40872d, androidx.appcompat.app.r.d(this.f40871c, androidx.appcompat.app.r.d(this.f40870b, Float.hashCode(this.f40869a) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpTouchBoundsExpansion(start=");
        androidx.compose.foundation.H.u(this.f40869a, ", top=", sb2);
        androidx.compose.foundation.H.u(this.f40870b, ", end=", sb2);
        androidx.compose.foundation.H.u(this.f40871c, ", bottom=", sb2);
        androidx.compose.foundation.H.u(this.f40872d, ", isLayoutDirectionAware=", sb2);
        return androidx.appcompat.app.r.x(sb2, this.f40873e, ')');
    }
}
