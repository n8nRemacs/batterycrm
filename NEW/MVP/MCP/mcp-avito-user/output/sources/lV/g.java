package lV;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.design.switcher.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lV.C43685a;

/* compiled from: ListItemSwitcherStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlV/g;", "LlV/b;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g implements InterfaceC43686b {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f413809j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C43685a f413810a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.switcher.a f413811b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.spinner.a f413812c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f413813d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C35763c0 f413814e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413815f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BaseListItem.Alignment f413816g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BaseListItem.Alignment f413817h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Drawable f413818i;

    /* compiled from: ListItemSwitcherStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/g$a;", "LLV/c;", "LlV/g;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<g> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static g b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178952W);
            g gVarC = c(typedArrayObtainStyledAttributes, context);
            C43685a.f413756q.getClass();
            g gVar = new g(C43685a.C11787a.b(i12, context), gVarC.f413811b, gVarC.f413812c, gVarC.f413813d, gVarC.f413814e, gVarC.f413815f, gVarC.f413816g, gVarC.f413817h, gVarC.f413818i);
            typedArrayObtainStyledAttributes.recycle();
            return gVar;
        }

        @k
        public static g c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            a.C5304a c5304a = com.avito.android.lib.design.switcher.a.f180669j;
            int resourceId = typedArray.getResourceId(9, 0);
            c5304a.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, d.n.f178926I0);
            com.avito.android.lib.design.switcher.a aVarB = a.C5304a.b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId2 = typedArray.getResourceId(6, 0);
            c5301a.getClass();
            com.avito.android.lib.design.spinner.a aVarB2 = a.C5301a.b(resourceId2, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 3);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 5);
            return new g(null, aVarB, aVarB2, c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getDimensionPixelSize(8, 0), typedArray.getInt(2, 0) == 0 ? BaseListItem.Alignment.f179502d : BaseListItem.Alignment.f179501c, typedArray.getInt(7, 0) == 0 ? BaseListItem.Alignment.f179502d : BaseListItem.Alignment.f179501c, typedArray.getDrawable(0), 1, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public g() {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f413810a, gVar.f413810a) && L.f(this.f413811b, gVar.f413811b) && L.f(this.f413812c, gVar.f413812c) && L.f(this.f413813d, gVar.f413813d) && L.f(this.f413814e, gVar.f413814e) && this.f413815f == gVar.f413815f && this.f413816g == gVar.f413816g && this.f413817h == gVar.f413817h && L.f(this.f413818i, gVar.f413818i);
    }

    public final int hashCode() {
        C43685a c43685a = this.f413810a;
        int iHashCode = (c43685a == null ? 0 : c43685a.hashCode()) * 31;
        com.avito.android.lib.design.switcher.a aVar = this.f413811b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.avito.android.lib.design.spinner.a aVar2 = this.f413812c;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C35763c0 c35763c0 = this.f413813d;
        int iHashCode4 = (iHashCode3 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f413814e;
        int iHashCode5 = (this.f413817h.hashCode() + ((this.f413816g.hashCode() + r.e(this.f413815f, (iHashCode4 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31)) * 31)) * 31;
        Drawable drawable = this.f413818i;
        return iHashCode5 + (drawable != null ? drawable.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemSwitcherStyle(baseListItemStyle=" + this.f413810a + ", switcherStyle=" + this.f413811b + ", spinnerStyle=" + this.f413812c + ", iconColor=" + this.f413813d + ", rightIconColor=" + this.f413814e + ", switcherMarginTop=" + this.f413815f + ", iconAlignment=" + this.f413816g + ", switcherAlignment=" + this.f413817h + ", icon=" + this.f413818i + ')';
    }

    public g(@l C43685a c43685a, @l com.avito.android.lib.design.switcher.a aVar, @l com.avito.android.lib.design.spinner.a aVar2, @l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, @k BaseListItem.Alignment alignment, @k BaseListItem.Alignment alignment2, @l Drawable drawable) {
        this.f413810a = c43685a;
        this.f413811b = aVar;
        this.f413812c = aVar2;
        this.f413813d = c35763c0;
        this.f413814e = c35763c02;
        this.f413815f = i12;
        this.f413816g = alignment;
        this.f413817h = alignment2;
        this.f413818i = drawable;
    }

    public /* synthetic */ g(C43685a c43685a, com.avito.android.lib.design.switcher.a aVar, com.avito.android.lib.design.spinner.a aVar2, C35763c0 c35763c0, C35763c0 c35763c02, int i12, BaseListItem.Alignment alignment, BaseListItem.Alignment alignment2, Drawable drawable, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : c43685a, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? null : aVar2, (i13 & 8) != 0 ? null : c35763c0, (i13 & 16) != 0 ? null : c35763c02, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? BaseListItem.Alignment.f179502d : alignment, (i13 & 128) != 0 ? BaseListItem.Alignment.f179502d : alignment2, (i13 & 256) == 0 ? drawable : null);
    }
}
