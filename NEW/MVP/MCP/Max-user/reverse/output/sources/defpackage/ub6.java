package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ub6 implements ob6 {
    public final ArrayList a;
    public final int b = hyc.oneme_folder_widget_section_view_type;
    public final long c = hyc.oneme_folder_widget_section_id;

    public ub6(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.t98
    public final int m() {
        return this.b;
    }
}
