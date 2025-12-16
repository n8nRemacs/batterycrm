package JU;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.lib.util.t;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeBarChildrenHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LJU/a;", "Lcom/avito/android/lib/util/t;", "LJU/c;", "Lcom/avito/android/lib/deprecated_design/badge_bar/BadgeView;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends t<c, BadgeView> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f9002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9003b;

    public /* synthetic */ a(ViewGroup viewGroup, int i12, int i13, C42822w c42822w) {
        this(viewGroup, (i13 & 2) != 0 ? 0 : i12);
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        BadgeView badgeView = (BadgeView) view;
        c cVar = (c) obj;
        badgeView.setBackgroundColor(cVar.f9006c);
        badgeView.setTextColor(cVar.f9005b);
        badgeView.setText(cVar.f9004a);
        badgeView.setPicture(cVar.f9007d);
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        BadgeView badgeView = new BadgeView(this.f9002a.getContext(), null, 0, 0, 14, null);
        int i12 = this.f9003b;
        if (i12 != 0) {
            badgeView.setAppearance(i12);
        }
        return badgeView;
    }

    public a(@k ViewGroup viewGroup, @f0 int i12) {
        this.f9002a = viewGroup;
        this.f9003b = i12;
    }
}
