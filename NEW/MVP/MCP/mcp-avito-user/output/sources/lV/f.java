package lV;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lV.C43685a;

/* compiled from: ListItemStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlV/f;", "LlV/b;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f implements InterfaceC43686b {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f413801h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C43685a f413802a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Drawable f413803b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Drawable f413804c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BaseListItem.Alignment f413805d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f413806e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f413807f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C35763c0 f413808g;

    /* compiled from: ListItemStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/f$a;", "LLV/c;", "LlV/f;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<f> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static f b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178943R);
            f fVarC = c(typedArrayObtainStyledAttributes, context);
            C43685a.f413756q.getClass();
            f fVar = new f(C43685a.C11787a.b(i12, context), fVarC.f413803b, fVarC.f413804c, fVarC.f413805d, fVarC.f413806e, fVarC.f413807f, fVarC.f413808g);
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        }

        @k
        public static f c(@k TypedArray typedArray, @k Context context) {
            Drawable drawable = typedArray.getDrawable(0);
            Drawable drawable2 = typedArray.getDrawable(1);
            BaseListItem.Alignment alignment = typedArray.getInt(2, 0) == 0 ? BaseListItem.Alignment.f179502d : BaseListItem.Alignment.f179501c;
            ColorStateList colorStateListA = x.a(typedArray, context, 3);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 4);
            return new f(null, drawable, drawable2, alignment, null, c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, 17, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public f() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f413802a, fVar.f413802a) && L.f(this.f413803b, fVar.f413803b) && L.f(this.f413804c, fVar.f413804c) && this.f413805d == fVar.f413805d && this.f413806e == fVar.f413806e && L.f(this.f413807f, fVar.f413807f) && L.f(this.f413808g, fVar.f413808g);
    }

    public final int hashCode() {
        C43685a c43685a = this.f413802a;
        int iHashCode = (c43685a == null ? 0 : c43685a.hashCode()) * 31;
        Drawable drawable = this.f413803b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f413804c;
        int iHashCode3 = (this.f413805d.hashCode() + ((iHashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31)) * 31;
        BaseListItem.Alignment alignment = this.f413806e;
        int iHashCode4 = (iHashCode3 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        C35763c0 c35763c0 = this.f413807f;
        int iHashCode5 = (iHashCode4 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f413808g;
        return iHashCode5 + (c35763c02 != null ? c35763c02.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemStyle(baseListItemStyle=" + this.f413802a + ", drawableLeft=" + this.f413803b + ", drawableRight=" + this.f413804c + ", leftAlignment=" + this.f413805d + ", rightAlignment=" + this.f413806e + ", leftIconColor=" + this.f413807f + ", rightIconColor=" + this.f413808g + ')';
    }

    public f(@l C43685a c43685a, @l Drawable drawable, @l Drawable drawable2, @k BaseListItem.Alignment alignment, @l BaseListItem.Alignment alignment2, @l C35763c0 c35763c0, @l C35763c0 c35763c02) {
        this.f413802a = c43685a;
        this.f413803b = drawable;
        this.f413804c = drawable2;
        this.f413805d = alignment;
        this.f413806e = alignment2;
        this.f413807f = c35763c0;
        this.f413808g = c35763c02;
    }

    public /* synthetic */ f(C43685a c43685a, Drawable drawable, Drawable drawable2, BaseListItem.Alignment alignment, BaseListItem.Alignment alignment2, C35763c0 c35763c0, C35763c0 c35763c02, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c43685a, (i12 & 2) != 0 ? null : drawable, (i12 & 4) != 0 ? null : drawable2, (i12 & 8) != 0 ? BaseListItem.Alignment.f179502d : alignment, (i12 & 16) != 0 ? null : alignment2, (i12 & 32) != 0 ? null : c35763c0, (i12 & 64) != 0 ? null : c35763c02);
    }
}
