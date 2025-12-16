package Gl;

import Ur0.c;
import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ld0.InterfaceC43734e;

/* compiled from: VerticalPromoItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGl/a;", "LUr0/c;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13894a extends c {

    /* renamed from: s, reason: collision with root package name */
    public final int f6721s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6722t;

    /* compiled from: VerticalPromoItemDecorator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGl/a$a;", "", "<init>", "()V", "", "FIRST_POS_TOP_MARGIN", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gl.a$a, reason: collision with other inner class name */
    public static final class C0368a {
        public /* synthetic */ C0368a(C42822w c42822w) {
            this();
        }

        public C0368a() {
        }
    }

    static {
        new C0368a(null);
    }

    public C13894a(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f6721s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f6722t = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background_redesign);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2 = RecyclerView.U(view);
        int i12 = this.f6722t;
        int iB2 = iU2 == 0 ? y6.b(4) : i12;
        if (recyclerView.W(view) instanceof InterfaceC43734e) {
            int i13 = -this.f6721s;
            rect.left = i13;
            rect.right = i13;
            rect.top = iB2;
            rect.bottom = i12;
            this.f16709q = true;
        } else {
            this.f16709q = false;
        }
        e(c.a.C1153a.f16711a);
    }
}
