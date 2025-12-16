package lV;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.facebook.imageutils.JfifUtil;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lV.C43685a;

/* compiled from: ListItemCheckboxStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlV/c;", "LlV/b;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lV.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C43687c implements InterfaceC43686b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f413775i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C43685a f413776a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.toggle.a f413777b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C35763c0 f413778c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f413779d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Drawable f413780e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f413781f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ImageRequest.c f413782g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f413783h;

    /* compiled from: ListItemCheckboxStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/c$a;", "LLV/c;", "LlV/c;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lV.c$a */
    public static final class a implements LV.c<C43687c> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static C43687c b(int i12, @k Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178945S);
            C43687c c43687cC = c(typedArrayObtainStyledAttributes, context);
            C43685a.f413756q.getClass();
            C43687c c43687cA = C43687c.a(c43687cC, C43685a.C11787a.b(i12, context));
            typedArrayObtainStyledAttributes.recycle();
            return c43687cA;
        }

        @k
        public static C43687c c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
            int resourceId = typedArray.getResourceId(2, 0);
            c5326a.getClass();
            com.avito.android.lib.design.toggle.a aVarB = a.C5326a.b(resourceId, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 4);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 5);
            return new C43687c(null, aVarB, c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getDrawable(0), null, null, null, JfifUtil.MARKER_APP1, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public C43687c() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static C43687c a(C43687c c43687c, C43685a c43685a) {
        com.avito.android.lib.design.toggle.a aVar = c43687c.f413777b;
        C35763c0 c35763c0 = c43687c.f413778c;
        C35763c0 c35763c02 = c43687c.f413779d;
        return new C43687c(c43687c.f413780e, c43687c.f413782g, c43687c.f413783h, aVar, c43687c.f413781f, c35763c0, c35763c02, c43685a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43687c)) {
            return false;
        }
        C43687c c43687c = (C43687c) obj;
        return L.f(this.f413776a, c43687c.f413776a) && L.f(this.f413777b, c43687c.f413777b) && L.f(this.f413778c, c43687c.f413778c) && L.f(this.f413779d, c43687c.f413779d) && L.f(this.f413780e, c43687c.f413780e) && L.f(this.f413781f, c43687c.f413781f) && L.f(this.f413782g, c43687c.f413782g) && this.f413783h == c43687c.f413783h;
    }

    public final int hashCode() {
        C43685a c43685a = this.f413776a;
        int iHashCode = (c43685a == null ? 0 : c43685a.hashCode()) * 31;
        com.avito.android.lib.design.toggle.a aVar = this.f413777b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C35763c0 c35763c0 = this.f413778c;
        int iHashCode3 = (iHashCode2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f413779d;
        int iHashCode4 = (iHashCode3 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        Drawable drawable = this.f413780e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Image image = this.f413781f;
        int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        ImageRequest.c cVar = this.f413782g;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        BaseListItem.Alignment alignment = this.f413783h;
        return iHashCode7 + (alignment != null ? alignment.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemCheckboxStyle(baseListItemStyle=" + this.f413776a + ", checkboxStyle=" + this.f413777b + ", iconColor=" + this.f413778c + ", rightIconColor=" + this.f413779d + ", icon=" + this.f413780e + ", iconFromBack=" + this.f413781f + ", iconSize=" + this.f413782g + ", iconAlignment=" + this.f413783h + ')';
    }

    public C43687c(@l Drawable drawable, @l ImageRequest.c cVar, @l BaseListItem.Alignment alignment, @l com.avito.android.lib.design.toggle.a aVar, @l Image image, @l C35763c0 c35763c0, @l C35763c0 c35763c02, @l C43685a c43685a) {
        this.f413776a = c43685a;
        this.f413777b = aVar;
        this.f413778c = c35763c0;
        this.f413779d = c35763c02;
        this.f413780e = drawable;
        this.f413781f = image;
        this.f413782g = cVar;
        this.f413783h = alignment;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C43687c(C43685a c43685a, com.avito.android.lib.design.toggle.a aVar, C35763c0 c35763c0, C35763c0 c35763c02, Drawable drawable, Image image, ImageRequest.c cVar, BaseListItem.Alignment alignment, int i12, C42822w c42822w) {
        C43685a c43685a2 = (i12 & 1) != 0 ? null : c43685a;
        com.avito.android.lib.design.toggle.a aVar2 = (i12 & 2) != 0 ? null : aVar;
        C35763c0 c35763c03 = (i12 & 4) != 0 ? null : c35763c0;
        C35763c0 c35763c04 = (i12 & 8) != 0 ? null : c35763c02;
        this((i12 & 16) != 0 ? null : drawable, (i12 & 64) != 0 ? null : cVar, (i12 & 128) != 0 ? null : alignment, aVar2, (i12 & 32) != 0 ? null : image, c35763c03, c35763c04, c43685a2);
    }
}
