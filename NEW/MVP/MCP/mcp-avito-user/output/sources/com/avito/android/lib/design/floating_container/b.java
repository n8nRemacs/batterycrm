package com.avito.android.lib.design.floating_container;

import LV.c;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingContainerStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/floating_container/b;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f179184i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AbstractC5272b f179185a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179186b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f179188d;

    /* renamed from: e, reason: collision with root package name */
    public final int f179189e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f179190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179191g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final VU.b f179192h;

    /* compiled from: FloatingContainerStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/floating_container/b$a;", "LLV/c;", "Lcom/avito/android/lib/design/floating_container/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static b b(int i12, @k Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178933M);
            b bVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarC;
        }

        @k
        public static b c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            VU.b bVarC;
            AbstractC5272b aVar;
            if (typedArray.hasValue(1)) {
                b.a aVar2 = VU.b.f17147t;
                int resourceId = typedArray.getResourceId(1, 0);
                aVar2.getClass();
                bVarC = b.a.c(resourceId, context);
            } else {
                bVarC = null;
            }
            if (typedArray.hasValue(9)) {
                a aVar3 = b.f179184i;
                int resourceId2 = typedArray.getResourceId(9, 0);
                aVar3.getClass();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, d.n.f178950U0);
                b.a aVar4 = VU.b.f17147t;
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                aVar4.getClass();
                AbstractC5272b c5273b = new AbstractC5272b.C5273b(b.a.c(resourceId3, context), b.a.c(typedArrayObtainStyledAttributes.getResourceId(3, 0), context), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getBoolean(2, false));
                typedArrayObtainStyledAttributes.recycle();
                aVar = c5273b;
            } else if (typedArray.hasValue(6)) {
                b.a aVar5 = VU.b.f17147t;
                int resourceId4 = typedArray.getResourceId(6, 0);
                aVar5.getClass();
                aVar = new AbstractC5272b.a(b.a.c(resourceId4, context));
            } else {
                aVar = null;
            }
            int dimensionPixelSize = typedArray.getDimensionPixelSize(3, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(5, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(8, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(7, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 2);
            return new b(aVar, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, colorStateListA != null ? C35771d0.b(colorStateListA) : null, typedArray.getDimensionPixelSize(4, 0), bVarC);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    /* compiled from: FloatingContainerStyle.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/floating_container/b$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/lib/design/floating_container/b$b$a;", "Lcom/avito/android/lib/design/floating_container/b$b$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.floating_container.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC5272b {

        /* compiled from: FloatingContainerStyle.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/floating_container/b$b$a;", "Lcom/avito/android/lib/design/floating_container/b$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.floating_container.b$b$a */
        public static final /* data */ class a extends AbstractC5272b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final VU.b f179193a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f179193a, ((a) obj).f179193a);
            }

            public final int hashCode() {
                VU.b bVar = this.f179193a;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            @k
            public final String toString() {
                return "OneButton(buttonStyle=" + this.f179193a + ')';
            }

            public /* synthetic */ a(VU.b bVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : bVar);
            }

            public a(@l VU.b bVar) {
                super(null);
                this.f179193a = bVar;
            }
        }

        /* compiled from: FloatingContainerStyle.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/floating_container/b$b$b;", "Lcom/avito/android/lib/design/floating_container/b$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.floating_container.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5273b extends AbstractC5272b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final VU.b f179194a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final VU.b f179195b;

            /* renamed from: c, reason: collision with root package name */
            public final int f179196c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f179197d;

            public /* synthetic */ C5273b(VU.b bVar, VU.b bVar2, int i12, boolean z12, int i13, C42822w c42822w) {
                this(bVar, bVar2, (i13 & 4) != 0 ? 0 : i12, z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5273b)) {
                    return false;
                }
                C5273b c5273b = (C5273b) obj;
                return L.f(this.f179194a, c5273b.f179194a) && L.f(this.f179195b, c5273b.f179195b) && this.f179196c == c5273b.f179196c && this.f179197d == c5273b.f179197d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f179197d) + r.e(this.f179196c, (this.f179195b.hashCode() + (this.f179194a.hashCode() * 31)) * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TwoButtons(firstButtonStyle=");
                sb2.append(this.f179194a);
                sb2.append(", secondButtonStyle=");
                sb2.append(this.f179195b);
                sb2.append(", distanceBetween=");
                sb2.append(this.f179196c);
                sb2.append(", isHorizontal=");
                return r.x(sb2, this.f179197d, ')');
            }

            public C5273b(@k VU.b bVar, @k VU.b bVar2, int i12, boolean z12) {
                super(null);
                this.f179194a = bVar;
                this.f179195b = bVar2;
                this.f179196c = i12;
                this.f179197d = z12;
            }
        }

        public /* synthetic */ AbstractC5272b(C42822w c42822w) {
            this();
        }

        public AbstractC5272b() {
        }
    }

    public b() {
        this(null, 0, 0, 0, 0, null, 0, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.avito.android.lib.design.floating_container.b$b] */
    public static b a(b bVar, AbstractC5272b.a aVar, int i12, int i13, int i14, int i15) {
        AbstractC5272b.a aVar2 = aVar;
        if ((i15 & 1) != 0) {
            aVar2 = bVar.f179185a;
        }
        return new b(aVar2, i12, i13, i14, bVar.f179189e, bVar.f179190f, bVar.f179191g, bVar.f179192h);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f179185a, bVar.f179185a) && this.f179186b == bVar.f179186b && this.f179187c == bVar.f179187c && this.f179188d == bVar.f179188d && this.f179189e == bVar.f179189e && L.f(this.f179190f, bVar.f179190f) && this.f179191g == bVar.f179191g && L.f(this.f179192h, bVar.f179192h);
    }

    public final int hashCode() {
        AbstractC5272b abstractC5272b = this.f179185a;
        int iE2 = r.e(this.f179189e, r.e(this.f179188d, r.e(this.f179187c, r.e(this.f179186b, (abstractC5272b == null ? 0 : abstractC5272b.hashCode()) * 31, 31), 31), 31), 31);
        C35763c0 c35763c0 = this.f179190f;
        int iE3 = r.e(this.f179191g, (iE2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31, 31);
        VU.b bVar = this.f179192h;
        return iE3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "FloatingContainerStyle(container=" + this.f179185a + ", bottomPadding=" + this.f179186b + ", horizontalPadding=" + this.f179187c + ", topPadding=" + this.f179188d + ", radius=" + this.f179189e + ", backgroundColor=" + this.f179190f + ", elevation=" + this.f179191g + ", buttonStyle=" + this.f179192h + ')';
    }

    public b(@l AbstractC5272b abstractC5272b, int i12, int i13, int i14, int i15, @l C35763c0 c35763c0, int i16, @l VU.b bVar) {
        this.f179185a = abstractC5272b;
        this.f179186b = i12;
        this.f179187c = i13;
        this.f179188d = i14;
        this.f179189e = i15;
        this.f179190f = c35763c0;
        this.f179191g = i16;
        this.f179192h = bVar;
    }

    public /* synthetic */ b(AbstractC5272b abstractC5272b, int i12, int i13, int i14, int i15, C35763c0 c35763c0, int i16, VU.b bVar, int i17, C42822w c42822w) {
        this((i17 & 1) != 0 ? null : abstractC5272b, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? null : c35763c0, (i17 & 64) == 0 ? i16 : 0, (i17 & 128) == 0 ? bVar : null);
    }
}
