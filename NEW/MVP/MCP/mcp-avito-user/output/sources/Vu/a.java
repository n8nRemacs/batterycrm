package VU;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;
import wK0.C49527b;

/* compiled from: ButtonBackground.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LVU/a;", "", "a", "b", "c", "d", "LVU/a$a;", "LVU/a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: ButtonBackground.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVU/a$a;", "LVU/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VU.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1180a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Drawable f17135a;

        public C1180a(@l Drawable drawable) {
            this.f17135a = drawable;
        }

        @Override // VU.a
        public final void a(@k Button button, @l a aVar) {
            if (new com.avito.android.lib.util.c(this, aVar instanceof d ? (d) aVar : null).f181333c) {
                return;
            }
            button.setBackground(this.f17135a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1180a) && L.f(this.f17135a, ((C1180a) obj).f17135a);
        }

        public final int hashCode() {
            Drawable drawable = this.f17135a;
            if (drawable == null) {
                return 0;
            }
            return drawable.hashCode();
        }

        @k
        public final String toString() {
            return "Drawable(drawable=" + this.f17135a + ')';
        }
    }

    /* compiled from: ButtonBackground.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVU/a$b;", "LVU/a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C35763c0 f17136b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C35763c0 f17137c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17138d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final C35763c0 f17139e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17140f;

        public b(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03, int i13) {
            this.f17136b = c35763c0;
            this.f17137c = c35763c02;
            this.f17138d = i12;
            this.f17139e = c35763c03;
            this.f17140f = i13;
        }

        @Override // VU.a
        public final void a(@k Button button, @l a aVar) {
            C49527b c49527bA;
            if (new com.avito.android.lib.util.c(this, aVar instanceof d ? (d) aVar : null).f181333c) {
                return;
            }
            C35763c0 c35763c0 = this.f17139e;
            C35763c0 c35763c02 = this.f17136b;
            C35763c0 c35763c03 = this.f17137c;
            if (c35763c03 == null) {
                c49527bA = AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, c35763c02 != null ? c35763c02.b() : null, null, this.f17138d, c35763c0 != null ? c35763c0.b() : null, this.f17140f, 98);
            } else {
                c49527bA = AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, c35763c02 != null ? c35763c02.b() : null, c35763c03.b(), this.f17138d, c35763c0 != null ? c35763c0.b() : null, this.f17140f, 96);
            }
            button.setBackground(c49527bA);
        }

        @Override // VU.a.d
        @k
        public final b b(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03, int i13) {
            return new b(c35763c0, c35763c02, i12, c35763c03, i13);
        }

        @Override // VU.a.d
        @l
        /* renamed from: c, reason: from getter */
        public final C35763c0 getF17141b() {
            return this.f17136b;
        }

        @Override // VU.a.d
        @l
        /* renamed from: d, reason: from getter */
        public final C35763c0 getF17144e() {
            return this.f17139e;
        }

        @Override // VU.a.d
        /* renamed from: e, reason: from getter */
        public final int getF17145f() {
            return this.f17140f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17136b, bVar.f17136b) && L.f(this.f17137c, bVar.f17137c) && this.f17138d == bVar.f17138d && L.f(this.f17139e, bVar.f17139e) && this.f17140f == bVar.f17140f;
        }

        @Override // VU.a.d
        /* renamed from: f, reason: from getter */
        public final int getF17143d() {
            return this.f17138d;
        }

        @Override // VU.a.d
        @l
        /* renamed from: g, reason: from getter */
        public final C35763c0 getF17142c() {
            return this.f17137c;
        }

        public final int hashCode() {
            C35763c0 c35763c0 = this.f17136b;
            int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
            C35763c0 c35763c02 = this.f17137c;
            int iE2 = r.e(this.f17138d, (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31);
            C35763c0 c35763c03 = this.f17139e;
            return Integer.hashCode(this.f17140f) + ((iE2 + (c35763c03 != null ? c35763c03.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LegacyShape(backgroundColor=");
            sb2.append(this.f17136b);
            sb2.append(", rippleColor=");
            sb2.append(this.f17137c);
            sb2.append(", cornerRadius=");
            sb2.append(this.f17138d);
            sb2.append(", borderColor=");
            sb2.append(this.f17139e);
            sb2.append(", borderWidth=");
            return r.t(sb2, this.f17140f, ')');
        }
    }

    /* compiled from: ButtonBackground.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVU/a$c;", "LVU/a$d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C35763c0 f17141b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C35763c0 f17142c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17143d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final C35763c0 f17144e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17145f;

        public c(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03, int i13) {
            this.f17141b = c35763c0;
            this.f17142c = c35763c02;
            this.f17143d = i12;
            this.f17144e = c35763c03;
            this.f17145f = i13;
        }

        @Override // VU.a
        public final void a(@k Button button, @l a aVar) {
            if (new com.avito.android.lib.util.c(this, aVar instanceof d ? (d) aVar : null).f181333c) {
                return;
            }
            AbstractC49526a.C12816a c12816a = AbstractC49526a.f441376b;
            C35763c0 c35763c0 = this.f17141b;
            ColorStateList colorStateListB = c35763c0 != null ? c35763c0.b() : null;
            C35763c0 c35763c02 = this.f17142c;
            ColorStateList colorStateListB2 = c35763c02 != null ? c35763c02.b() : null;
            C35763c0 c35763c03 = this.f17144e;
            button.setBackground(AbstractC49526a.C12816a.a(c12816a, colorStateListB, colorStateListB2, this.f17143d, c35763c03 != null ? c35763c03.b() : null, this.f17145f, 96));
        }

        @Override // VU.a.d
        @k
        public final b b(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03, int i13) {
            return new b(c35763c0, c35763c02, i12, c35763c03, i13);
        }

        @Override // VU.a.d
        @l
        /* renamed from: c, reason: from getter */
        public final C35763c0 getF17141b() {
            return this.f17141b;
        }

        @Override // VU.a.d
        @l
        /* renamed from: d, reason: from getter */
        public final C35763c0 getF17144e() {
            return this.f17144e;
        }

        @Override // VU.a.d
        /* renamed from: e, reason: from getter */
        public final int getF17145f() {
            return this.f17145f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f17141b, cVar.f17141b) && L.f(this.f17142c, cVar.f17142c) && this.f17143d == cVar.f17143d && L.f(this.f17144e, cVar.f17144e) && this.f17145f == cVar.f17145f;
        }

        @Override // VU.a.d
        /* renamed from: f, reason: from getter */
        public final int getF17143d() {
            return this.f17143d;
        }

        @Override // VU.a.d
        @l
        /* renamed from: g, reason: from getter */
        public final C35763c0 getF17142c() {
            return this.f17142c;
        }

        public final int hashCode() {
            C35763c0 c35763c0 = this.f17141b;
            int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
            C35763c0 c35763c02 = this.f17142c;
            int iE2 = r.e(this.f17143d, (iHashCode + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31);
            C35763c0 c35763c03 = this.f17144e;
            return Integer.hashCode(this.f17145f) + ((iE2 + (c35763c03 != null ? c35763c03.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NewShape(backgroundColor=");
            sb2.append(this.f17141b);
            sb2.append(", rippleColor=");
            sb2.append(this.f17142c);
            sb2.append(", cornerRadius=");
            sb2.append(this.f17143d);
            sb2.append(", borderColor=");
            sb2.append(this.f17144e);
            sb2.append(", borderWidth=");
            return r.t(sb2, this.f17145f, ')');
        }
    }

    /* compiled from: ButtonBackground.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LVU/a$d;", "LVU/a;", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1181a f17146a = new C1181a(null);

        /* compiled from: ButtonBackground.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVU/a$d$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: VU.a$d$a, reason: collision with other inner class name */
        public static final class C1181a {
            public /* synthetic */ C1181a(C42822w c42822w) {
                this();
            }

            public C1181a() {
            }
        }

        @k
        public abstract b b(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @l C35763c0 c35763c03, int i13);

        @l
        /* renamed from: c */
        public abstract C35763c0 getF17141b();

        @l
        /* renamed from: d */
        public abstract C35763c0 getF17144e();

        /* renamed from: e */
        public abstract int getF17145f();

        /* renamed from: f */
        public abstract int getF17143d();

        @l
        /* renamed from: g */
        public abstract C35763c0 getF17142c();
    }

    void a(@k Button button, @l a aVar);
}
