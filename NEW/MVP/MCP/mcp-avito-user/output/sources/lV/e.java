package lV;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lV.C43685a;

/* compiled from: ListItemRadioStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlV/e;", "LlV/b;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements InterfaceC43686b {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f413793h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C43685a f413794a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.toggle.a f413795b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C35763c0 f413796c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f413797d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Drawable f413798e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BaseListItem.Alignment f413799f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final n f413800g;

    /* compiled from: ListItemRadioStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/e$a;", "LLV/c;", "LlV/e;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<e> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static e b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178951V);
            e eVarC = c(typedArrayObtainStyledAttributes, context);
            C43685a.f413756q.getClass();
            e eVar = new e(C43685a.C11787a.b(i12, context), eVarC.f413795b, eVarC.f413796c, eVarC.f413797d, eVarC.f413798e, eVarC.f413799f, eVarC.f413800g);
            typedArrayObtainStyledAttributes.recycle();
            return eVar;
        }

        @k
        public static e c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
            int resourceId = typedArray.getResourceId(5, 0);
            c5326a.getClass();
            com.avito.android.lib.design.toggle.a aVarB = a.C5326a.b(resourceId, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 3);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 6);
            return new e(null, aVarB, c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getDrawable(0), typedArray.getInt(2, 0) == 0 ? BaseListItem.Alignment.f179500b : BaseListItem.Alignment.f179501c, null, 65, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f413794a, eVar.f413794a) && L.f(this.f413795b, eVar.f413795b) && L.f(this.f413796c, eVar.f413796c) && L.f(this.f413797d, eVar.f413797d) && L.f(this.f413798e, eVar.f413798e) && this.f413799f == eVar.f413799f && L.f(this.f413800g, eVar.f413800g);
    }

    public final int hashCode() {
        C43685a c43685a = this.f413794a;
        int iHashCode = (c43685a == null ? 0 : c43685a.hashCode()) * 31;
        com.avito.android.lib.design.toggle.a aVar = this.f413795b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C35763c0 c35763c0 = this.f413796c;
        int iHashCode3 = (iHashCode2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f413797d;
        int iHashCode4 = (iHashCode3 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        Drawable drawable = this.f413798e;
        int iHashCode5 = (this.f413799f.hashCode() + ((iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31;
        n nVar = this.f413800g;
        return iHashCode5 + (nVar != null ? nVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemRadioStyle(baseListItemStyle=" + this.f413794a + ", radioStyle=" + this.f413795b + ", iconColor=" + this.f413796c + ", rightIconColor=" + this.f413797d + ", icon=" + this.f413798e + ", iconAlignment=" + this.f413799f + ", secondSubtitleStyle=" + this.f413800g + ')';
    }

    public e(@l C43685a c43685a, @l com.avito.android.lib.design.toggle.a aVar, @l C35763c0 c35763c0, @l C35763c0 c35763c02, @l Drawable drawable, @k BaseListItem.Alignment alignment, @l n nVar) {
        this.f413794a = c43685a;
        this.f413795b = aVar;
        this.f413796c = c35763c0;
        this.f413797d = c35763c02;
        this.f413798e = drawable;
        this.f413799f = alignment;
        this.f413800g = nVar;
    }

    public /* synthetic */ e(C43685a c43685a, com.avito.android.lib.design.toggle.a aVar, C35763c0 c35763c0, C35763c0 c35763c02, Drawable drawable, BaseListItem.Alignment alignment, n nVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c43685a, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : c35763c0, (i12 & 8) != 0 ? null : c35763c02, (i12 & 16) != 0 ? null : drawable, (i12 & 32) != 0 ? BaseListItem.Alignment.f179500b : alignment, (i12 & 64) != 0 ? null : nVar);
    }
}
