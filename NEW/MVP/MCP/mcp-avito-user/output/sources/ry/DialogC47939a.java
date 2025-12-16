package ry;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.core.widget.NestedScrollView;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPicker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lry/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ry.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC47939a extends d {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f437267E = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC47939a(@k Context context, @k String str, @k ArrayList arrayList, @k l lVar) {
        super(context, 0, 2, null);
        int i12 = 0;
        NestedScrollView nestedScrollView = new NestedScrollView(getContext(), null);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, y6.b(24));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        nestedScrollView.addView(linearLayout);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12603a c12603a = (C12603a) it.next();
            ListItemCheckmark listItemCheckmark = new ListItemCheckmark(getContext(), null);
            listItemCheckmark.setPadding(y6.b(24), i12, y6.b(24), i12);
            listItemCheckmark.setTitle(c12603a.f437268a);
            if (c12603a.f437270c) {
                listItemCheckmark.setChecked(true);
            } else {
                listItemCheckmark.setOnClickListener(new com.avito.android.advert.item.beduin.v2.favorite.a(this, listItemCheckmark, linearLayout, lVar, c12603a));
            }
            linearLayout.addView(listItemCheckmark);
            i12 = 0;
        }
        G(nestedScrollView, true);
        d.I(this, true);
        d.M(this, str, true, true, 2);
    }

    /* compiled from: ItemPicker.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lry/a$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ry.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12603a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f437268a;

        /* renamed from: b, reason: collision with root package name */
        public final int f437269b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f437270c;

        public C12603a(@k String str, int i12, boolean z12) {
            this.f437268a = str;
            this.f437269b = i12;
            this.f437270c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12603a)) {
                return false;
            }
            C12603a c12603a = (C12603a) obj;
            return L.f(this.f437268a, c12603a.f437268a) && this.f437269b == c12603a.f437269b && this.f437270c == c12603a.f437270c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f437270c) + r.e(this.f437269b, this.f437268a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(name=");
            sb2.append(this.f437268a);
            sb2.append(", id=");
            sb2.append(this.f437269b);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f437270c, ')');
        }

        public /* synthetic */ C12603a(String str, int i12, boolean z12, int i13, C42822w c42822w) {
            this(str, i12, (i13 & 4) != 0 ? false : z12);
        }
    }
}
