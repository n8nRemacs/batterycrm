package lV;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lV.C43685a;

/* compiled from: ListItemCheckmarkStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlV/d;", "LlV/b;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lV.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C43688d implements InterfaceC43686b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f413784i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C43685a f413785a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.toggle.a f413786b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C35763c0 f413787c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f413788d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BaseListItem.Alignment f413789e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f413790f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f413791g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ImageRequest.c f413792h;

    /* compiled from: ListItemCheckmarkStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/d$a;", "LLV/c;", "LlV/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lV.d$a */
    public static final class a implements LV.c<C43688d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static C43688d b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178947T);
            C43688d c43688dC = c(typedArrayObtainStyledAttributes, context);
            C43685a.f413756q.getClass();
            C43688d c43688dA = C43688d.a(c43688dC, C43685a.C11787a.b(i12, context), null, null, 254);
            typedArrayObtainStyledAttributes.recycle();
            return c43688dA;
        }

        @k
        public static C43688d c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
            int resourceId = typedArray.getResourceId(3, 0);
            c5326a.getClass();
            com.avito.android.lib.design.toggle.a aVarB = a.C5326a.b(resourceId, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 4);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 5);
            return new C43688d(null, aVarB, c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getInt(1, 0) == 0 ? BaseListItem.Alignment.f179502d : BaseListItem.Alignment.f179501c, typedArray.getDrawable(0), null, null, 193, null);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public C43688d() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.graphics.drawable.Drawable] */
    public static C43688d a(C43688d c43688d, C43685a c43685a, LayerDrawable layerDrawable, ImageRequest.c cVar, int i12) {
        if ((i12 & 1) != 0) {
            c43685a = c43688d.f413785a;
        }
        C43685a c43685a2 = c43685a;
        LayerDrawable layerDrawable2 = layerDrawable;
        if ((i12 & 32) != 0) {
            layerDrawable2 = c43688d.f413790f;
        }
        LayerDrawable layerDrawable3 = layerDrawable2;
        if ((i12 & 128) != 0) {
            cVar = c43688d.f413792h;
        }
        return new C43688d(layerDrawable3, cVar, c43688d.f413789e, c43688d.f413786b, c43688d.f413791g, c43688d.f413787c, c43688d.f413788d, c43685a2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43688d)) {
            return false;
        }
        C43688d c43688d = (C43688d) obj;
        return L.f(this.f413785a, c43688d.f413785a) && L.f(this.f413786b, c43688d.f413786b) && L.f(this.f413787c, c43688d.f413787c) && L.f(this.f413788d, c43688d.f413788d) && this.f413789e == c43688d.f413789e && L.f(this.f413790f, c43688d.f413790f) && L.f(this.f413791g, c43688d.f413791g) && L.f(this.f413792h, c43688d.f413792h);
    }

    public final int hashCode() {
        C43685a c43685a = this.f413785a;
        int iHashCode = (c43685a == null ? 0 : c43685a.hashCode()) * 31;
        com.avito.android.lib.design.toggle.a aVar = this.f413786b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C35763c0 c35763c0 = this.f413787c;
        int iHashCode3 = (iHashCode2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        C35763c0 c35763c02 = this.f413788d;
        int iHashCode4 = (iHashCode3 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        BaseListItem.Alignment alignment = this.f413789e;
        int iHashCode5 = (iHashCode4 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        Drawable drawable = this.f413790f;
        int iHashCode6 = (iHashCode5 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Image image = this.f413791g;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        ImageRequest.c cVar = this.f413792h;
        return iHashCode7 + (cVar != null ? cVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ListItemCheckmarkStyle(baseListItemStyle=" + this.f413785a + ", checkmarkStyle=" + this.f413786b + ", iconColor=" + this.f413787c + ", rightIconColor=" + this.f413788d + ", alignment=" + this.f413789e + ", icon=" + this.f413790f + ", iconFromBack=" + this.f413791g + ", iconSize=" + this.f413792h + ')';
    }

    public C43688d(@l Drawable drawable, @l ImageRequest.c cVar, @l BaseListItem.Alignment alignment, @l com.avito.android.lib.design.toggle.a aVar, @l Image image, @l C35763c0 c35763c0, @l C35763c0 c35763c02, @l C43685a c43685a) {
        this.f413785a = c43685a;
        this.f413786b = aVar;
        this.f413787c = c35763c0;
        this.f413788d = c35763c02;
        this.f413789e = alignment;
        this.f413790f = drawable;
        this.f413791g = image;
        this.f413792h = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C43688d(C43685a c43685a, com.avito.android.lib.design.toggle.a aVar, C35763c0 c35763c0, C35763c0 c35763c02, BaseListItem.Alignment alignment, Drawable drawable, Image image, ImageRequest.c cVar, int i12, C42822w c42822w) {
        C43685a c43685a2 = (i12 & 1) != 0 ? null : c43685a;
        com.avito.android.lib.design.toggle.a aVar2 = (i12 & 2) != 0 ? null : aVar;
        C35763c0 c35763c03 = (i12 & 4) != 0 ? null : c35763c0;
        C35763c0 c35763c04 = (i12 & 8) != 0 ? null : c35763c02;
        BaseListItem.Alignment alignment2 = (i12 & 16) != 0 ? null : alignment;
        this((i12 & 32) != 0 ? null : drawable, (i12 & 128) != 0 ? null : cVar, alignment2, aVar2, (i12 & 64) != 0 ? null : image, c35763c03, c35763c04, c43685a2);
    }
}
