package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class f44 implements y34 {
    public final Bundle a = new Bundle();

    @Override // defpackage.y34
    public final y34 B(View view) {
        if (view.getId() == -1) {
            throw new IllegalStateException("Check failed.");
        }
        int id = view.getId();
        Bundle bundle = this.a;
        bundle.putInt("anchor_id", id);
        bundle.putSerializable("anchor_class", view.getClass());
        return this;
    }

    @Override // defpackage.y34
    public final y34 D() {
        q85 q85Var = BaseBottomSheetWidget.s0;
        yy7[] yy7VarArr = ContextMenuBottomSheet.K0;
        BaseBottomSheetWidget.s0.getClass();
        this.a.putBoolean(BaseBottomSheetWidget.u0, true);
        return this;
    }

    @Override // defpackage.y34
    public final y34 G(s5g s5gVar) {
        this.a.putParcelable("header", s5gVar);
        return this;
    }

    @Override // defpackage.y34
    public final y34 b() {
        Rect rect = t27.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.y34
    public final z34 build() {
        return new ContextMenuBottomSheet(new Bundle(this.a));
    }

    @Override // defpackage.y34
    public final y34 f() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.y34
    public final y34 h(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.y34
    public final y34 o(Collection collection) {
        this.a.putBundle("actions", g6j.a(collection));
        return this;
    }

    @Override // defpackage.y34
    public final y34 v(float f) {
        Rect rect = t27.b;
        Rect rect2 = t27.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.y34
    public final y34 x(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }
}
