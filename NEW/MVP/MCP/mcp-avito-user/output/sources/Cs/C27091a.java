package cS;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.beduin.v2.avito.component.graphic_element.GraphicElement;
import com.avito.beduin.v2.avito.component.graphic_element.d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m.C43852a;

/* compiled from: GraphicElementComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LcS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/graphic_element/a;", "Landroidx/appcompat/widget/AppCompatImageView;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_graphic-element"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27091a extends AbstractC36333c<com.avito.beduin.v2.avito.component.graphic_element.a, AppCompatImageView> {

    /* compiled from: GraphicElementComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LcS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/graphic_element/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_graphic-element"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cS.a$a, reason: collision with other inner class name */
    public static final class C2045a extends n<com.avito.beduin.v2.avito.component.graphic_element.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C2045a f57861c = new C2045a();

        public C2045a() {
            super(d.f334398c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new C27091a();
        }
    }

    /* compiled from: GraphicElementComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cS.a$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[GraphicElement.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GraphicElement graphicElement = GraphicElement.f334386b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GraphicElement graphicElement2 = GraphicElement.f334386b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GraphicElement graphicElement3 = GraphicElement.f334386b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GraphicElement graphicElement4 = GraphicElement.f334386b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GraphicElement graphicElement5 = GraphicElement.f334386b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                GraphicElement graphicElement6 = GraphicElement.f334386b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27091a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.graphic_element.a aVar) {
        int i12;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        com.avito.beduin.v2.avito.component.graphic_element.a aVar2 = aVar;
        Context context = appCompatImageView.getContext();
        switch (aVar2.f334389a.ordinal()) {
            case 0:
                i12 = R.drawable.graphic_element_plus;
                break;
            case 1:
                i12 = R.drawable.graphic_element_snowflake;
                break;
            case 2:
                i12 = R.drawable.graphic_element_diamond;
                break;
            case 3:
                i12 = R.drawable.graphic_element_piece_rotated_right;
                break;
            case 4:
                i12 = R.drawable.graphic_element_oval_vertical_rotated_right;
                break;
            case 5:
                i12 = R.drawable.graphic_element_candy_rotated_right;
                break;
            case 6:
                i12 = R.drawable.graphic_element_pill_rotated_right;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(C43852a.a(context, i12));
        appCompatImageView.setRotation(aVar2.f334391c);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(s(aVar2.f334390b)));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new AppCompatImageView(viewGroup.getContext());
    }
}
