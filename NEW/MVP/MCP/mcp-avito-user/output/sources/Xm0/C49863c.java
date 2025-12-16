package xM0;

import PK0.n;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.verification.a;
import hw.InterfaceC41176a;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import shark.AndroidResourceIdNames;

/* compiled from: VerificationContentPlaceholderStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LxM0/c;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C49863c {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f442425r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final n f442426a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final n f442427b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final n f442428c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f442429d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final VU.b f442430e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final VU.b f442431f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C35763c0 f442432g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442433h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442434i;

    /* renamed from: j, reason: collision with root package name */
    public final int f442435j;

    /* renamed from: k, reason: collision with root package name */
    public final int f442436k;

    /* renamed from: l, reason: collision with root package name */
    public final int f442437l;

    /* renamed from: m, reason: collision with root package name */
    public final int f442438m;

    /* renamed from: n, reason: collision with root package name */
    public final int f442439n;

    /* renamed from: o, reason: collision with root package name */
    public final int f442440o;

    /* renamed from: p, reason: collision with root package name */
    public final int f442441p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Drawable f442442q;

    /* compiled from: VerificationContentPlaceholderStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LxM0/c$a;", "LLV/c;", "LxM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xM0.c$a */
    public static final class a implements LV.c<C49863c> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static C49863c b(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 15, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            n nVarA = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(13, 0), context);
            n nVarA2 = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(2, 0), context);
            Integer numValueOf = Integer.valueOf(typedArray.getColor(3, 0));
            b.a aVar = VU.b.f17147t;
            int resourceId = typedArray.getResourceId(4, 0);
            aVar.getClass();
            VU.b bVarC = b.a.c(resourceId, context);
            VU.b bVarC2 = b.a.c(typedArray.getResourceId(12, 0), context);
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            return new C49863c(nVarD, nVarA, nVarA2, numValueOf, bVarC, bVarC2, colorStateListA != null ? C35771d0.b(colorStateListA) : null, typedArray.getDimensionPixelSize(5, 0), typedArray.getDimensionPixelSize(10, 0), typedArray.getDimensionPixelSize(11, 0), typedArray.getDimensionPixelSize(9, 0), typedArray.getDimensionPixelSize(8, 0), typedArray.getDimensionPixelSize(7, 0), typedArray.getDimensionPixelSize(16, 0), typedArray.getDimensionPixelSize(14, 0), typedArray.getDimensionPixelSize(1, 0), x.b(typedArray, context, 6));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, a.j.f323379a);
            C49863c c49863cB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return c49863cB;
        }

        public a() {
        }
    }

    public C49863c(@l n nVar, @l n nVar2, @l n nVar3, @l Integer num, @l VU.b bVar, @l VU.b bVar2, @l C35763c0 c35763c0, @U int i12, @U int i13, @U int i14, @U int i15, @U int i16, @U int i17, @U int i18, @U int i19, @U int i22, @l Drawable drawable) {
        this.f442426a = nVar;
        this.f442427b = nVar2;
        this.f442428c = nVar3;
        this.f442429d = num;
        this.f442430e = bVar;
        this.f442431f = bVar2;
        this.f442432g = c35763c0;
        this.f442433h = i12;
        this.f442434i = i13;
        this.f442435j = i14;
        this.f442436k = i15;
        this.f442437l = i16;
        this.f442438m = i17;
        this.f442439n = i18;
        this.f442440o = i19;
        this.f442441p = i22;
        this.f442442q = drawable;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49863c)) {
            return false;
        }
        C49863c c49863c = (C49863c) obj;
        return L.f(this.f442426a, c49863c.f442426a) && L.f(this.f442427b, c49863c.f442427b) && L.f(this.f442428c, c49863c.f442428c) && L.f(this.f442429d, c49863c.f442429d) && L.f(this.f442430e, c49863c.f442430e) && L.f(this.f442431f, c49863c.f442431f) && L.f(this.f442432g, c49863c.f442432g) && this.f442433h == c49863c.f442433h && this.f442434i == c49863c.f442434i && this.f442435j == c49863c.f442435j && this.f442436k == c49863c.f442436k && this.f442437l == c49863c.f442437l && this.f442438m == c49863c.f442438m && this.f442439n == c49863c.f442439n && this.f442440o == c49863c.f442440o && this.f442441p == c49863c.f442441p && L.f(this.f442442q, c49863c.f442442q);
    }

    public final int hashCode() {
        n nVar = this.f442426a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        n nVar2 = this.f442427b;
        int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.f442428c;
        int iHashCode3 = (iHashCode2 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        Integer num = this.f442429d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        VU.b bVar = this.f442430e;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        VU.b bVar2 = this.f442431f;
        int iHashCode6 = (iHashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        C35763c0 c35763c0 = this.f442432g;
        int iE2 = r.e(this.f442441p, r.e(this.f442440o, r.e(this.f442439n, r.e(this.f442438m, r.e(this.f442437l, r.e(this.f442436k, r.e(this.f442435j, r.e(this.f442434i, r.e(this.f442433h, (iHashCode6 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable = this.f442442q;
        return iE2 + (drawable != null ? drawable.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VerificationContentPlaceholderStyle(titleAppearance=" + this.f442426a + ", subtitleAppearance=" + this.f442427b + ", errorCodeAppearance=" + this.f442428c + ", errorCodeColor=" + this.f442429d + ", firstButtonStyle=" + this.f442430e + ", secondButtonStyle=" + this.f442431f + ", backgroundColor=" + this.f442432g + ", imageContainerSize=" + this.f442433h + ", paddingStart=" + this.f442434i + ", paddingTop=" + this.f442435j + ", paddingEnd=" + this.f442436k + ", paddingBottom=" + this.f442437l + ", imageToTextSpacing=" + this.f442438m + ", titleToSubtitleSpacing=" + this.f442439n + ", subtitleToErrorCodeSpacing=" + this.f442440o + ", buttonToButtonSpacing=" + this.f442441p + ", imageSrc=" + this.f442442q + ')';
    }

    public /* synthetic */ C49863c(n nVar, n nVar2, n nVar3, Integer num, VU.b bVar, VU.b bVar2, C35763c0 c35763c0, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, Drawable drawable, int i23, C42822w c42822w) {
        this(nVar, nVar2, nVar3, num, bVar, bVar2, c35763c0, i12, i13, i14, i15, i16, i17, i18, i19, i22, (i23 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : drawable);
    }
}
